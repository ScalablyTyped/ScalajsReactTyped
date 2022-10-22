package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddons.distTs3Dot9Mod.Collection
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAddonsListMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAddonsListMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply(addonSelected: String, onPressAddon: String => Callback, panels: Collection): Default[default] = {
    val __props = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1((t0: String) => onPressAddon(t0).runNow()), panels = panels.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
