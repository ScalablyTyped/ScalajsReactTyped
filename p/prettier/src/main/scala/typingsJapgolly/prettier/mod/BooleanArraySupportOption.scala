package typingsJapgolly.prettier.mod

import typingsJapgolly.prettier.anon.Value
import typingsJapgolly.prettier.prettierBooleans.`true`
import typingsJapgolly.prettier.prettierStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanArraySupportOption
  extends StObject
     with BaseSupportOption[boolean]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[Value]] = js.undefined
  
  var array: `true`
}
object BooleanArraySupportOption {
  
  inline def apply(category: String, since: String): BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanArraySupportOption]
  }
  
  extension [Self <: BooleanArraySupportOption](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[Value]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Value*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
