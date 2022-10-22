package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValueArrayValue extends StObject {
  
  var arrayValue: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
}
object ArrayValueArrayValue {
  
  inline def apply(
    arrayValue: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
  ): ArrayValueArrayValue = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayValueArrayValue]
  }
  
  extension [Self <: ArrayValueArrayValue](x: Self) {
    
    inline def setArrayValue(value: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
