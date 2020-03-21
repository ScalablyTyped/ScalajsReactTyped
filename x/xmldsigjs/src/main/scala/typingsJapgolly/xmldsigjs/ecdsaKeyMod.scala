package typingsJapgolly.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.xmlCore.mod.XmlObject
import typingsJapgolly.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", JSImport.Namespace)
@js.native
object ecdsaKeyMod extends js.Object {
  @js.native
  class DomainParameters () extends XmlObject {
    var NamedCurve: typingsJapgolly.xmldsigjs.ecdsaKeyMod.NamedCurve = js.native
  }
  
  @js.native
  class EcdsaKeyValue () extends KeyInfoClause {
    var DomainParameters: typingsJapgolly.xmldsigjs.ecdsaKeyMod.DomainParameters = js.native
    var PublicKey: EcdsaPublicKey = js.native
    var jwk: JsonWebKey | Null = js.native
    var key: CryptoKey | Null = js.native
    var keyUsage: js.Array[String] | Null = js.native
    var name: String = js.native
    /**
      * Gets the NamedCurve value of then public key
      */
    def NamedCurve(): String = js.native
  }
  
  @js.native
  class EcdsaPublicKey () extends XmlObject {
    var X: scala.scalajs.js.typedarray.Uint8Array = js.native
    var Y: scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  class NamedCurve () extends XmlObject {
    var Uri: String = js.native
  }
  
  trait _NamedCurveType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-256`
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-384`
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
}

