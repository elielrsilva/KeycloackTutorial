package com.example.authWithKeycloack;
import org.springframework.core.convert.converter.Converter;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

interface AuthoritiesConverter extends Converter<Map<String, Object>, Collection<GrantedAuthority>> {}

