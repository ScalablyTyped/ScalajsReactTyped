package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`read-only`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /** @description Unique identifier of the label. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @description Name of the label. */
  var name: String
  
  /**
    * @description The type of label. Read-only labels are applied automatically when the runner is configured.
    * @enum {string}
    */
  var `type`: js.UndefOr[`read-only` | custom] = js.undefined
}
object Id {
  
  inline def apply(name: String): Id = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `read-only` | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
