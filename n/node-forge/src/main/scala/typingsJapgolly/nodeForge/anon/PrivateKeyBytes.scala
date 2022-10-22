package typingsJapgolly.nodeForge.anon

import typingsJapgolly.nodeForge.mod.pki.ed25519.NativeBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyBytes extends StObject {
  
  var privateKeyBytes: NativeBuffer
}
object PrivateKeyBytes {
  
  inline def apply(privateKeyBytes: NativeBuffer): PrivateKeyBytes = {
    val __obj = js.Dynamic.literal(privateKeyBytes = privateKeyBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBytes]
  }
  
  extension [Self <: PrivateKeyBytes](x: Self) {
    
    inline def setPrivateKeyBytes(value: NativeBuffer): Self = StObject.set(x, "privateKeyBytes", value.asInstanceOf[js.Any])
  }
}
