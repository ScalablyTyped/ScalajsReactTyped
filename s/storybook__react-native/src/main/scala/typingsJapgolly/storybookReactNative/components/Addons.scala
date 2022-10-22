package typingsJapgolly.storybookReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAddonsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Addons {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Addons.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
