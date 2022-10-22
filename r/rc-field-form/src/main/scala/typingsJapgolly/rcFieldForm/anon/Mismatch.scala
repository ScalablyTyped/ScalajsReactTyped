package typingsJapgolly.rcFieldForm.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mismatch extends StObject {
  
  var mismatch: js.UndefOr[ValidateMessage] = js.undefined
}
object Mismatch {
  
  inline def apply(): Mismatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mismatch]
  }
  
  extension [Self <: Mismatch](x: Self) {
    
    inline def setMismatch(value: ValidateMessage): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
    
    inline def setMismatchCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "mismatch", value.toJsFn)
    
    inline def setMismatchUndefined: Self = StObject.set(x, "mismatch", js.undefined)
  }
}
