package typingsJapgolly.matrixAppserviceBridge.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.matrixAppserviceBridge.libComponentsIntentMod.IntentBackingStore
import typingsJapgolly.matrixAppserviceBridge.libComponentsIntentMod.OnEventSentHook
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackingStore extends StObject {
  
  var backingStore: IntentBackingStore
  
  var caching: Size
  
  var dontCheckPowerLevel: js.UndefOr[Boolean] = js.undefined
  
  var dontJoin: js.UndefOr[Boolean] = js.undefined
  
  var enablePresence: Boolean
  
  var getJsSdkClient: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onEventSent: js.UndefOr[OnEventSentHook] = js.undefined
  
  var registered: js.UndefOr[Boolean] = js.undefined
}
object BackingStore {
  
  inline def apply(backingStore: IntentBackingStore, caching: Size, enablePresence: Boolean): BackingStore = {
    val __obj = js.Dynamic.literal(backingStore = backingStore.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], enablePresence = enablePresence.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackingStore]
  }
  
  extension [Self <: BackingStore](x: Self) {
    
    inline def setBackingStore(value: IntentBackingStore): Self = StObject.set(x, "backingStore", value.asInstanceOf[js.Any])
    
    inline def setCaching(value: Size): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
    
    inline def setDontCheckPowerLevel(value: Boolean): Self = StObject.set(x, "dontCheckPowerLevel", value.asInstanceOf[js.Any])
    
    inline def setDontCheckPowerLevelUndefined: Self = StObject.set(x, "dontCheckPowerLevel", js.undefined)
    
    inline def setDontJoin(value: Boolean): Self = StObject.set(x, "dontJoin", value.asInstanceOf[js.Any])
    
    inline def setDontJoinUndefined: Self = StObject.set(x, "dontJoin", js.undefined)
    
    inline def setEnablePresence(value: Boolean): Self = StObject.set(x, "enablePresence", value.asInstanceOf[js.Any])
    
    inline def setGetJsSdkClient(value: CallbackTo[Any]): Self = StObject.set(x, "getJsSdkClient", value.toJsFn)
    
    inline def setGetJsSdkClientUndefined: Self = StObject.set(x, "getJsSdkClient", js.undefined)
    
    inline def setOnEventSent(
      value: (/* roomId */ String, /* type */ String, /* content */ Record[String, Any], /* eventId */ String) => Callback
    ): Self = StObject.set(x, "onEventSent", js.Any.fromFunction4((t0: /* roomId */ String, t1: /* type */ String, t2: /* content */ Record[String, Any], t3: /* eventId */ String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnEventSentUndefined: Self = StObject.set(x, "onEventSent", js.undefined)
    
    inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
  }
}
