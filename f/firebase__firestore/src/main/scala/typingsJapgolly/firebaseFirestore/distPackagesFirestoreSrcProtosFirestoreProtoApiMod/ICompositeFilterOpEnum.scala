package typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompositeFilterOpEnum extends StObject {
  
  var AND: CompositeFilterOp
  
  var OPERATOR_UNSPECIFIED: CompositeFilterOp
  
  def values(): js.Array[CompositeFilterOp]
}
object ICompositeFilterOpEnum {
  
  inline def apply(
    AND: CompositeFilterOp,
    OPERATOR_UNSPECIFIED: CompositeFilterOp,
    values: CallbackTo[js.Array[CompositeFilterOp]]
  ): ICompositeFilterOpEnum = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[ICompositeFilterOpEnum]
  }
  
  extension [Self <: ICompositeFilterOpEnum](x: Self) {
    
    inline def setAND(value: CompositeFilterOp): Self = StObject.set(x, "AND", value.asInstanceOf[js.Any])
    
    inline def setOPERATOR_UNSPECIFIED(value: CompositeFilterOp): Self = StObject.set(x, "OPERATOR_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[CompositeFilterOp]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
