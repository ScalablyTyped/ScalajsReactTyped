package typingsJapgolly.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends js.Object {
  /**
    * Default: false
    *
    * Will ony be deleted if the queue has no messages
    */
  var ifEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * Will only destroy the queue if it has no consumers
    */
  var ifUnused: js.UndefOr[Boolean] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(ifEmpty: js.UndefOr[Boolean] = js.undefined, ifUnused: js.UndefOr[Boolean] = js.undefined): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifEmpty)) __obj.updateDynamic("ifEmpty")(ifEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(ifUnused)) __obj.updateDynamic("ifUnused")(ifUnused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyOptions]
  }
}

