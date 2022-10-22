package typingsJapgolly.keycloakJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.keycloakJs.anon.Rptendpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeycloakAuthzMod {
  
  @JSImport("keycloak-js/dist/keycloak-authz", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with KeycloakAuthorization {
    /**
    	 * Creates a new Keycloak client instance.
    	 * @param config Path to a JSON config file or a plain config object.
    	 */
    def this(keycloak: typingsJapgolly.keycloakJs.mod.default) = this()
  }
  object default {
    
    /**
      * @deprecated Construct a KeycloakAuthorization instance using the `new` keyword instead.
      */
    @JSImport("keycloak-js/dist/keycloak-authz", JSImport.Default)
    @js.native
    def apply(keycloak: typingsJapgolly.keycloakJs.mod.default): KeycloakAuthorization = js.native
  }
  
  trait AuthorizationRequest extends StObject {
    
    /**
    	 * Defines whether or not this authorization request should include the current RPT. If set to true, the RPT will
    	 * be sent and permissions in the current RPT will be included in the new RPT. Otherwise, only the permissions referenced in this
    	 * authorization request will be granted in the new RPT.
    	 */
    var incrementalAuthorization: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Defines additional information about this authorization request in order to specify how it should be processed
    	 * by the server.
    	 */
    var metadata: js.UndefOr[AuthorizationRequestMetadata] = js.undefined
    
    /**
    	 * An array of objects representing the resource and scopes.
    	 */
    var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.undefined
    
    /**
    	 * A boolean value indicating whether the server should create permission requests to the resources
    	 * and scopes referenced by a permission ticket. This parameter will only take effect when used together
    	 * with the ticket parameter as part of a UMA authorization process.
    	 */
    var submitRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * A permission ticket obtained from a resource server when using UMA authorization protocol.
    	 */
    var ticket: js.UndefOr[String] = js.undefined
  }
  object AuthorizationRequest {
    
    inline def apply(): AuthorizationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRequest]
    }
    
    extension [Self <: AuthorizationRequest](x: Self) {
      
      inline def setIncrementalAuthorization(value: Boolean): Self = StObject.set(x, "incrementalAuthorization", value.asInstanceOf[js.Any])
      
      inline def setIncrementalAuthorizationUndefined: Self = StObject.set(x, "incrementalAuthorization", js.undefined)
      
      inline def setMetadata(value: AuthorizationRequestMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPermissions(value: js.Array[ResourcePermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setSubmitRequest(value: Boolean): Self = StObject.set(x, "submitRequest", value.asInstanceOf[js.Any])
      
      inline def setSubmitRequestUndefined: Self = StObject.set(x, "submitRequest", js.undefined)
      
      inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
      
      inline def setTicketUndefined: Self = StObject.set(x, "ticket", js.undefined)
    }
  }
  
  trait AuthorizationRequestMetadata extends StObject {
    
    /**
    	 * A boolean value indicating to the server if resource names should be included in the RPT’s permissions.
    	 * If false, only the resource identifier is included.
    	 */
    var responseIncludeResourceName: js.UndefOr[Any] = js.undefined
    
    /**
    	 * An integer N that defines a limit for the amount of permissions an RPT can have. When used together with
    	 * rpt parameter, only the last N requested permissions will be kept in the RPT.
    	 */
    var response_permissions_limit: js.UndefOr[Double] = js.undefined
  }
  object AuthorizationRequestMetadata {
    
    inline def apply(): AuthorizationRequestMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRequestMetadata]
    }
    
    extension [Self <: AuthorizationRequestMetadata](x: Self) {
      
      inline def setResponseIncludeResourceName(value: Any): Self = StObject.set(x, "responseIncludeResourceName", value.asInstanceOf[js.Any])
      
      inline def setResponseIncludeResourceNameUndefined: Self = StObject.set(x, "responseIncludeResourceName", js.undefined)
      
      inline def setResponse_permissions_limit(value: Double): Self = StObject.set(x, "response_permissions_limit", value.asInstanceOf[js.Any])
      
      inline def setResponse_permissions_limitUndefined: Self = StObject.set(x, "response_permissions_limit", js.undefined)
    }
  }
  
  @js.native
  trait KeycloakAuthorization extends StObject {
    
    /**
    	 * This method enables client applications to better integrate with resource servers protected by a Keycloak
    	 * policy enforcer using UMA protocol.
    	 *
    	 * The authorization request must be provided with a ticket.
    	 *
    	 * @param authorizationRequest An AuthorizationRequest instance with a valid permission ticket set.
    	 * @returns A promise to set functions to be invoked on grant, deny or error.
    	 */
    def authorize(authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
    
    var config: Rptendpoint = js.native
    
    /**
    	 * Obtains all entitlements from a Keycloak server based on a given resourceServerId.
    	 *
    	 * @param resourceServerId The id (client id) of the resource server to obtain permissions from.
    	 * @param authorizationRequest An AuthorizationRequest instance.
    	 * @returns A promise to set functions to be invoked on grant, deny or error.
    	 */
    def entitlement(resourceServerId: String): KeycloakAuthorizationPromise = js.native
    def entitlement(resourceServerId: String, authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
    
    def init(): Unit = js.native
    
    var rpt: Any = js.native
  }
  
  type KeycloakAuthorizationInstance = KeycloakAuthorization
  
  trait KeycloakAuthorizationPromise extends StObject {
    
    def `then`(
      onGrant: js.Function1[/* rpt */ String, Unit],
      onDeny: js.Function0[Unit],
      onError: js.Function0[Unit]
    ): Unit
  }
  object KeycloakAuthorizationPromise {
    
    inline def apply(`then`: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Callback): KeycloakAuthorizationPromise = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction3((t0: js.Function1[/* rpt */ String, Unit], t1: js.Function0[Unit], t2: js.Function0[Unit]) => (`then`(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[KeycloakAuthorizationPromise]
    }
    
    extension [Self <: KeycloakAuthorizationPromise](x: Self) {
      
      inline def setThen(value: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Callback): Self = StObject.set(x, "then", js.Any.fromFunction3((t0: js.Function1[/* rpt */ String, Unit], t1: js.Function0[Unit], t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait ResourcePermission extends StObject {
    
    /**
    	 * The id or name of a resource.
    	 */
    var id: String
    
    /**
    	 * An array of strings where each value is the name of a scope associated with the resource.
    	 */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ResourcePermission {
    
    inline def apply(id: String): ResourcePermission = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourcePermission]
    }
    
    extension [Self <: ResourcePermission](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
}
