package typingsJapgolly.maximMazurokGapiClientDns

import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ChangesResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.DnsKeysResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ManagedZoneOperationsResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ManagedZonesResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.PoliciesResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ResourceRecordSetsResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ResponsePoliciesResource
import typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns.ResponsePolicyRulesResource
import typingsJapgolly.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.dns
import typingsJapgolly.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.v1
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object dns {
        
        @JSGlobal("gapi.client.dns.changes")
        @js.native
        val changes: ChangesResource = js.native
        
        @JSGlobal("gapi.client.dns.dnsKeys")
        @js.native
        val dnsKeys: DnsKeysResource = js.native
        
        @JSGlobal("gapi.client.dns.managedZoneOperations")
        @js.native
        val managedZoneOperations: ManagedZoneOperationsResource = js.native
        
        @JSGlobal("gapi.client.dns.managedZones")
        @js.native
        val managedZones: ManagedZonesResource = js.native
        
        @JSGlobal("gapi.client.dns.policies")
        @js.native
        val policies: PoliciesResource = js.native
        
        @JSGlobal("gapi.client.dns.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.dns.resourceRecordSets")
        @js.native
        val resourceRecordSets: ResourceRecordSetsResource = js.native
        
        @JSGlobal("gapi.client.dns.responsePolicies")
        @js.native
        val responsePolicies: ResponsePoliciesResource = js.native
        
        @JSGlobal("gapi.client.dns.responsePolicyRules")
        @js.native
        val responsePolicyRules: ResponsePolicyRulesResource = js.native
      }
      
      /** Load Cloud DNS API v1 */
      inline def load(name: dns, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: dns, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
