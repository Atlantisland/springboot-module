package academy.everyonecodes.drhouseDiagnoses.configuration;

import academy.everyonecodes.drhouseDiagnoses.domain.Diagnosis;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("diagnosis")
public class DiagnosisConfiguration {

    private List<Diagnosis> diagnoses;

    @Bean
    List<Diagnosis> diagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }
}