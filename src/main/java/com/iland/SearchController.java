package com.iland;

import io.swagger.api.NotFoundException;
import io.swagger.api.OrgApiService;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class SearchController implements OrgApiService {
    public Response orgOrgUuidSearchGet(String orgUuid, String query, Integer offset, Integer limit, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    public Response orgOrgUuidSearchPost(String orgUuid, SecurityContext securityContext) throws NotFoundException {
        return null;
    }
}
