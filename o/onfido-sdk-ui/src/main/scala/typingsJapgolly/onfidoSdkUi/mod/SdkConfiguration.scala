package typingsJapgolly.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkConfiguration extends StObject {
  
  var biometrics_liveness: js.UndefOr[BiometricsLiveness] = js.undefined
  
  var device_intelligence: js.UndefOr[DeviceIntelligence] = js.undefined
  
  var document_capture: DocumentCapture
  
  var experimental_features: js.UndefOr[ExperimentalFeatures] = js.undefined
  
  var sdk_features: js.UndefOr[SdkFeatures] = js.undefined
  
  var validations: js.UndefOr[SdkConfigurationValidations] = js.undefined
}
object SdkConfiguration {
  
  inline def apply(document_capture: DocumentCapture): SdkConfiguration = {
    val __obj = js.Dynamic.literal(document_capture = document_capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkConfiguration]
  }
  
  extension [Self <: SdkConfiguration](x: Self) {
    
    inline def setBiometrics_liveness(value: BiometricsLiveness): Self = StObject.set(x, "biometrics_liveness", value.asInstanceOf[js.Any])
    
    inline def setBiometrics_livenessUndefined: Self = StObject.set(x, "biometrics_liveness", js.undefined)
    
    inline def setDevice_intelligence(value: DeviceIntelligence): Self = StObject.set(x, "device_intelligence", value.asInstanceOf[js.Any])
    
    inline def setDevice_intelligenceUndefined: Self = StObject.set(x, "device_intelligence", js.undefined)
    
    inline def setDocument_capture(value: DocumentCapture): Self = StObject.set(x, "document_capture", value.asInstanceOf[js.Any])
    
    inline def setExperimental_features(value: ExperimentalFeatures): Self = StObject.set(x, "experimental_features", value.asInstanceOf[js.Any])
    
    inline def setExperimental_featuresUndefined: Self = StObject.set(x, "experimental_features", js.undefined)
    
    inline def setSdk_features(value: SdkFeatures): Self = StObject.set(x, "sdk_features", value.asInstanceOf[js.Any])
    
    inline def setSdk_featuresUndefined: Self = StObject.set(x, "sdk_features", js.undefined)
    
    inline def setValidations(value: SdkConfigurationValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}
