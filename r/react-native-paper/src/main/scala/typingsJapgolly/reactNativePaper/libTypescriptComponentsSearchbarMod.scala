package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.reactNativePaper.anon.ClearAccessibilityLabel
import typingsJapgolly.reactNativePaper.anon.PickPickPropsiconkeytheme
import typingsJapgolly.reactNativePaper.anon.PickPropsiconkeythemekeyo
import typingsJapgolly.reactNativePaper.anon.TypeofTextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsSearchbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Searchbar", JSImport.Default)
  @js.native
  val default: ComponentType[PickPickPropsiconkeytheme] & (NonReactStatics[
    ComponentType[PickPropsiconkeythemekeyo] & ForwardRefExoticComponent[PickPropsiconkeythemekeyo], 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofTextInput] & ClearAccessibilityLabel
  
  /* Inlined std.Pick<react-native.react-native.TextInput, 'setNativeProps' | 'isFocused' | 'clear' | 'blur' | 'focus'> */
  trait TextInputHandles extends StObject {
    
    var blur: js.UndefOr[Any] = js.undefined
    
    var clear: js.Function0[Unit]
    
    var focus: js.UndefOr[Any] = js.undefined
    
    var isFocused: js.Function0[Boolean]
    
    var setNativeProps: js.UndefOr[Any] = js.undefined
  }
  object TextInputHandles {
    
    inline def apply(clear: Callback, isFocused: CallbackTo[Boolean]): TextInputHandles = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, isFocused = isFocused.toJsFn)
      __obj.asInstanceOf[TextInputHandles]
    }
    
    extension [Self <: TextInputHandles](x: Self) {
      
      inline def setBlur(value: Any): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setFocus(value: Any): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setSetNativeProps(value: Any): Self = StObject.set(x, "setNativeProps", value.asInstanceOf[js.Any])
      
      inline def setSetNativePropsUndefined: Self = StObject.set(x, "setNativeProps", js.undefined)
    }
  }
  
  type _To = ComponentType[PickPickPropsiconkeytheme] & (NonReactStatics[
    ComponentType[PickPropsiconkeythemekeyo] & ForwardRefExoticComponent[PickPropsiconkeythemekeyo], 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsSearchbarMod.foo` */
  override def _to: ComponentType[PickPickPropsiconkeytheme] & (NonReactStatics[
    ComponentType[PickPropsiconkeythemekeyo] & ForwardRefExoticComponent[PickPropsiconkeythemekeyo], 
    js.Object
  ]) = default
}
