package typingsJapgolly.nodeForge.anon

import typingsJapgolly.nodeForge.mod.pki.ed25519.BinaryBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  var publicKey: BinaryBuffer
  
  var signature: BinaryBuffer
}
object PublicKey {
  
  inline def apply(publicKey: BinaryBuffer, signature: BinaryBuffer): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setPublicKey(value: BinaryBuffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: BinaryBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
