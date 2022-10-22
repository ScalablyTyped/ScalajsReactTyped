package typingsJapgolly.reactImageMagnifiers.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnifiers.mod.GlassMagnifierProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlassMagnifier {
  
  inline def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GlassMagnifierProps]))
  }
  
  @JSImport("react-image-magnifiers", "GlassMagnifier")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowOverflow(value: Boolean): this.type = set("allowOverflow", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    inline def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    inline def magnifierBackgroundColor(value: String): this.type = set("magnifierBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def magnifierBorderColor(value: String): this.type = set("magnifierBorderColor", value.asInstanceOf[js.Any])
    
    inline def magnifierBorderSize(value: Double): this.type = set("magnifierBorderSize", value.asInstanceOf[js.Any])
    
    inline def magnifierOffsetX(value: Double): this.type = set("magnifierOffsetX", value.asInstanceOf[js.Any])
    
    inline def magnifierOffsetY(value: Double): this.type = set("magnifierOffsetY", value.asInstanceOf[js.Any])
    
    inline def magnifierSize(value: String | Double): this.type = set("magnifierSize", value.asInstanceOf[js.Any])
    
    inline def onImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onLargeImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onLargeImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onZoomEnd(value: Callback): this.type = set("onZoomEnd", value.toJsFn)
    
    inline def onZoomStart(value: Callback): this.type = set("onZoomStart", value.toJsFn)
    
    inline def renderOverlay(value: /* state */ Boolean => Node): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    inline def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlassMagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
