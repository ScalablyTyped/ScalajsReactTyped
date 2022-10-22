package typingsJapgolly.xmldsigjs

import org.scalajs.dom.CryptoKey
import org.scalajs.dom.JsonWebKey
import typingsJapgolly.xmlCore.mod.XmlObject
import typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlKeyInfosEcdsaKeyMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "DomainParameters")
  @js.native
  open class DomainParameters () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var NamedCurve: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.NamedCurve = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaKeyValue")
  @js.native
  open class EcdsaKeyValue () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    var DomainParameters: typingsJapgolly.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.DomainParameters = js.native
    
    /**
      * Gets the NamedCurve value of then public key
      */
    def NamedCurve: String = js.native
    
    var PublicKey: EcdsaPublicKey = js.native
    
    /* protected */ var jwk: JsonWebKey | Null = js.native
    
    /* protected */ var key: CryptoKey | Null = js.native
    
    /* protected */ var keyUsage: js.Array[String] | Null = js.native
    
    /* protected */ var name: String = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaPublicKey")
  @js.native
  open class EcdsaPublicKey () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var X: js.typedarray.Uint8Array = js.native
    
    var Y: js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "NamedCurve")
  @js.native
  open class NamedCurve () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-256`
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-384`
    - typingsJapgolly.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
  
  trait _NamedCurveType extends StObject
}
