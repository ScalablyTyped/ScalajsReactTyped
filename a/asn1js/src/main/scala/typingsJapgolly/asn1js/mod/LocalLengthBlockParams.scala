package typingsJapgolly.asn1js.mod

import typingsJapgolly.asn1js.anon.PartialILocalLengthBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalLengthBlockParams extends StObject {
  
  var lenBlock: js.UndefOr[PartialILocalLengthBlock] = js.undefined
}
object LocalLengthBlockParams {
  
  inline def apply(): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
  
  extension [Self <: LocalLengthBlockParams](x: Self) {
    
    inline def setLenBlock(value: PartialILocalLengthBlock): Self = StObject.set(x, "lenBlock", value.asInstanceOf[js.Any])
    
    inline def setLenBlockUndefined: Self = StObject.set(x, "lenBlock", js.undefined)
  }
}
