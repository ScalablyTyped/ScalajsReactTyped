package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecordingConfigurationResponse extends StObject {
  
  /**
    * 
    */
  var recordingConfiguration: js.UndefOr[RecordingConfiguration] = js.undefined
}
object CreateRecordingConfigurationResponse {
  
  inline def apply(): CreateRecordingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRecordingConfigurationResponse]
  }
  
  extension [Self <: CreateRecordingConfigurationResponse](x: Self) {
    
    inline def setRecordingConfiguration(value: RecordingConfiguration): Self = StObject.set(x, "recordingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRecordingConfigurationUndefined: Self = StObject.set(x, "recordingConfiguration", js.undefined)
  }
}
