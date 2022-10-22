package typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1FieldTypeEnumType extends StObject {
  
  /**
    * The set of allowed values for this enum. This set must not be empty and can include up to 100 allowed values. The display names of the values in this set must not be empty and must
    * be case-insensitively unique within this set. The order of items in this set is preserved. This field can be used to create, remove, and reorder enum values. To rename enum values,
    * use the `RenameTagTemplateFieldEnumValue` method.
    */
  var allowedValues: js.UndefOr[js.Array[GoogleCloudDatacatalogV1FieldTypeEnumTypeEnumValue]] = js.undefined
}
object GoogleCloudDatacatalogV1FieldTypeEnumType {
  
  inline def apply(): GoogleCloudDatacatalogV1FieldTypeEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1FieldTypeEnumType]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1FieldTypeEnumType](x: Self) {
    
    inline def setAllowedValues(value: js.Array[GoogleCloudDatacatalogV1FieldTypeEnumTypeEnumValue]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: GoogleCloudDatacatalogV1FieldTypeEnumTypeEnumValue*): Self = StObject.set(x, "allowedValues", js.Array(value*))
  }
}
