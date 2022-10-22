package typingsJapgolly.reactNativeDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeDialog.libContainerMod.DialogContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("react-native-dialog", "default.Container")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def blurComponentIOS(value: VdomNode): this.type = set("blurComponentIOS", value.rawNode.asInstanceOf[js.Any])
    
    inline def blurComponentIOSNull: this.type = set("blurComponentIOS", null)
    
    inline def blurComponentIOSVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("blurComponentIOS", js.Array(value*))
    
    inline def blurComponentIOSVdomElement(value: VdomElement): this.type = set("blurComponentIOS", value.rawElement.asInstanceOf[js.Any])
    
    inline def blurStyle(value: StyleProp[ViewStyle]): this.type = set("blurStyle", value.asInstanceOf[js.Any])
    
    inline def blurStyleNull: this.type = set("blurStyle", null)
    
    inline def buttonSeparatorStyle(value: StyleProp[ViewStyle]): this.type = set("buttonSeparatorStyle", value.asInstanceOf[js.Any])
    
    inline def buttonSeparatorStyleNull: this.type = set("buttonSeparatorStyle", null)
    
    inline def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contentStyleNull: this.type = set("contentStyle", null)
    
    inline def footerStyle(value: StyleProp[ViewStyle]): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    inline def footerStyleNull: this.type = set("footerStyle", null)
    
    inline def headerStyle(value: StyleProp[ViewStyle]): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def headerStyleNull: this.type = set("headerStyle", null)
    
    inline def keyboardVerticalOffset(value: Double): this.type = set("keyboardVerticalOffset", value.asInstanceOf[js.Any])
    
    inline def onBackdropPress(value: Callback): this.type = set("onBackdropPress", value.toJsFn)
    
    inline def onRequestClose(value: Callback): this.type = set("onRequestClose", value.toJsFn)
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def verticalButtons(value: Boolean): this.type = set("verticalButtons", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Container.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DialogContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
