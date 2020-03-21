package typingsJapgolly.documentdbServer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContext extends js.Object {
  /** Gets the collection object. */
  def getCollection(): ICollection
  /** Gets the request object. */
  def getRequest(): IRequest
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse
}

object IContext {
  @scala.inline
  def apply(
    getCollection: CallbackTo[ICollection],
    getRequest: CallbackTo[IRequest],
    getResponse: CallbackTo[IResponse]
  ): IContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCollection")(getCollection.toJsFn)
    __obj.updateDynamic("getRequest")(getRequest.toJsFn)
    __obj.updateDynamic("getResponse")(getResponse.toJsFn)
    __obj.asInstanceOf[IContext]
  }
}

