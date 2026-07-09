package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method (optional but recommended)
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call the service method
        service.fetchData();

        // Verify that getData() was called exactly once
        verify(mockApi).getData();
    }
}