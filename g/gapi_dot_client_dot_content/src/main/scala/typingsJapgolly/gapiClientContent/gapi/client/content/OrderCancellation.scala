package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCancellation extends js.Object {
  /** The actor that created the cancellation. */
  var actor: js.UndefOr[String] = js.undefined
  /** Date on which the cancellation has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  /** The quantity that was canceled. */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * The reason for the cancellation. Orders that are cancelled with a noInventory reason will lead to the removal of the product from POG until you make an
    * update to that product. This will not affect your Shopping ads.
    */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrderCancellation {
  @scala.inline
  def apply(
    actor: String = null,
    creationDate: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrderCancellation = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCancellation]
  }
}

