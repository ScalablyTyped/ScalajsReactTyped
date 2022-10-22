package typingsJapgolly.ipfsHttpServer.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlg extends StObject {
  
  var data: Buffer
  
  var hashAlg: Any
}
object HashAlg {
  
  inline def apply(data: Buffer, hashAlg: Any): HashAlg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
  
  extension [Self <: HashAlg](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
  }
}
