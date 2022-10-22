package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.anon.OnBlurOnFocus
import typingsJapgolly.orbitUiReactComponents.anon.OnFocus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseFocusWithinMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusWithin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFocusWithin(): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")().asInstanceOf[OnFocus | OnBlurOnFocus]
  inline def useFocusWithin(hasOnFocusOnBlurIsDisabled: UseFocusWithinOptions): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(hasOnFocusOnBlurIsDisabled.asInstanceOf[js.Any]).asInstanceOf[OnFocus | OnBlurOnFocus]
  
  trait UseFocusWithinOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[Element], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[Element], Unit]] = js.undefined
  }
  object UseFocusWithinOptions {
    
    inline def apply(): UseFocusWithinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFocusWithinOptions]
    }
    
    extension [Self <: UseFocusWithinOptions](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnBlur(value: /* event */ ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* event */ ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
