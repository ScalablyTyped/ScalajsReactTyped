package typingsJapgolly.paypalPaypalJs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paypalPaypalJs.typesApisOrdersMod.OrderResponseBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorize extends StObject {
  
  /**
    * Authorizes payment for an order.
    * To successfully authorize payment for an order,
    * the buyer must first approve the order or a valid payment_source must be provided in the request
    */
  def authorize(): js.Promise[OrderResponseBody]
  
  /**
    * Captures payment for an order.
    * To successfully capture payment for an order,the buyer must first
    * approve the order or a valid `payment_source` must be provided in the request
    */
  def capture(): js.Promise[OrderResponseBody]
  
  /**
    * Shows details for an order, by ID
    */
  def get(): js.Promise[OrderResponseBody]
  
  /**
    * Updates an order with a `CREATED` or `APPROVED` status.
    * You cannot update an order with the `COMPLETED` status
    */
  def patch(): js.Promise[Unit]
}
object Authorize {
  
  inline def apply(
    authorize: CallbackTo[js.Promise[OrderResponseBody]],
    capture: CallbackTo[js.Promise[OrderResponseBody]],
    get: CallbackTo[js.Promise[OrderResponseBody]],
    patch: CallbackTo[js.Promise[Unit]]
  ): Authorize = {
    val __obj = js.Dynamic.literal(authorize = authorize.toJsFn, capture = capture.toJsFn, get = get.toJsFn, patch = patch.toJsFn)
    __obj.asInstanceOf[Authorize]
  }
  
  extension [Self <: Authorize](x: Self) {
    
    inline def setAuthorize(value: CallbackTo[js.Promise[OrderResponseBody]]): Self = StObject.set(x, "authorize", value.toJsFn)
    
    inline def setCapture(value: CallbackTo[js.Promise[OrderResponseBody]]): Self = StObject.set(x, "capture", value.toJsFn)
    
    inline def setGet(value: CallbackTo[js.Promise[OrderResponseBody]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setPatch(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "patch", value.toJsFn)
  }
}
