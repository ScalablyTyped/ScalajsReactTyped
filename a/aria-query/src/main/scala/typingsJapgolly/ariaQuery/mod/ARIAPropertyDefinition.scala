package typingsJapgolly.ariaQuery.mod

import typingsJapgolly.ariaQuery.ariaQueryStrings.boolean
import typingsJapgolly.ariaQuery.ariaQueryStrings.id
import typingsJapgolly.ariaQuery.ariaQueryStrings.idlist
import typingsJapgolly.ariaQuery.ariaQueryStrings.integer
import typingsJapgolly.ariaQuery.ariaQueryStrings.number
import typingsJapgolly.ariaQuery.ariaQueryStrings.string
import typingsJapgolly.ariaQuery.ariaQueryStrings.token
import typingsJapgolly.ariaQuery.ariaQueryStrings.tokenlist
import typingsJapgolly.ariaQuery.ariaQueryStrings.tristate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIAPropertyDefinition extends StObject {
  
  var allowundefined: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate
  
  var values: js.UndefOr[js.Array[String | Boolean]] = js.undefined
}
object ARIAPropertyDefinition {
  
  inline def apply(`type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
  
  extension [Self <: ARIAPropertyDefinition](x: Self) {
    
    inline def setAllowundefined(value: Boolean): Self = StObject.set(x, "allowundefined", value.asInstanceOf[js.Any])
    
    inline def setAllowundefinedUndefined: Self = StObject.set(x, "allowundefined", js.undefined)
    
    inline def setType(value: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String | Boolean]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (String | Boolean)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
