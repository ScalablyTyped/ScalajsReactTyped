package typingsJapgolly.maximMazurokGapiClientDomainsrdap

import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.AutnumResource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.DomainResource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.EntityResource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.IpResource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.NameserverResource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.V1Resource
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.domainsrdap
import typingsJapgolly.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.v1
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
      
      object domainsrdap {
        
        @JSGlobal("gapi.client.domainsrdap.autnum")
        @js.native
        val autnum: AutnumResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.domain")
        @js.native
        val domain: DomainResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.entity")
        @js.native
        val entity: EntityResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.ip")
        @js.native
        val ip: IpResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.nameserver")
        @js.native
        val nameserver: NameserverResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Domains RDAP API v1 */
      inline def load(name: domainsrdap, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: domainsrdap, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
