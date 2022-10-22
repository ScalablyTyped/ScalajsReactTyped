package typingsJapgolly.typedGraphql.graphqlMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputObjectConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap
  
  var name: String
}
object InputObjectConfig {
  
  inline def apply(fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap, name: String): InputObjectConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectConfig]
  }
  
  extension [Self <: InputObjectConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsCallbackTo(value: CallbackTo[InputObjectConfigFieldMap]): Self = StObject.set(x, "fields", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
