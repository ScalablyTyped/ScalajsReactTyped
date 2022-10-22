package typingsJapgolly.amazonConnectStreams

import typingsJapgolly.amazonConnectStreams.connect.Agent
import typingsJapgolly.amazonConnectStreams.connect.AgentApp
import typingsJapgolly.amazonConnectStreams.connect.AgentCallback
import typingsJapgolly.amazonConnectStreams.connect.Contact
import typingsJapgolly.amazonConnectStreams.connect.ContactCallback
import typingsJapgolly.amazonConnectStreams.connect.Core
import typingsJapgolly.amazonConnectStreams.connect.EndpointType
import typingsJapgolly.amazonConnectStreams.connect.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object connect {
    
    @JSGlobal("connect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("connect.AgentAvailStates")
    @js.native
    object AgentAvailStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates & String] = js.native
      
      /* "AfterCallWork" */ val AFTER_CALL_WORK: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.AFTER_CALL_WORK & String = js.native
      
      /* "Busy" */ val BUSY: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.BUSY & String = js.native
      
      /* "CallingCustomer" */ val CALLING_CUSTOMER: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.CALLING_CUSTOMER & String = js.native
      
      /* "Dialing" */ val DIALING: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.DIALING & String = js.native
      
      /* "Init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.INIT & String = js.native
      
      /* "Joining" */ val JOINING: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.JOINING & String = js.native
      
      /* "PendingAvailable" */ val PENDING_AVAILABLE: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.PENDING_AVAILABLE & String = js.native
      
      /* "PendingBusy" */ val PENDING_BUSY: typingsJapgolly.amazonConnectStreams.connect.AgentAvailStates.PENDING_BUSY & String = js.native
    }
    
    @JSGlobal("connect.AgentErrorStates")
    @js.native
    object AgentErrorStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates & String] = js.native
      
      /* "AgentHungUp" */ val AGENT_HUNG_UP: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.AGENT_HUNG_UP & String = js.native
      
      /* "BadAddressAgent" */ val BAD_ADDRESS_AGENT: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_AGENT & String = js.native
      
      /* "BadAddressCustomer" */ val BAD_ADDRESS_CUSTOMER: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_CUSTOMER & String = js.native
      
      /* "Default" */ val DEFAULT: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.DEFAULT & String = js.native
      
      /* "Error" */ val ERROR: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.ERROR & String = js.native
      
      /* "FailedConnectAgent" */ val FAILED_CONNECT_AGENT: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_AGENT & String = js.native
      
      /* "FailedConnectCustomer" */ val FAILED_CONNECT_CUSTOMER: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_CUSTOMER & String = js.native
      
      /* "LineEngagedAgent" */ val LINE_ENGAGED_AGENT: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_AGENT & String = js.native
      
      /* "LineEngagedCustomer" */ val LINE_ENGAGED_CUSTOMER: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_CUSTOMER & String = js.native
      
      /* "MissedCallAgent" */ val MISSED_CALL_AGENT: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_AGENT & String = js.native
      
      /* "MissedCallCustomer" */ val MISSED_CALL_CUSTOMER: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_CUSTOMER & String = js.native
      
      /* "MultipleCcpWindows" */ val MULTIPLE_CCP_WINDOWS: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.MULTIPLE_CCP_WINDOWS & String = js.native
      
      /* "RealtimeCommunicationError" */ val REALTIME_COMMUNICATION_ERROR: typingsJapgolly.amazonConnectStreams.connect.AgentErrorStates.REALTIME_COMMUNICATION_ERROR & String = js.native
    }
    
    /** This enumeration lists the different types of agent states. */
    @JSGlobal("connect.AgentStateType")
    @js.native
    object AgentStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.AgentStateType & String] = js.native
      
      /* "init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.AgentStateType.INIT & String = js.native
      
      /* "not_routable" */ val NOT_ROUTABLE: typingsJapgolly.amazonConnectStreams.connect.AgentStateType.NOT_ROUTABLE & String = js.native
      
      /* "offline" */ val OFFLINE: typingsJapgolly.amazonConnectStreams.connect.AgentStateType.OFFLINE & String = js.native
      
      /* "routable" */ val ROUTABLE: typingsJapgolly.amazonConnectStreams.connect.AgentStateType.ROUTABLE & String = js.native
    }
    
    /**
      * The Agent API provides event subscription methods and action methods which can be called on behalf of the agent.
      * There is only ever one agent per Streams instantiation and all contacts and actions are assumed to be taken on behalf of this one agent.
      */
    @JSGlobal("connect.Agent")
    @js.native
    open class Agent_ ()
      extends StObject
         with Agent
    
    /**
      * The Connection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the contactId and connectionId of the connection and make sure that the contact and connection still exist by fetching them in order from the Agent API object before calling methods on them.
      */
    @JSGlobal("connect.BaseConnection")
    @js.native
    open class BaseConnection ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.BaseConnection
    
    @JSGlobal("connect.CONTACT_ACTIVE_STATES")
    @js.native
    object CONTACT_ACTIVE_STATES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES & String] = js.native
      
      /* "connected" */ val CONNECTED: typingsJapgolly.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typingsJapgolly.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTING & String = js.native
      
      /* "incoming" */ val INCOMING: typingsJapgolly.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.INCOMING & String = js.native
      
      /* "pending" */ val PENDING: typingsJapgolly.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.PENDING & String = js.native
    }
    
    @JSGlobal("connect.CTIExceptions")
    @js.native
    object CTIExceptions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.CTIExceptions & String] = js.native
      
      /* "AccessDeniedException" */ val ACCESS_DENIED_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.ACCESS_DENIED_EXCEPTION & String = js.native
      
      /* "BadEndpointException" */ val BAD_ENDPOINT_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.BAD_ENDPOINT_EXCEPTION & String = js.native
      
      /* "InvalidAgentARNException" */ val INVALID_AGENT_ARNEXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.INVALID_AGENT_ARNEXCEPTION & String = js.native
      
      /* "InvalidConfigurationException" */ val INVALID_CONFIGURATION_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.INVALID_CONFIGURATION_EXCEPTION & String = js.native
      
      /* "InvalidContactTypeException" */ val INVALID_CONTACT_TYPE_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.INVALID_CONTACT_TYPE_EXCEPTION & String = js.native
      
      /* "InvalidStateException" */ val INVALID_STATE_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.INVALID_STATE_EXCEPTION & String = js.native
      
      /* "PaginationException" */ val PAGINATION_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.PAGINATION_EXCEPTION & String = js.native
      
      /* "RefreshTokenExpiredException" */ val REFRESH_TOKEN_EXPIRED_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.REFRESH_TOKEN_EXPIRED_EXCEPTION & String = js.native
      
      /* "SendDataFailedException" */ val SEND_DATA_FAILED_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.SEND_DATA_FAILED_EXCEPTION & String = js.native
      
      /* "UnauthorizedException" */ val UNAUTHORIZED_EXCEPTION: typingsJapgolly.amazonConnectStreams.connect.CTIExceptions.UNAUTHORIZED_EXCEPTION & String = js.native
    }
    
    /** This enumeration lists the different types of contact channels. */
    @JSGlobal("connect.ChannelType")
    @js.native
    object ChannelType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ChannelType & String] = js.native
      
      /* "CHAT" */ val CHAT: typingsJapgolly.amazonConnectStreams.connect.ChannelType.CHAT & String = js.native
      
      /* "TASK" */ val TASK: typingsJapgolly.amazonConnectStreams.connect.ChannelType.TASK & String = js.native
      
      /* "VOICE" */ val VOICE: typingsJapgolly.amazonConnectStreams.connect.ChannelType.VOICE & String = js.native
    }
    
    /**
      * The ChatConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular chat connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.ChatConnection")
    @js.native
    open class ChatConnection ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.ChatConnection
    
    @JSGlobal("connect.ClickType")
    @js.native
    object ClickType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ClickType & String] = js.native
      
      /* "Accept" */ val ACCEPT: typingsJapgolly.amazonConnectStreams.connect.ClickType.ACCEPT & String = js.native
      
      /* "Hangup" */ val HANGUP: typingsJapgolly.amazonConnectStreams.connect.ClickType.HANGUP & String = js.native
      
      /* "Reject" */ val REJECT: typingsJapgolly.amazonConnectStreams.connect.ClickType.REJECT & String = js.native
    }
    
    /** An enumeration listing the different states that a connection can have. */
    @JSGlobal("connect.ConnectionStateType")
    @js.native
    object ConnectionStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType & String] = js.native
      
      /* "connected" */ val CONNECTED: typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType.CONNECTING & String = js.native
      
      /* "disconnected" */ val DISCONNECTED: typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED & String = js.native
      
      /* "hold" */ val HOLD: typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType.HOLD & String = js.native
      
      /* "init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.ConnectionStateType.INIT & String = js.native
    }
    
    /** Lists the different types of connections. */
    @JSGlobal("connect.ConnectionType")
    @js.native
    object ConnectionType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ConnectionType & String] = js.native
      
      /* "agent" */ val AGENT: typingsJapgolly.amazonConnectStreams.connect.ConnectionType.AGENT & String = js.native
      
      /* "inbound" */ val INBOUND: typingsJapgolly.amazonConnectStreams.connect.ConnectionType.INBOUND & String = js.native
      
      /* "monitoring" */ val MONITORING: typingsJapgolly.amazonConnectStreams.connect.ConnectionType.MONITORING & String = js.native
      
      /* "outbound" */ val OUTBOUND: typingsJapgolly.amazonConnectStreams.connect.ConnectionType.OUTBOUND & String = js.native
    }
    
    @JSGlobal("connect.ContactEvents")
    @js.native
    object ContactEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ContactEvents & String] = js.native
      
      /* "accepted" */ val ACCEPTED: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.ACCEPTED & String = js.native
      
      /* "acw" */ val ACW: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.ACW & String = js.native
      
      /* "connected" */ val CONNECTED: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.CONNECTING & String = js.native
      
      /* "destroyed" */ val DESTROYED: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.DESTROYED & String = js.native
      
      /* "ended" */ val ENDED: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.ENDED & String = js.native
      
      /* "error" */ val ERROR: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.ERROR & String = js.native
      
      /* "incoming" */ val INCOMING: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.INCOMING & String = js.native
      
      /* "init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.INIT & String = js.native
      
      /* "missed" */ val MISSED: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.MISSED & String = js.native
      
      /* "pending" */ val PENDING: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.PENDING & String = js.native
      
      /* "refresh" */ val REFRESH: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.REFRESH & String = js.native
      
      /* "view" */ val VIEW: typingsJapgolly.amazonConnectStreams.connect.ContactEvents.VIEW & String = js.native
    }
    
    /** An enumeration listing the different high-level states that a contact can have. */
    @JSGlobal("connect.ContactStateType")
    @js.native
    object ContactStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ContactStateType & String] = js.native
      
      /* "connected" */ val CONNECTED: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.CONNECTED & String = js.native
      
      /* "connecting" */ val CONNECTING: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.CONNECTING & String = js.native
      
      /* "ended" */ val ENDED: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.ENDED & String = js.native
      
      /* "error" */ val ERROR: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.ERROR & String = js.native
      
      /* "incoming" */ val INCOMING: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.INCOMING & String = js.native
      
      /* "init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.INIT & String = js.native
      
      /* "missed" */ val MISSED: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.MISSED & String = js.native
      
      /* "pending" */ val PENDING: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.PENDING & String = js.native
      
      /* "rejected" */ val REJECTED: typingsJapgolly.amazonConnectStreams.connect.ContactStateType.REJECTED & String = js.native
    }
    
    /** This enumeration lists all of the contact types supported by Connect Streams. */
    @JSGlobal("connect.ContactType")
    @js.native
    object ContactType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ContactType & String] = js.native
      
      /* "chat" */ val CHAT: typingsJapgolly.amazonConnectStreams.connect.ContactType.CHAT & String = js.native
      
      /* "queue_callback" */ val QUEUE_CALLBACK: typingsJapgolly.amazonConnectStreams.connect.ContactType.QUEUE_CALLBACK & String = js.native
      
      /* "task" */ val TASK: typingsJapgolly.amazonConnectStreams.connect.ContactType.TASK & String = js.native
      
      /* "voice" */ val VOICE: typingsJapgolly.amazonConnectStreams.connect.ContactType.VOICE & String = js.native
    }
    
    /**
      * The Contact API provides event subscription methods and action methods which can be called on behalf of a specific contact.
      * Contacts come and go and so should these API objects.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` of the contact and make sure that the contact still exists by fetching it from the `Agent` API object before calling methods on it.
      */
    @JSGlobal("connect.Contact")
    @js.native
    open class Contact_ ()
      extends StObject
         with Contact
    
    @JSGlobal("connect.Endpoint")
    @js.native
    open class Endpoint ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.Endpoint {
      
      /* CompleteClass */
      override val agentLogin: String = js.native
      
      /* CompleteClass */
      override val endpointARN: String = js.native
      
      /* CompleteClass */
      override val endpointId: String = js.native
      
      /* CompleteClass */
      override val name: String = js.native
      
      /* CompleteClass */
      override val phoneNumber: String = js.native
      
      /* CompleteClass */
      override val queue: String = js.native
      
      /* CompleteClass */
      override val `type`: EndpointType = js.native
    }
    object Endpoint {
      
      @JSGlobal("connect.Endpoint")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates an endpoint from a E.164 phone number.
        *
        * @param phoneNumber The E.164 endpoint phone number.
        */
      /* static member */
      inline def byPhoneNumber(phoneNumber: String): typingsJapgolly.amazonConnectStreams.connect.Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("byPhoneNumber")(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.amazonConnectStreams.connect.Endpoint]
    }
    
    /** This enumeration lists the different types of endpoints. */
    @JSGlobal("connect.EndpointType")
    @js.native
    object EndpointType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.EndpointType & String] = js.native
      
      /* "agent" */ val AGENT: typingsJapgolly.amazonConnectStreams.connect.EndpointType.AGENT & String = js.native
      
      /* "phone_number" */ val PHONE_NUMBER: typingsJapgolly.amazonConnectStreams.connect.EndpointType.PHONE_NUMBER & String = js.native
      
      /* "queue" */ val QUEUE: typingsJapgolly.amazonConnectStreams.connect.EndpointType.QUEUE & String = js.native
    }
    
    @JSGlobal("connect.EventType")
    @js.native
    object EventType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.EventType & String] = js.native
      
      /* "access_denied" */ val ACCESS_DENIED: typingsJapgolly.amazonConnectStreams.connect.EventType.ACCESS_DENIED & String = js.native
      
      /* "acknowledge" */ val ACKNOWLEDGE: typingsJapgolly.amazonConnectStreams.connect.EventType.ACKNOWLEDGE & String = js.native
      
      /* "ack_timeout" */ val ACK_TIMEOUT: typingsJapgolly.amazonConnectStreams.connect.EventType.ACK_TIMEOUT & String = js.native
      
      /* "api_metric" */ val API_METRIC: typingsJapgolly.amazonConnectStreams.connect.EventType.API_METRIC & String = js.native
      
      /* "api_request" */ val API_REQUEST: typingsJapgolly.amazonConnectStreams.connect.EventType.API_REQUEST & String = js.native
      
      /* "api_response" */ val API_RESPONSE: typingsJapgolly.amazonConnectStreams.connect.EventType.API_RESPONSE & String = js.native
      
      /* "authorize_retries_exhausted" */ val AUTHORIZE_RETRIES_EXHAUSTED: typingsJapgolly.amazonConnectStreams.connect.EventType.AUTHORIZE_RETRIES_EXHAUSTED & String = js.native
      
      /* "authorize_success" */ val AUTHORIZE_SUCCESS: typingsJapgolly.amazonConnectStreams.connect.EventType.AUTHORIZE_SUCCESS & String = js.native
      
      /* "auth_fail" */ val AUTH_FAIL: typingsJapgolly.amazonConnectStreams.connect.EventType.AUTH_FAIL & String = js.native
      
      /* "broadcast" */ val BROADCAST: typingsJapgolly.amazonConnectStreams.connect.EventType.BROADCAST & String = js.native
      
      /* "click_stream_data" */ val CLICK_STREAM_DATA: typingsJapgolly.amazonConnectStreams.connect.EventType.CLICK_STREAM_DATA & String = js.native
      
      /* "client_metric" */ val CLIENT_METRIC: typingsJapgolly.amazonConnectStreams.connect.EventType.CLIENT_METRIC & String = js.native
      
      /* "client_side_logs" */ val CLIENT_SIDE_LOGS: typingsJapgolly.amazonConnectStreams.connect.EventType.CLIENT_SIDE_LOGS & String = js.native
      
      /* "close" */ val CLOSE: typingsJapgolly.amazonConnectStreams.connect.EventType.CLOSE & String = js.native
      
      /* "configure" */ val CONFIGURE: typingsJapgolly.amazonConnectStreams.connect.EventType.CONFIGURE & String = js.native
      
      /* "cti_authorize_retries_exhausted" */ val CTI_AUTHORIZE_RETRIES_EXHAUSTED: typingsJapgolly.amazonConnectStreams.connect.EventType.CTI_AUTHORIZE_RETRIES_EXHAUSTED & String = js.native
      
      /* "iframe_retries_exhausted" */ val IFRAME_RETRIES_EXHAUSTED: typingsJapgolly.amazonConnectStreams.connect.EventType.IFRAME_RETRIES_EXHAUSTED & String = js.native
      
      /* "iframe_style" */ val IFRAME_STYLE: typingsJapgolly.amazonConnectStreams.connect.EventType.IFRAME_STYLE & String = js.native
      
      /* "init" */ val INIT: typingsJapgolly.amazonConnectStreams.connect.EventType.INIT & String = js.native
      
      /* "log" */ val LOG: typingsJapgolly.amazonConnectStreams.connect.EventType.LOG & String = js.native
      
      /* "master_request" */ val MASTER_REQUEST: typingsJapgolly.amazonConnectStreams.connect.EventType.MASTER_REQUEST & String = js.native
      
      /* "master_response" */ val MASTER_RESPONSE: typingsJapgolly.amazonConnectStreams.connect.EventType.MASTER_RESPONSE & String = js.native
      
      /* "media_device_request" */ val MEDIA_DEVICE_REQUEST: typingsJapgolly.amazonConnectStreams.connect.EventType.MEDIA_DEVICE_REQUEST & String = js.native
      
      /* "media_device_response" */ val MEDIA_DEVICE_RESPONSE: typingsJapgolly.amazonConnectStreams.connect.EventType.MEDIA_DEVICE_RESPONSE & String = js.native
      
      /* "mute" */ val MUTE: typingsJapgolly.amazonConnectStreams.connect.EventType.MUTE & String = js.native
      
      /* "outer_context_info" */ val OUTER_CONTEXT_INFO: typingsJapgolly.amazonConnectStreams.connect.EventType.OUTER_CONTEXT_INFO & String = js.native
      
      /* "reload_agent_configuration" */ val RELOAD_AGENT_CONFIGURATION: typingsJapgolly.amazonConnectStreams.connect.EventType.RELOAD_AGENT_CONFIGURATION & String = js.native
      
      /* "send_logs" */ val SEND_LOGS: typingsJapgolly.amazonConnectStreams.connect.EventType.SEND_LOGS & String = js.native
      
      /* "server_bound_internal_log" */ val SERVER_BOUND_INTERNAL_LOG: typingsJapgolly.amazonConnectStreams.connect.EventType.SERVER_BOUND_INTERNAL_LOG & String = js.native
      
      /* "softphone_report" */ val SOFTPHONE_REPORT: typingsJapgolly.amazonConnectStreams.connect.EventType.SOFTPHONE_REPORT & String = js.native
      
      /* "softphone_stats" */ val SOFTPHONE_STATS: typingsJapgolly.amazonConnectStreams.connect.EventType.SOFTPHONE_STATS & String = js.native
      
      /* "synchronize" */ val SYNCHRONIZE: typingsJapgolly.amazonConnectStreams.connect.EventType.SYNCHRONIZE & String = js.native
      
      /* "tab_id" */ val TAB_ID: typingsJapgolly.amazonConnectStreams.connect.EventType.TAB_ID & String = js.native
      
      /* "terminate" */ val TERMINATE: typingsJapgolly.amazonConnectStreams.connect.EventType.TERMINATE & String = js.native
      
      /* "terminated" */ val TERMINATED: typingsJapgolly.amazonConnectStreams.connect.EventType.TERMINATED & String = js.native
      
      /* "update_connected_ccps" */ val UPDATE_CONNECTED_CCPS: typingsJapgolly.amazonConnectStreams.connect.EventType.UPDATE_CONNECTED_CCPS & String = js.native
    }
    
    @JSGlobal("connect.MediaType")
    @js.native
    object MediaType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.MediaType & String] = js.native
      
      /* "chat" */ val CHAT: typingsJapgolly.amazonConnectStreams.connect.MediaType.CHAT & String = js.native
      
      /* "softphone" */ val SOFTPHONE: typingsJapgolly.amazonConnectStreams.connect.MediaType.SOFTPHONE & String = js.native
      
      /* "task" */ val TASK: typingsJapgolly.amazonConnectStreams.connect.MediaType.TASK & String = js.native
    }
    
    @JSGlobal("connect.ReferenceType")
    @js.native
    object ReferenceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.ReferenceType & String] = js.native
      
      /* "URL" */ val URL: typingsJapgolly.amazonConnectStreams.connect.ReferenceType.URL & String = js.native
    }
    
    @JSGlobal("connect.SoftphoneCallType")
    @js.native
    object SoftphoneCallType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.SoftphoneCallType & String] = js.native
      
      /* "audio_only" */ val AUDIO_ONLY: typingsJapgolly.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_ONLY & String = js.native
      
      /* "audio_video" */ val AUDIO_VIDEO: typingsJapgolly.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_VIDEO & String = js.native
      
      /* "none" */ val NONE: typingsJapgolly.amazonConnectStreams.connect.SoftphoneCallType.NONE & String = js.native
      
      /* "video_only" */ val VIDEO_ONLY: typingsJapgolly.amazonConnectStreams.connect.SoftphoneCallType.VIDEO_ONLY & String = js.native
    }
    
    @JSGlobal("connect.SoftphoneError")
    @js.native
    open class SoftphoneError protected ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.SoftphoneError {
      def this(errorType: String, errorMessage: String, endPointUrl: String) = this()
      
      /* CompleteClass */
      override val endPointUrl: String = js.native
      
      /* CompleteClass */
      override val errorMessage: String = js.native
      
      /* CompleteClass */
      override val errorType: String = js.native
      
      /* CompleteClass */
      override def getEndPointUrl(): String = js.native
      
      /* CompleteClass */
      override def getErrorMessage(): String = js.native
      
      /* CompleteClass */
      override def getErrorType(): String = js.native
    }
    
    @JSGlobal("connect.SoftphoneErrorTypes")
    @js.native
    object SoftphoneErrorTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes & String] = js.native
      
      /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.ICE_COLLECTION_TIMEOUT & String = js.native
      
      /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.MICROPHONE_NOT_SHARED & String = js.native
      
      /* "other" */ val OTHER: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.OTHER & String = js.native
      
      /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.REALTIME_COMMUNICATION_ERROR & String = js.native
      
      /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_CONNECTION_FAILURE & String = js.native
      
      /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_HANDSHAKE_FAILURE & String = js.native
      
      /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.UNSUPPORTED_BROWSER & String = js.native
      
      /* "user_busy_error" */ val USER_BUSY_ERROR: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.USER_BUSY_ERROR & String = js.native
      
      /* "webrtc_error" */ val WEBRTC_ERROR: typingsJapgolly.amazonConnectStreams.connect.SoftphoneErrorTypes.WEBRTC_ERROR & String = js.native
    }
    
    /**
      * The TaskConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular task connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.TaskConnection")
    @js.native
    open class TaskConnection ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.TaskConnection
    
    /**
      * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.VoiceConnection")
    @js.native
    open class VoiceConnection ()
      extends StObject
         with typingsJapgolly.amazonConnectStreams.connect.VoiceConnection
    
    /**
      * Subscribe a method to be called when the agent is initialized.
      * If the agent has already been initialized, the call is synchronous and the callback is invoked immediately.
      * Otherwise, the callback is invoked once the first agent data is received from upstream.
      * This callback is provided with an `Agent` API object, which can also be created at any time after initialization is complete via `new connect.Agent()`.
      *
      * @param callback A callback that will receive an `Agent` API object instance.
      */
    inline def agent(callback: AgentCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("connect.agentApp")
    @js.native
    val agentApp: AgentApp = js.native
    
    /**
      * Subscribe a method to be called for each newly detected agent contact.
      * Note that this function is not only for incoming contacts, but for contacts which already existed when Streams was initialized, such as from a previous agent session.
      * This callback is provided with a `Contact` API object for this contact. `Contact` API objects can also be listed from the `Agent` API by calling `agent.getContacts()`.
      *
      * @param callback A callback that will receive an `Contact` API object instance.
      */
    inline def contact(callback: ContactCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("contact")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("connect.core")
    @js.native
    val core: Core = js.native
    
    /** Gets the global logger instance. */
    inline def getLog(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLog")().asInstanceOf[Logger]
    
    /**
      * A useful utility function for creating callback closures that bind a function to an object instance.
      *
      * @param scope The instance object to be set as the scope of the function.
      * @param method The method to be encapsulated.
      */
    inline def hitch[T /* <: js.Function1[/* repeated */ Any, Any] */](scope: js.Object, method: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("hitch")(scope.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
