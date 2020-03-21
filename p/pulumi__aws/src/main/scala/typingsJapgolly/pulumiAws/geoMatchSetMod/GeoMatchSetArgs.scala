package typingsJapgolly.pulumiAws.geoMatchSetMod

import typingsJapgolly.pulumiAws.inputMod.wafregional.GeoMatchSetGeoMatchConstraint
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetArgs extends js.Object {
  /**
    * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
    */
  val geoMatchConstraints: js.UndefOr[Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]]] = js.native
  /**
    * The name or description of the Geo Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object GeoMatchSetArgs {
  @scala.inline
  def apply(
    geoMatchConstraints: Input[js.Array[Input[GeoMatchSetGeoMatchConstraint]]] = null,
    name: Input[String] = null
  ): GeoMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (geoMatchConstraints != null) __obj.updateDynamic("geoMatchConstraints")(geoMatchConstraints.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetArgs]
  }
}

