package typingsJapgolly.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedImgixAndSourceProps
  extends StObject
     with CommonProps {
  
  var attributeConfig: js.UndefOr[AttributeConfig] = js.undefined
  
  var disableLibraryParam: js.UndefOr[Boolean] = js.undefined
  
  var disablePathEncoding: js.UndefOr[Boolean] = js.undefined
  
  var disableQualityByDPR: js.UndefOr[Boolean] = js.undefined
  
  var disableSrcSet: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var imgixParams: js.UndefOr[ImgixParams] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: String
  
  var srcSetOptions: js.UndefOr[SrcSetParams] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SharedImgixAndSourceProps {
  
  inline def apply(src: String): SharedImgixAndSourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImgixAndSourceProps]
  }
  
  extension [Self <: SharedImgixAndSourceProps](x: Self) {
    
    inline def setAttributeConfig(value: AttributeConfig): Self = StObject.set(x, "attributeConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributeConfigUndefined: Self = StObject.set(x, "attributeConfig", js.undefined)
    
    inline def setDisableLibraryParam(value: Boolean): Self = StObject.set(x, "disableLibraryParam", value.asInstanceOf[js.Any])
    
    inline def setDisableLibraryParamUndefined: Self = StObject.set(x, "disableLibraryParam", js.undefined)
    
    inline def setDisablePathEncoding(value: Boolean): Self = StObject.set(x, "disablePathEncoding", value.asInstanceOf[js.Any])
    
    inline def setDisablePathEncodingUndefined: Self = StObject.set(x, "disablePathEncoding", js.undefined)
    
    inline def setDisableQualityByDPR(value: Boolean): Self = StObject.set(x, "disableQualityByDPR", value.asInstanceOf[js.Any])
    
    inline def setDisableQualityByDPRUndefined: Self = StObject.set(x, "disableQualityByDPR", js.undefined)
    
    inline def setDisableSrcSet(value: Boolean): Self = StObject.set(x, "disableSrcSet", value.asInstanceOf[js.Any])
    
    inline def setDisableSrcSetUndefined: Self = StObject.set(x, "disableSrcSet", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImgixParams(value: ImgixParams): Self = StObject.set(x, "imgixParams", value.asInstanceOf[js.Any])
    
    inline def setImgixParamsUndefined: Self = StObject.set(x, "imgixParams", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcSetOptions(value: SrcSetParams): Self = StObject.set(x, "srcSetOptions", value.asInstanceOf[js.Any])
    
    inline def setSrcSetOptionsUndefined: Self = StObject.set(x, "srcSetOptions", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
