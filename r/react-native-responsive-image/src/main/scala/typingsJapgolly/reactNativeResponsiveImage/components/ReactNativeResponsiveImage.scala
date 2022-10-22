package typingsJapgolly.reactNativeResponsiveImage.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNative.mod.ImageBackground
import typingsJapgolly.reactNative.mod.ImageErrorEventData
import typingsJapgolly.reactNative.mod.ImageLoadEventData
import typingsJapgolly.reactNative.mod.ImageProgressEventDataIOS
import typingsJapgolly.reactNative.mod.ImageResizeMode
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeResponsiveImage.mod.ResponsiveImageProps
import typingsJapgolly.reactNativeResponsiveImage.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeResponsiveImage {
  
  inline def apply(source: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ResponsiveImageProps]))
  }
  
  @JSImport("react-native-responsive-image", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def component(value: Image | ImageBackground): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def defaultSource(value: ImageURISource | Double): this.type = set("defaultSource", value.asInstanceOf[js.Any])
    
    inline def initHeight(value: Double): this.type = set("initHeight", value.asInstanceOf[js.Any])
    
    inline def initWidth(value: Double): this.type = set("initWidth", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* error */ NativeSyntheticEvent[ImageErrorEventData]) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageLoadEventData]) => value(t0).runNow()))
    
    inline def onLoadEnd(value: Callback): this.type = set("onLoadEnd", value.toJsFn)
    
    inline def onLoadStart(value: Callback): this.type = set("onLoadStart", value.toJsFn)
    
    inline def onProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS]) => value(t0).runNow()))
    
    inline def resizeMode(value: ImageResizeMode): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: ResponsiveImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
