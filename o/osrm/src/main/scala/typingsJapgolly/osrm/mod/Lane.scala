package typingsJapgolly.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Lane represents a turn lane at the corresponding turn location.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#lane-object
  */
trait Lane extends StObject {
  
  var indications: js.Array[Indication]
  
  var valid: Boolean
}
object Lane {
  
  inline def apply(indications: js.Array[Indication], valid: Boolean): Lane = {
    val __obj = js.Dynamic.literal(indications = indications.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  
  extension [Self <: Lane](x: Self) {
    
    inline def setIndications(value: js.Array[Indication]): Self = StObject.set(x, "indications", value.asInstanceOf[js.Any])
    
    inline def setIndicationsVarargs(value: Indication*): Self = StObject.set(x, "indications", js.Array(value*))
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
