package typingsJapgolly.ono.stackMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ono.onoBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Property Descriptor of a lazily-computed `stack` property.
  */
trait LazyStack extends js.Object {
  var configurable: `true`
  /**
    * Lazily computes the error's stack trace.
    */
  def get(): js.UndefOr[String]
}

object LazyStack {
  @scala.inline
  def apply(configurable: `true`, get: CallbackTo[js.UndefOr[String]]): LazyStack = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[LazyStack]
  }
}

