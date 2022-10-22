package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaImageScaling
import typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaPlatformItem
import typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaImage {
  
  @JSImport("wix-ui-core/dist/es/src", "MediaImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.MediaImage] {
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def errorMediaPlatformItem(value: MediaPlatformItem): this.type = set("errorMediaPlatformItem", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def mediaPlatformItem(value: MediaPlatformItem): this.type = set("mediaPlatformItem", value.asInstanceOf[js.Any])
    
    inline def nativeRef(value: Ref[HTMLImageElement]): this.type = set("nativeRef", value.asInstanceOf[js.Any])
    
    inline def nativeRefFunction1(value: HTMLImageElement | Null => Callback): this.type = set("nativeRef", js.Any.fromFunction1((t0: HTMLImageElement | Null) => value(t0).runNow()))
    
    inline def nativeRefNull: this.type = set("nativeRef", null)
    
    inline def onError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
    
    inline def scale(value: MediaImageScaling): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MediaImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
