package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.hex
import typingsJapgolly.invityApi.invityApiStrings.number
import typingsJapgolly.invityApi.invityApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinExtraField extends StObject {
  
  var description: String
  
  var name: String
  
  var required: Boolean
  
  var `type`: number | text | hex
}
object CoinExtraField {
  
  inline def apply(description: String, name: String, required: Boolean, `type`: number | text | hex): CoinExtraField = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinExtraField]
  }
  
  extension [Self <: CoinExtraField](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: number | text | hex): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
