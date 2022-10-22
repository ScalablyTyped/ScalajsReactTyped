package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeShare.overlayMod.OverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  inline def apply(onCancel: Callback, visible: Boolean): Default[typingsJapgolly.reactNativeShare.mod.Overlay] = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, visible = visible.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNativeShare.mod.Overlay](js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("react-native-share", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OverlayProps): Default[typingsJapgolly.reactNativeShare.mod.Overlay] = new Default[typingsJapgolly.reactNativeShare.mod.Overlay](js.Array(this.component, p.asInstanceOf[js.Any]))
}
