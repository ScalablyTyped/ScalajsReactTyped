package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValue extends StObject {
  
  var arrayValue: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
}
object ArrayValue {
  
  inline def apply(
    arrayValue: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
  ): ArrayValue = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayValue]
  }
  
  extension [Self <: ArrayValue](x: Self) {
    
    inline def setArrayValue(value: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
