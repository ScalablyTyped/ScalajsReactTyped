package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.AnonPrivateKey
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.nodeStrings.der
import typingsJapgolly.node.nodeStrings.dsa
import typingsJapgolly.node.nodeStrings.ec
import typingsJapgolly.node.nodeStrings.pem
import typingsJapgolly.node.nodeStrings.rsa
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  def apply(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def promisify_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def promisify_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

