package typingsJapgolly.officeJsPreview.Word.Interfaces

import typingsJapgolly.officeJsPreview.Word.DocumentPropertyType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Boolean
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Date
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
trait CustomPropertyData extends StObject {
  
  /**
    * Gets the key of the custom property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.String | Number | Date | Boolean
  ] = js.undefined
  
  /**
    * Gets or sets the value of the custom property. Note that even though Word on the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object CustomPropertyData {
  
  inline def apply(): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyData]
  }
  
  extension [Self <: CustomPropertyData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(
      value: DocumentPropertyType | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.String | Number | Date | Boolean
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
