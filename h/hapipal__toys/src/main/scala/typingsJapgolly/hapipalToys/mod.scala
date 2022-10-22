package typingsJapgolly.hapipalToys

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hapiBoom.mod.Boom
import typingsJapgolly.hapiHapi.mod.Lifecycle.Method
import typingsJapgolly.hapiHapi.mod.Lifecycle.ReturnValue
import typingsJapgolly.hapiHapi.mod.Plugin
import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseObjectHeaderOptions
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import typingsJapgolly.hapiHapi.mod.RouteExtObject
import typingsJapgolly.hapiHapi.mod.RouteOptionsPreArray
import typingsJapgolly.hapiHapi.mod.ServerAuthScheme
import typingsJapgolly.hapiHapi.mod.ServerExtEventsObject
import typingsJapgolly.hapiHapi.mod.ServerExtOptions
import typingsJapgolly.hapiHapi.mod.ServerRealm
import typingsJapgolly.hapiHapi.mod.ServerRoute
import typingsJapgolly.hapiHapi.mod.Server_
import typingsJapgolly.hapipalToys.anon.PartialServerRoute
import typingsJapgolly.node.asyncHooksMod.AsyncLocalStorage
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.FinishedOptions
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapipal/toys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncStorage(identifier: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncStorage")(identifier.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def asyncStorageInternals(): Map[String, Instantiable0[AsyncLocalStorage[js.Object]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncStorageInternals")().asInstanceOf[Map[String, Instantiable0[AsyncLocalStorage[js.Object]]]]
  
  object auth {
    
    @JSImport("@hapipal/toys", "auth")
    @js.native
    val ^ : js.Any = js.native
    
    inline def strategy(server: Server_, name: String, authenticate: ServerAuthSchemeAuthenticate): ServerAuthScheme = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(server.asInstanceOf[js.Any], name.asInstanceOf[js.Any], authenticate.asInstanceOf[js.Any])).asInstanceOf[ServerAuthScheme]
    
    type ServerAuthSchemeAuthenticate = js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]
  }
  
  inline def code(response: Boom[Any], code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(response.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def code(response: ResponseObject, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(response.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def event(emitter: EventEmitter, eventName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def event(emitter: EventEmitter, eventName: String, options: EventOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def ext(method: Method): RouteExtObject = ^.asInstanceOf[js.Dynamic].applyDynamic("ext")(method.asInstanceOf[js.Any]).asInstanceOf[RouteExtObject]
  inline def ext(method: Method, options: ServerExtOptions): RouteExtObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ext")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RouteExtObject]
  
  inline def forEachAncestorRealm(realm: ServerRealm, fn: AncestorRealmIterator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachAncestorRealm")(realm.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCode(response: Boom[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(response.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCode(response: ResponseObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(response.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getHeaders(response: Boom[Any]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(response.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def getHeaders(response: ResponseObject): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(response.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def header(response: Boom[Any], name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(response.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def header(response: Boom[Any], name: String, value: String, options: ResponseObjectHeaderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(response.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def header(response: ResponseObject, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(response.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def header(response: ResponseObject, name: String, value: String, options: ResponseObjectHeaderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(response.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@hapipal/toys", "noop")
  @js.native
  val noop: Plugin[Any] = js.native
  
  inline def onCredentials(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onCredentials")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onCredentials(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onCredentials")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPostAuth(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPostAuth")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPostAuth(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPostAuth")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPostHandler(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPostHandler")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPostHandler(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPostHandler")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPostResponse(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPostResponse")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPostResponse(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPostResponse")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPreAuth(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPreAuth")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPreAuth(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPreAuth")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPreHandler(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPreHandler")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPreHandler(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPreHandler")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onPreResponse(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onPreResponse")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onPreResponse(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onPreResponse")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def onRequest(method: Method): ServerExtEventsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("onRequest")(method.asInstanceOf[js.Any]).asInstanceOf[ServerExtEventsObject]
  inline def onRequest(method: Method, options: ServerExtOptions): ServerExtEventsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("onRequest")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServerExtEventsObject]
  
  inline def options(obj: TypesWithRealmsAndOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def pre(options: js.Array[ToysPreArg]): RouteOptionsPreArray = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(options.asInstanceOf[js.Any]).asInstanceOf[RouteOptionsPreArray]
  inline def pre(options: ToysPreArg): RouteOptionsPreArray = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(options.asInstanceOf[js.Any]).asInstanceOf[RouteOptionsPreArray]
  
  inline def reacher(chain: String): PerformReach = ^.asInstanceOf[js.Dynamic].applyDynamic("reacher")(chain.asInstanceOf[js.Any]).asInstanceOf[PerformReach]
  inline def reacher(chain: String, options: ReacherOptions): PerformReach = (^.asInstanceOf[js.Dynamic].applyDynamic("reacher")(chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformReach]
  inline def reacher(chain: js.Array[String | Double]): PerformReach = ^.asInstanceOf[js.Dynamic].applyDynamic("reacher")(chain.asInstanceOf[js.Any]).asInstanceOf[PerformReach]
  inline def reacher(chain: js.Array[String | Double], options: ReacherOptions): PerformReach = (^.asInstanceOf[js.Dynamic].applyDynamic("reacher")(chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformReach]
  
  inline def realm(obj: TypesWithRealmsAndOptions): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("realm")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def rootRealm(realm: ServerRealm): ServerRealm = ^.asInstanceOf[js.Dynamic].applyDynamic("rootRealm")(realm.asInstanceOf[js.Any]).asInstanceOf[ServerRealm]
  
  inline def rootState(realm: ServerRealm, pluginName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("rootState")(realm.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def state(realm: ServerRealm, pluginName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("state")(realm.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def stream(stream: Stream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def stream(stream: Stream, options: StreamOptions & FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def transformer(transform: Transformer_): PerformTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("transformer")(transform.asInstanceOf[js.Any]).asInstanceOf[PerformTransform]
  inline def transformer(transform: Transformer_, options: ReacherOptions): PerformTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("transformer")(transform.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PerformTransform]
  
  inline def withAsyncStorage[T](identifier: String, value: T, fn: js.Function0[Unit]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withAsyncStorage")(identifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def withRouteDefaults(defaults: PartialServerRoute): AssignRouteDefaults = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouteDefaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[AssignRouteDefaults]
  
  type AncestorRealmIterator = js.Function1[/* realm */ ServerRealm, Unit]
  
  type AssignRouteDefaults = js.Function1[
    /* routes */ PartialServerRoute | js.Array[PartialServerRoute], 
    ServerRoute | js.Array[ServerRoute]
  ]
  
  trait EventOptions extends StObject {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    extension [Self <: EventOptions](x: Self) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  type PerformReach = js.Function1[/* input */ js.UndefOr[js.Object], Any]
  
  type PerformTransform = js.Function1[/* input */ js.Object, js.Object]
  
  trait ReacherOptions extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var functions: js.UndefOr[Boolean] = js.undefined
    
    var iterables: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ReacherOptions {
    
    inline def apply(): ReacherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReacherOptions]
    }
    
    extension [Self <: ReacherOptions](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setIterables(value: Boolean): Self = StObject.set(x, "iterables", value.asInstanceOf[js.Any])
      
      inline def setIterablesUndefined: Self = StObject.set(x, "iterables", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait StreamOptions extends StObject {
    
    var cleanup: js.UndefOr[Boolean] = js.undefined
  }
  object StreamOptions {
    
    inline def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setCleanup(value: Boolean): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
    }
  }
  
  type ToysPreArg = ToysPreShorthand | Method
  
  type ToysPreShorthand = StringDictionary[Method]
  
  type Transformer_ = StringDictionary[String]
  
  type TypesWithRealmsAndOptions = Server_ | Request | ResponseToolkit | ServerRealm | ServerRoute
}
