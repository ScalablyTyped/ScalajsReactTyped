package typingsJapgolly.reactNativeWebrtc.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeWebrtc.mod.RTCViewProps
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCView {
  
  inline def apply(streamURL: String): Builder = {
    val __props = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RTCViewProps]))
  }
  
  @JSImport("react-native-webrtc", "RTCView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWebrtc.mod.RTCView] {
    
    inline def mirror(value: Boolean): this.type = set("mirror", value.asInstanceOf[js.Any])
    
    inline def objectFit(value: contain | cover): this.type = set("objectFit", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def zOrder(value: Double): this.type = set("zOrder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RTCViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
