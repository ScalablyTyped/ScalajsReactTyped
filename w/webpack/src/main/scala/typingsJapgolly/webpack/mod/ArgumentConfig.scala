package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.webpackStrings.RegExp
import typingsJapgolly.webpack.webpackStrings.`enum`
import typingsJapgolly.webpack.webpackStrings.boolean
import typingsJapgolly.webpack.webpackStrings.number
import typingsJapgolly.webpack.webpackStrings.path
import typingsJapgolly.webpack.webpackStrings.reset
import typingsJapgolly.webpack.webpackStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentConfig extends StObject {
  
  var description: String
  
  var multiple: Boolean
  
  var negatedDescription: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var `type`: string | number | boolean | path | `enum` | RegExp | reset
  
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object ArgumentConfig {
  
  inline def apply(
    description: String,
    multiple: Boolean,
    path: String,
    `type`: string | number | boolean | path | `enum` | RegExp | reset
  ): ArgumentConfig = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentConfig]
  }
  
  extension [Self <: ArgumentConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setNegatedDescription(value: String): Self = StObject.set(x, "negatedDescription", value.asInstanceOf[js.Any])
    
    inline def setNegatedDescriptionUndefined: Self = StObject.set(x, "negatedDescription", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: string | number | boolean | path | `enum` | RegExp | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
