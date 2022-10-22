package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.FocusEvent
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFocusableFocusableMod {
  
  @JSImport("wix-style-react/dist/types/common/Focusable/Focusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withFocusable[T](Component: ComponentType[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def withFocusable[T](Component: ComponentType[T], options: FocusableOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait FocusableOptions extends StObject {
    
    var isFocusWithMouse: js.UndefOr[Boolean] = js.undefined
  }
  object FocusableOptions {
    
    inline def apply(): FocusableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableOptions]
    }
    
    extension [Self <: FocusableOptions](x: Self) {
      
      inline def setIsFocusWithMouse(value: Boolean): Self = StObject.set(x, "isFocusWithMouse", value.asInstanceOf[js.Any])
      
      inline def setIsFocusWithMouseUndefined: Self = StObject.set(x, "isFocusWithMouse", js.undefined)
    }
  }
  
  trait Triggers extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object Triggers {
    
    inline def apply(blur: Callback, focus: Callback): Triggers = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn)
      __obj.asInstanceOf[Triggers]
    }
    
    extension [Self <: Triggers](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait WithFocusableProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function2[/* event */ FocusEvent, /* triggers */ Triggers, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function2[/* event */ FocusEvent, /* triggers */ Triggers, Unit]] = js.undefined
  }
  object WithFocusableProps {
    
    inline def apply(): WithFocusableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithFocusableProps]
    }
    
    extension [Self <: WithFocusableProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: (/* event */ FocusEvent, /* triggers */ Triggers) => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction2((t0: /* event */ FocusEvent, t1: /* triggers */ Triggers) => (value(t0, t1)).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: (/* event */ FocusEvent, /* triggers */ Triggers) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: /* event */ FocusEvent, t1: /* triggers */ Triggers) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
