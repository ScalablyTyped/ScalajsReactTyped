package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.meteor.Meteor.Connection
import typingsJapgolly.meteor.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddpMod {
  
  object DDP {
    
    @JSImport("meteor/ddp", "DDP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allSubscriptionsReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSubscriptionsReady")().asInstanceOf[Boolean]
    
    inline def connect(url: String): DDPStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[DDPStatic]
    
    trait DDPStatic extends StObject {
      
      @JSName("apply")
      def apply(method: String, parameters: Any*): Any
      
      def call(method: String, parameters: Any*): Any
      
      def disconnect(): Unit
      
      def methods(IMeteorMethodsDictionary: Any): Any
      
      def onReconnect(): Unit
      
      def reconnect(): Unit
      
      def status(): DDPStatus
      
      def subscribe(name: String, rest: Any*): SubscriptionHandle
    }
    object DDPStatic {
      
      inline def apply(
        apply: (String, /* repeated */ Any) => Any,
        call: (String, /* repeated */ Any) => Any,
        disconnect: japgolly.scalajs.react.Callback,
        methods: Any => Any,
        onReconnect: japgolly.scalajs.react.Callback,
        reconnect: japgolly.scalajs.react.Callback,
        status: CallbackTo[DDPStatus],
        subscribe: (String, /* repeated */ Any) => SubscriptionHandle
      ): DDPStatic = {
        val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = disconnect.toJsFn, methods = js.Any.fromFunction1(methods), onReconnect = onReconnect.toJsFn, reconnect = reconnect.toJsFn, status = status.toJsFn, subscribe = js.Any.fromFunction2(subscribe))
        __obj.asInstanceOf[DDPStatic]
      }
      
      extension [Self <: DDPStatic](x: Self) {
        
        inline def setApply(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
        
        inline def setCall(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
        
        inline def setDisconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
        
        inline def setMethods(value: Any => Any): Self = StObject.set(x, "methods", js.Any.fromFunction1(value))
        
        inline def setOnReconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onReconnect", value.toJsFn)
        
        inline def setReconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reconnect", value.toJsFn)
        
        inline def setStatus(value: CallbackTo[DDPStatus]): Self = StObject.set(x, "status", value.toJsFn)
        
        inline def setSubscribe(value: (String, /* repeated */ Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      }
    }
    
    trait DDPStatus extends StObject {
      
      var connected: Boolean
      
      var reason: js.UndefOr[String] = js.undefined
      
      var retryCount: Double
      
      var retryTime: js.UndefOr[Double] = js.undefined
      
      var status: Status
    }
    object DDPStatus {
      
      inline def apply(connected: Boolean, retryCount: Double, status: Status): DDPStatus = {
        val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[DDPStatus]
      }
      
      extension [Self <: DDPStatus](x: Self) {
        
        inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
        
        inline def setRetryTime(value: Double): Self = StObject.set(x, "retryTime", value.asInstanceOf[js.Any])
        
        inline def setRetryTimeUndefined: Self = StObject.set(x, "retryTime", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.meteor.meteorStrings.connected
      - typingsJapgolly.meteor.meteorStrings.connecting
      - typingsJapgolly.meteor.meteorStrings.failed
      - typingsJapgolly.meteor.meteorStrings.waiting
      - typingsJapgolly.meteor.meteorStrings.offline
    */
    trait Status extends StObject
    object Status {
      
      inline def connected: typingsJapgolly.meteor.meteorStrings.connected = "connected".asInstanceOf[typingsJapgolly.meteor.meteorStrings.connected]
      
      inline def connecting: typingsJapgolly.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.meteor.meteorStrings.connecting]
      
      inline def failed: typingsJapgolly.meteor.meteorStrings.failed = "failed".asInstanceOf[typingsJapgolly.meteor.meteorStrings.failed]
      
      inline def offline: typingsJapgolly.meteor.meteorStrings.offline = "offline".asInstanceOf[typingsJapgolly.meteor.meteorStrings.offline]
      
      inline def waiting: typingsJapgolly.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typingsJapgolly.meteor.meteorStrings.waiting]
    }
  }
  
  object DDPCommon {
    
    /** The state for a single invocation of a method, referenced by this inside a method definition. */
    @js.native
    trait MethodInvocation
      extends StObject
         with Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
      
      /**
        * Access inside a method invocation. The [connection](#meteor_onconnection) that this method was received on. `null` if the method is not associated with a connection, eg. a server
        * initiated method call. Calls to methods made from a server method which was in turn initiated from the client share the same `connection`.
        */
      var connection: Connection = js.native
      
      /**
        * Access inside a method invocation.  Boolean value, true if this invocation is a stub.
        */
      var isSimulation: Boolean = js.native
      
      /**
        * Set the logged in user.
        * @param userId The value that should be returned by `userId` on this connection.
        */
      def setUserId(): Unit = js.native
      def setUserId(userId: String): Unit = js.native
      
      /**
        * Call inside a method invocation.  Allow subsequent method from this client to begin running in a new fiber.
        */
      def unblock(): Unit = js.native
      
      /**
        * The id of the user that made this method call, or `null` if no user was logged in.
        */
      var userId: String | Null = js.native
    }
    
    trait MethodInvocationOptions extends StObject {
      
      var connection: Connection
      
      var isSimulation: Boolean
      
      var randomSeed: String
      
      var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.undefined
      
      var userId: String | Null
    }
    object MethodInvocationOptions {
      
      inline def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
        val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any], userId = null)
        __obj.asInstanceOf[MethodInvocationOptions]
      }
      
      extension [Self <: MethodInvocationOptions](x: Self) {
        
        inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        inline def setIsSimulation(value: Boolean): Self = StObject.set(x, "isSimulation", value.asInstanceOf[js.Any])
        
        inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
        
        inline def setSetUserId(value: /* newUserId */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserId", js.Any.fromFunction1((t0: /* newUserId */ String) => value(t0).runNow()))
        
        inline def setSetUserIdUndefined: Self = StObject.set(x, "setUserId", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdNull: Self = StObject.set(x, "userId", null)
      }
    }
  }
}
