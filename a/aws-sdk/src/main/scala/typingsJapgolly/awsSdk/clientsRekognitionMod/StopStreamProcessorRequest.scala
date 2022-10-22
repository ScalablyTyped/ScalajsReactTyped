package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStreamProcessorRequest extends StObject {
  
  /**
    * The name of a stream processor created by CreateStreamProcessor.
    */
  var Name: StreamProcessorName
}
object StopStreamProcessorRequest {
  
  inline def apply(Name: StreamProcessorName): StopStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamProcessorRequest]
  }
  
  extension [Self <: StopStreamProcessorRequest](x: Self) {
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
