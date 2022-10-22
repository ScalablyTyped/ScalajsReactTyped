package typingsJapgolly.reactImageMagnifiers.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnifiers.mod.PictureInPictureMagnifierProps
import typingsJapgolly.reactImageMagnifiers.reactImageMagnifiersStrings.bottom
import typingsJapgolly.reactImageMagnifiers.reactImageMagnifiersStrings.left
import typingsJapgolly.reactImageMagnifiers.reactImageMagnifiersStrings.right
import typingsJapgolly.reactImageMagnifiers.reactImageMagnifiersStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PictureInPictureMagnifier {
  
  inline def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PictureInPictureMagnifierProps]))
  }
  
  @JSImport("react-image-magnifiers", "PictureInPictureMagnifier")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    inline def cursorStyleActive(value: String): this.type = set("cursorStyleActive", value.asInstanceOf[js.Any])
    
    inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    inline def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    inline def onImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onLargeImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onLargeImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onZoomEnd(value: Callback): this.type = set("onZoomEnd", value.toJsFn)
    
    inline def onZoomStart(value: Callback): this.type = set("onZoomStart", value.toJsFn)
    
    inline def previewHorizontalPos(value: left | right): this.type = set("previewHorizontalPos", value.asInstanceOf[js.Any])
    
    inline def previewOpacity(value: Double): this.type = set("previewOpacity", value.asInstanceOf[js.Any])
    
    inline def previewOverlayBackgroundColor(value: String): this.type = set("previewOverlayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def previewOverlayBoxColor(value: String): this.type = set("previewOverlayBoxColor", value.asInstanceOf[js.Any])
    
    inline def previewOverlayBoxImage(value: String): this.type = set("previewOverlayBoxImage", value.asInstanceOf[js.Any])
    
    inline def previewOverlayBoxImageSize(value: String): this.type = set("previewOverlayBoxImageSize", value.asInstanceOf[js.Any])
    
    inline def previewOverlayBoxOpacity(value: Double): this.type = set("previewOverlayBoxOpacity", value.asInstanceOf[js.Any])
    
    inline def previewOverlayOpacity(value: Double): this.type = set("previewOverlayOpacity", value.asInstanceOf[js.Any])
    
    inline def previewSizePercentage(value: Double): this.type = set("previewSizePercentage", value.asInstanceOf[js.Any])
    
    inline def previewVerticalPos(value: top | bottom): this.type = set("previewVerticalPos", value.asInstanceOf[js.Any])
    
    inline def renderOverlay(value: /* state */ Boolean => Node): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    inline def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    inline def shadowColor(value: String): this.type = set("shadowColor", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PictureInPictureMagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
