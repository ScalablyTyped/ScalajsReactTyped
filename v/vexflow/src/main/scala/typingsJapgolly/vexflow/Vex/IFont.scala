package typingsJapgolly.vexflow.Vex

import typingsJapgolly.vexflow.anon.Copyright
import typingsJapgolly.vexflow.anon.Ha
import typingsJapgolly.vexflow.anon.XMax_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
trait IFont extends StObject {
  
  var ascender: Double
  
  var boundingBox: XMax_
  
  var cssFontStyle: String
  
  var cssFontWeight: String
  
  var descender: Double
  
  var familyName: String
  
  var glyphs: js.Array[Ha]
  
  var lineHeight: Double
  
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[Copyright] = js.undefined
  
  var resolution: Double
  
  var underlinePosition: Double
  
  var underlineThickness: Double
}
object IFont {
  
  inline def apply(
    ascender: Double,
    boundingBox: XMax_,
    cssFontStyle: String,
    cssFontWeight: String,
    descender: Double,
    familyName: String,
    glyphs: js.Array[Ha],
    lineHeight: Double,
    resolution: Double,
    underlinePosition: Double,
    underlineThickness: Double
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], cssFontStyle = cssFontStyle.asInstanceOf[js.Any], cssFontWeight = cssFontWeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  
  extension [Self <: IFont](x: Self) {
    
    inline def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    inline def setBoundingBox(value: XMax_): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setCssFontStyle(value: String): Self = StObject.set(x, "cssFontStyle", value.asInstanceOf[js.Any])
    
    inline def setCssFontWeight(value: String): Self = StObject.set(x, "cssFontWeight", value.asInstanceOf[js.Any])
    
    inline def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setGlyphs(value: js.Array[Ha]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setGlyphsVarargs(value: Ha*): Self = StObject.set(x, "glyphs", js.Array(value*))
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setOriginal_font_information(value: Copyright): Self = StObject.set(x, "original_font_information", value.asInstanceOf[js.Any])
    
    inline def setOriginal_font_informationUndefined: Self = StObject.set(x, "original_font_information", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setUnderlinePosition(value: Double): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
    
    inline def setUnderlineThickness(value: Double): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
  }
}
