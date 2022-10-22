package typingsJapgolly.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartApplicationRequest extends StObject {
  
  /**
    * Name of the application.
    */
  var ApplicationName: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ApplicationName
  
  /**
    * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts reading the streaming source associated with the input. You can also specify where in the streaming source you want Amazon Kinesis Analytics to start reading.
    */
  var InputConfigurations: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.InputConfigurations
}
object StartApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName, InputConfigurations: InputConfigurations): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], InputConfigurations = InputConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  extension [Self <: StartApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurations(value: InputConfigurations): Self = StObject.set(x, "InputConfigurations", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurationsVarargs(value: InputConfiguration*): Self = StObject.set(x, "InputConfigurations", js.Array(value*))
  }
}
