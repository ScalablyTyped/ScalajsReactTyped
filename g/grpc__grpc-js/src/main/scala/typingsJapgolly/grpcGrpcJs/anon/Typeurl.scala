package typingsJapgolly.grpcGrpcJs.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeurl extends StObject {
  
  var type_url: String
  
  var value: Buffer | js.typedarray.Uint8Array | String
}
object Typeurl {
  
  inline def apply(type_url: String, value: Buffer | js.typedarray.Uint8Array | String): Typeurl = {
    val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeurl]
  }
  
  extension [Self <: Typeurl](x: Self) {
    
    inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
