package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.SKError
import typingsJapgolly.atvlegacycontentkit.SKProductsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that can retrieve localized information from the App Store about a specified list of products.
  *
  * See https://developer.apple.com/documentation/storekit/skproductsrequest for more information.
  */
trait SKProductsRequest extends StObject {
  
  /**
    * Cancels a previously started request.
    */
  def cancel(): Unit
  
  /**
    * Accepts the App Store response that contains the app-requested product information.
    */
  var onProductsRequestDidReceiveResponse: js.UndefOr[js.Function1[/* response */ SKProductsResponse, Unit]] = js.undefined
  
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
object SKProductsRequest {
  
  inline def apply(cancel: Callback, start: Callback): SKProductsRequest = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[SKProductsRequest]
  }
  
  extension [Self <: SKProductsRequest](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setOnProductsRequestDidReceiveResponse(value: /* response */ SKProductsResponse => Callback): Self = StObject.set(x, "onProductsRequestDidReceiveResponse", js.Any.fromFunction1((t0: /* response */ SKProductsResponse) => value(t0).runNow()))
    
    inline def setOnProductsRequestDidReceiveResponseUndefined: Self = StObject.set(x, "onProductsRequestDidReceiveResponse", js.undefined)
    
    inline def setOnRequestDidFailWithError(value: /* error */ SKError => Callback): Self = StObject.set(x, "onRequestDidFailWithError", js.Any.fromFunction1((t0: /* error */ SKError) => value(t0).runNow()))
    
    inline def setOnRequestDidFailWithErrorUndefined: Self = StObject.set(x, "onRequestDidFailWithError", js.undefined)
    
    inline def setOnRequestDidFinish(value: Callback): Self = StObject.set(x, "onRequestDidFinish", value.toJsFn)
    
    inline def setOnRequestDidFinishUndefined: Self = StObject.set(x, "onRequestDidFinish", js.undefined)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
