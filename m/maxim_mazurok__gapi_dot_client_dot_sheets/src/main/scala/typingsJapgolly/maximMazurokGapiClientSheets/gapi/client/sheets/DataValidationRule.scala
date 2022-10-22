package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValidationRule extends StObject {
  
  /** The condition that data in the cell must match. */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  
  /** A message to show the user when adding data to the cell. */
  var inputMessage: js.UndefOr[String] = js.undefined
  
  /** True if the UI should be customized based on the kind of condition. If true, "List" conditions will show a dropdown. */
  var showCustomUi: js.UndefOr[Boolean] = js.undefined
  
  /** True if invalid data should be rejected. */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object DataValidationRule {
  
  inline def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  
  extension [Self <: DataValidationRule](x: Self) {
    
    inline def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setInputMessage(value: String): Self = StObject.set(x, "inputMessage", value.asInstanceOf[js.Any])
    
    inline def setInputMessageUndefined: Self = StObject.set(x, "inputMessage", js.undefined)
    
    inline def setShowCustomUi(value: Boolean): Self = StObject.set(x, "showCustomUi", value.asInstanceOf[js.Any])
    
    inline def setShowCustomUiUndefined: Self = StObject.set(x, "showCustomUi", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
