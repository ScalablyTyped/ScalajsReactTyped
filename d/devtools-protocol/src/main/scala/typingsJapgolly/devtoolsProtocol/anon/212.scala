package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var paramsType: js.Array[TrackIndexedDBForStorageKeyRequest]
  
  var returnType: Unit
}
object `212` {
  
  inline def apply(paramsType: js.Array[TrackIndexedDBForStorageKeyRequest], returnType: Unit): `212` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`212`]
  }
  
  extension [Self <: `212`](x: Self) {
    
    inline def setParamsType(value: js.Array[TrackIndexedDBForStorageKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackIndexedDBForStorageKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
