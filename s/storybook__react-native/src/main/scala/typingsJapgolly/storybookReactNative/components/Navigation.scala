package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUINavigationMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigation {
  
  inline def apply(onChangeTab: Double => Callback, tabOpen: Double): Builder = {
    val __props = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1((t0: Double) => onChangeTab(t0).runNow()), tabOpen = tabOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def initialUiVisible(value: Boolean): this.type = set("initialUiVisible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
