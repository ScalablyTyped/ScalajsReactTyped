package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeShare.mod.ShareSheetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareSheet {
  
  inline def apply(onCancel: Callback, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ShareSheetProps]))
  }
  
  @JSImport("react-native-share", "ShareSheet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeShare.mod.ShareSheet] {
    
    inline def overlayStyle(value: StyleProp[ViewProps]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayStyleNull: this.type = set("overlayStyle", null)
    
    inline def style(value: StyleProp[ViewProps]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: ShareSheetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
