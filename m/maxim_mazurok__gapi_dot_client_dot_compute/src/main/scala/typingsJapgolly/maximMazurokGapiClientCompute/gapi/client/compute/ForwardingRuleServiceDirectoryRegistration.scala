package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingRuleServiceDirectoryRegistration extends StObject {
  
  /** Service Directory namespace to register the forwarding rule under. */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** Service Directory service to register the forwarding rule under. */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs Forwarding
    * Rules on the same network should use the same Service Directory region.
    */
  var serviceDirectoryRegion: js.UndefOr[String] = js.undefined
}
object ForwardingRuleServiceDirectoryRegistration {
  
  inline def apply(): ForwardingRuleServiceDirectoryRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleServiceDirectoryRegistration]
  }
  
  extension [Self <: ForwardingRuleServiceDirectoryRegistration](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryRegion(value: String): Self = StObject.set(x, "serviceDirectoryRegion", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryRegionUndefined: Self = StObject.set(x, "serviceDirectoryRegion", js.undefined)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
