package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.SKError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to refresh the receipt, which represents the user's transactions with your app.
  *
  * See https://developer.apple.com/documentation/storekit/skreceiptrefreshrequest for more information.
  */
trait SKReceiptRefreshRequest extends StObject {
  
  /**
    * Cancels a previously started request.
    */
  def cancel(): Unit
  
  /**
    * Tells the delegate that the request failed to execute.
    */
  var onRequestDidFailWithError: js.UndefOr[js.Function1[/* error */ SKError, Unit]] = js.undefined
  
  /**
    * Tells the delegate that the request has completed.
    */
  var onRequestDidFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Sends the request to the Apple App Store.
    */
  def start(): Unit
}
object SKReceiptRefreshRequest {
  
  inline def apply(cancel: Callback, start: Callback): SKReceiptRefreshRequest = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[SKReceiptRefreshRequest]
  }
  
  extension [Self <: SKReceiptRefreshRequest](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setOnRequestDidFailWithError(value: /* error */ SKError => Callback): Self = StObject.set(x, "onRequestDidFailWithError", js.Any.fromFunction1((t0: /* error */ SKError) => value(t0).runNow()))
    
    inline def setOnRequestDidFailWithErrorUndefined: Self = StObject.set(x, "onRequestDidFailWithError", js.undefined)
    
    inline def setOnRequestDidFinish(value: Callback): Self = StObject.set(x, "onRequestDidFinish", value.toJsFn)
    
    inline def setOnRequestDidFinishUndefined: Self = StObject.set(x, "onRequestDidFinish", js.undefined)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
