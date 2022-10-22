package typingsJapgolly.reduxSentryMiddleware

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryBrowser.anon.TypeofCoreIntegrations
import typingsJapgolly.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typingsJapgolly.sentryBrowser.mod.Breadcrumbs
import typingsJapgolly.sentryBrowser.mod.Dedupe
import typingsJapgolly.sentryBrowser.mod.FunctionToString
import typingsJapgolly.sentryBrowser.mod.GlobalHandlers
import typingsJapgolly.sentryBrowser.mod.HttpContext
import typingsJapgolly.sentryBrowser.mod.InboundFilters
import typingsJapgolly.sentryBrowser.mod.LinkedErrors
import typingsJapgolly.sentryBrowser.mod.Scope
import typingsJapgolly.sentryBrowser.typesClientMod.BrowserClientOptions
import typingsJapgolly.sentryBrowser.typesClientMod.BrowserOptions
import typingsJapgolly.sentryBrowser.typesHelpersMod.ReportDialogOptions
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.TryCatch
import typingsJapgolly.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typingsJapgolly.sentryBrowser.typesTransportsUtilsMod.FetchImpl
import typingsJapgolly.sentryCore.anon.FnCall
import typingsJapgolly.sentryCore.anon.FnCallCallback
import typingsJapgolly.sentryCore.anon.FnCallContextCustomSamplingContext
import typingsJapgolly.sentryCore.anon.FnCallEventHint
import typingsJapgolly.sentryCore.anon.FnCallExceptionHint
import typingsJapgolly.sentryCore.anon.FnCallMessageLevelHint
import typingsJapgolly.sentryCore.anon.FnCallNameContext
import typingsJapgolly.sentryCore.anon.FnCallUser
import typingsJapgolly.sentryCore.typesHubMod.Carrier
import typingsJapgolly.sentryCore.typesHubMod.Hub
import typingsJapgolly.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesExtraMod.Extra
import typingsJapgolly.sentryTypes.typesExtraMod.Extras
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import typingsJapgolly.sentryTypes.typesScopeMod.CaptureContext
import typingsJapgolly.sentryTypes.typesSeverityMod.Severity
import typingsJapgolly.sentryTypes.typesSeverityMod.SeverityLevel
import typingsJapgolly.sentryTypes.typesStackframeMod.StackFrame
import typingsJapgolly.sentryTypes.typesStacktraceMod.StackLineParser
import typingsJapgolly.sentryTypes.typesTransactionMod.CustomSamplingContext
import typingsJapgolly.sentryTypes.typesTransactionMod.TransactionContext
import typingsJapgolly.sentryTypes.typesTransportMod.InternalBaseTransportOptions
import typingsJapgolly.sentryTypes.typesTransportMod.Transport
import typingsJapgolly.sentryTypes.typesTransportMod.TransportRequestExecutor
import typingsJapgolly.sentryTypes.typesUserMod.User
import typingsJapgolly.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeof extends StObject {
    
    var Breadcrumbs: typingsJapgolly.sentryBrowser.anon.TypeofBreadcrumbs
    
    var Dedupe: typingsJapgolly.sentryBrowser.anon.TypeofDedupe
    
    var FunctionToString: TypeofCoreIntegrations
    
    var GlobalHandlers: typingsJapgolly.sentryBrowser.anon.TypeofGlobalHandlers
    
    var HttpContext: typingsJapgolly.sentryBrowser.anon.TypeofHttpContext
    
    var InboundFilters: TypeofCoreIntegrationsInstantiable
    
    var LinkedErrors: typingsJapgolly.sentryBrowser.anon.TypeofLinkedErrors
    
    var TryCatch: typingsJapgolly.sentryBrowser.anon.TypeofTryCatch
  }
  object Typeof {
    
    inline def apply(
      Breadcrumbs: typingsJapgolly.sentryBrowser.anon.TypeofBreadcrumbs,
      Dedupe: typingsJapgolly.sentryBrowser.anon.TypeofDedupe,
      FunctionToString: TypeofCoreIntegrations,
      GlobalHandlers: typingsJapgolly.sentryBrowser.anon.TypeofGlobalHandlers,
      HttpContext: typingsJapgolly.sentryBrowser.anon.TypeofHttpContext,
      InboundFilters: TypeofCoreIntegrationsInstantiable,
      LinkedErrors: typingsJapgolly.sentryBrowser.anon.TypeofLinkedErrors,
      TryCatch: typingsJapgolly.sentryBrowser.anon.TypeofTryCatch
    ): Typeof = {
      val __obj = js.Dynamic.literal(Breadcrumbs = Breadcrumbs.asInstanceOf[js.Any], Dedupe = Dedupe.asInstanceOf[js.Any], FunctionToString = FunctionToString.asInstanceOf[js.Any], GlobalHandlers = GlobalHandlers.asInstanceOf[js.Any], HttpContext = HttpContext.asInstanceOf[js.Any], InboundFilters = InboundFilters.asInstanceOf[js.Any], LinkedErrors = LinkedErrors.asInstanceOf[js.Any], TryCatch = TryCatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeof]
    }
    
    extension [Self <: Typeof](x: Self) {
      
      inline def setBreadcrumbs(value: typingsJapgolly.sentryBrowser.anon.TypeofBreadcrumbs): Self = StObject.set(x, "Breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setDedupe(value: typingsJapgolly.sentryBrowser.anon.TypeofDedupe): Self = StObject.set(x, "Dedupe", value.asInstanceOf[js.Any])
      
      inline def setFunctionToString(value: TypeofCoreIntegrations): Self = StObject.set(x, "FunctionToString", value.asInstanceOf[js.Any])
      
      inline def setGlobalHandlers(value: typingsJapgolly.sentryBrowser.anon.TypeofGlobalHandlers): Self = StObject.set(x, "GlobalHandlers", value.asInstanceOf[js.Any])
      
      inline def setHttpContext(value: typingsJapgolly.sentryBrowser.anon.TypeofHttpContext): Self = StObject.set(x, "HttpContext", value.asInstanceOf[js.Any])
      
      inline def setInboundFilters(value: TypeofCoreIntegrationsInstantiable): Self = StObject.set(x, "InboundFilters", value.asInstanceOf[js.Any])
      
      inline def setLinkedErrors(value: typingsJapgolly.sentryBrowser.anon.TypeofLinkedErrors): Self = StObject.set(x, "LinkedErrors", value.asInstanceOf[js.Any])
      
      inline def setTryCatch(value: typingsJapgolly.sentryBrowser.anon.TypeofTryCatch): Self = StObject.set(x, "TryCatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBreadcrumbs
    extends StObject
       with Instantiable0[Breadcrumbs] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofDedupe
    extends StObject
       with Instantiable0[Dedupe] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofFunctionToString
    extends StObject
       with Instantiable0[FunctionToString] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofGlobalHandlers
    extends StObject
       with Instantiable0[GlobalHandlers] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofHttpContext
    extends StObject
       with Instantiable0[HttpContext] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofInboundFilters
    extends StObject
       with Instantiable0[InboundFilters] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofIntegrations
    extends StObject
       with Typeof
  
  @js.native
  trait TypeofLinkedErrors
    extends StObject
       with Instantiable0[LinkedErrors] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  trait TypeofScope
    extends StObject
       with Instantiable0[Scope] {
    
    def clone(scope: typingsJapgolly.sentryCore.typesScopeMod.Scope): typingsJapgolly.sentryCore.typesScopeMod.Scope = js.native
  }
  
  @js.native
  trait TypeofSentry extends StObject {
    
    var Breadcrumbs: TypeofBreadcrumbs = js.native
    
    var BrowserClient: Instantiable1[
        /* options */ BrowserClientOptions, 
        typingsJapgolly.sentryBrowser.mod.BrowserClient
      ] = js.native
    
    var Dedupe: TypeofDedupe = js.native
    
    var FunctionToString: TypeofFunctionToString = js.native
    
    var GlobalHandlers: TypeofGlobalHandlers = js.native
    
    var HttpContext: TypeofHttpContext = js.native
    
    var Hub: Instantiable0[typingsJapgolly.sentryBrowser.mod.Hub] = js.native
    
    var InboundFilters: TypeofInboundFilters = js.native
    
    val Integrations: TypeofIntegrations = js.native
    
    var LinkedErrors: TypeofLinkedErrors = js.native
    
    val SDK_VERSION: /* "7.15.0" */ String = js.native
    
    var Scope: TypeofScope = js.native
    
    var TryCatch: TypeofTryCatch = js.native
    
    def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCall] = js.native
    
    def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
    
    def captureEvent(event: Event): ReturnType[FnCallEventHint] = js.native
    def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = js.native
    
    def captureException(exception: Any): ReturnType[FnCallExceptionHint] = js.native
    def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCallExceptionHint] = js.native
    
    def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = js.native
    def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = js.native
    
    val chromeStackLineParser: StackLineParser = js.native
    
    def close(): PromiseLike[Boolean] = js.native
    def close(timeout: Double): PromiseLike[Boolean] = js.native
    
    def configureScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
    def createTransport(options: InternalBaseTransportOptions, makeRequest: TransportRequestExecutor): Transport = js.native
    def createTransport(
      options: InternalBaseTransportOptions,
      makeRequest: TransportRequestExecutor,
      buffer: PromiseBuffer[Unit]
    ): Transport = js.native
    
    val defaultIntegrations: js.Array[
        typingsJapgolly.sentryBrowser.typesIntegrationsMod.GlobalHandlers | TryCatch | typingsJapgolly.sentryBrowser.typesIntegrationsMod.Breadcrumbs | typingsJapgolly.sentryBrowser.typesIntegrationsMod.LinkedErrors | typingsJapgolly.sentryBrowser.typesIntegrationsMod.HttpContext | typingsJapgolly.sentryBrowser.typesIntegrationsMod.Dedupe | typingsJapgolly.sentryCore.mod.Integrations.InboundFilters | typingsJapgolly.sentryCore.mod.Integrations.FunctionToString
      ] = js.native
    
    val defaultStackLineParsers: js.Array[StackLineParser] = js.native
    
    def defaultStackParser(stack: String): js.Array[StackFrame] = js.native
    def defaultStackParser(stack: String, skipFirst: Double): js.Array[StackFrame] = js.native
    
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    def forceLoad(): Unit = js.native
    
    val geckoStackLineParser: StackLineParser = js.native
    
    def getCurrentHub(): Hub = js.native
    
    def getHubFromCarrier(carrier: Carrier): Hub = js.native
    
    def init(): Unit = js.native
    def init(options: BrowserOptions): Unit = js.native
    
    def lastEventId(): js.UndefOr[String] = js.native
    
    def makeFetchTransport(options: BrowserTransportOptions): Transport = js.native
    def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = js.native
    
    def makeMain(hub: Hub): Hub = js.native
    
    def makeXHRTransport(options: BrowserTransportOptions): Transport = js.native
    
    def onLoad(callback: js.Function0[Unit]): Unit = js.native
    
    val opera10StackLineParser: StackLineParser = js.native
    
    val opera11StackLineParser: StackLineParser = js.native
    
    def setContext(name: String): ReturnType[FnCallNameContext] = js.native
    def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = js.native
    
    def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = js.native
    
    def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = js.native
    
    def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = js.native
    
    def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = js.native
    
    def setUser(): ReturnType[FnCallUser] = js.native
    def setUser(user: User): ReturnType[FnCallUser] = js.native
    
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: Unit, hub: typingsJapgolly.sentryCore.mod.Hub): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
    def showReportDialog(options: ReportDialogOptions, hub: typingsJapgolly.sentryCore.mod.Hub): Unit = js.native
    
    def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = js.native
    
    val winjsStackLineParser: StackLineParser = js.native
    
    def withScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryCore.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = js.native
    
    def wrap(fn: js.Function1[/* args */ Any, Any]): Any = js.native
  }
  
  @js.native
  trait TypeofTryCatch
    extends StObject
       with Instantiable0[typingsJapgolly.sentryBrowser.mod.TryCatch] {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
