package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationBarMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  inline def apply(index: Double, onPress: Double => Callback): Default[default] = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1((t0: Double) => onPress(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
