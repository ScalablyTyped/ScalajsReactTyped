package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the property values for a PlayReady-ND transmitter certificate. */
trait INDTransmitterProperties extends StObject {
  
  /** Gets the certificate type for the transmitter. */
  var certificateType: NDCertificateType
  
  /** Gets the client identifier from the transmitter certificate. */
  var clientID: Double
  
  /** Gets the expiration date and time from the transmitter certificate. */
  var expirationDate: js.Date
  
  /** Gets the model digest from a transmitter certificate. */
  var modelDigest: Double
  
  /** Gets the model manufacturer name from a transmitter certificate. */
  var modelManufacturerName: String
  
  /** Gets the model name from a transmitter certificate. */
  var modelName: String
  
  /** Gets the model number from a transmitter certificate. */
  var modelNumber: String
  
  /** Gets the platform identifier from a transmitter certificate. */
  var platformIdentifier: NDCertificatePlatformID
  
  /** Gets the security level from a transmitter certificate. */
  var securityLevel: Double
  
  /** Gets the security version from a transmitter certificate. */
  var securityVersion: Double
  
  /** Gets the list of supported features from the transmitter certificate. */
  var supportedFeatures: NDCertificateFeature
}
object INDTransmitterProperties {
  
  inline def apply(
    certificateType: NDCertificateType,
    clientID: Double,
    expirationDate: js.Date,
    modelDigest: Double,
    modelManufacturerName: String,
    modelName: String,
    modelNumber: String,
    platformIdentifier: NDCertificatePlatformID,
    securityLevel: Double,
    securityVersion: Double,
    supportedFeatures: NDCertificateFeature
  ): INDTransmitterProperties = {
    val __obj = js.Dynamic.literal(certificateType = certificateType.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], modelDigest = modelDigest.asInstanceOf[js.Any], modelManufacturerName = modelManufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], platformIdentifier = platformIdentifier.asInstanceOf[js.Any], securityLevel = securityLevel.asInstanceOf[js.Any], securityVersion = securityVersion.asInstanceOf[js.Any], supportedFeatures = supportedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDTransmitterProperties]
  }
  
  extension [Self <: INDTransmitterProperties](x: Self) {
    
    inline def setCertificateType(value: NDCertificateType): Self = StObject.set(x, "certificateType", value.asInstanceOf[js.Any])
    
    inline def setClientID(value: Double): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setModelDigest(value: Double): Self = StObject.set(x, "modelDigest", value.asInstanceOf[js.Any])
    
    inline def setModelManufacturerName(value: String): Self = StObject.set(x, "modelManufacturerName", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdentifier(value: NDCertificatePlatformID): Self = StObject.set(x, "platformIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevel(value: Double): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityVersion(value: Double): Self = StObject.set(x, "securityVersion", value.asInstanceOf[js.Any])
    
    inline def setSupportedFeatures(value: NDCertificateFeature): Self = StObject.set(x, "supportedFeatures", value.asInstanceOf[js.Any])
  }
}
