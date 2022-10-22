package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNativePaper.anon.ActiveOutlineColor
import typingsJapgolly.reactNativePaper.anon.PartialProps
import typingsJapgolly.reactNativePaper.anon.PickTextInputPropsRefAttr
import typingsJapgolly.reactNativePaper.anon.TextInputPropsRefAttribut
import typingsJapgolly.reactNativePaper.anon.TypeofNativeTextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputTextInputMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/TextInput", JSImport.Default)
  @js.native
  val default: ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object]) = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[Props & RefAttributes[TextInputHandles]] {
    
    var Affix: FunctionComponent[PartialProps] = js.native
    
    var Icon: FunctionComponent[
        typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTextInputIconMod.Props
      ] = js.native
  }
  
  type Props = ComponentPropsWithRef[TypeofNativeTextInput] & ActiveOutlineColor
  
  /* Inlined std.Pick<react-native.react-native.TextInput, 'focus' | 'clear' | 'blur' | 'isFocused' | 'setNativeProps'> */
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
  
  type _To = ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTextInputTextInputMod.foo` */
  override def _to: ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object]) = default
}
