package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.libCheckboxCheckboxMod.RefCheckboxProps
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioItemPropsType
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioItemMod {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  open class default () extends RadioItem
  
  @js.native
  trait RadioItem
    extends Component[RadioItemProps, js.Object, Any] {
    
    def handleClick(): Unit = js.native
    
    var radio: RefCheckboxProps = js.native
  }
  
  trait RadioItemProps
    extends StObject
       with RadioItemPropsType
       with WithThemeStyles[CheckboxStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object RadioItemProps {
    
    inline def apply(): RadioItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemProps]
    }
    
    extension [Self <: RadioItemProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
