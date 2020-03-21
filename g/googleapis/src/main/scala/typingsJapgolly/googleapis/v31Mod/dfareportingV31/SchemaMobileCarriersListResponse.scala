package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile Carrier List Response
  */
@js.native
trait SchemaMobileCarriersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarriersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Mobile carrier collection.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.native
}

object SchemaMobileCarriersListResponse {
  @scala.inline
  def apply(kind: String = null, mobileCarriers: js.Array[SchemaMobileCarrier] = null): SchemaMobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileCarriersListResponse]
  }
}

