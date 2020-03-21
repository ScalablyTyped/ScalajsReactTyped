package typingsJapgolly.knuddelsUserappsApi.mod._Global_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knuddelsUserappsApi.mod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/App.html
	 */
trait App extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#property_chatCommands
  		 */
  var chatCommands: js.UndefOr[
    StringDictionary[
      js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayJoinChannel
  		 */
  var mayJoinChannel: js.UndefOr[js.Function1[/* user */ User, ChannelJoinPermission]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicActionMessage
  		 */
  var mayShowPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicMessage
  		 */
  var mayShowPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayUserDice
  		 */
  var mayUserDice: js.UndefOr[js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountChangedKnuddelAmount
  		 */
  var onAccountChangedKnuddelAmount: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* knuddelAccount */ KnuddelAccount, 
      /* oldKnuddelAmount */ KnuddelAmount, 
      /* newKnuddelAmount */ KnuddelAmount, 
      Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountReceivedKnuddel
  		 */
  var onAccountReceivedKnuddel: js.UndefOr[
    js.Function5[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      /* knuddelAccount */ KnuddelAccount, 
      Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppEventReceived
  		 */
  var onAppEventReceived: js.UndefOr[
    js.Function3[
      /* appInstance */ AppInstance, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppStart
  		 */
  var onAppStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onBeforeKnuddelReceived
  		 */
  var onBeforeKnuddelReceived: js.UndefOr[js.Function1[/* knuddelTransfer */ KnuddelTransfer, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onDeveloperCommand
  		 * @since AppServer 108662, ChatServer 108662
  		 */
  var onDeveloperCommand: js.UndefOr[js.Function2[/* user */ User, /* params */ java.lang.String, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onEventReceived
  		 */
  var onEventReceived: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      /* appContentSession */ AppContentSession, 
      Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onKnuddelReceived
  		 */
  var onKnuddelReceived: js.UndefOr[
    js.Function4[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrepareShutdown
  		 */
  var onPrepareShutdown: js.UndefOr[js.Function1[/* secondsTillShutdown */ Double, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrivateMessage
  		 */
  var onPrivateMessage: js.UndefOr[js.Function1[/* privateMessage */ PrivateMessage, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicActionMessage
  		 */
  var onPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicEventMessage
  		 */
  var onPublicEventMessage: js.UndefOr[js.Function1[/* publicEventMessage */ PublicEventMessage, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicMessage
  		 */
  var onPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onShutdown
  		 */
  var onShutdown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDeleted
  		 */
  var onUserDeleted: js.UndefOr[js.Function2[/* userId */ Double, /* userPersistence */ UserPersistence, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDiced
  		 */
  var onUserDiced: js.UndefOr[js.Function1[/* diceEvent */ DiceEvent, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserJoined
  		 */
  var onUserJoined: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserLeft
  		 */
  var onUserLeft: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.undefined
}

object App {
  @scala.inline
  def apply(
    chatCommands: StringDictionary[
      js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
    ] = null,
    mayJoinChannel: /* user */ User => CallbackTo[ChannelJoinPermission] = null,
    mayShowPublicActionMessage: /* publicActionMessage */ PublicActionMessage => CallbackTo[Boolean] = null,
    mayShowPublicMessage: /* publicMessage */ PublicMessage => CallbackTo[Boolean] = null,
    mayUserDice: (/* user */ User, /* diceConfig */ DiceConfiguration) => CallbackTo[Boolean] = null,
    onAccountChangedKnuddelAmount: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => Callback = null,
    onAccountReceivedKnuddel: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => Callback = null,
    onAppEventReceived: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ KnuddelsEvent) => Callback = null,
    onAppStart: js.UndefOr[Callback] = js.undefined,
    onBeforeKnuddelReceived: /* knuddelTransfer */ KnuddelTransfer => Callback = null,
    onDeveloperCommand: (/* user */ User, /* params */ java.lang.String) => Callback = null,
    onEventReceived: (/* user */ User, /* type */ java.lang.String, /* data */ KnuddelsEvent, /* appContentSession */ AppContentSession) => Callback = null,
    onKnuddelReceived: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => Callback = null,
    onPrepareShutdown: /* secondsTillShutdown */ Double => Callback = null,
    onPrivateMessage: /* privateMessage */ PrivateMessage => Callback = null,
    onPublicActionMessage: /* publicActionMessage */ PublicActionMessage => Callback = null,
    onPublicEventMessage: /* publicEventMessage */ PublicEventMessage => Callback = null,
    onPublicMessage: /* publicMessage */ PublicMessage => Callback = null,
    onShutdown: js.UndefOr[Callback] = js.undefined,
    onUserDeleted: (/* userId */ Double, /* userPersistence */ UserPersistence) => Callback = null,
    onUserDiced: /* diceEvent */ DiceEvent => Callback = null,
    onUserJoined: /* user */ User => Callback = null,
    onUserLeft: /* user */ User => Callback = null
  ): App = {
    val __obj = js.Dynamic.literal()
    if (chatCommands != null) __obj.updateDynamic("chatCommands")(chatCommands.asInstanceOf[js.Any])
    if (mayJoinChannel != null) __obj.updateDynamic("mayJoinChannel")(js.Any.fromFunction1((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User) => mayJoinChannel(t0).runNow()))
    if (mayShowPublicActionMessage != null) __obj.updateDynamic("mayShowPublicActionMessage")(js.Any.fromFunction1((t0: /* publicActionMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PublicActionMessage) => mayShowPublicActionMessage(t0).runNow()))
    if (mayShowPublicMessage != null) __obj.updateDynamic("mayShowPublicMessage")(js.Any.fromFunction1((t0: /* publicMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PublicMessage) => mayShowPublicMessage(t0).runNow()))
    if (mayUserDice != null) __obj.updateDynamic("mayUserDice")(js.Any.fromFunction2((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* diceConfig */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.DiceConfiguration) => mayUserDice(t0, t1).runNow()))
    if (onAccountChangedKnuddelAmount != null) __obj.updateDynamic("onAccountChangedKnuddelAmount")(js.Any.fromFunction4((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* knuddelAccount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAccount, t2: /* oldKnuddelAmount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAmount, t3: /* newKnuddelAmount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAmount) => onAccountChangedKnuddelAmount(t0, t1, t2, t3).runNow()))
    if (onAccountReceivedKnuddel != null) __obj.updateDynamic("onAccountReceivedKnuddel")(js.Any.fromFunction5((t0: /* sender */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* receiver */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.BotUser, t2: /* knuddelAmount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAmount, t3: /* transferReason */ java.lang.String, t4: /* knuddelAccount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAccount) => onAccountReceivedKnuddel(t0, t1, t2, t3, t4).runNow()))
    if (onAppEventReceived != null) __obj.updateDynamic("onAppEventReceived")(js.Any.fromFunction3((t0: /* appInstance */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.AppInstance, t1: /* type */ java.lang.String, t2: /* data */ typingsJapgolly.knuddelsUserappsApi.mod.KnuddelsEvent) => onAppEventReceived(t0, t1, t2).runNow()))
    onAppStart.foreach(p => __obj.updateDynamic("onAppStart")(p.toJsFn))
    if (onBeforeKnuddelReceived != null) __obj.updateDynamic("onBeforeKnuddelReceived")(js.Any.fromFunction1((t0: /* knuddelTransfer */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelTransfer) => onBeforeKnuddelReceived(t0).runNow()))
    if (onDeveloperCommand != null) __obj.updateDynamic("onDeveloperCommand")(js.Any.fromFunction2((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* params */ java.lang.String) => onDeveloperCommand(t0, t1).runNow()))
    if (onEventReceived != null) __obj.updateDynamic("onEventReceived")(js.Any.fromFunction4((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* type */ java.lang.String, t2: /* data */ typingsJapgolly.knuddelsUserappsApi.mod.KnuddelsEvent, t3: /* appContentSession */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.AppContentSession) => onEventReceived(t0, t1, t2, t3).runNow()))
    if (onKnuddelReceived != null) __obj.updateDynamic("onKnuddelReceived")(js.Any.fromFunction4((t0: /* sender */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User, t1: /* receiver */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.BotUser, t2: /* knuddelAmount */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelAmount, t3: /* transferReason */ java.lang.String) => onKnuddelReceived(t0, t1, t2, t3).runNow()))
    if (onPrepareShutdown != null) __obj.updateDynamic("onPrepareShutdown")(js.Any.fromFunction1((t0: /* secondsTillShutdown */ scala.Double) => onPrepareShutdown(t0).runNow()))
    if (onPrivateMessage != null) __obj.updateDynamic("onPrivateMessage")(js.Any.fromFunction1((t0: /* privateMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PrivateMessage) => onPrivateMessage(t0).runNow()))
    if (onPublicActionMessage != null) __obj.updateDynamic("onPublicActionMessage")(js.Any.fromFunction1((t0: /* publicActionMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PublicActionMessage) => onPublicActionMessage(t0).runNow()))
    if (onPublicEventMessage != null) __obj.updateDynamic("onPublicEventMessage")(js.Any.fromFunction1((t0: /* publicEventMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PublicEventMessage) => onPublicEventMessage(t0).runNow()))
    if (onPublicMessage != null) __obj.updateDynamic("onPublicMessage")(js.Any.fromFunction1((t0: /* publicMessage */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.PublicMessage) => onPublicMessage(t0).runNow()))
    onShutdown.foreach(p => __obj.updateDynamic("onShutdown")(p.toJsFn))
    if (onUserDeleted != null) __obj.updateDynamic("onUserDeleted")(js.Any.fromFunction2((t0: /* userId */ scala.Double, t1: /* userPersistence */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.UserPersistence) => onUserDeleted(t0, t1).runNow()))
    if (onUserDiced != null) __obj.updateDynamic("onUserDiced")(js.Any.fromFunction1((t0: /* diceEvent */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.DiceEvent) => onUserDiced(t0).runNow()))
    if (onUserJoined != null) __obj.updateDynamic("onUserJoined")(js.Any.fromFunction1((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User) => onUserJoined(t0).runNow()))
    if (onUserLeft != null) __obj.updateDynamic("onUserLeft")(js.Any.fromFunction1((t0: /* user */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.User) => onUserLeft(t0).runNow()))
    __obj.asInstanceOf[App]
  }
}

