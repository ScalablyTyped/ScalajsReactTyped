package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.buildTypesPkiMod.X509Certificate
import typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.RsaPSSSignParams
import typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlKeyInfosMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "DomainParameters")
  @js.native
  open class DomainParameters ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.DomainParameters {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaKeyValue")
  @js.native
  open class EcdsaKeyValue ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.EcdsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaPublicKey")
  @js.native
  open class EcdsaPublicKey ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.EcdsaPublicKey {
    def this(properties: js.Object) = this()
  }
  
  /* note: abstract class */ @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoClause")
  @js.native
  open class KeyInfoClause ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoX509Data")
  @js.native
  open class KeyInfoX509Data ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyValue")
  @js.native
  open class KeyValue ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosKeyValueMod.KeyValue {
    def this(value: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "MaskGenerationFunction")
  @js.native
  open class MaskGenerationFunction ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.MaskGenerationFunction {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "NamedCurve")
  @js.native
  open class NamedCurve ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.NamedCurve {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
  @js.native
  open class PssAlgorithmParams ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FromAlgorithm(algorithm: RsaPSSSignParams): typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams = ^.asInstanceOf[js.Dynamic].applyDynamic("FromAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams]
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "RsaKeyValue")
  @js.native
  open class RsaKeyValue ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.RsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "SPKIData")
  @js.native
  open class SPKIData ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosSpkiDataMod.SPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption & Double
      ] = js.native
    
    /* 1 */ val EndCertOnly: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.EndCertOnly & Double = js.native
    
    /* 2 */ val ExcludeRoot: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.ExcludeRoot & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.None & Double = js.native
    
    /* 3 */ val WholeChain: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.WholeChain & Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IssuerSerial")
  @js.native
  open class X509IssuerSerial ()
    extends typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IssuerSerial {
    def this(properties: js.Object) = this()
  }
}
