package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShippingsettingsGetSupportedCarriersResponse extends js.Object {
  /**
    * A list of supported carriers. May be empty.
    */
  var carriers: js.UndefOr[js.Array[SchemaCarriersCarrier]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedCarriersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(carriers: js.Array[SchemaCarriersCarrier] = null, kind: String = null): SchemaShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    if (carriers != null) __obj.updateDynamic("carriers")(carriers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedCarriersResponse]
  }
}

