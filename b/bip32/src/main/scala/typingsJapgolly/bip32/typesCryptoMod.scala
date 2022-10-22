package typingsJapgolly.bip32

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoMod {
  
  @JSImport("bip32/types/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hmacSHA512(key: Buffer, data: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSHA512")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
