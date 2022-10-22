package typingsJapgolly.reactImageMagnifiers.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnifiers.anon.ClickMoveLimit
import typingsJapgolly.reactImageMagnifiers.mod.MagnifierProps
import typingsJapgolly.reactImageMagnifiers.mod.MouseActivation
import typingsJapgolly.reactImageMagnifiers.mod.TouchActivation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Magnifier {
  
  inline def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MagnifierProps]))
  }
  
  @JSImport("react-image-magnifiers", "Magnifier")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursorStyle(value: String): this.type = set("cursorStyle", value.asInstanceOf[js.Any])
    
    inline def cursorStyleActive(value: String): this.type = set("cursorStyleActive", value.asInstanceOf[js.Any])
    
    inline def dragToMove(value: Boolean): this.type = set("dragToMove", value.asInstanceOf[js.Any])
    
    inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    inline def interactionSettings(value: ClickMoveLimit): this.type = set("interactionSettings", value.asInstanceOf[js.Any])
    
    inline def largeImageSrc(value: String): this.type = set("largeImageSrc", value.asInstanceOf[js.Any])
    
    inline def mouseActivation(value: MouseActivation): this.type = set("mouseActivation", value.asInstanceOf[js.Any])
    
    inline def onImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onLargeImageLoad(value: /* ev */ ReactEventFrom[Element] => Callback): this.type = set("onLargeImageLoad", js.Any.fromFunction1((t0: /* ev */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onZoomEnd(value: Callback): this.type = set("onZoomEnd", value.toJsFn)
    
    inline def onZoomStart(value: Callback): this.type = set("onZoomStart", value.toJsFn)
    
    inline def renderOverlay(value: /* state */ Boolean => Node): this.type = set("renderOverlay", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def touchActivation(value: TouchActivation): this.type = set("touchActivation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
