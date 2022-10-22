package typingsJapgolly.reactImageMagnifiers.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnifiers.mod.MagnifierPreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MagnifierPreview {
  
  inline def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MagnifierPreviewProps]))
  }
  
  @JSImport("react-image-magnifiers", "MagnifierPreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    inline def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    inline def onImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onLargeImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onLargeImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onZoomEnd(value: Callback): this.type = set("onZoomEnd", value.toJsFn)
    
    inline def onZoomStart(value: Callback): this.type = set("onZoomStart", value.toJsFn)
    
    inline def overlayBackgroundColor(value: Double): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def overlayBoxColor(value: Double): this.type = set("overlayBoxColor", value.asInstanceOf[js.Any])
    
    inline def overlayBoxImage(value: Double): this.type = set("overlayBoxImage", value.asInstanceOf[js.Any])
    
    inline def overlayBoxImageSize(value: Double): this.type = set("overlayBoxImageSize", value.asInstanceOf[js.Any])
    
    inline def overlayBoxOpacity(value: Double): this.type = set("overlayBoxOpacity", value.asInstanceOf[js.Any])
    
    inline def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    
    inline def renderOverlay(value: /* state */ Boolean => Node): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
