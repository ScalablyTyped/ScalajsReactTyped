package typingsJapgolly.reactElemental.mod

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps
  extends StObject
     with ImgHTMLAttributes[HTMLImageElement] {
  
  @JSName("alt")
  val alt_ImageProps: String
  
  @JSName("height")
  val height_ImageProps: js.UndefOr[String] = js.undefined
  
  val imgStyle: js.UndefOr[CSSProperties] = js.undefined
  
  val `lazy`: js.UndefOr[Boolean] = js.undefined
  
  val showIntermediate: js.UndefOr[Boolean] = js.undefined
  
  @JSName("width")
  val width_ImageProps: js.UndefOr[String] = js.undefined
}
object ImageProps {
  
  inline def apply(alt: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  extension [Self <: ImageProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImgStyle(value: CSSProperties): Self = StObject.set(x, "imgStyle", value.asInstanceOf[js.Any])
    
    inline def setImgStyleUndefined: Self = StObject.set(x, "imgStyle", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setShowIntermediate(value: Boolean): Self = StObject.set(x, "showIntermediate", value.asInstanceOf[js.Any])
    
    inline def setShowIntermediateUndefined: Self = StObject.set(x, "showIntermediate", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
