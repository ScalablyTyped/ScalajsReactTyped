package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSettingsSVG
  extends StObject
     with ExportSettings {
  
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  
  val format: SVG
  
  // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
  
  // defaults to true
  val svgIdAttribute: js.UndefOr[Boolean] = js.undefined
  
  val svgOutlineText: js.UndefOr[Boolean] = js.undefined
  
  // defaults to false
  val svgSimplifyStroke: js.UndefOr[Boolean] = js.undefined
}
object ExportSettingsSVG {
  
  inline def apply(): ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = "SVG")
    __obj.asInstanceOf[ExportSettingsSVG]
  }
  
  extension [Self <: ExportSettingsSVG](x: Self) {
    
    inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    inline def setFormat(value: SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSvgIdAttribute(value: Boolean): Self = StObject.set(x, "svgIdAttribute", value.asInstanceOf[js.Any])
    
    inline def setSvgIdAttributeUndefined: Self = StObject.set(x, "svgIdAttribute", js.undefined)
    
    inline def setSvgOutlineText(value: Boolean): Self = StObject.set(x, "svgOutlineText", value.asInstanceOf[js.Any])
    
    inline def setSvgOutlineTextUndefined: Self = StObject.set(x, "svgOutlineText", js.undefined)
    
    inline def setSvgSimplifyStroke(value: Boolean): Self = StObject.set(x, "svgSimplifyStroke", value.asInstanceOf[js.Any])
    
    inline def setSvgSimplifyStrokeUndefined: Self = StObject.set(x, "svgSimplifyStroke", js.undefined)
  }
}
