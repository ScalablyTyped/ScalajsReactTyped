package typingsJapgolly.twilio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.twilio.twilioStrings.scopeColonclientColonincoming
import typingsJapgolly.twilio.twilioStrings.scopeColonclientColonoutgoing
import typingsJapgolly.twilio.twilioStrings.scopeColonstreamColonsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJwtClientCapabilityMod {
  
  @JSImport("twilio/lib/jwt/ClientCapability", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClientCapability {
    def this(options: ClientCapabilityOptions) = this()
    
    /* CompleteClass */
    var accountSid: String = js.native
    
    /* CompleteClass */
    override def addScope(scope: Scope): Unit = js.native
    
    /* CompleteClass */
    var authToken: String = js.native
    
    /* CompleteClass */
    var scopes: js.Array[Scope] = js.native
    
    /* CompleteClass */
    override def toJwt(): String = js.native
    
    /* CompleteClass */
    var ttl: Double = js.native
  }
  
  @JSImport("twilio/lib/jwt/ClientCapability", "EventStreamScope")
  @js.native
  open class EventStreamScope protected ()
    extends StObject
       with Scope {
    def this(filters: js.Object) = this()
    
    var filters: js.Object = js.native
    
    /* CompleteClass */
    override def payload(): String = js.native
    
    /* CompleteClass */
    var scope: String = js.native
    @JSName("scope")
    var scope_EventStreamScope: scopeColonstreamColonsubscribe = js.native
  }
  
  @JSImport("twilio/lib/jwt/ClientCapability", "IncomingClientScope")
  @js.native
  open class IncomingClientScope protected ()
    extends StObject
       with Scope {
    def this(clientName: String) = this()
    
    var clientName: String = js.native
    
    /* CompleteClass */
    override def payload(): String = js.native
    
    /* CompleteClass */
    var scope: String = js.native
    @JSName("scope")
    var scope_IncomingClientScope: scopeColonclientColonincoming = js.native
  }
  
  @JSImport("twilio/lib/jwt/ClientCapability", "OutgoingClientScope")
  @js.native
  open class OutgoingClientScope protected ()
    extends StObject
       with Scope {
    def this(options: OutgoingClientScopeOptions) = this()
    
    var applicationSid: String = js.native
    
    var clientName: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    /* CompleteClass */
    override def payload(): String = js.native
    
    /* CompleteClass */
    var scope: String = js.native
    @JSName("scope")
    var scope_OutgoingClientScope: scopeColonclientColonoutgoing = js.native
  }
  
  trait ClientCapability extends StObject {
    
    var accountSid: String
    
    def addScope(scope: Scope): Unit
    
    var authToken: String
    
    var scopes: js.Array[Scope]
    
    def toJwt(): String
    
    var ttl: Double
  }
  object ClientCapability {
    
    inline def apply(
      accountSid: String,
      addScope: Scope => Callback,
      authToken: String,
      scopes: js.Array[Scope],
      toJwt: CallbackTo[String],
      ttl: Double
    ): ClientCapability = {
      val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], addScope = js.Any.fromFunction1((t0: Scope) => addScope(t0).runNow()), authToken = authToken.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], toJwt = toJwt.toJsFn, ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCapability]
    }
    
    extension [Self <: ClientCapability](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAddScope(value: Scope => Callback): Self = StObject.set(x, "addScope", js.Any.fromFunction1((t0: Scope) => value(t0).runNow()))
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setToJwt(value: CallbackTo[String]): Self = StObject.set(x, "toJwt", value.toJsFn)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientCapabilityOptions extends StObject {
    
    var accountSid: String
    
    var authToken: String
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object ClientCapabilityOptions {
    
    inline def apply(accountSid: String, authToken: String): ClientCapabilityOptions = {
      val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], authToken = authToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCapabilityOptions]
    }
    
    extension [Self <: ClientCapabilityOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait OutgoingClientScopeOptions extends StObject {
    
    var applicationSid: String
    
    var clientName: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
  }
  object OutgoingClientScopeOptions {
    
    inline def apply(applicationSid: String): OutgoingClientScopeOptions = {
      val __obj = js.Dynamic.literal(applicationSid = applicationSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingClientScopeOptions]
    }
    
    extension [Self <: OutgoingClientScopeOptions](x: Self) {
      
      inline def setApplicationSid(value: String): Self = StObject.set(x, "applicationSid", value.asInstanceOf[js.Any])
      
      inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait Scope extends StObject {
    
    def payload(): String
    
    var scope: String
  }
  object Scope {
    
    inline def apply(payload: CallbackTo[String], scope: String): Scope = {
      val __obj = js.Dynamic.literal(payload = payload.toJsFn, scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setPayload(value: CallbackTo[String]): Self = StObject.set(x, "payload", value.toJsFn)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
