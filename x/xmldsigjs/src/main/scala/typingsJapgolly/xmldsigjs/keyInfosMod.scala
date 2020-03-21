package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.pkiMod.X509Certificate
import typingsJapgolly.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos", JSImport.Namespace)
@js.native
object keyInfosMod extends js.Object {
  @js.native
  class DomainParameters ()
    extends typingsJapgolly.xmldsigjs.ecdsaKeyMod.DomainParameters
  
  @js.native
  class EcdsaKeyValue ()
    extends typingsJapgolly.xmldsigjs.ecdsaKeyMod.EcdsaKeyValue
  
  @js.native
  class EcdsaPublicKey ()
    extends typingsJapgolly.xmldsigjs.ecdsaKeyMod.EcdsaPublicKey
  
  @js.native
  abstract class KeyInfoClause ()
    extends typingsJapgolly.xmldsigjs.keyInfoClauseMod.KeyInfoClause
  
  @js.native
  class KeyInfoX509Data ()
    extends typingsJapgolly.xmldsigjs.x509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @js.native
  class KeyValue ()
    extends typingsJapgolly.xmldsigjs.keyValueMod.KeyValue {
    def this(value: typingsJapgolly.xmldsigjs.keyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @js.native
  class MaskGenerationFunction ()
    extends typingsJapgolly.xmldsigjs.rsaKeyMod.MaskGenerationFunction
  
  @js.native
  class NamedCurve ()
    extends typingsJapgolly.xmldsigjs.ecdsaKeyMod.NamedCurve
  
  @js.native
  class PssAlgorithmParams ()
    extends typingsJapgolly.xmldsigjs.rsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  
  @js.native
  class RsaKeyValue ()
    extends typingsJapgolly.xmldsigjs.rsaKeyMod.RsaKeyValue
  
  @js.native
  class SPKIData ()
    extends typingsJapgolly.xmldsigjs.spkiDataMod.SPKIData
  
  @js.native
  class X509IssuerSerial ()
    extends typingsJapgolly.xmldsigjs.x509DataMod.X509IssuerSerial
  
  /* static members */
  @js.native
  object PssAlgorithmParams extends js.Object {
    def FromAlgorithm(algorithm: RsaPSSSignParams): typingsJapgolly.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
  }
  
  @js.native
  object X509IncludeOption extends js.Object {
    /* 1 */ val EndCertOnly: typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    /* 2 */ val ExcludeRoot: typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    /* 0 */ val None: typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    /* 3 */ val WholeChain: typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
  }
  
}

