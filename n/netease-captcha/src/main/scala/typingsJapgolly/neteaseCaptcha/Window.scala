package typingsJapgolly.neteaseCaptcha

import japgolly.scalajs.react.Callback
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Config
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onError
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onLoad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var initNECaptcha: js.UndefOr[InitFunction] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setInitNECaptcha(
      value: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Callback
    ): Self = StObject.set(x, "initNECaptcha", js.Any.fromFunction3((t0: /* config */ Config, t1: /* onLoad */ js.UndefOr[onLoad], t2: /* onError */ js.UndefOr[onError]) => (value(t0, t1, t2)).runNow()))
    
    inline def setInitNECaptchaUndefined: Self = StObject.set(x, "initNECaptcha", js.undefined)
  }
}
