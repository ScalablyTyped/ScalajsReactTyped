package typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelFieldModification extends StObject {
  
  /** The ID of the Field to be modified. */
  var fieldId: js.UndefOr[String] = js.undefined
  
  /** This is always drive#labelFieldModification. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Replaces a dateString field with these new values. The values must be strings in the RFC 3339 full-date format: YYYY-MM-DD. */
  var setDateValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Replaces an integer field with these new values. */
  var setIntegerValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Replaces a selection field with these new values. */
  var setSelectionValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Replaces a text field with these new values. */
  var setTextValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Replaces a user field with these new values. The values must be valid email addresses. */
  var setUserValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Unsets the values for this field. */
  var unsetValues: js.UndefOr[Boolean] = js.undefined
}
object LabelFieldModification {
  
  inline def apply(): LabelFieldModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelFieldModification]
  }
  
  extension [Self <: LabelFieldModification](x: Self) {
    
    inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSetDateValues(value: js.Array[String]): Self = StObject.set(x, "setDateValues", value.asInstanceOf[js.Any])
    
    inline def setSetDateValuesUndefined: Self = StObject.set(x, "setDateValues", js.undefined)
    
    inline def setSetDateValuesVarargs(value: String*): Self = StObject.set(x, "setDateValues", js.Array(value*))
    
    inline def setSetIntegerValues(value: js.Array[String]): Self = StObject.set(x, "setIntegerValues", value.asInstanceOf[js.Any])
    
    inline def setSetIntegerValuesUndefined: Self = StObject.set(x, "setIntegerValues", js.undefined)
    
    inline def setSetIntegerValuesVarargs(value: String*): Self = StObject.set(x, "setIntegerValues", js.Array(value*))
    
    inline def setSetSelectionValues(value: js.Array[String]): Self = StObject.set(x, "setSelectionValues", value.asInstanceOf[js.Any])
    
    inline def setSetSelectionValuesUndefined: Self = StObject.set(x, "setSelectionValues", js.undefined)
    
    inline def setSetSelectionValuesVarargs(value: String*): Self = StObject.set(x, "setSelectionValues", js.Array(value*))
    
    inline def setSetTextValues(value: js.Array[String]): Self = StObject.set(x, "setTextValues", value.asInstanceOf[js.Any])
    
    inline def setSetTextValuesUndefined: Self = StObject.set(x, "setTextValues", js.undefined)
    
    inline def setSetTextValuesVarargs(value: String*): Self = StObject.set(x, "setTextValues", js.Array(value*))
    
    inline def setSetUserValues(value: js.Array[String]): Self = StObject.set(x, "setUserValues", value.asInstanceOf[js.Any])
    
    inline def setSetUserValuesUndefined: Self = StObject.set(x, "setUserValues", js.undefined)
    
    inline def setSetUserValuesVarargs(value: String*): Self = StObject.set(x, "setUserValues", js.Array(value*))
    
    inline def setUnsetValues(value: Boolean): Self = StObject.set(x, "unsetValues", value.asInstanceOf[js.Any])
    
    inline def setUnsetValuesUndefined: Self = StObject.set(x, "unsetValues", js.undefined)
  }
}
