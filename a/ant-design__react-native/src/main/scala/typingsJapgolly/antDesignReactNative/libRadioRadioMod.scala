package typingsJapgolly.antDesignReactNative

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioPropsType
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/radio/Radio", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadioProps & RefAttributes[Any]] = js.native
  
  trait RadioProps
    extends StObject
       with RadioPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RadioProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libRadioRadioMod.foo` */
  override def _to: ForwardRefExoticComponent[RadioProps & RefAttributes[Any]] = default
}
