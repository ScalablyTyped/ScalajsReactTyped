package typingsJapgolly.storybookReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddons.distTs3Dot9Mod.Collection
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAddonsWrapperMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAddonsWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wrapper {
  
  inline def apply(addonSelected: String, panels: Collection): Default[default] = {
    val __props = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
