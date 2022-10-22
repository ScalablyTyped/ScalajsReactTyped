package typingsJapgolly.reactNativePopupDialog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.AlignTypes
import typingsJapgolly.reactNativePopupDialog.mod.DialogTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogTitle {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogTitleProps]))
  }
  
  @JSImport("react-native-popup-dialog", "DialogTitle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativePopupDialog.mod.DialogTitle] {
    
    inline def align(value: AlignTypes): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def hasTitleBar(value: Boolean): this.type = set("hasTitleBar", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
  }
  
  def withProps(p: DialogTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
