package typingsJapgolly.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined opentype.js.opentype.js.FontConstructorOptionsBase & std.Partial<opentype.js.opentype.js.FontOptions> & {  glyphs :std.Array<opentype.js.opentype.js.Glyph>} */
trait FontConstructorOptions extends StObject {
  
  var ascender: Double & js.UndefOr[Double]
  
  var copyright: js.UndefOr[String] = js.undefined
  
  var createdTimestamp: js.UndefOr[Double] = js.undefined
  
  var descender: Double & js.UndefOr[Double]
  
  var description: js.UndefOr[String] = js.undefined
  
  var designer: js.UndefOr[String] = js.undefined
  
  var designerURL: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var familyName: String & js.UndefOr[String]
  
  var fsSelection: js.UndefOr[String] = js.undefined
  
  var fullName: js.UndefOr[String] = js.undefined
  
  var glyphs: js.Array[Glyph]
  
  var license: js.UndefOr[String] = js.undefined
  
  var licenseURL: js.UndefOr[String] = js.undefined
  
  var manufacturer: js.UndefOr[String] = js.undefined
  
  var manufacturerURL: js.UndefOr[String] = js.undefined
  
  var postScriptName: js.UndefOr[String] = js.undefined
  
  var styleName: String & js.UndefOr[String]
  
  var trademark: js.UndefOr[String] = js.undefined
  
  var unitsPerEm: Double & js.UndefOr[Double]
  
  var version: js.UndefOr[String] = js.undefined
  
  var weightClass: js.UndefOr[String] = js.undefined
  
  var widthClass: js.UndefOr[String] = js.undefined
}
object FontConstructorOptions {
  
  inline def apply(
    ascender: Double & js.UndefOr[Double],
    descender: Double & js.UndefOr[Double],
    familyName: String & js.UndefOr[String],
    glyphs: js.Array[Glyph],
    styleName: String & js.UndefOr[String],
    unitsPerEm: Double & js.UndefOr[Double]
  ): FontConstructorOptions = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptions]
  }
  
  extension [Self <: FontConstructorOptions](x: Self) {
    
    inline def setAscender(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCreatedTimestamp(value: Double): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "createdTimestamp", js.undefined)
    
    inline def setDescender(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDesigner(value: String): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    inline def setDesignerURL(value: String): Self = StObject.set(x, "designerURL", value.asInstanceOf[js.Any])
    
    inline def setDesignerURLUndefined: Self = StObject.set(x, "designerURL", js.undefined)
    
    inline def setDesignerUndefined: Self = StObject.set(x, "designer", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFamilyName(value: String & js.UndefOr[String]): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFsSelection(value: String): Self = StObject.set(x, "fsSelection", value.asInstanceOf[js.Any])
    
    inline def setFsSelectionUndefined: Self = StObject.set(x, "fsSelection", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setGlyphs(value: js.Array[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setGlyphsVarargs(value: Glyph*): Self = StObject.set(x, "glyphs", js.Array(value*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseURL(value: String): Self = StObject.set(x, "licenseURL", value.asInstanceOf[js.Any])
    
    inline def setLicenseURLUndefined: Self = StObject.set(x, "licenseURL", js.undefined)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerURL(value: String): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
    
    inline def setManufacturerURLUndefined: Self = StObject.set(x, "manufacturerURL", js.undefined)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setPostScriptName(value: String): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
    
    inline def setPostScriptNameUndefined: Self = StObject.set(x, "postScriptName", js.undefined)
    
    inline def setStyleName(value: String & js.UndefOr[String]): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setTrademark(value: String): Self = StObject.set(x, "trademark", value.asInstanceOf[js.Any])
    
    inline def setTrademarkUndefined: Self = StObject.set(x, "trademark", js.undefined)
    
    inline def setUnitsPerEm(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWeightClass(value: String): Self = StObject.set(x, "weightClass", value.asInstanceOf[js.Any])
    
    inline def setWeightClassUndefined: Self = StObject.set(x, "weightClass", js.undefined)
    
    inline def setWidthClass(value: String): Self = StObject.set(x, "widthClass", value.asInstanceOf[js.Any])
    
    inline def setWidthClassUndefined: Self = StObject.set(x, "widthClass", js.undefined)
  }
}
