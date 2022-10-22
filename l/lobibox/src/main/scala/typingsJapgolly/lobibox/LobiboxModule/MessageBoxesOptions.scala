package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import typingsJapgolly.lobibox.anon.Cancel
import typingsJapgolly.lobibox.anon.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoxesOptions
  extends StObject
     with MessageBoxesDefault {
  
  var bodyClass: js.UndefOr[String] = js.undefined
  
  var buttons: js.UndefOr[Cancel | Any] = js.undefined
  
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[Any] = js.undefined
  
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  var modalClasses: js.UndefOr[Confirm] = js.undefined
}
object MessageBoxesOptions {
  
  inline def apply(): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesOptions]
  }
  
  extension [Self <: MessageBoxesOptions](x: Self) {
    
    inline def setBodyClass(value: String): Self = StObject.set(x, "bodyClass", value.asInstanceOf[js.Any])
    
    inline def setBodyClassUndefined: Self = StObject.set(x, "bodyClass", js.undefined)
    
    inline def setButtons(value: Cancel | Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsAlign(value: Any): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
    
    inline def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: (/* lobibox */ Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction3((t0: /* lobibox */ Any, t1: /* type */ js.UndefOr[String], t2: /* ev */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setModalClasses(value: Confirm): Self = StObject.set(x, "modalClasses", value.asInstanceOf[js.Any])
    
    inline def setModalClassesUndefined: Self = StObject.set(x, "modalClasses", js.undefined)
  }
}
