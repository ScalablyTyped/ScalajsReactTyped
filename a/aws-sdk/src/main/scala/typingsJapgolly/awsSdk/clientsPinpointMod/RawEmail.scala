package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawEmail extends StObject {
  
  /**
    * The email message, represented as a raw MIME message. The entire message must be base64 encoded.
    */
  var Data: js.UndefOr[_Blob] = js.undefined
}
object RawEmail {
  
  inline def apply(): RawEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawEmail]
  }
  
  extension [Self <: RawEmail](x: Self) {
    
    inline def setData(value: _Blob): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
