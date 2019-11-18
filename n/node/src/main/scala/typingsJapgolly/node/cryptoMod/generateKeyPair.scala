package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Anon_PrivateKey
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.Error
import typingsJapgolly.node.nodeStrings.der
import typingsJapgolly.node.nodeStrings.dsa
import typingsJapgolly.node.nodeStrings.ec
import typingsJapgolly.node.nodeStrings.pem
import typingsJapgolly.node.nodeStrings.rsa
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
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
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
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
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
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

