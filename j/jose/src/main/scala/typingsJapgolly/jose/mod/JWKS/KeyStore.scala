package typingsJapgolly.jose.mod.JWKS

import typingsJapgolly.jose.joseStrings.EC
import typingsJapgolly.jose.joseStrings.OKP
import typingsJapgolly.jose.joseStrings.RSA
import typingsJapgolly.jose.joseStrings.oct
import typingsJapgolly.jose.mod.BasicParameters
import typingsJapgolly.jose.mod.ECCurve
import typingsJapgolly.jose.mod.JSONWebKeySet
import typingsJapgolly.jose.mod.JWK.Key
import typingsJapgolly.jose.mod.OKPCurve
import typingsJapgolly.jose.mod._ConsumeKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWKS.KeyStore")
@js.native
class KeyStore () extends _ConsumeKeyInput {
  def this(keys: js.Array[Key]) = this()
  var size: Double = js.native
  def add(key: Key): Unit = js.native
  def all(): js.Array[Key] = js.native
  def all(parameters: KeyQuery): js.Array[Key] = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC): Unit = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve): Unit = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): Unit = js.native
  @JSName("generateSync")
  def generateSync_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP): Unit = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve): Unit = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): Unit = js.native
  @JSName("generateSync")
  def generateSync_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA): Unit = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double): Unit = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): Unit = js.native
  @JSName("generateSync")
  def generateSync_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct): Unit = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct, bitlength: Double): Unit = js.native
  @JSName("generateSync")
  def generateSync_oct(kty: oct, bitlength: Double, parameters: BasicParameters): Unit = js.native
  @JSName("generate")
  def generate_EC(kty: EC): Unit = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve): Unit = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters): Unit = js.native
  @JSName("generate")
  def generate_EC(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP): Unit = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve): Unit = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters): Unit = js.native
  @JSName("generate")
  def generate_OKP(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA): Unit = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double): Unit = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters): Unit = js.native
  @JSName("generate")
  def generate_RSA(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): Unit = js.native
  @JSName("generate")
  def generate_oct(kty: oct): Unit = js.native
  @JSName("generate")
  def generate_oct(kty: oct, bitlength: Double): Unit = js.native
  @JSName("generate")
  def generate_oct(kty: oct, bitlength: Double, parameters: BasicParameters): Unit = js.native
  def get(): Key = js.native
  def get(parameters: KeyQuery): Key = js.native
  def remove(key: Key): Unit = js.native
  def toJWKS(): JSONWebKeySet = js.native
  def toJWKS(`private`: Boolean): JSONWebKeySet = js.native
}

/* static members */
@JSImport("jose", "JWKS.KeyStore")
@js.native
object KeyStore extends js.Object {
  /*
    * @deprecated in favor of JWKS.asKeyStore
    */
  def fromJWKS(jwks: JSONWebKeySet): KeyStore = js.native
}

