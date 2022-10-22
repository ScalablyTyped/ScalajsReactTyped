package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TurboModule extends StObject {
  
  var getConstants: js.UndefOr[js.Function0[js.Object]] = js.undefined
}
object TurboModule {
  
  inline def apply(): TurboModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurboModule]
  }
  
  extension [Self <: TurboModule](x: Self) {
    
    inline def setGetConstants(value: CallbackTo[js.Object]): Self = StObject.set(x, "getConstants", value.toJsFn)
    
    inline def setGetConstantsUndefined: Self = StObject.set(x, "getConstants", js.undefined)
  }
}
