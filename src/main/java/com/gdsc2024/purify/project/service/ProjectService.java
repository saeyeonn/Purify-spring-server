package com.gdsc2024.purify.project.service;

import com.gdsc2024.purify.project.domain.Project;
import com.gdsc2024.purify.project.dto.ReqProjectCreateDto;
import com.gdsc2024.purify.project.dto.ResProjectDto;
import com.gdsc2024.purify.security.dto.AuthorizerDto;

import java.util.List;

public interface ProjectService {
    void createProject(ReqProjectCreateDto reqProjectCreateDto, AuthorizerDto authorizerDto);

    List<ResProjectDto> getProjects(AuthorizerDto authorizerDto);
}