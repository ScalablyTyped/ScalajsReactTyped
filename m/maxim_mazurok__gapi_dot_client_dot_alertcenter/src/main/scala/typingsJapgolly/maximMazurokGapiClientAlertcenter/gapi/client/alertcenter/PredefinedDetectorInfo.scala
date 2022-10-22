package typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedDetectorInfo extends StObject {
  
  /** Name that uniquely identifies the detector. */
  var detectorName: js.UndefOr[String] = js.undefined
}
object PredefinedDetectorInfo {
  
  inline def apply(): PredefinedDetectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredefinedDetectorInfo]
  }
  
  extension [Self <: PredefinedDetectorInfo](x: Self) {
    
    inline def setDetectorName(value: String): Self = StObject.set(x, "detectorName", value.asInstanceOf[js.Any])
    
    inline def setDetectorNameUndefined: Self = StObject.set(x, "detectorName", js.undefined)
  }
}
