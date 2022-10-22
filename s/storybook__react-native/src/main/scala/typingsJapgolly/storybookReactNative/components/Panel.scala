package typingsJapgolly.storybookReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIPanelMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIPanelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  inline def apply(style: js.Array[Any]): Default[default] = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/panel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
