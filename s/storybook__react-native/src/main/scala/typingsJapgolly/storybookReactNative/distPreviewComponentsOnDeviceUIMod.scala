package typingsJapgolly.storybookReactNative

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIAbsolutePositionedKeyboardAwareViewMod.PreviewDimens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUIMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", JSImport.Default)
  @js.native
  open class default protected () extends OnDeviceUI {
    def this(props: OnDeviceUIProps) = this()
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", "IS_EXPO")
  @js.native
  val IS_EXPO: Boolean = js.native
  
  @js.native
  trait OnDeviceUI extends PureComponent[OnDeviceUIProps, OnDeviceUIState, Any] {
    
    var animatedValue: Value = js.native
    
    var channel: typingsJapgolly.storybookChannels.mod.default = js.native
    
    def handleOpenPreview(): Unit = js.native
    
    def handleToggleTab(newTabOpen: Double): Unit = js.native
    
    def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
  }
  
  trait OnDeviceUIProps extends StObject {
    
    var isUIHidden: js.UndefOr[Boolean] = js.undefined
    
    var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
    
    var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
    
    var stories: Any
    
    var tabOpen: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object OnDeviceUIProps {
    
    inline def apply(stories: Any): OnDeviceUIProps = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDeviceUIProps]
    }
    
    extension [Self <: OnDeviceUIProps](x: Self) {
      
      inline def setIsUIHidden(value: Boolean): Self = StObject.set(x, "isUIHidden", value.asInstanceOf[js.Any])
      
      inline def setIsUIHiddenUndefined: Self = StObject.set(x, "isUIHidden", js.undefined)
      
      inline def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
      
      inline def setKeyboardAvoidingViewVerticalOffsetUndefined: Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", js.undefined)
      
      inline def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
      
      inline def setShouldDisableKeyboardAvoidingViewUndefined: Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", js.undefined)
      
      inline def setStories(value: Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
      
      inline def setTabOpenUndefined: Self = StObject.set(x, "tabOpen", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait OnDeviceUIState extends StObject {
    
    var previewHeight: Double
    
    var previewWidth: Double
    
    var slideBetweenAnimation: Boolean
    
    var tabOpen: Double
  }
  object OnDeviceUIState {
    
    inline def apply(previewHeight: Double, previewWidth: Double, slideBetweenAnimation: Boolean, tabOpen: Double): OnDeviceUIState = {
      val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any], slideBetweenAnimation = slideBetweenAnimation.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDeviceUIState]
    }
    
    extension [Self <: OnDeviceUIState](x: Self) {
      
      inline def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideBetweenAnimation(value: Boolean): Self = StObject.set(x, "slideBetweenAnimation", value.asInstanceOf[js.Any])
      
      inline def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
    }
  }
}
