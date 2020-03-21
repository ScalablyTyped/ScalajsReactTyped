package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyOrder extends js.Object {
  /** The direction to order by. Defaults to `ASCENDING`. */
  var direction: js.UndefOr[String] = js.undefined
  /** The property to order by. */
  var property: js.UndefOr[PropertyReference] = js.undefined
}

object PropertyOrder {
  @scala.inline
  def apply(direction: String = null, property: PropertyReference = null): PropertyOrder = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyOrder]
  }
}

