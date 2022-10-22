package typingsJapgolly.knuddelsUserappsApi.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/App.html
  */
trait App extends StObject {
  
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
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onDebtsUpdate
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  var onDebtsUpdate: js.UndefOr[js.Function1[/* debts */ KnuddelAmount, Unit]] = js.undefined
  
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
  
  inline def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setChatCommands(
      value: StringDictionary[
          js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
        ]
    ): Self = StObject.set(x, "chatCommands", value.asInstanceOf[js.Any])
    
    inline def setChatCommandsUndefined: Self = StObject.set(x, "chatCommands", js.undefined)
    
    inline def setMayJoinChannel(value: /* user */ User => ChannelJoinPermission): Self = StObject.set(x, "mayJoinChannel", js.Any.fromFunction1(value))
    
    inline def setMayJoinChannelUndefined: Self = StObject.set(x, "mayJoinChannel", js.undefined)
    
    inline def setMayShowPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Boolean): Self = StObject.set(x, "mayShowPublicActionMessage", js.Any.fromFunction1(value))
    
    inline def setMayShowPublicActionMessageUndefined: Self = StObject.set(x, "mayShowPublicActionMessage", js.undefined)
    
    inline def setMayShowPublicMessage(value: /* publicMessage */ PublicMessage => Boolean): Self = StObject.set(x, "mayShowPublicMessage", js.Any.fromFunction1(value))
    
    inline def setMayShowPublicMessageUndefined: Self = StObject.set(x, "mayShowPublicMessage", js.undefined)
    
    inline def setMayUserDice(value: (/* user */ User, /* diceConfig */ DiceConfiguration) => Boolean): Self = StObject.set(x, "mayUserDice", js.Any.fromFunction2(value))
    
    inline def setMayUserDiceUndefined: Self = StObject.set(x, "mayUserDice", js.undefined)
    
    inline def setOnAccountChangedKnuddelAmount(
      value: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => Callback
    ): Self = StObject.set(x, "onAccountChangedKnuddelAmount", js.Any.fromFunction4((t0: /* user */ User, t1: /* knuddelAccount */ KnuddelAccount, t2: /* oldKnuddelAmount */ KnuddelAmount, t3: /* newKnuddelAmount */ KnuddelAmount) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnAccountChangedKnuddelAmountUndefined: Self = StObject.set(x, "onAccountChangedKnuddelAmount", js.undefined)
    
    inline def setOnAccountReceivedKnuddel(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => Callback
    ): Self = StObject.set(x, "onAccountReceivedKnuddel", js.Any.fromFunction5((t0: /* sender */ User, t1: /* receiver */ BotUser, t2: /* knuddelAmount */ KnuddelAmount, t3: /* transferReason */ java.lang.String, t4: /* knuddelAccount */ KnuddelAccount) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnAccountReceivedKnuddelUndefined: Self = StObject.set(x, "onAccountReceivedKnuddel", js.undefined)
    
    inline def setOnAppEventReceived(
      value: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ KnuddelsEvent) => Callback
    ): Self = StObject.set(x, "onAppEventReceived", js.Any.fromFunction3((t0: /* appInstance */ AppInstance, t1: /* type */ java.lang.String, t2: /* data */ KnuddelsEvent) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnAppEventReceivedUndefined: Self = StObject.set(x, "onAppEventReceived", js.undefined)
    
    inline def setOnAppStart(value: Callback): Self = StObject.set(x, "onAppStart", value.toJsFn)
    
    inline def setOnAppStartUndefined: Self = StObject.set(x, "onAppStart", js.undefined)
    
    inline def setOnBeforeKnuddelReceived(value: /* knuddelTransfer */ KnuddelTransfer => Callback): Self = StObject.set(x, "onBeforeKnuddelReceived", js.Any.fromFunction1((t0: /* knuddelTransfer */ KnuddelTransfer) => value(t0).runNow()))
    
    inline def setOnBeforeKnuddelReceivedUndefined: Self = StObject.set(x, "onBeforeKnuddelReceived", js.undefined)
    
    inline def setOnDebtsUpdate(value: /* debts */ KnuddelAmount => Callback): Self = StObject.set(x, "onDebtsUpdate", js.Any.fromFunction1((t0: /* debts */ KnuddelAmount) => value(t0).runNow()))
    
    inline def setOnDebtsUpdateUndefined: Self = StObject.set(x, "onDebtsUpdate", js.undefined)
    
    inline def setOnDeveloperCommand(value: (/* user */ User, /* params */ java.lang.String) => Callback): Self = StObject.set(x, "onDeveloperCommand", js.Any.fromFunction2((t0: /* user */ User, t1: /* params */ java.lang.String) => (value(t0, t1)).runNow()))
    
    inline def setOnDeveloperCommandUndefined: Self = StObject.set(x, "onDeveloperCommand", js.undefined)
    
    inline def setOnEventReceived(
      value: (/* user */ User, /* type */ java.lang.String, /* data */ KnuddelsEvent, /* appContentSession */ AppContentSession) => Callback
    ): Self = StObject.set(x, "onEventReceived", js.Any.fromFunction4((t0: /* user */ User, t1: /* type */ java.lang.String, t2: /* data */ KnuddelsEvent, t3: /* appContentSession */ AppContentSession) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnEventReceivedUndefined: Self = StObject.set(x, "onEventReceived", js.undefined)
    
    inline def setOnKnuddelReceived(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => Callback
    ): Self = StObject.set(x, "onKnuddelReceived", js.Any.fromFunction4((t0: /* sender */ User, t1: /* receiver */ BotUser, t2: /* knuddelAmount */ KnuddelAmount, t3: /* transferReason */ java.lang.String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnKnuddelReceivedUndefined: Self = StObject.set(x, "onKnuddelReceived", js.undefined)
    
    inline def setOnPrepareShutdown(value: /* secondsTillShutdown */ Double => Callback): Self = StObject.set(x, "onPrepareShutdown", js.Any.fromFunction1((t0: /* secondsTillShutdown */ Double) => value(t0).runNow()))
    
    inline def setOnPrepareShutdownUndefined: Self = StObject.set(x, "onPrepareShutdown", js.undefined)
    
    inline def setOnPrivateMessage(value: /* privateMessage */ PrivateMessage => Callback): Self = StObject.set(x, "onPrivateMessage", js.Any.fromFunction1((t0: /* privateMessage */ PrivateMessage) => value(t0).runNow()))
    
    inline def setOnPrivateMessageUndefined: Self = StObject.set(x, "onPrivateMessage", js.undefined)
    
    inline def setOnPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Callback): Self = StObject.set(x, "onPublicActionMessage", js.Any.fromFunction1((t0: /* publicActionMessage */ PublicActionMessage) => value(t0).runNow()))
    
    inline def setOnPublicActionMessageUndefined: Self = StObject.set(x, "onPublicActionMessage", js.undefined)
    
    inline def setOnPublicEventMessage(value: /* publicEventMessage */ PublicEventMessage => Callback): Self = StObject.set(x, "onPublicEventMessage", js.Any.fromFunction1((t0: /* publicEventMessage */ PublicEventMessage) => value(t0).runNow()))
    
    inline def setOnPublicEventMessageUndefined: Self = StObject.set(x, "onPublicEventMessage", js.undefined)
    
    inline def setOnPublicMessage(value: /* publicMessage */ PublicMessage => Callback): Self = StObject.set(x, "onPublicMessage", js.Any.fromFunction1((t0: /* publicMessage */ PublicMessage) => value(t0).runNow()))
    
    inline def setOnPublicMessageUndefined: Self = StObject.set(x, "onPublicMessage", js.undefined)
    
    inline def setOnShutdown(value: Callback): Self = StObject.set(x, "onShutdown", value.toJsFn)
    
    inline def setOnShutdownUndefined: Self = StObject.set(x, "onShutdown", js.undefined)
    
    inline def setOnUserDeleted(value: (/* userId */ Double, /* userPersistence */ UserPersistence) => Callback): Self = StObject.set(x, "onUserDeleted", js.Any.fromFunction2((t0: /* userId */ Double, t1: /* userPersistence */ UserPersistence) => (value(t0, t1)).runNow()))
    
    inline def setOnUserDeletedUndefined: Self = StObject.set(x, "onUserDeleted", js.undefined)
    
    inline def setOnUserDiced(value: /* diceEvent */ DiceEvent => Callback): Self = StObject.set(x, "onUserDiced", js.Any.fromFunction1((t0: /* diceEvent */ DiceEvent) => value(t0).runNow()))
    
    inline def setOnUserDicedUndefined: Self = StObject.set(x, "onUserDiced", js.undefined)
    
    inline def setOnUserJoined(value: /* user */ User => Callback): Self = StObject.set(x, "onUserJoined", js.Any.fromFunction1((t0: /* user */ User) => value(t0).runNow()))
    
    inline def setOnUserJoinedUndefined: Self = StObject.set(x, "onUserJoined", js.undefined)
    
    inline def setOnUserLeft(value: /* user */ User => Callback): Self = StObject.set(x, "onUserLeft", js.Any.fromFunction1((t0: /* user */ User) => value(t0).runNow()))
    
    inline def setOnUserLeftUndefined: Self = StObject.set(x, "onUserLeft", js.undefined)
  }
}
