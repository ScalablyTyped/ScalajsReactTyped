package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcRemoteNumberSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/remote/number_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDouble(serializer: Serializer, value: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("toDouble")(serializer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def toInteger(value: Double): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("toInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def toNumber(serializer: Serializer, value: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(serializer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  trait Serializer extends StObject {
    
    val useProto3Json: Boolean
  }
  object Serializer {
    
    inline def apply(useProto3Json: Boolean): Serializer = {
      val __obj = js.Dynamic.literal(useProto3Json = useProto3Json.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serializer]
    }
    
    extension [Self <: Serializer](x: Self) {
      
      inline def setUseProto3Json(value: Boolean): Self = StObject.set(x, "useProto3Json", value.asInstanceOf[js.Any])
    }
  }
}
