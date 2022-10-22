package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionUdiDeviceIdentifier
  extends StObject
     with BackboneElement {
  
  var _deviceIdentifier: js.UndefOr[Element] = js.undefined
  
  var _issuer: js.UndefOr[Element] = js.undefined
  
  var _jurisdiction: js.UndefOr[Element] = js.undefined
  
  /**
    * The identifier that is to be associated with every Device that references this DeviceDefintiion for the issuer and jurisdiction provided in the DeviceDefinition.udiDeviceIdentifier.
    */
  var deviceIdentifier: String
  
  /**
    * The organization that assigns the identifier algorithm.
    */
  var issuer: String
  
  /**
    * The jurisdiction to which the deviceIdentifier applies.
    */
  var jurisdiction: String
  
  /**
    * The organization that assigns the identifier algorithm.
    */
  var marketDistribution: js.UndefOr[js.Array[DeviceDefinitionUdiDeviceIdentifierMarketDistribution]] = js.undefined
}
object DeviceDefinitionUdiDeviceIdentifier {
  
  inline def apply(deviceIdentifier: String, issuer: String, jurisdiction: String): DeviceDefinitionUdiDeviceIdentifier = {
    val __obj = js.Dynamic.literal(deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jurisdiction = jurisdiction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionUdiDeviceIdentifier]
  }
  
  extension [Self <: DeviceDefinitionUdiDeviceIdentifier](x: Self) {
    
    inline def setDeviceIdentifier(value: String): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: String): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setMarketDistribution(value: js.Array[DeviceDefinitionUdiDeviceIdentifierMarketDistribution]): Self = StObject.set(x, "marketDistribution", value.asInstanceOf[js.Any])
    
    inline def setMarketDistributionUndefined: Self = StObject.set(x, "marketDistribution", js.undefined)
    
    inline def setMarketDistributionVarargs(value: DeviceDefinitionUdiDeviceIdentifierMarketDistribution*): Self = StObject.set(x, "marketDistribution", js.Array(value*))
    
    inline def set_deviceIdentifier(value: Element): Self = StObject.set(x, "_deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_deviceIdentifierUndefined: Self = StObject.set(x, "_deviceIdentifier", js.undefined)
    
    inline def set_issuer(value: Element): Self = StObject.set(x, "_issuer", value.asInstanceOf[js.Any])
    
    inline def set_issuerUndefined: Self = StObject.set(x, "_issuer", js.undefined)
    
    inline def set_jurisdiction(value: Element): Self = StObject.set(x, "_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def set_jurisdictionUndefined: Self = StObject.set(x, "_jurisdiction", js.undefined)
  }
}
