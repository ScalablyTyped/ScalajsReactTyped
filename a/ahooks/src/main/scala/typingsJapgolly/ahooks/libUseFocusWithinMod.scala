package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFocusWithinMod {
  
  @JSImport("ahooks/lib/useFocusWithin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: BasicTarget[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(target: BasicTarget[Element], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* isFocusWithin */ Boolean, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnBlur(value: /* e */ FocusEvent => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ FocusEvent) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* isFocusWithin */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* isFocusWithin */ Boolean) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ FocusEvent) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
