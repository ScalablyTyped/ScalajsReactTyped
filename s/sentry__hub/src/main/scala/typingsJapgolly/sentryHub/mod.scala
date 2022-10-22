package typingsJapgolly.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryHub.anon.FnCall
import typingsJapgolly.sentryHub.anon.FnCallCallback
import typingsJapgolly.sentryHub.anon.FnCallContextCustomSamplingContext
import typingsJapgolly.sentryHub.anon.FnCallEventHint
import typingsJapgolly.sentryHub.anon.FnCallExceptionHint
import typingsJapgolly.sentryHub.anon.FnCallMessageLevelHint
import typingsJapgolly.sentryHub.anon.FnCallNameContext
import typingsJapgolly.sentryHub.anon.FnCallUser
import typingsJapgolly.sentryHub.anon.OmitSessionContextstarted
import typingsJapgolly.sentryHub.sentryHubStrings.ok
import typingsJapgolly.sentryHub.typesHubMod.Carrier
import typingsJapgolly.sentryHub.typesSessionflusherMod.ReleaseHealthAttributes
import typingsJapgolly.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typingsJapgolly.sentryTypes.typesClientMod.Client
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesExtraMod.Extra
import typingsJapgolly.sentryTypes.typesExtraMod.Extras
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import typingsJapgolly.sentryTypes.typesOptionsMod.ClientOptions
import typingsJapgolly.sentryTypes.typesScopeMod.CaptureContext
import typingsJapgolly.sentryTypes.typesSessionMod.Session
import typingsJapgolly.sentryTypes.typesSessionMod.SessionContext
import typingsJapgolly.sentryTypes.typesSessionMod.SessionStatus
import typingsJapgolly.sentryTypes.typesSeverityMod.Severity
import typingsJapgolly.sentryTypes.typesSeverityMod.SeverityLevel
import typingsJapgolly.sentryTypes.typesTransactionMod.CustomSamplingContext
import typingsJapgolly.sentryTypes.typesTransactionMod.TransactionContext
import typingsJapgolly.sentryTypes.typesTransportMod.BaseTransportOptions
import typingsJapgolly.sentryTypes.typesUserMod.User
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/hub", "Hub")
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
    extends typingsJapgolly.sentryHub.typesHubMod.Hub {
    def this(client: Client[ClientOptions[BaseTransportOptions]]) = this()
    def this(client: Unit, scope: typingsJapgolly.sentryHub.typesScopeMod.Scope) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typingsJapgolly.sentryHub.typesScopeMod.Scope
    ) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typingsJapgolly.sentryHub.typesScopeMod.Scope, _version: Double) = this()
    def this(client: Client[ClientOptions[BaseTransportOptions]], scope: Unit, _version: Double) = this()
    def this(
      client: Client[ClientOptions[BaseTransportOptions]],
      scope: typingsJapgolly.sentryHub.typesScopeMod.Scope,
      _version: Double
    ) = this()
  }
  
  @JSImport("@sentry/hub", "Scope")
  @js.native
  open class Scope ()
    extends typingsJapgolly.sentryHub.typesScopeMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/hub", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typingsJapgolly.sentryHub.typesScopeMod.Scope): typingsJapgolly.sentryHub.typesScopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryHub.typesScopeMod.Scope]
  }
  
  @JSImport("@sentry/hub", "SessionFlusher")
  @js.native
  open class SessionFlusher protected ()
    extends typingsJapgolly.sentryHub.typesSessionflusherMod.SessionFlusher {
    def this(client: Client[ClientOptions[BaseTransportOptions]], attrs: ReleaseHealthAttributes) = this()
  }
  
  inline def addBreadcrumb(breadcrumb: Breadcrumb): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def captureEvent(event: Event): ReturnType[FnCallEventHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallEventHint]]
  inline def captureEvent(event: Event, hint: EventHint): ReturnType[FnCallEventHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallEventHint]]
  
  inline def captureException(exception: Any): ReturnType[FnCallExceptionHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallExceptionHint]]
  inline def captureException(exception: Any, captureContext: CaptureContext): ReturnType[FnCallExceptionHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallExceptionHint]]
  
  inline def captureMessage(message: String): ReturnType[FnCallMessageLevelHint] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: CaptureContext): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: Severity): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  inline def captureMessage(message: String, captureContext: SeverityLevel): ReturnType[FnCallMessageLevelHint] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallMessageLevelHint]]
  
  inline def closeSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeSession_ok(session: Session, status: Exclude[SessionStatus, ok]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def configureScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryHub.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
  
  inline def getCurrentHub(): typingsJapgolly.sentryHub.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typingsJapgolly.sentryHub.typesHubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typingsJapgolly.sentryHub.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryHub.typesHubMod.Hub]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def makeMain(hub: typingsJapgolly.sentryHub.typesHubMod.Hub): typingsJapgolly.sentryHub.typesHubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sentryHub.typesHubMod.Hub]
  
  inline def makeSession(): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")().asInstanceOf[Session]
  inline def makeSession(context: OmitSessionContextstarted): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")(context.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def setContext(name: String): ReturnType[FnCallNameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallNameContext]]
  inline def setContext(name: String, context: StringDictionary[Any]): ReturnType[FnCallNameContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallNameContext]]
  
  inline def setExtra(key: String, extra: Extra): ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* extra */ Extra, Unit]]]
  
  inline def setExtras(extras: Extras): ReturnType[js.Function1[/* extras */ Extras, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* extras */ Extras, Unit]]]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: typingsJapgolly.sentryHub.typesHubMod.Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setTag(key: String, value: Primitive): ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReturnType[js.Function2[/* key */ String, /* value */ Primitive, Unit]]]
  
  inline def setTags(tags: StringDictionary[Primitive]): ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[ReturnType[js.Function1[/* tags */ StringDictionary[Primitive], Unit]]]
  
  inline def setUser(): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[ReturnType[FnCallUser]]
  inline def setUser(user: User): ReturnType[FnCallUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallUser]]
  
  inline def startTransaction(context: TransactionContext): ReturnType[FnCallContextCustomSamplingContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  inline def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): ReturnType[FnCallContextCustomSamplingContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCallContextCustomSamplingContext]]
  
  inline def updateSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSession(session: Session, context: SessionContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withScope(callback: js.Function1[/* scope */ typingsJapgolly.sentryHub.typesScopeMod.Scope, Unit]): ReturnType[FnCallCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallCallback]]
}
