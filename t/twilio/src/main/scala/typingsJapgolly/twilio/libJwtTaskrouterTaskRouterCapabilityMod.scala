package typingsJapgolly.twilio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJwtTaskrouterTaskRouterCapabilityMod {
  
  @JSImport("twilio/lib/jwt/taskrouter/TaskRouterCapability", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TaskRouterCapability {
    /**
      * TaskRouterCapability class
      * @param options Options to initiate
      */
    def this(options: TaskRouterCapabilityOptions) = this()
    
    /* CompleteClass */
    var accountSid: String = js.native
    
    /* CompleteClass */
    override def addPolicy(policy: Policy): Unit = js.native
    
    /* CompleteClass */
    var authToken: String = js.native
    
    /* CompleteClass */
    var channelId: String = js.native
    
    /* CompleteClass */
    var policies: js.Array[Policy] = js.native
    
    /* CompleteClass */
    override def toJwt(): String = js.native
    
    /* CompleteClass */
    var ttl: Double = js.native
    
    /* CompleteClass */
    var version: String = js.native
    
    /* CompleteClass */
    var workspaceSid: String = js.native
  }
  
  @JSImport("twilio/lib/jwt/taskrouter/TaskRouterCapability", "Policy")
  @js.native
  open class Policy protected () extends StObject {
    /**
      * Create a new Policy
      * @param options Options to initiate policy
      */
    def this(options: PolicyOptions) = this()
    
    def payload(): PolicyPayload = js.native
  }
  
  trait PolicyOptions extends StObject {
    
    /** Allow the policy */
    var allow: js.UndefOr[Boolean] = js.undefined
    
    /** HTTP Method */
    var method: js.UndefOr[String] = js.undefined
    
    /** Request post filter allowances */
    var postFilter: js.UndefOr[js.Object] = js.undefined
    
    /** Request query filter allowances */
    var queryFilter: js.UndefOr[js.Object] = js.undefined
    
    /** Policy URL */
    var url: js.UndefOr[String] = js.undefined
  }
  object PolicyOptions {
    
    inline def apply(): PolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyOptions]
    }
    
    extension [Self <: PolicyOptions](x: Self) {
      
      inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPostFilter(value: js.Object): Self = StObject.set(x, "postFilter", value.asInstanceOf[js.Any])
      
      inline def setPostFilterUndefined: Self = StObject.set(x, "postFilter", js.undefined)
      
      inline def setQueryFilter(value: js.Object): Self = StObject.set(x, "queryFilter", value.asInstanceOf[js.Any])
      
      inline def setQueryFilterUndefined: Self = StObject.set(x, "queryFilter", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait PolicyPayload extends StObject {
    
    var allow: Boolean
    
    var method: String
    
    var post_filter: js.Object
    
    var query_filter: js.Object
    
    var url: String
  }
  object PolicyPayload {
    
    inline def apply(allow: Boolean, method: String, post_filter: js.Object, query_filter: js.Object, url: String): PolicyPayload = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], post_filter = post_filter.asInstanceOf[js.Any], query_filter = query_filter.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyPayload]
    }
    
    extension [Self <: PolicyPayload](x: Self) {
      
      inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPost_filter(value: js.Object): Self = StObject.set(x, "post_filter", value.asInstanceOf[js.Any])
      
      inline def setQuery_filter(value: js.Object): Self = StObject.set(x, "query_filter", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskRouterCapability extends StObject {
    
    var accountSid: String
    
    def addPolicy(policy: Policy): Unit
    
    var authToken: String
    
    var channelId: String
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var policies: js.Array[Policy]
    
    def toJwt(): String
    
    var ttl: Double
    
    var version: String
    
    var workspaceSid: String
  }
  object TaskRouterCapability {
    
    inline def apply(
      accountSid: String,
      addPolicy: Policy => Callback,
      authToken: String,
      channelId: String,
      policies: js.Array[Policy],
      toJwt: CallbackTo[String],
      ttl: Double,
      version: String,
      workspaceSid: String
    ): TaskRouterCapability = {
      val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], addPolicy = js.Any.fromFunction1((t0: Policy) => addPolicy(t0).runNow()), authToken = authToken.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], toJwt = toJwt.toJsFn, ttl = ttl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workspaceSid = workspaceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskRouterCapability]
    }
    
    extension [Self <: TaskRouterCapability](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAddPolicy(value: Policy => Callback): Self = StObject.set(x, "addPolicy", js.Any.fromFunction1((t0: Policy) => value(t0).runNow()))
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPolicies(value: js.Array[Policy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value*))
      
      inline def setToJwt(value: CallbackTo[String]): Self = StObject.set(x, "toJwt", value.toJsFn)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskRouterCapabilityOptions extends StObject {
    
    var accountSid: String
    
    var authToken: String
    
    var channelId: String
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var workspaceSid: String
  }
  object TaskRouterCapabilityOptions {
    
    inline def apply(accountSid: String, authToken: String, channelId: String, workspaceSid: String): TaskRouterCapabilityOptions = {
      val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], authToken = authToken.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], workspaceSid = workspaceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskRouterCapabilityOptions]
    }
    
    extension [Self <: TaskRouterCapabilityOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
    }
  }
}
