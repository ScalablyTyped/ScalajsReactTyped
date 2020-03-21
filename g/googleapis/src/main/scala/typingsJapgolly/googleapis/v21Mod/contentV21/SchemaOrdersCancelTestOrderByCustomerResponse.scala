package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCancelTestOrderByCustomerResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCancelTestOrderByCustomerResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrdersCancelTestOrderByCustomerResponse {
  @scala.inline
  def apply(kind: String = null): SchemaOrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerResponse]
  }
}

