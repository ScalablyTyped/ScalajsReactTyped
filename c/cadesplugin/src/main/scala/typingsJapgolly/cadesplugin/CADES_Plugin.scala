package typingsJapgolly.cadesplugin

import typingsJapgolly.cadesplugin.CAPICOM.Store
import typingsJapgolly.cadesplugin.CAPICOM.StoreAsync
import typingsJapgolly.cadesplugin.CAdESCOM.About
import typingsJapgolly.cadesplugin.CAdESCOM.AboutAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPAttribute
import typingsJapgolly.cadesplugin.CAdESCOM.CPAttributeAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPHashedData
import typingsJapgolly.cadesplugin.CAdESCOM.CPHashedDataAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPSigner
import typingsJapgolly.cadesplugin.CAdESCOM.CPSignerAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CadesSignedData
import typingsJapgolly.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typingsJapgolly.cadesplugin.CAdESCOM.RawSignature
import typingsJapgolly.cadesplugin.CAdESCOM.RawSignatureAsync
import typingsJapgolly.cadesplugin.CAdESCOM.SignedXML
import typingsJapgolly.cadesplugin.CAdESCOM.SignedXMLAsync
import typingsJapgolly.cadesplugin.cadespluginInts.`-1`
import typingsJapgolly.cadesplugin.cadespluginInts.`0`
import typingsJapgolly.cadesplugin.cadespluginInts.`1`
import typingsJapgolly.cadesplugin.cadespluginInts.`2`
import typingsJapgolly.cadesplugin.cadespluginInts.`4`
import typingsJapgolly.cadesplugin.cadespluginStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
import typingsJapgolly.cadesplugin.cadespluginStrings.`urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-256`
import typingsJapgolly.cadesplugin.cadespluginStrings.`urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-512`
import typingsJapgolly.cadesplugin.cadespluginStrings.urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CADES_Plugin {
  
  trait EncodingType extends StObject {
    
    val CADESCOM_ENCODE_ANY: `-1`
    
    val CADESCOM_ENCODE_BASE64: `0`
    
    val CADESCOM_ENCODE_BINARY: `1`
  }
  object EncodingType {
    
    inline def apply(): EncodingType = {
      val __obj = js.Dynamic.literal(CADESCOM_ENCODE_ANY = -1, CADESCOM_ENCODE_BASE64 = 0, CADESCOM_ENCODE_BINARY = 1)
      __obj.asInstanceOf[EncodingType]
    }
    
    extension [Self <: EncodingType](x: Self) {
      
      inline def setCADESCOM_ENCODE_ANY(value: `-1`): Self = StObject.set(x, "CADESCOM_ENCODE_ANY", value.asInstanceOf[js.Any])
      
      inline def setCADESCOM_ENCODE_BASE64(value: `0`): Self = StObject.set(x, "CADESCOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
      
      inline def setCADESCOM_ENCODE_BINARY(value: `1`): Self = StObject.set(x, "CADESCOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogLevel extends StObject {
    
    val LOG_LEVEL_DEBUG: `4`
    
    val LOG_LEVEL_ERROR: `1`
    
    val LOG_LEVEL_INFO: `2`
  }
  object LogLevel {
    
    inline def apply(): LogLevel = {
      val __obj = js.Dynamic.literal(LOG_LEVEL_DEBUG = 4, LOG_LEVEL_ERROR = 1, LOG_LEVEL_INFO = 2)
      __obj.asInstanceOf[LogLevel]
    }
    
    extension [Self <: LogLevel](x: Self) {
      
      inline def setLOG_LEVEL_DEBUG(value: `4`): Self = StObject.set(x, "LOG_LEVEL_DEBUG", value.asInstanceOf[js.Any])
      
      inline def setLOG_LEVEL_ERROR(value: `1`): Self = StObject.set(x, "LOG_LEVEL_ERROR", value.asInstanceOf[js.Any])
      
      inline def setLOG_LEVEL_INFO(value: `2`): Self = StObject.set(x, "LOG_LEVEL_INFO", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNames extends StObject {
    
    @JSName("CAPICOM.Store")
    var CAPICOMDotStore: Store
    
    @JSName("CAdESCOM.About")
    var CAdESCOMDotAbout: About
    
    @JSName("CAdESCOM.CPAttribute")
    var CAdESCOMDotCPAttribute: CPAttribute
    
    @JSName("CAdESCOM.CPSigner")
    var CAdESCOMDotCPSigner: CPSigner
    
    @JSName("CAdESCOM.CadesSignedData")
    var CAdESCOMDotCadesSignedData: CadesSignedData
    
    @JSName("CAdESCOM.HashedData")
    var CAdESCOMDotHashedData: CPHashedData
    
    @JSName("CAdESCOM.RawSignature")
    var CAdESCOMDotRawSignature: RawSignature
    
    @JSName("CAdESCOM.SignedXML")
    var CAdESCOMDotSignedXML: SignedXML
  }
  object ObjectNames {
    
    inline def apply(
      CAPICOMDotStore: Store,
      CAdESCOMDotAbout: About,
      CAdESCOMDotCPAttribute: CPAttribute,
      CAdESCOMDotCPSigner: CPSigner,
      CAdESCOMDotCadesSignedData: CadesSignedData,
      CAdESCOMDotHashedData: CPHashedData,
      CAdESCOMDotRawSignature: RawSignature,
      CAdESCOMDotSignedXML: SignedXML
    ): ObjectNames = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("CAPICOM.Store")(CAPICOMDotStore.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.About")(CAdESCOMDotAbout.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CPAttribute")(CAdESCOMDotCPAttribute.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CPSigner")(CAdESCOMDotCPSigner.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CadesSignedData")(CAdESCOMDotCadesSignedData.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.HashedData")(CAdESCOMDotHashedData.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.RawSignature")(CAdESCOMDotRawSignature.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.SignedXML")(CAdESCOMDotSignedXML.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectNames]
    }
    
    extension [Self <: ObjectNames](x: Self) {
      
      inline def setCAPICOMDotStore(value: Store): Self = StObject.set(x, "CAPICOM.Store", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotAbout(value: About): Self = StObject.set(x, "CAdESCOM.About", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCPAttribute(value: CPAttribute): Self = StObject.set(x, "CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCPSigner(value: CPSigner): Self = StObject.set(x, "CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCadesSignedData(value: CadesSignedData): Self = StObject.set(x, "CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotHashedData(value: CPHashedData): Self = StObject.set(x, "CAdESCOM.HashedData", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotRawSignature(value: RawSignature): Self = StObject.set(x, "CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotSignedXML(value: SignedXML): Self = StObject.set(x, "CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNamesAsync extends StObject {
    
    @JSName("CAdESCOM.About")
    var CAdESCOMDotAbout: AboutAsync
    
    @JSName("CAdESCOM.CPAttribute")
    var CAdESCOMDotCPAttribute: CPAttributeAsync
    
    @JSName("CAdESCOM.CPSigner")
    var CAdESCOMDotCPSigner: CPSignerAsync
    
    @JSName("CAdESCOM.CadesSignedData")
    var CAdESCOMDotCadesSignedData: CadesSignedDataAsync
    
    @JSName("CAdESCOM.HashedData")
    var CAdESCOMDotHashedData: CPHashedDataAsync
    
    @JSName("CAdESCOM.RawSignature")
    var CAdESCOMDotRawSignature: RawSignatureAsync
    
    @JSName("CAdESCOM.SignedXML")
    var CAdESCOMDotSignedXML: SignedXMLAsync
    
    @JSName("CAdESCOM.Store")
    var CAdESCOMDotStore: StoreAsync
  }
  object ObjectNamesAsync {
    
    inline def apply(
      CAdESCOMDotAbout: AboutAsync,
      CAdESCOMDotCPAttribute: CPAttributeAsync,
      CAdESCOMDotCPSigner: CPSignerAsync,
      CAdESCOMDotCadesSignedData: CadesSignedDataAsync,
      CAdESCOMDotHashedData: CPHashedDataAsync,
      CAdESCOMDotRawSignature: RawSignatureAsync,
      CAdESCOMDotSignedXML: SignedXMLAsync,
      CAdESCOMDotStore: StoreAsync
    ): ObjectNamesAsync = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("CAdESCOM.About")(CAdESCOMDotAbout.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CPAttribute")(CAdESCOMDotCPAttribute.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CPSigner")(CAdESCOMDotCPSigner.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.CadesSignedData")(CAdESCOMDotCadesSignedData.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.HashedData")(CAdESCOMDotHashedData.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.RawSignature")(CAdESCOMDotRawSignature.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.SignedXML")(CAdESCOMDotSignedXML.asInstanceOf[js.Any])
      __obj.updateDynamic("CAdESCOM.Store")(CAdESCOMDotStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectNamesAsync]
    }
    
    extension [Self <: ObjectNamesAsync](x: Self) {
      
      inline def setCAdESCOMDotAbout(value: AboutAsync): Self = StObject.set(x, "CAdESCOM.About", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCPAttribute(value: CPAttributeAsync): Self = StObject.set(x, "CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCPSigner(value: CPSignerAsync): Self = StObject.set(x, "CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotCadesSignedData(value: CadesSignedDataAsync): Self = StObject.set(x, "CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotHashedData(value: CPHashedDataAsync): Self = StObject.set(x, "CAdESCOM.HashedData", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotRawSignature(value: RawSignatureAsync): Self = StObject.set(x, "CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotSignedXML(value: SignedXMLAsync): Self = StObject.set(x, "CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
      
      inline def setCAdESCOMDotStore(value: StoreAsync): Self = StObject.set(x, "CAdESCOM.Store", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedXmlUrls extends StObject {
    
    val XmlDsigGost3410Url: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411 */ String
    
    val XmlDsigGost3410Url2012256: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256 */ String
    
    val XmlDsigGost3410Url2012512: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512 */ String
    
    val XmlDsigGost3410UrlObsolete: /* http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411 */ String
    
    val XmlDsigGost3411Url: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411
    
    val XmlDsigGost3411Url2012256: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-256`
    
    val XmlDsigGost3411Url2012512: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-512`
    
    val XmlDsigGost3411UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
  }
  object SignedXmlUrls {
    
    inline def apply(): SignedXmlUrls = {
      val __obj = js.Dynamic.literal(XmlDsigGost3410Url = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411", XmlDsigGost3410Url2012256 = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256", XmlDsigGost3410Url2012512 = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512", XmlDsigGost3410UrlObsolete = "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", XmlDsigGost3411Url = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr3411", XmlDsigGost3411Url2012256 = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34112012-256", XmlDsigGost3411Url2012512 = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34112012-512", XmlDsigGost3411UrlObsolete = "http://www.w3.org/2001/04/xmldsig-more#gostr3411")
      __obj.asInstanceOf[SignedXmlUrls]
    }
    
    extension [Self <: SignedXmlUrls](x: Self) {
      
      inline def setXmlDsigGost3410Url(value: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411 */ String): Self = StObject.set(x, "XmlDsigGost3410Url", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3410Url2012256(value: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256 */ String): Self = StObject.set(x, "XmlDsigGost3410Url2012256", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3410Url2012512(value: /* urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512 */ String): Self = StObject.set(x, "XmlDsigGost3410Url2012512", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3410UrlObsolete(value: /* http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411 */ String): Self = StObject.set(x, "XmlDsigGost3410UrlObsolete", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3411Url(value: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411): Self = StObject.set(x, "XmlDsigGost3411Url", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3411Url2012256(value: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-256`): Self = StObject.set(x, "XmlDsigGost3411Url2012256", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3411Url2012512(value: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34112012-512`): Self = StObject.set(x, "XmlDsigGost3411Url2012512", value.asInstanceOf[js.Any])
      
      inline def setXmlDsigGost3411UrlObsolete(value: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`): Self = StObject.set(x, "XmlDsigGost3411UrlObsolete", value.asInstanceOf[js.Any])
    }
  }
}
