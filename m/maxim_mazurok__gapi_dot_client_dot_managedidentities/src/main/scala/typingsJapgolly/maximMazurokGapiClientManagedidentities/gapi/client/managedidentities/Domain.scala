package typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /** Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used. */
  var admin: js.UndefOr[String] = js.undefined
  
  /** Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled. */
  var auditLogsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using
    * UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
    */
  var authorizedNetworks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an
    * internal network.
    */
  var fqdn: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels that can contain user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block. */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing
    * subnets in [Domain].[authorized_networks].
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of this domain. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the current status of this domain, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. The current trusts associated with the domain. */
  var trusts: js.UndefOr[js.Array[Trust]] = js.undefined
  
  /** Output only. The last update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setAuditLogsEnabled(value: Boolean): Self = StObject.set(x, "auditLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAuditLogsEnabledUndefined: Self = StObject.set(x, "auditLogsEnabled", js.undefined)
    
    inline def setAuthorizedNetworks(value: js.Array[String]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    inline def setAuthorizedNetworksVarargs(value: String*): Self = StObject.set(x, "authorizedNetworks", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTrusts(value: js.Array[Trust]): Self = StObject.set(x, "trusts", value.asInstanceOf[js.Any])
    
    inline def setTrustsUndefined: Self = StObject.set(x, "trusts", js.undefined)
    
    inline def setTrustsVarargs(value: Trust*): Self = StObject.set(x, "trusts", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
