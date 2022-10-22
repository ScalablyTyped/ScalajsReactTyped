package typingsJapgolly.sentryNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.sentryCore.anon.FnCall
import typingsJapgolly.sentryCore.anon.FnCallCallback
import typingsJapgolly.sentryCore.anon.FnCallContextCustomSamplingContext
import typingsJapgolly.sentryCore.anon.FnCallEventHint
import typingsJapgolly.sentryCore.anon.FnCallExceptionHint
import typingsJapgolly.sentryCore.anon.FnCallMessageLevelHint
import typingsJapgolly.sentryCore.anon.FnCallNameContext
import typingsJapgolly.sentryCore.anon.FnCallUser
import typingsJapgolly.sentryCore.mod.Integrations.FunctionToString
import typingsJapgolly.sentryCore.mod.Integrations.InboundFilters
import typingsJapgolly.sentryCore.typesHubMod.Carrier
import typingsJapgolly.sentryNode.anon.Breadcrumbs
import typingsJapgolly.sentryNode.anon.Include
import typingsJapgolly.sentryNode.anon.Key
import typingsJapgolly.sentryNode.anon.Mode
import typingsJapgolly.sentryNode.anon.OmitAddRequestDataToEvent
import typingsJapgolly.sentryNode.anon.OnFatalError
import typingsJapgolly.sentryNode.anon.ShouldHandleError
import typingsJapgolly.sentryNode.anon.TypeofConsole
import typingsJapgolly.sentryNode.anon.TypeofContext
import typingsJapgolly.sentryNode.anon.TypeofContextLines
import typingsJapgolly.sentryNode.anon.TypeofCoreIntegrations
import typingsJapgolly.sentryNode.anon.TypeofCoreIntegrationsInstantiable
import typingsJapgolly.sentryNode.anon.TypeofHttp_
import typingsJapgolly.sentryNode.anon.TypeofLinkedErrors
import typingsJapgolly.sentryNode.anon.TypeofModules
import typingsJapgolly.sentryNode.anon.TypeofOnUncaughtException
import typingsJapgolly.sentryNode.anon.TypeofOnUnhandledRejectio
import typingsJapgolly.sentryNode.typesHandlersMod.MiddlewareError
import typingsJapgolly.sentryNode.typesHandlersMod.RequestHandlerOptions
import typingsJapgolly.sentryNode.typesIntegrationsContextMod.ContextOptions
import typingsJapgolly.sentryNode.typesIntegrationsContextlinesMod.ContextLinesOptions
import typingsJapgolly.sentryNode.typesIntegrationsMod.Console
import typingsJapgolly.sentryNode.typesIntegrationsMod.Context
import typingsJapgolly.sentryNode.typesIntegrationsMod.ContextLines
import typingsJapgolly.sentryNode.typesIntegrationsMod.Http
import typingsJapgolly.sentryNode.typesIntegrationsMod.LinkedErrors
import typingsJapgolly.sentryNode.typesIntegrationsMod.Modules
import typingsJapgolly.sentryNode.typesIntegrationsMod.OnUncaughtException
import typingsJapgolly.sentryNode.typesIntegrationsMod.OnUnhandledRejection
import typingsJapgolly.sentryNode.typesRequestDataDeprecatedMod.ExpressRequest
import typingsJapgolly.sentryNode.typesRequestDataDeprecatedMod.ParseRequestOptions
import typingsJapgolly.sentryNode.typesTransportsHttpMod.NodeTransportOptions
import typingsJapgolly.sentryNode.typesTypesMod.NodeClientOptions
import typingsJapgolly.sentryNode.typesTypesMod.NodeOptions
import typingsJapgolly.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typingsJapgolly.sentryTypes.typesClientMod.Client
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesExtraMod.Extra
import typingsJapgolly.sentryTypes.typesExtraMod.Extras
import typingsJapgolly.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import typingsJapgolly.sentryTypes.typesOptionsMod.ClientOptions
import typingsJapgolly.sentryTypes.typesScopeMod.CaptureContext
import typingsJapgolly.sentryTypes.typesSeverityMod.Severity
import typingsJapgolly.sentryTypes.typesSeverityMod.SeverityLevel
import typingsJapgolly.sentryTypes.typesStacktraceMod.StackParser
import typingsJapgolly.sentryTypes.typesTransactionMod.CustomSamplingContext
import typingsJapgolly.sentryTypes.typesTransactionMod.TransactionContext
import typingsJapgolly.sentryTypes.typesTransportMod.BaseTransportOptions
import typingsJapgolly.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typingsJapgolly.sentryTypes.typesTransportMod.Transport
import typingsJapgolly.sentryTypes.typesTransportMod.TransportRequestExecutor
import typingsJapgolly.sentryTypes.typesUserMod.User
import typingsJapgolly.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Handlers {
    
    @JSImport("@sentry/node", "Handlers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def errorHandler(): js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")().asInstanceOf[js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ]]
    inline def errorHandler(options: ShouldHandleError): js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
        /* error */ MiddlewareError, 
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
        Unit
      ]]
    
    inline def extractRequestData(req: StringDictionary[Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
    inline def extractRequestData(req: StringDictionary[Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
    
    inline def parseRequest(event: Event, req: ExpressRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
    inline def parseRequest(event: Event, req: ExpressRequest, options: ParseRequestOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
    
    inline def requestHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")().asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
    inline def requestHandler(options: RequestHandlerOptions): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
    
    inline def tracingHandler(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingHandler")().asInstanceOf[js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        Unit
      ]]
  }
  
  @JSImport("@sentry/node", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  open class Hub ()
    extends typingsJapgolly.sentryCore.mod.Hub {
    def this(client: Client[ClientOptions[BaseTransportOptions]]) = this()
    def this(client: Unit, scope: typingsJapgolly.sentryCore.typesScopeMod.Scope) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typingsJapgolly.sentryCore.typesScopeMod.Scope
    ) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typingsJapgolly.sentryCore.typesScopeMod.Scope, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Unit, _version: Double) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typingsJapgolly.sentryCore.typesScopeMod.Scope,
      _version: Double
    ) = this()
  }
  
  object Integrations {
    
    @JSImport("@sentry/node", "Integrations")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Console")
    @js.native
    open class Console ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.Console
    @JSImport("@sentry/node", "Integrations.Console")
    @js.native
    def Console: TypeofConsole = js.native
    inline def Console_=(x: TypeofConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Console")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Context")
    @js.native
    open class Context ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.Context {
      def this(_options: ContextOptions) = this()
    }
    @JSImport("@sentry/node", "Integrations.Context")
    @js.native
    def Context: TypeofContext = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.ContextLines")
    @js.native
    open class ContextLines ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.ContextLines {
      def this(_options: ContextLinesOptions) = this()
    }
    @JSImport("@sentry/node", "Integrations.ContextLines")
    @js.native
    def ContextLines: TypeofContextLines = js.native
    inline def ContextLines_=(x: TypeofContextLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContextLines")(x.asInstanceOf[js.Any])
    
    inline def Context_=(x: TypeofContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.FunctionToString")
    @js.native
    open class FunctionToString ()
      extends typingsJapgolly.sentryCore.mod.Integrations.FunctionToString
    @JSImport("@sentry/node", "Integrations.FunctionToString")
    @js.native
    def FunctionToString: TypeofCoreIntegrations = js.native
    inline def FunctionToString_=(x: TypeofCoreIntegrations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionToString")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Http")
    @js.native
    /**
      * @inheritDoc
      */
    open class Http ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.Http {
      def this(options: Breadcrumbs) = this()
    }
    @JSImport("@sentry/node", "Integrations.Http")
    @js.native
    def Http: TypeofHttp_ = js.native
    inline def Http_=(x: TypeofHttp_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Http")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.InboundFilters")
    @js.native
    open class InboundFilters ()
      extends typingsJapgolly.sentryCore.mod.Integrations.InboundFilters
    @JSImport("@sentry/node", "Integrations.InboundFilters")
    @js.native
    def InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    inline def InboundFilters_=(x: TypeofCoreIntegrationsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InboundFilters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.LinkedErrors")
    @js.native
    /**
      * @inheritDoc
      */
    open class LinkedErrors ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.LinkedErrors {
      def this(options: Key) = this()
    }
    @JSImport("@sentry/node", "Integrations.LinkedErrors")
    @js.native
    def LinkedErrors: TypeofLinkedErrors = js.native
    inline def LinkedErrors_=(x: TypeofLinkedErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkedErrors")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.Modules")
    @js.native
    open class Modules ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.Modules
    @JSImport("@sentry/node", "Integrations.Modules")
    @js.native
    def Modules: TypeofModules = js.native
    inline def Modules_=(x: TypeofModules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modules")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.OnUncaughtException")
    @js.native
    /**
      * @inheritDoc
      */
    open class OnUncaughtException ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.OnUncaughtException {
      def this(_options: OnFatalError) = this()
    }
    @JSImport("@sentry/node", "Integrations.OnUncaughtException")
    @js.native
    def OnUncaughtException: TypeofOnUncaughtException = js.native
    inline def OnUncaughtException_=(x: TypeofOnUncaughtException): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnUncaughtException")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/node", "Integrations.OnUnhandledRejection")
    @js.native
    /**
      * @inheritDoc
      */
    open class OnUnhandledRejection ()
      extends typingsJapgolly.sentryNode.typesIntegrationsMod.OnUnhandledRejection {
      def this(_options: Mode) = this()
    }
    @JSImport("@sentry/node", "Integrations.OnUnhandledRejection")
    @js.native
    def OnUnhandledRejection: TypeofOnUnhandledRejectio = js.native
    inline def OnUnhandledRejection_=(x: TypeofOnUnhandledRejectio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnUnhandledRejection")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/node", "NodeClient")
  @js.native
  open class NodeClient protected ()
    extends typingsJapgolly.sentryNode.typesClientMod.NodeClient {
    /**
      * Creates a new Node SDK instance.
      * @param options Configuration options for this SDK.
      */
    def this(options: NodeClientOptions) = this()
  }
  
  @JSImport("@sentry/node", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "7.15.0" */ String = js.native
  
  @JSImport("@sentry/node", "Scope")
  @js.native
  open class Scope ()
    extends typingsJapgolly.sentryCore.mod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/node", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typingsJapgolly.sentryCore.typesScopeMod.Scope): typingsJapgolly.sentryCore.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryCore.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/node", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sentryTypes.typesSeverityMod.Severity & String] = js.native
    
    /* "debug" */ val Debug: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Warning & String = js.native
  }
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addRequestDataToEvent(
    event: Event,
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(
    event: Event,
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any,
    options: OmitAddRequestDataToEvent
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCallExceptionHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallExceptionHint]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCallExceptionHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallExceptionHint]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
  inline def close(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def configureScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any])).asInstanceOf[Transport]
  inline def createTransport(
    options: InternalBaseTransportOptions,
    makeRequest: TransportRequestExecutor,
    buffer: PromiseBuffer[Unit]
  ): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(options.asInstanceOf[js.Any], makeRequest.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def deepReadDirSync(targetDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReadDirSync")(targetDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("@sentry/node", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    Console | Http | OnUncaughtException | OnUnhandledRejection | ContextLines | LinkedErrors | Modules | Context | InboundFilters | FunctionToString
  ] = js.native
  
  @JSImport("@sentry/node", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def extractRequestData(
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any
  ): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any,
    options: Include
  ): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def flush(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Promise[Boolean]]
  inline def flush(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getCurrentHub(): typingsJapgolly.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typingsJapgolly.sentryCore.typesHubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typingsJapgolly.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryCore.typesHubMod.Hub]
  
  inline def getSentryRelease(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")().asInstanceOf[js.UndefOr[String]]
  inline def getSentryRelease(fallback: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")(fallback.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: NodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  inline def makeMain(hub: typingsJapgolly.sentryCore.typesHubMod.Hub): typingsJapgolly.sentryCore.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryCore.typesHubMod.Hub]
  
  inline def makeNodeTransport(options: NodeTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNodeTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  inline def withScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
}
