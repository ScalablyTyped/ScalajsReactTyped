package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreaker extends js.Object {
  def allowRequest(): Boolean
  def allowSingleTest(): Boolean
  def isOpen(): Boolean
  def markSuccess(): Unit
}

object CircuitBreaker {
  @scala.inline
  def apply(
    allowRequest: CallbackTo[Boolean],
    allowSingleTest: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    markSuccess: Callback
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowRequest")(allowRequest.toJsFn)
    __obj.updateDynamic("allowSingleTest")(allowSingleTest.toJsFn)
    __obj.updateDynamic("isOpen")(isOpen.toJsFn)
    __obj.updateDynamic("markSuccess")(markSuccess.toJsFn)
    __obj.asInstanceOf[CircuitBreaker]
  }
}

