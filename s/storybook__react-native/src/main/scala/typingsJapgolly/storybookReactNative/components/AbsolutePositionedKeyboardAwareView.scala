package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAbsolutePositionedKeyboardAwareViewMod.PreviewDimens
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAbsolutePositionedKeyboardAwareViewMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAbsolutePositionedKeyboardAwareViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AbsolutePositionedKeyboardAwareView {
  
  inline def apply(onLayout: PreviewDimens => Callback, previewHeight: Double, previewWidth: Double): Default[default] = {
    val __props = js.Dynamic.literal(onLayout = js.Any.fromFunction1((t0: PreviewDimens) => onLayout(t0).runNow()), previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
