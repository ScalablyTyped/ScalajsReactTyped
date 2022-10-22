package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents parameters to use when building a certificate chain. */
trait ChainBuildingParameters extends StObject {
  
  /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
  var authorityInformationAccessEnabled: Boolean
  
  /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
  var currentTimeValidationEnabled: Boolean
  
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
  var enhancedKeyUsages: IVector[String]
  
  /** Gets the list of root certificates that will be trusted. */
  var exclusiveTrustRoots: IVector[Certificate]
  
  /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
  var networkRetrievalEnabled: Boolean
  
  /** Gets or sets a value indicating whether revocation checking is enabled. */
  var revocationCheckEnabled: Boolean
  
  /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
  var validationTimestamp: js.Date
}
object ChainBuildingParameters {
  
  inline def apply(
    authorityInformationAccessEnabled: Boolean,
    currentTimeValidationEnabled: Boolean,
    enhancedKeyUsages: IVector[String],
    exclusiveTrustRoots: IVector[Certificate],
    networkRetrievalEnabled: Boolean,
    revocationCheckEnabled: Boolean,
    validationTimestamp: js.Date
  ): ChainBuildingParameters = {
    val __obj = js.Dynamic.literal(authorityInformationAccessEnabled = authorityInformationAccessEnabled.asInstanceOf[js.Any], currentTimeValidationEnabled = currentTimeValidationEnabled.asInstanceOf[js.Any], enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], exclusiveTrustRoots = exclusiveTrustRoots.asInstanceOf[js.Any], networkRetrievalEnabled = networkRetrievalEnabled.asInstanceOf[js.Any], revocationCheckEnabled = revocationCheckEnabled.asInstanceOf[js.Any], validationTimestamp = validationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainBuildingParameters]
  }
  
  extension [Self <: ChainBuildingParameters](x: Self) {
    
    inline def setAuthorityInformationAccessEnabled(value: Boolean): Self = StObject.set(x, "authorityInformationAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeValidationEnabled(value: Boolean): Self = StObject.set(x, "currentTimeValidationEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnhancedKeyUsages(value: IVector[String]): Self = StObject.set(x, "enhancedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setExclusiveTrustRoots(value: IVector[Certificate]): Self = StObject.set(x, "exclusiveTrustRoots", value.asInstanceOf[js.Any])
    
    inline def setNetworkRetrievalEnabled(value: Boolean): Self = StObject.set(x, "networkRetrievalEnabled", value.asInstanceOf[js.Any])
    
    inline def setRevocationCheckEnabled(value: Boolean): Self = StObject.set(x, "revocationCheckEnabled", value.asInstanceOf[js.Any])
    
    inline def setValidationTimestamp(value: js.Date): Self = StObject.set(x, "validationTimestamp", value.asInstanceOf[js.Any])
  }
}
