package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.emitterMod.Emitter
import typingsJapgolly.sipJs.registerMod.OutgoingRegisterRequest
import typingsJapgolly.sipJs.registererOptionsMod.RegistererOptions
import typingsJapgolly.sipJs.registererRegisterOptionsMod.RegistererRegisterOptions
import typingsJapgolly.sipJs.registererStateMod.RegistererState
import typingsJapgolly.sipJs.registererUnregisterOptionsMod.RegistererUnregisterOptions
import typingsJapgolly.sipJs.userAgentMod.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/registerer", JSImport.Namespace)
@js.native
object registererMod extends js.Object {
  @js.native
  class Registerer protected () extends js.Object {
    /**
      * Constructs a new instance of the `Registerer` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param options - Options bucket. See {@link RegistererOptions} for details.
      */
    def this(userAgent: UserAgent) = this()
    def this(userAgent: UserAgent, options: RegistererOptions) = this()
    /** The contacts returned from the most recent accepted REGISTER request. */
    var _contacts: js.Any = js.native
    /** The registration state. */
    var _state: js.Any = js.native
    /** Emits when the registration state changes. */
    var _stateEventEmitter: js.Any = js.native
    /** True is waiting for final response to outstanding REGISTER request. */
    var _waiting: js.Any = js.native
    /** Emits when waiting changes. */
    var _waitingEventEmitter: js.Any = js.native
    /**
      * Clear registration timers.
      */
    var clearTimers: js.Any = js.native
    /** The registered contacts. */
    val contacts: js.Array[String] = js.native
    var disposed: js.Any = js.native
    var expires: js.Any = js.native
    /**
      * Generate Contact Header
      */
    var generateContactHeader: js.Any = js.native
    var id: js.Any = js.native
    var logger: js.Any = js.native
    var options: js.Any = js.native
    /**
      * Helper function, called when registered.
      */
    var registered: js.Any = js.native
    var registrationExpiredTimer: js.Any = js.native
    var registrationTimer: js.Any = js.native
    var request: js.Any = js.native
    /** The registration state. */
    val state: RegistererState = js.native
    /** Emits when the registerer state changes. */
    val stateChange: Emitter[RegistererState] = js.native
    /**
      * Transition registration state.
      */
    var stateTransition: js.Any = js.native
    /**
      * Helper function, called when terminated.
      */
    var terminated: js.Any = js.native
    /**
      * Helper function, called when unregistered.
      */
    var unregistered: js.Any = js.native
    var userAgent: js.Any = js.native
    /** True if the registerer is currently waiting for final response to a REGISTER request. */
    val waiting: js.Any = js.native
    /** Emits when the registerer waiting state changes. */
    val waitingChange: js.Any = js.native
    /**
      * Toggle waiting.
      */
    var waitingToggle: js.Any = js.native
    /** Destructor. */
    def dispose(): js.Promise[Unit] = js.native
    /**
      * Sends the REGISTER request.
      * @remarks
      * If successful, sends re-REGISTER requests prior to registration expiration until `unsubscribe()` is called.
      * Rejects with `RequestPendingError` if a REGISTER request is already in progress.
      */
    def register(): js.Promise[OutgoingRegisterRequest] = js.native
    def register(options: RegistererRegisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
    /**
      * Sends the REGISTER request with expires equal to zero.
      * Rejects with `RequestPendingError` if a REGISTER request is already in progress.
      */
    def unregister(): js.Promise[OutgoingRegisterRequest] = js.native
    def unregister(options: RegistererUnregisterOptions): js.Promise[OutgoingRegisterRequest] = js.native
  }
  
  /* static members */
  @js.native
  object Registerer extends js.Object {
    /** Default registerer options. */
    val defaultOptions: js.Any = js.native
    var newUUID: js.Any = js.native
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    var stripUndefinedProperties: js.Any = js.native
  }
  
}

