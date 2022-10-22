package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeShare.buttonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  inline def apply(iconSrc: ImageSourcePropType, onPress: Callback): Builder = {
    val __props = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = onPress.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
  
  @JSImport("react-native-share", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonStyle(value: StyleProp[ViewProps]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def buttonStyleNull: this.type = set("buttonStyle", null)
    
    inline def textStyle(value: StyleProp[TextProps]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
