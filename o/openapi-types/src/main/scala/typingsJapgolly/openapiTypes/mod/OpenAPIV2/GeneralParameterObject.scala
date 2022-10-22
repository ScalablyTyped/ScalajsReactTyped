package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralParameterObject
  extends StObject
     with ParameterObject
     with ItemsObject
     with Parameter {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
}
object GeneralParameterObject {
  
  inline def apply(in: String, name: String, `type`: String): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralParameterObject]
  }
  
  extension [Self <: GeneralParameterObject](x: Self) {
    
    inline def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
  }
}
