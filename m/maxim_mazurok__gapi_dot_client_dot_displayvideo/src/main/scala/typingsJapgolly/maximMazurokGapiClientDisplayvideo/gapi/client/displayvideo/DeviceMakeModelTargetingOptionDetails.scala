package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMakeModelTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the device make and model. */
  var displayName: js.UndefOr[String] = js.undefined
}
object DeviceMakeModelTargetingOptionDetails {
  
  inline def apply(): DeviceMakeModelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMakeModelTargetingOptionDetails]
  }
  
  extension [Self <: DeviceMakeModelTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
