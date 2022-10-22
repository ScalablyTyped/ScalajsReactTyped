package typingsJapgolly.xadesjs

import org.scalajs.dom.Algorithm
import org.scalajs.dom.CryptoKey
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.std.AlgorithmIdentifier
import typingsJapgolly.xadesjs.buildTypesXmlMod.QualifyingProperties
import typingsJapgolly.xadesjs.buildTypesXmlObjectIdentifierMod.IdentifierQualifier
import typingsJapgolly.xmldsigjs.buildTypesSignedXmlMod.DigestReferenceSource
import typingsJapgolly.xmldsigjs.buildTypesSignedXmlMod.OptionsSign
import typingsJapgolly.xmldsigjs.buildTypesSignedXmlMod.OptionsSignTransform
import typingsJapgolly.xmldsigjs.mod.Signature
import typingsJapgolly.xmldsigjs.mod.X509Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSignedXmlMod {
  
  @JSImport("xadesjs/build/types/signed_xml", "SignedXml")
  @js.native
  open class SignedXml ()
    extends typingsJapgolly.xmldsigjs.mod.SignedXml {
    def this(node: Document) = this()
    def this(node: Element) = this()
    
    /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsXAdES): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySignaturePolicyIdentifier(): js.Promise[Unit] = js.native
    /* protected */ def ApplySignaturePolicyIdentifier(options: Boolean): js.Promise[Unit] = js.native
    /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySignatureProductionPlace(): Unit = js.native
    /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): Unit = js.native
    
    /* protected */ def ApplySignerRoles(): Unit = js.native
    /* protected */ def ApplySignerRoles(options: OptionsSignerRole): Unit = js.native
    
    /* protected */ def ApplySigningCertificate(): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificate(value: String): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificate(value: OptionsSigningCertificate): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySigningCertificateV2(): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificateV2(value: String): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificateV2(value: OptionsSigningCertificateV2): js.Promise[Unit] = js.native
    
    /* protected */ def CreateQualifyingProperties(): Unit = js.native
    
    def LoadXml(value: String, useContainer: Boolean): Unit = js.native
    def LoadXml(value: Element, useContainer: Boolean): Unit = js.native
    
    def Properties: QualifyingProperties | Null = js.native
    
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsXAdES): js.Promise[Signature] = js.native
    def Sign(algorithm: Algorithm, key: CryptoKey, data: DigestReferenceSource, options: OptionsXAdES): js.Promise[Signature] = js.native
    
    def SignedProperties: typingsJapgolly.xadesjs.buildTypesXmlMod.SignedProperties = js.native
    
    def UnsignedProperties: typingsJapgolly.xadesjs.buildTypesXmlMod.UnsignedProperties = js.native
    
    /* protected */ def VerifySigningCertificate(): js.Promise[X509Certificate | Null] = js.native
    
    /* protected */ var properties: QualifyingProperties | Null = js.native
  }
  
  trait OptionsNoticeReference extends StObject {
    
    var noticeNumbers: js.Array[Double]
    
    var organization: String
  }
  object OptionsNoticeReference {
    
    inline def apply(noticeNumbers: js.Array[Double], organization: String): OptionsNoticeReference = {
      val __obj = js.Dynamic.literal(noticeNumbers = noticeNumbers.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsNoticeReference]
    }
    
    extension [Self <: OptionsNoticeReference](x: Self) {
      
      inline def setNoticeNumbers(value: js.Array[Double]): Self = StObject.set(x, "noticeNumbers", value.asInstanceOf[js.Any])
      
      inline def setNoticeNumbersVarargs(value: Double*): Self = StObject.set(x, "noticeNumbers", js.Array(value*))
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsPolicyId extends StObject {
    
    var digestValue: js.UndefOr[String] = js.undefined
    
    var hash: AlgorithmIdentifier
    
    var identifier: OptionsPolicyIdentifier
    
    var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | String]] = js.undefined
    
    var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.undefined
  }
  object OptionsPolicyId {
    
    inline def apply(hash: AlgorithmIdentifier, identifier: OptionsPolicyIdentifier): OptionsPolicyId = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsPolicyId]
    }
    
    extension [Self <: OptionsPolicyId](x: Self) {
      
      inline def setDigestValue(value: String): Self = StObject.set(x, "digestValue", value.asInstanceOf[js.Any])
      
      inline def setDigestValueUndefined: Self = StObject.set(x, "digestValue", js.undefined)
      
      inline def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: OptionsPolicyIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: js.Array[OptionsPolicyUserNotice | String]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def setQualifiersUndefined: Self = StObject.set(x, "qualifiers", js.undefined)
      
      inline def setQualifiersVarargs(value: (OptionsPolicyUserNotice | String)*): Self = StObject.set(x, "qualifiers", js.Array(value*))
      
      inline def setTransforms(value: js.Array[OptionsSignTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: OptionsSignTransform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  trait OptionsPolicyIdentifier extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var qualifier: js.UndefOr[IdentifierQualifier] = js.undefined
    
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: String
  }
  object OptionsPolicyIdentifier {
    
    inline def apply(value: String): OptionsPolicyIdentifier = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsPolicyIdentifier]
    }
    
    extension [Self <: OptionsPolicyIdentifier](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setQualifier(value: IdentifierQualifier): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsPolicyUserNotice extends StObject {
    
    var explicitText: js.UndefOr[String] = js.undefined
    
    var noticeRef: js.UndefOr[OptionsNoticeReference] = js.undefined
  }
  object OptionsPolicyUserNotice {
    
    inline def apply(): OptionsPolicyUserNotice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsPolicyUserNotice]
    }
    
    extension [Self <: OptionsPolicyUserNotice](x: Self) {
      
      inline def setExplicitText(value: String): Self = StObject.set(x, "explicitText", value.asInstanceOf[js.Any])
      
      inline def setExplicitTextUndefined: Self = StObject.set(x, "explicitText", js.undefined)
      
      inline def setNoticeRef(value: OptionsNoticeReference): Self = StObject.set(x, "noticeRef", value.asInstanceOf[js.Any])
      
      inline def setNoticeRefUndefined: Self = StObject.set(x, "noticeRef", js.undefined)
    }
  }
  
  trait OptionsProductionPlace extends StObject {
    
    var city: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object OptionsProductionPlace {
    
    inline def apply(): OptionsProductionPlace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsProductionPlace]
    }
    
    extension [Self <: OptionsProductionPlace](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait OptionsSignerRole extends StObject {
    
    var certified: js.UndefOr[js.Array[String]] = js.undefined
    
    var claimed: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OptionsSignerRole {
    
    inline def apply(): OptionsSignerRole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSignerRole]
    }
    
    extension [Self <: OptionsSignerRole](x: Self) {
      
      inline def setCertified(value: js.Array[String]): Self = StObject.set(x, "certified", value.asInstanceOf[js.Any])
      
      inline def setCertifiedUndefined: Self = StObject.set(x, "certified", js.undefined)
      
      inline def setCertifiedVarargs(value: String*): Self = StObject.set(x, "certified", js.Array(value*))
      
      inline def setClaimed(value: js.Array[String]): Self = StObject.set(x, "claimed", value.asInstanceOf[js.Any])
      
      inline def setClaimedUndefined: Self = StObject.set(x, "claimed", js.undefined)
      
      inline def setClaimedVarargs(value: String*): Self = StObject.set(x, "claimed", js.Array(value*))
    }
  }
  
  trait OptionsSigningCertificate extends StObject {
    
    var certificate: String
    
    var digestAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  }
  object OptionsSigningCertificate {
    
    inline def apply(certificate: String): OptionsSigningCertificate = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsSigningCertificate]
    }
    
    extension [Self <: OptionsSigningCertificate](x: Self) {
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    }
  }
  
  trait OptionsSigningCertificateV2 extends StObject {
    
    var certificate: String
    
    var digestAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  }
  object OptionsSigningCertificateV2 {
    
    inline def apply(certificate: String): OptionsSigningCertificateV2 = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsSigningCertificateV2]
    }
    
    extension [Self <: OptionsSigningCertificateV2](x: Self) {
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    }
  }
  
  trait OptionsSigningTime extends StObject {
    
    /**
      * Format of the signing time. Default format is ISO
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Signing time value. Default value if now
      */
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object OptionsSigningTime {
    
    inline def apply(): OptionsSigningTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSigningTime]
    }
    
    extension [Self <: OptionsSigningTime](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptionsXAdES
    extends StObject
       with OptionsSign {
    
    var policy: js.UndefOr[OptionsPolicyId | Boolean] = js.undefined
    
    var productionPlace: js.UndefOr[OptionsProductionPlace] = js.undefined
    
    var signerRole: js.UndefOr[OptionsSignerRole] = js.undefined
    
    /**
      * Sets a certificate of signer for signature. Optional
      */
    var signingCertificate: js.UndefOr[String | OptionsSigningCertificate] = js.undefined
    
    /**
      * Sets a certificate of signer for signature. Optional
      */
    var signingCertificateV2: js.UndefOr[String | OptionsSigningCertificateV2] = js.undefined
    
    /**
      * Sets signing time options
      */
    var signingTime: js.UndefOr[OptionsSigningTime] = js.undefined
  }
  object OptionsXAdES {
    
    inline def apply(): OptionsXAdES = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsXAdES]
    }
    
    extension [Self <: OptionsXAdES](x: Self) {
      
      inline def setPolicy(value: OptionsPolicyId | Boolean): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setProductionPlace(value: OptionsProductionPlace): Self = StObject.set(x, "productionPlace", value.asInstanceOf[js.Any])
      
      inline def setProductionPlaceUndefined: Self = StObject.set(x, "productionPlace", js.undefined)
      
      inline def setSignerRole(value: OptionsSignerRole): Self = StObject.set(x, "signerRole", value.asInstanceOf[js.Any])
      
      inline def setSignerRoleUndefined: Self = StObject.set(x, "signerRole", js.undefined)
      
      inline def setSigningCertificate(value: String | OptionsSigningCertificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
      
      inline def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
      
      inline def setSigningCertificateV2(value: String | OptionsSigningCertificateV2): Self = StObject.set(x, "signingCertificateV2", value.asInstanceOf[js.Any])
      
      inline def setSigningCertificateV2Undefined: Self = StObject.set(x, "signingCertificateV2", js.undefined)
      
      inline def setSigningTime(value: OptionsSigningTime): Self = StObject.set(x, "signingTime", value.asInstanceOf[js.Any])
      
      inline def setSigningTimeUndefined: Self = StObject.set(x, "signingTime", js.undefined)
    }
  }
}
