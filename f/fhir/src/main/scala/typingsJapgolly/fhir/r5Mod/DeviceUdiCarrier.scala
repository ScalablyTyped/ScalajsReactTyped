package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`electronic-transmission`
import typingsJapgolly.fhir.fhirStrings.`self-reported`
import typingsJapgolly.fhir.fhirStrings.barcode
import typingsJapgolly.fhir.fhirStrings.card
import typingsJapgolly.fhir.fhirStrings.manual
import typingsJapgolly.fhir.fhirStrings.rfid
import typingsJapgolly.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUdiCarrier
  extends StObject
     with BackboneElement {
  
  var _carrierAIDC: js.UndefOr[Element] = js.undefined
  
  var _carrierHRF: js.UndefOr[Element] = js.undefined
  
  var _deviceIdentifier: js.UndefOr[Element] = js.undefined
  
  var _entryType: js.UndefOr[Element] = js.undefined
  
  var _issuer: js.UndefOr[Element] = js.undefined
  
  var _jurisdiction: js.UndefOr[Element] = js.undefined
  
  /**
    * The AIDC form of UDIs should be scanned or otherwise used for the identification of the device whenever possible to minimize errors in records resulting from manual transcriptions. If separate barcodes for DI and PI are present, concatenate the string with DI first and in order of human readable expression on label.
    */
  var carrierAIDC: js.UndefOr[String] = js.undefined
  
  /**
    * If separate barcodes for DI and PI are present, concatenate the string with DI first and in order of human readable expression on label.
    */
  var carrierHRF: js.UndefOr[String] = js.undefined
  
  /**
    * The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device.
    */
  var deviceIdentifier: String
  
  /**
    * A coded entry to indicate how the data was entered.
    */
  var entryType: js.UndefOr[
    barcode | rfid | manual | card | `self-reported` | `electronic-transmission` | unknown
  ] = js.undefined
  
  /**
    * Organization that is charged with issuing UDIs for devices. For example, the US FDA issuers include:
    * 1) GS1: http://hl7.org/fhir/NamingSystem/gs1-di,
    * 2) HIBCC: http://hl7.org/fhir/NamingSystem/hibcc-diI,
    * 3) ICCBBA for blood containers: http://hl7.org/fhir/NamingSystem/iccbba-blood-di,
    * 4) ICCBA for other devices: http://hl7.org/fhir/NamingSystem/iccbba-other-di # Informationsstelle für Arzneispezialitäten (IFA GmbH) (EU only): http://hl7.org/fhir/NamingSystem/ifa-gmbh-di.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The identity of the authoritative source for UDI generation within a jurisdiction. All UDIs are globally unique within a single namespace with the appropriate repository uri as the system. For example, UDIs of devices managed in the U.S. by the FDA, the value is http://hl7.org/fhir/NamingSystem/us-fda-udi or in the European Union by the European Commission http://hl7.org/fhir/NamingSystem/eu-ec-udi.
    */
  var jurisdiction: js.UndefOr[String] = js.undefined
}
object DeviceUdiCarrier {
  
  inline def apply(deviceIdentifier: String): DeviceUdiCarrier = {
    val __obj = js.Dynamic.literal(deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUdiCarrier]
  }
  
  extension [Self <: DeviceUdiCarrier](x: Self) {
    
    inline def setCarrierAIDC(value: String): Self = StObject.set(x, "carrierAIDC", value.asInstanceOf[js.Any])
    
    inline def setCarrierAIDCUndefined: Self = StObject.set(x, "carrierAIDC", js.undefined)
    
    inline def setCarrierHRF(value: String): Self = StObject.set(x, "carrierHRF", value.asInstanceOf[js.Any])
    
    inline def setCarrierHRFUndefined: Self = StObject.set(x, "carrierHRF", js.undefined)
    
    inline def setDeviceIdentifier(value: String): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEntryType(value: barcode | rfid | manual | card | `self-reported` | `electronic-transmission` | unknown): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
    
    inline def setEntryTypeUndefined: Self = StObject.set(x, "entryType", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def set_carrierAIDC(value: Element): Self = StObject.set(x, "_carrierAIDC", value.asInstanceOf[js.Any])
    
    inline def set_carrierAIDCUndefined: Self = StObject.set(x, "_carrierAIDC", js.undefined)
    
    inline def set_carrierHRF(value: Element): Self = StObject.set(x, "_carrierHRF", value.asInstanceOf[js.Any])
    
    inline def set_carrierHRFUndefined: Self = StObject.set(x, "_carrierHRF", js.undefined)
    
    inline def set_deviceIdentifier(value: Element): Self = StObject.set(x, "_deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_deviceIdentifierUndefined: Self = StObject.set(x, "_deviceIdentifier", js.undefined)
    
    inline def set_entryType(value: Element): Self = StObject.set(x, "_entryType", value.asInstanceOf[js.Any])
    
    inline def set_entryTypeUndefined: Self = StObject.set(x, "_entryType", js.undefined)
    
    inline def set_issuer(value: Element): Self = StObject.set(x, "_issuer", value.asInstanceOf[js.Any])
    
    inline def set_issuerUndefined: Self = StObject.set(x, "_issuer", js.undefined)
    
    inline def set_jurisdiction(value: Element): Self = StObject.set(x, "_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_jurisdictionUndefined: Self = StObject.set(x, "_jurisdiction", js.undefined)
  }
}
