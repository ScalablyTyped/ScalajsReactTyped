package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.googleapis.AnonArtUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOffers extends js.Object {
  /**
    * A list of offers.
    */
  var items: js.UndefOr[js.Array[AnonArtUrl]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOffers {
  @scala.inline
  def apply(items: js.Array[AnonArtUrl] = null, kind: String = null): SchemaOffers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOffers]
  }
}

