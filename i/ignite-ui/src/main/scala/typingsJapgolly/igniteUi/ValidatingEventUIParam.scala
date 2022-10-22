package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatingEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object ValidatingEventUIParam {
  
  inline def apply(): ValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatingEventUIParam]
  }
  
  extension [Self <: ValidatingEventUIParam](x: Self) {
    
    inline def setFieldOptions(value: Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
