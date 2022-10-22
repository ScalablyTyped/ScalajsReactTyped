package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Any. */
trait IAny extends StObject {
  
  /** Any type_url */
  var type_url: js.UndefOr[String | Null] = js.undefined
  
  /** Any value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IAny {
  
  inline def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  extension [Self <: IAny](x: Self) {
    
    inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
    
    inline def setType_urlNull: Self = StObject.set(x, "type_url", null)
    
    inline def setType_urlUndefined: Self = StObject.set(x, "type_url", js.undefined)
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
