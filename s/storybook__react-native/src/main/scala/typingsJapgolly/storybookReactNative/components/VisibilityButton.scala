package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationVisibilityButtonMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationVisibilityButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisibilityButton {
  
  inline def apply(onPress: Callback): Default[default] = {
    val __props = js.Dynamic.literal(onPress = onPress.toJsFn)
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/visibility-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
