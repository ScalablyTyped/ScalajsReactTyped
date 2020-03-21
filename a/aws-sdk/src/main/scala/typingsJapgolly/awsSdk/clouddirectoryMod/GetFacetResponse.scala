package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFacetResponse extends js.Object {
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.Facet] = js.native
}

object GetFacetResponse {
  @scala.inline
  def apply(Facet: Facet = null): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    if (Facet != null) __obj.updateDynamic("Facet")(Facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFacetResponse]
  }
}

