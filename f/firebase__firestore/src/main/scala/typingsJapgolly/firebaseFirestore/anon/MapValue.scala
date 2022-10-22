package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue extends StObject {
  
  var mapValue: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue
}
object MapValue {
  
  inline def apply(mapValue: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue): MapValue = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setMapValue(value: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
