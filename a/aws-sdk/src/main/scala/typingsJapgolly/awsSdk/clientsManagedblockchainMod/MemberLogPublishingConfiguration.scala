package typingsJapgolly.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration] = js.undefined
}
object MemberLogPublishingConfiguration {
  
  inline def apply(): MemberLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberLogPublishingConfiguration]
  }
  
  extension [Self <: MemberLogPublishingConfiguration](x: Self) {
    
    inline def setFabric(value: MemberFabricLogPublishingConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    inline def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
