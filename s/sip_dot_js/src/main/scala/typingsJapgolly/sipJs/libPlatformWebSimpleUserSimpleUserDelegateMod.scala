package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSimpleUserSimpleUserDelegateMod {
  
  trait SimpleUserDelegate extends StObject {
    
    /**
      * Called when a call is answered.
      * @remarks
      * Callback for handling establishment of a new Session.
      */
    var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when a call is created.
      * @remarks
      * Callback for handling the creation of a new Session.
      */
    var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when a call receives an incoming DTMF tone.
      * @remarks
      * Callback for handling an incoming INFO request with content type application/dtmf-relay.
      */
    var onCallDTMFReceived: js.UndefOr[js.Function2[/* tone */ String, /* duration */ Double, Unit]] = js.undefined
    
    /**
      * Called when a call is hung up.
      * @remarks
      * Callback for handling termination of a Session.
      */
    var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when a call is put on hold or taken off hold.
      * @remarks
      * Callback for handling re-INVITE responses.
      */
    var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.undefined
    
    /**
      * Called when a call is received.
      * @remarks
      * Callback for handling incoming INVITE requests.
      * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
      */
    var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called upon receiving a message.
      * @remarks
      * Callback for handling incoming MESSAGE requests.
      * @param message - The message received.
      */
    var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    /**
      * Called when user is registered to received calls.
      */
    var onRegistered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when user is connected to server.
      * @remarks
      * Callback for handling user becomes connected.
      */
    var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when user is no longer connected.
      * @remarks
      * Callback for handling user becomes disconnected.
      *
      * @param error - An Error if server caused the disconnect. Otherwise undefined.
      */
    var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    /**
      * Called when user is no longer registered to received calls.
      */
    var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SimpleUserDelegate {
    
    inline def apply(): SimpleUserDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserDelegate]
    }
    
    extension [Self <: SimpleUserDelegate](x: Self) {
      
      inline def setOnCallAnswered(value: Callback): Self = StObject.set(x, "onCallAnswered", value.toJsFn)
      
      inline def setOnCallAnsweredUndefined: Self = StObject.set(x, "onCallAnswered", js.undefined)
      
      inline def setOnCallCreated(value: Callback): Self = StObject.set(x, "onCallCreated", value.toJsFn)
      
      inline def setOnCallCreatedUndefined: Self = StObject.set(x, "onCallCreated", js.undefined)
      
      inline def setOnCallDTMFReceived(value: (/* tone */ String, /* duration */ Double) => Callback): Self = StObject.set(x, "onCallDTMFReceived", js.Any.fromFunction2((t0: /* tone */ String, t1: /* duration */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnCallDTMFReceivedUndefined: Self = StObject.set(x, "onCallDTMFReceived", js.undefined)
      
      inline def setOnCallHangup(value: Callback): Self = StObject.set(x, "onCallHangup", value.toJsFn)
      
      inline def setOnCallHangupUndefined: Self = StObject.set(x, "onCallHangup", js.undefined)
      
      inline def setOnCallHold(value: /* held */ Boolean => Callback): Self = StObject.set(x, "onCallHold", js.Any.fromFunction1((t0: /* held */ Boolean) => value(t0).runNow()))
      
      inline def setOnCallHoldUndefined: Self = StObject.set(x, "onCallHold", js.undefined)
      
      inline def setOnCallReceived(value: Callback): Self = StObject.set(x, "onCallReceived", value.toJsFn)
      
      inline def setOnCallReceivedUndefined: Self = StObject.set(x, "onCallReceived", js.undefined)
      
      inline def setOnMessageReceived(value: /* message */ String => Callback): Self = StObject.set(x, "onMessageReceived", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
      
      inline def setOnMessageReceivedUndefined: Self = StObject.set(x, "onMessageReceived", js.undefined)
      
      inline def setOnRegistered(value: Callback): Self = StObject.set(x, "onRegistered", value.toJsFn)
      
      inline def setOnRegisteredUndefined: Self = StObject.set(x, "onRegistered", js.undefined)
      
      inline def setOnServerConnect(value: Callback): Self = StObject.set(x, "onServerConnect", value.toJsFn)
      
      inline def setOnServerConnectUndefined: Self = StObject.set(x, "onServerConnect", js.undefined)
      
      inline def setOnServerDisconnect(value: /* error */ js.UndefOr[js.Error] => Callback): Self = StObject.set(x, "onServerDisconnect", js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Error]) => value(t0).runNow()))
      
      inline def setOnServerDisconnectUndefined: Self = StObject.set(x, "onServerDisconnect", js.undefined)
      
      inline def setOnUnregistered(value: Callback): Self = StObject.set(x, "onUnregistered", value.toJsFn)
      
      inline def setOnUnregisteredUndefined: Self = StObject.set(x, "onUnregistered", js.undefined)
    }
  }
}
