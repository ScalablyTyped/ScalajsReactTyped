package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inclusive extends StObject {
  
  var inclusive: Boolean
  
  var value: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
}
object Inclusive {
  
  inline def apply(
    inclusive: Boolean,
    value: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
  ): Inclusive = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inclusive]
  }
  
  extension [Self <: Inclusive](x: Self) {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
