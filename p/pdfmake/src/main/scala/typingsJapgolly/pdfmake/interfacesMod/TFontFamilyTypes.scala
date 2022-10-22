package typingsJapgolly.pdfmake.interfacesMod

import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFFontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFontFamilyTypes extends StObject {
  
  /** Font variant that is bold. */
  var bold: js.UndefOr[PDFFontSource] = js.undefined
  
  /** Font variant that is bold and italic. */
  var bolditalics: js.UndefOr[PDFFontSource] = js.undefined
  
  /** Font variant that is italic. */
  var italics: js.UndefOr[PDFFontSource] = js.undefined
  
  /** Font variant that is neither bold nor italic. */
  var normal: js.UndefOr[PDFFontSource] = js.undefined
}
object TFontFamilyTypes {
  
  inline def apply(): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFontFamilyTypes]
  }
  
  extension [Self <: TFontFamilyTypes](x: Self) {
    
    inline def setBold(value: PDFFontSource): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setBolditalics(value: PDFFontSource): Self = StObject.set(x, "bolditalics", value.asInstanceOf[js.Any])
    
    inline def setBolditalicsUndefined: Self = StObject.set(x, "bolditalics", js.undefined)
    
    inline def setItalics(value: PDFFontSource): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setNormal(value: PDFFontSource): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
  }
}
