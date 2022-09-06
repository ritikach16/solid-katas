package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelemetryDiagnosticControlsTest
{
	@Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() throws Exception {
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls();
        telemetryDiagnosticControls.setDiagnosticInfo("status : 200, response : OK");
        telemetryDiagnosticControls.getDiagnosticInfo();
        assertEquals("status : 200, response : OK", telemetryDiagnosticControls.getDiagnosticInfo());
        telemetryDiagnosticControls.checkTransmission();
        assertEquals(502, telemetryDiagnosticControls.getDiagnosticInfo().length());
    }

}
