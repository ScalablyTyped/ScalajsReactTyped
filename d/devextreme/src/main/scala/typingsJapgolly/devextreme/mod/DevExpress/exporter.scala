package typingsJapgolly.devextreme.mod.DevExpress

import typingsJapgolly.devextreme.devextremeStrings.single_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  trait ExcelFont extends StObject {
    
    /**
      * Specifies whether the text should be in bold.
      */
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The text&apos;s color in hexadecimal characters.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether the text should be in italic.
      */
    var italic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the typeface that should be applied to the text.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The font size specified in points (1/72 of an inch).
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * The underline formatting style.
      */
    var underline: js.UndefOr[ExcelUnderlineType] = js.undefined
  }
  object ExcelFont {
    
    inline def apply(): ExcelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelFont]
    }
    
    extension [Self <: ExcelFont](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUnderline(value: ExcelUnderlineType): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.double
    - typingsJapgolly.devextreme.devextremeStrings.doubleAccounting
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.single_
    - typingsJapgolly.devextreme.devextremeStrings.singleAccounting
  */
  trait ExcelUnderlineType extends StObject
  object ExcelUnderlineType {
    
    inline def double: typingsJapgolly.devextreme.devextremeStrings.double = "double".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.double]
    
    inline def doubleAccounting: typingsJapgolly.devextreme.devextremeStrings.doubleAccounting = "doubleAccounting".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.doubleAccounting]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def single: single_ = "single".asInstanceOf[single_]
    
    inline def singleAccounting: typingsJapgolly.devextreme.devextremeStrings.singleAccounting = "singleAccounting".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.singleAccounting]
  }
}
