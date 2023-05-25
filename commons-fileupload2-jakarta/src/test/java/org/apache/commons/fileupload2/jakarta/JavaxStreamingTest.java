/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.fileupload2.jakarta;

import java.io.InputStream;

import org.apache.commons.fileupload2.AbstractStreamingTest;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Unit test for items with varying sizes.
 */
public class JavaxStreamingTest extends AbstractStreamingTest<JakartaServletFileUpload, HttpServletRequest, JakartaServletRequestContext> {

    @Override
    protected JakartaServletFileUpload newFileUpload() {
        return new JakartaServletFileUpload();
    }

    @Override
    protected HttpServletRequest newMockHttpServletRequest(final InputStream request, final long requestLength, final String contentType, final int readLimit) {
        return new JakartaMockHttpServletRequest(request, requestLength, contentType, readLimit);
    }

    @Override
    protected JakartaServletRequestContext newServletRequestContext(final HttpServletRequest request) {
        return new JakartaServletRequestContext(request);
    }

}