package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.anon.PartialUserAgentOptions
import typingsJapgolly.sipJs.libApiInviterOptionsMod.InviterOptions
import typingsJapgolly.sipJs.libApiMessagerOptionsMod.MessagerOptions
import typingsJapgolly.sipJs.libApiPublisherOptionsMod.PublisherOptions
import typingsJapgolly.sipJs.libApiRegistererOptionsMod.RegistererOptions
import typingsJapgolly.sipJs.libApiSessionOptionsMod.SessionOptions
import typingsJapgolly.sipJs.libApiSubscriberOptionsMod.SubscriberOptions
import typingsJapgolly.sipJs.libApiSubscriptionOptionsMod.SubscriptionOptions
import typingsJapgolly.sipJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsMessageMod.IncomingMessageRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typingsJapgolly.sipJs.libCoreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiMod {
  
  @JSImport("sip.js/lib/api", "Ack")
  @js.native
  open class Ack protected ()
    extends typingsJapgolly.sipJs.libApiAckMod.Ack {
    /** @internal */
    def this(incomingAckRequest: IncomingAckRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Bye")
  @js.native
  open class Bye protected ()
    extends typingsJapgolly.sipJs.libApiByeMod.Bye {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "ContentTypeUnsupportedError")
  @js.native
  open class ContentTypeUnsupportedError ()
    extends typingsJapgolly.sipJs.libApiExceptionsMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "EmitterImpl")
  @js.native
  open class EmitterImpl[T] ()
    extends typingsJapgolly.sipJs.libApiEmitterMod.EmitterImpl[T]
  
  @JSImport("sip.js/lib/api", "Info")
  @js.native
  open class Info protected ()
    extends typingsJapgolly.sipJs.libApiInfoMod.Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Invitation")
  @js.native
  open class Invitation protected ()
    extends typingsJapgolly.sipJs.libApiInvitationMod.Invitation {
    /** @internal */
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      incomingInviteRequest: IncomingInviteRequest
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Inviter")
  @js.native
  open class Inviter protected ()
    extends typingsJapgolly.sipJs.libApiInviterMod.Inviter {
    /**
      * Constructs a new instance of the `Inviter` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param options - Options bucket. See {@link InviterOptions} for details.
      */
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, targetURI: URI) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      options: InviterOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Message")
  @js.native
  open class Message protected ()
    extends typingsJapgolly.sipJs.libApiMessageMod.Message {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Messager")
  @js.native
  open class Messager protected ()
    extends typingsJapgolly.sipJs.libApiMessagerMod.Messager {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, targetURI: URI, content: String) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String
    ) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: Unit,
      options: MessagerOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Notification")
  @js.native
  open class Notification protected ()
    extends typingsJapgolly.sipJs.libApiNotificationMod.Notification {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Publisher")
  @js.native
  open class Publisher protected ()
    extends typingsJapgolly.sipJs.libApiPublisherMod.Publisher {
    /**
      * Constructs a new instance of the `Publisher` class.
      *
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: PublisherOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "PublisherState")
  @js.native
  object PublisherState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiPublisherStateMod.PublisherState & String] = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libApiPublisherStateMod.PublisherState.Initial & String = js.native
    
    /* "Published" */ val Published: typingsJapgolly.sipJs.libApiPublisherStateMod.PublisherState.Published & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libApiPublisherStateMod.PublisherState.Terminated & String = js.native
    
    /* "Unpublished" */ val Unpublished: typingsJapgolly.sipJs.libApiPublisherStateMod.PublisherState.Unpublished & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "Referral")
  @js.native
  open class Referral protected ()
    extends typingsJapgolly.sipJs.libApiReferralMod.Referral {
    /** @internal */
    def this(
      incomingReferRequest: IncomingReferRequest,
      session: typingsJapgolly.sipJs.libApiSessionMod.Session
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Registerer")
  @js.native
  open class Registerer protected ()
    extends typingsJapgolly.sipJs.libApiRegistererMod.Registerer {
    /**
      * Constructs a new instance of the `Registerer` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param options - Options bucket. See {@link RegistererOptions} for details.
      */
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent) = this()
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, options: RegistererOptions) = this()
  }
  /* static members */
  object Registerer {
    
    @JSImport("sip.js/lib/api", "Registerer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/api", "Registerer.defaultExpires")
    @js.native
    val defaultExpires: Any = js.native
    
    /** Default registerer options. */
    @JSImport("sip.js/lib/api", "Registerer.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/api", "Registerer.defaultRefreshFrequency")
    @js.native
    val defaultRefreshFrequency: Any = js.native
    
    @JSImport("sip.js/lib/api", "Registerer.newUUID")
    @js.native
    def newUUID: Any = js.native
    inline def newUUID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "Registerer.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "RegistererState")
  @js.native
  object RegistererState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiRegistererStateMod.RegistererState & String] = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libApiRegistererStateMod.RegistererState.Initial & String = js.native
    
    /* "Registered" */ val Registered: typingsJapgolly.sipJs.libApiRegistererStateMod.RegistererState.Registered & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libApiRegistererStateMod.RegistererState.Terminated & String = js.native
    
    /* "Unregistered" */ val Unregistered: typingsJapgolly.sipJs.libApiRegistererStateMod.RegistererState.Unregistered & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "RequestPendingError")
  @js.native
  /** @internal */
  open class RequestPendingError ()
    extends typingsJapgolly.sipJs.libApiExceptionsMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SIPExtension")
  @js.native
  object SIPExtension extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension & String] = js.native
    
    /* "Required" */ val Required: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Required & String = js.native
    
    /* "Supported" */ val Supported: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Supported & String = js.native
    
    /* "Unsupported" */ val Unsupported: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Unsupported & String = js.native
  }
  
  /* note: abstract class */ @JSImport("sip.js/lib/api", "Session")
  @js.native
  open class Session protected ()
    extends typingsJapgolly.sipJs.libApiSessionMod.Session {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent) = this()
    /* protected */ def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, options: SessionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionDescriptionHandlerError")
  @js.native
  open class SessionDescriptionHandlerError ()
    extends typingsJapgolly.sipJs.libApiExceptionsMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiSessionStateMod.SessionState & String] = js.native
    
    /* "Established" */ val Established: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Established & String = js.native
    
    /* "Establishing" */ val Establishing: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Establishing & String = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Initial & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Terminated & String = js.native
    
    /* "Terminating" */ val Terminating: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Terminating & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "SessionTerminatedError")
  @js.native
  open class SessionTerminatedError ()
    extends typingsJapgolly.sipJs.libApiExceptionsMod.SessionTerminatedError
  
  @JSImport("sip.js/lib/api", "StateTransitionError")
  @js.native
  open class StateTransitionError ()
    extends typingsJapgolly.sipJs.libApiExceptionsMod.StateTransitionError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "Subscriber")
  @js.native
  open class Subscriber protected ()
    extends typingsJapgolly.sipJs.libApiSubscriberMod.Subscriber {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - The request URI identifying the subscribed event.
      * @param eventType - The event type identifying the subscribed event.
      * @param options - Options bucket. See {@link SubscriberOptions} for details.
      */
    def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: SubscriberOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("sip.js/lib/api", "Subscription")
  @js.native
  open class Subscription protected ()
    extends typingsJapgolly.sipJs.libApiSubscriptionMod.Subscription {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent) = this()
    /* protected */ def this(userAgent: typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent, options: SubscriptionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiSubscriptionStateMod.SubscriptionState & String] = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libApiSubscriptionStateMod.SubscriptionState.Initial & String = js.native
    
    /* "NotifyWait" */ val NotifyWait: typingsJapgolly.sipJs.libApiSubscriptionStateMod.SubscriptionState.NotifyWait & String = js.native
    
    /* "Subscribed" */ val Subscribed: typingsJapgolly.sipJs.libApiSubscriptionStateMod.SubscriptionState.Subscribed & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libApiSubscriptionStateMod.SubscriptionState.Terminated & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "TransportState")
  @js.native
  object TransportState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiTransportStateMod.TransportState & String] = js.native
    
    /* "Connected" */ val Connected: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Connected & String = js.native
    
    /* "Connecting" */ val Connecting: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Connecting & String = js.native
    
    /* "Disconnected" */ val Disconnected: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Disconnected & String = js.native
    
    /* "Disconnecting" */ val Disconnecting: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Disconnecting & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "UserAgent")
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  open class UserAgent ()
    extends typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent {
    def this(options: PartialUserAgentOptions) = this()
  }
  /* static members */
  object UserAgent {
    
    @JSImport("sip.js/lib/api", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default user agent options. */
    @JSImport("sip.js/lib/api", "UserAgent.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    inline def makeURI(uri: String): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "UserAgent.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "UserAgentState")
  @js.native
  object UserAgentState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiUserAgentStateMod.UserAgentState & String] = js.native
    
    /* "Started" */ val Started: typingsJapgolly.sipJs.libApiUserAgentStateMod.UserAgentState.Started & String = js.native
    
    /* "Stopped" */ val Stopped: typingsJapgolly.sipJs.libApiUserAgentStateMod.UserAgentState.Stopped & String = js.native
  }
}
