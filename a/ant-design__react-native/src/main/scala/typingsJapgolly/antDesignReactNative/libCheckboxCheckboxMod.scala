package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxPropsType
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.AccessibilityProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxCheckboxMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]] = js.native
  
  trait CheckboxProps
    extends StObject
       with CheckboxPropsType
       with WithThemeStyles[CheckboxStyle]
       with AccessibilityProps {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait RefCheckboxProps extends StObject {
    
    def onPress(): Unit
  }
  object RefCheckboxProps {
    
    inline def apply(onPress: Callback): RefCheckboxProps = {
      val __obj = js.Dynamic.literal(onPress = onPress.toJsFn)
      __obj.asInstanceOf[RefCheckboxProps]
    }
    
    extension [Self <: RefCheckboxProps](x: Self) {
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    }
  }
  
  type _To = ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxCheckboxMod.foo` */
  override def _to: ForwardRefExoticComponent[CheckboxProps & RefAttributes[Any]] = default
}
