package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorDataSharingPreference extends StObject {
  
  /**
    *  If this option is set to true, you choose to share data with Rekognition to improve model performance. 
    */
  var OptIn: Boolean
}
object StreamProcessorDataSharingPreference {
  
  inline def apply(OptIn: Boolean): StreamProcessorDataSharingPreference = {
    val __obj = js.Dynamic.literal(OptIn = OptIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorDataSharingPreference]
  }
  
  extension [Self <: StreamProcessorDataSharingPreference](x: Self) {
    
    inline def setOptIn(value: Boolean): Self = StObject.set(x, "OptIn", value.asInstanceOf[js.Any])
  }
}
