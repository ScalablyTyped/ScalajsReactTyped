package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseFocusStateMod {
  
  @JSImport("@react-md/form/types/useFocusState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFocusState(hasOnFocusOnBlur: Options): js.Tuple3[Boolean, FocusEventHandler, BlurEventHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusState")(hasOnFocusOnBlur.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, FocusEventHandler, BlurEventHandler]]
  
  type BlurEventHandler = typingsJapgolly.react.mod.FocusEventHandler[FocusElement]
  
  type FocusElement = HTMLInputElement | HTMLTextAreaElement | HTMLLabelElement | HTMLSelectElement | HTMLDivElement
  
  type FocusEventHandler = typingsJapgolly.react.mod.FocusEventHandler[FocusElement]
  
  /* Inlined std.Pick<react.react.HTMLAttributes<@react-md/form.@react-md/form/types/useFocusState.FocusElement>, 'onBlur' | 'onFocus'> */
  trait Options extends StObject {
    
    var onBlur: js.UndefOr[typingsJapgolly.react.mod.FocusEventHandler[FocusElement]] = js.undefined
    
    var onFocus: js.UndefOr[typingsJapgolly.react.mod.FocusEventHandler[FocusElement]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[FocusElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[FocusElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[FocusElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[FocusElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
