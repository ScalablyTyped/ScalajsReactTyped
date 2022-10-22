package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.ssh2.ssh2Strings.publickey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: js.UndefOr[Buffer] = js.native
  
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  
  /** The method of authentication. */
  @JSName("method")
  var method_PublicKeyAuthContext: publickey = js.native
  
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: js.UndefOr[Buffer] = js.native
}
