package typingsJapgolly.reactRedux

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactRedux.anon.Clear
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsSubscriptionMod {
  
  @JSImport("react-redux/es/utils/Subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSubscription(store: Any): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscription")(store.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  inline def createSubscription(store: Any, parentSub: Subscription): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscription")(store.asInstanceOf[js.Any], parentSub.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  trait Listener extends StObject {
    
    var callback: VoidFunc
    
    var next: Listener | Null
    
    var prev: Listener | Null
  }
  object Listener {
    
    inline def apply(callback: Callback): Listener = {
      val __obj = js.Dynamic.literal(callback = callback.toJsFn, next = null, prev = null)
      __obj.asInstanceOf[Listener]
    }
    
    extension [Self <: Listener](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setNext(value: Listener): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: Listener): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
  
  type ListenerCollection = ReturnType[js.Function0[Clear]]
  
  trait Subscription extends StObject {
    
    def addNestedSub(listener: VoidFunc): VoidFunc
    
    def getListeners(): ListenerCollection
    
    var handleChangeWrapper: VoidFunc
    
    def isSubscribed(): Boolean
    
    var notifyNestedSubs: VoidFunc
    
    var onStateChange: js.UndefOr[VoidFunc | Null] = js.undefined
    
    var trySubscribe: VoidFunc
    
    var tryUnsubscribe: VoidFunc
  }
  object Subscription {
    
    inline def apply(
      addNestedSub: VoidFunc => VoidFunc,
      getListeners: CallbackTo[ListenerCollection],
      handleChangeWrapper: Callback,
      isSubscribed: CallbackTo[Boolean],
      notifyNestedSubs: Callback,
      trySubscribe: Callback,
      tryUnsubscribe: Callback
    ): Subscription = {
      val __obj = js.Dynamic.literal(addNestedSub = js.Any.fromFunction1(addNestedSub), getListeners = getListeners.toJsFn, handleChangeWrapper = handleChangeWrapper.toJsFn, isSubscribed = isSubscribed.toJsFn, notifyNestedSubs = notifyNestedSubs.toJsFn, trySubscribe = trySubscribe.toJsFn, tryUnsubscribe = tryUnsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setAddNestedSub(value: VoidFunc => VoidFunc): Self = StObject.set(x, "addNestedSub", js.Any.fromFunction1(value))
      
      inline def setGetListeners(value: CallbackTo[ListenerCollection]): Self = StObject.set(x, "getListeners", value.toJsFn)
      
      inline def setHandleChangeWrapper(value: Callback): Self = StObject.set(x, "handleChangeWrapper", value.toJsFn)
      
      inline def setIsSubscribed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSubscribed", value.toJsFn)
      
      inline def setNotifyNestedSubs(value: Callback): Self = StObject.set(x, "notifyNestedSubs", value.toJsFn)
      
      inline def setOnStateChange(value: Callback): Self = StObject.set(x, "onStateChange", value.toJsFn)
      
      inline def setOnStateChangeNull: Self = StObject.set(x, "onStateChange", null)
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setTrySubscribe(value: Callback): Self = StObject.set(x, "trySubscribe", value.toJsFn)
      
      inline def setTryUnsubscribe(value: Callback): Self = StObject.set(x, "tryUnsubscribe", value.toJsFn)
    }
  }
  
  type VoidFunc = js.Function0[Unit]
}
