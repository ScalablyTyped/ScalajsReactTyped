package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.emitterMod.Emitter
import typingsJapgolly.sipJs.subscriptionDelegateMod.SubscriptionDelegate
import typingsJapgolly.sipJs.subscriptionOptionsMod.SubscriptionOptions
import typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState
import typingsJapgolly.sipJs.subscriptionSubscribeOptionsMod.SubscriptionSubscribeOptions
import typingsJapgolly.sipJs.subscriptionUnsubscribeOptionsMod.SubscriptionUnsubscribeOptions
import typingsJapgolly.sipJs.userAgentMod.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/subscription", JSImport.Namespace)
@js.native
object subscriptionMod extends js.Object {
  @js.native
  abstract class Subscription protected () extends js.Object {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    protected def this(userAgent: UserAgent) = this()
    protected def this(userAgent: UserAgent, options: SubscriptionOptions) = this()
    /**
      * If the subscription state is SubscriptionState.Subscribed, the associated subscription dialog. Otherwise undefined.
      * @internal
      */
    var _dialog: js.UndefOr[typingsJapgolly.sipJs.subscriptionSubscriptionMod.Subscription] = js.native
    var _disposed: js.Any = js.native
    var _logger: js.Any = js.native
    var _state: js.Any = js.native
    var _stateEventEmitter: js.Any = js.native
    /**
      * Our user agent.
      * @internal
      */
    var _userAgent: UserAgent = js.native
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: js.Any = js.native
    /**
      * Subscription delegate. See {@link SubscriptionDelegate} for details.
      * @defaultValue `undefined`
      */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    /**
      * The subscribed subscription dialog.
      */
    val dialog: js.UndefOr[typingsJapgolly.sipJs.subscriptionSubscriptionMod.Subscription] = js.native
    /**
      * True if disposed.
      * @internal
      */
    val disposed: Boolean = js.native
    /**
      * Subscription state. See {@link SubscriptionState} for details.
      */
    val state: SubscriptionState = js.native
    /**
      * Emits when the subscription `state` property changes.
      */
    val stateChange: Emitter[SubscriptionState] = js.native
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    /** @internal */
    /* protected */ def stateTransition(newState: SubscriptionState): Unit = js.native
    /**
      * Sends a re-SUBSCRIBE request if the subscription is "active".
      */
    def subscribe(): js.Promise[Unit] = js.native
    def subscribe(options: SubscriptionSubscribeOptions): js.Promise[Unit] = js.native
    /**
      * Unsubscribe from event notifications.
      *
      * @remarks
      * If the subscription state is SubscriptionState.Subscribed, sends an in dialog SUBSCRIBE request
      * with expires time of zero (an un-subscribe) and terminates the subscription.
      * Otherwise a noop.
      */
    def unsubscribe(): js.Promise[Unit] = js.native
    def unsubscribe(options: SubscriptionUnsubscribeOptions): js.Promise[Unit] = js.native
  }
  
}

