package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNative.mod.KeyboardEvent
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUIAbsolutePositionedKeyboardAwareViewMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view", JSImport.Default)
  @js.native
  open class default protected () extends AbsolutePositionedKeyboardAwareView {
    def this(props: Props) = this()
  }
  
  @js.native
  trait AbsolutePositionedKeyboardAwareView
    extends PureComponent[Props, js.Object, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAbsolutePositionedKeyboardAwareView(): Unit = js.native
    
    def keyboardDidHideHandler(): Unit = js.native
    
    var keyboardDidHideListener: EmitterSubscription = js.native
    
    def keyboardDidShowHandler(e: KeyboardEvent): Unit = js.native
    
    var keyboardDidShowListener: EmitterSubscription = js.native
    
    var keyboardOpen: Boolean = js.native
    
    def onLayoutHandler(hasNativeEvent: LayoutChangeEvent): Unit = js.native
    
    def removeKeyboardOnOrientationChange(): Unit = js.native
  }
  
  trait PreviewDimens extends StObject {
    
    var previewHeight: Double
    
    var previewWidth: Double
  }
  object PreviewDimens {
    
    inline def apply(previewHeight: Double, previewWidth: Double): PreviewDimens = {
      val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewDimens]
    }
    
    extension [Self <: PreviewDimens](x: Self) {
      
      inline def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props
    extends StObject
       with PreviewDimens {
    
    def onLayout(dimens: PreviewDimens): Unit
  }
  object Props {
    
    inline def apply(onLayout: PreviewDimens => Callback, previewHeight: Double, previewWidth: Double): Props = {
      val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1((t0: PreviewDimens) => onLayout(t0).runNow()), previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnLayout(value: PreviewDimens => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: PreviewDimens) => value(t0).runNow()))
    }
  }
}
