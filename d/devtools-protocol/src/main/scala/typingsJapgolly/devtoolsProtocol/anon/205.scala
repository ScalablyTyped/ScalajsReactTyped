package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearDataForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  var paramsType: js.Array[ClearDataForStorageKeyRequest]
  
  var returnType: Unit
}
object `205` {
  
  inline def apply(paramsType: js.Array[ClearDataForStorageKeyRequest], returnType: Unit): `205` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def setParamsType(value: js.Array[ClearDataForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearDataForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
