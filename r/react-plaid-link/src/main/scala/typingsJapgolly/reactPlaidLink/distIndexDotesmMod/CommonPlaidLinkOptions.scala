package typingsJapgolly.reactPlaidLink.distIndexDotesmMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPlaidLinkOptions extends StObject {
  
  // A callback that is called during a user's flow in Link.
  // See all values for eventName here https://plaid.com/docs/link/web/#link-web-onevent-eventName
  var onEvent: js.UndefOr[PlaidLinkOnEvent] = js.undefined
  
  // A callback that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[PlaidLinkOnExit] = js.undefined
  
  // A callback that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[PlaidLinkOnLoad] = js.undefined
  
  // A function that is called when a user has successfully connecter an Item.
  // The function should expect two arguments, the public_key and a metadata object
  var onSuccess: PlaidLinkOnSuccess
}
object CommonPlaidLinkOptions {
  
  inline def apply(onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Callback): CommonPlaidLinkOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ PlaidLinkOnSuccessMetadata) => (onSuccess(t0, t1)).runNow()))
    __obj.asInstanceOf[CommonPlaidLinkOptions]
  }
  
  extension [Self <: CommonPlaidLinkOptions](x: Self) {
    
    inline def setOnEvent(
      value: (/* eventName */ PlaidLinkStableEvent | String, /* metadata */ PlaidLinkOnEventMetadata) => Callback
    ): Self = StObject.set(x, "onEvent", js.Any.fromFunction2((t0: /* eventName */ PlaidLinkStableEvent | String, t1: /* metadata */ PlaidLinkOnEventMetadata) => (value(t0, t1)).runNow()))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: (/* error */ Null | PlaidLinkError, /* metadata */ PlaidLinkOnExitMetadata) => Callback): Self = StObject.set(x, "onExit", js.Any.fromFunction2((t0: /* error */ Null | PlaidLinkError, t1: /* metadata */ PlaidLinkOnExitMetadata) => (value(t0, t1)).runNow()))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnSuccess(value: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ PlaidLinkOnSuccessMetadata) => (value(t0, t1)).runNow()))
  }
}
