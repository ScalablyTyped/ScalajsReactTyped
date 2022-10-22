package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestPayload extends StObject {
  
  /**
    * The application manifest.
    */
  var PayloadData: js.UndefOr[ManifestPayloadData] = js.undefined
}
object ManifestPayload {
  
  inline def apply(): ManifestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestPayload]
  }
  
  extension [Self <: ManifestPayload](x: Self) {
    
    inline def setPayloadData(value: ManifestPayloadData): Self = StObject.set(x, "PayloadData", value.asInstanceOf[js.Any])
    
    inline def setPayloadDataUndefined: Self = StObject.set(x, "PayloadData", js.undefined)
  }
}
