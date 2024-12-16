package com.empAssesment1.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Hero {

@ValueMapValue
    private String fileReference;
@ValueMapValue
    private String title;
   
 @ValueMapValue
    private String description;
@ValueMapValue
    private String label;
@ValueMapValue
private String url;
public String getFileReference() {
    return fileReference;
}
public String getTitle() {
    return title;
}
public String getDescription() {
    return description;
}
public String getLabel() {
    return label;
}
public String getUrl() {
    return url;
}

}
