package typingsJapgolly.reactMediumImageZoom.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomDefaultStyles
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomImage
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomProps
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomZoomImage
import typingsJapgolly.reactMediumImageZoom.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMediumImageZoom {
  
  inline def apply(image: ImageZoomImage): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageZoomProps]))
  }
  
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def defaultStyles(value: ImageZoomDefaultStyles): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    inline def isZoomed(value: Boolean): this.type = set("isZoomed", value.asInstanceOf[js.Any])
    
    inline def onUnzoom(value: CallbackTo[js.Object]): this.type = set("onUnzoom", value.toJsFn)
    
    inline def onZoom(value: CallbackTo[js.Object]): this.type = set("onZoom", value.toJsFn)
    
    inline def shouldHandleZoom(value: CallbackTo[Boolean]): this.type = set("shouldHandleZoom", value.toJsFn)
    
    inline def shouldReplaceImage(value: Boolean): this.type = set("shouldReplaceImage", value.asInstanceOf[js.Any])
    
    inline def shouldRespectMaxDimension(value: Boolean): this.type = set("shouldRespectMaxDimension", value.asInstanceOf[js.Any])
    
    inline def zoomImage(value: ImageZoomZoomImage): this.type = set("zoomImage", value.asInstanceOf[js.Any])
    
    inline def zoomMargin(value: Double): this.type = set("zoomMargin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageZoomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
