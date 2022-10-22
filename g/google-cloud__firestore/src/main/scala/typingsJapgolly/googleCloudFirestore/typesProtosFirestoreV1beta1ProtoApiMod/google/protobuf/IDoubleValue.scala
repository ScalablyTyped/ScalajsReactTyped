package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DoubleValue. */
trait IDoubleValue extends StObject {
  
  /** DoubleValue value */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object IDoubleValue {
  
  inline def apply(): IDoubleValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoubleValue]
  }
  
  extension [Self <: IDoubleValue](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
