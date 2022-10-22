package typingsJapgolly.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipOpEnumValues
  extends StObject
     with EmbindEnum {
  
  var Difference: ClipOp
  
  var Intersect: ClipOp
}
object ClipOpEnumValues {
  
  inline def apply(Difference: ClipOp, Intersect: ClipOp, values: js.Array[Double]): ClipOpEnumValues = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipOpEnumValues]
  }
  
  extension [Self <: ClipOpEnumValues](x: Self) {
    
    inline def setDifference(value: ClipOp): Self = StObject.set(x, "Difference", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: ClipOp): Self = StObject.set(x, "Intersect", value.asInstanceOf[js.Any])
  }
}
