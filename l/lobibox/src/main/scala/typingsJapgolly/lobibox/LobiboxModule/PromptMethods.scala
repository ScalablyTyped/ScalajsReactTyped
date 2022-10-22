package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMethods extends StObject {
  
  var getValue: js.UndefOr[js.Function0[String]] = js.undefined
  
  var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[String], this.type]] = js.undefined
}
object PromptMethods {
  
  inline def apply(): PromptMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptMethods]
  }
  
  extension [Self <: PromptMethods](x: Self) {
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setSetValue(value: /* val */ js.UndefOr[String] => PromptMethods): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
