package typingsJapgolly.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Value of the dimension.
  */
@js.native
trait SchemaDimensionDimensionValue extends js.Object {
  /**
    * Id of the dimension.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Name of the dimension mainly for debugging purposes, except for the case
    * of CREATIVE_SIZE. For CREATIVE_SIZE, strings are used instead of ids.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Percent of total impressions for a dimension type. e.g. {dimension_type:
    * &#39;GENDER&#39;, [{dimension_value: {id: 1, name: &#39;MALE&#39;,
    * percentage: 60}}]} Gender MALE is 60% of all impressions which have
    * gender.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object SchemaDimensionDimensionValue {
  @scala.inline
  def apply(id: Int | Double = null, name: String = null, percentage: Int | Double = null): SchemaDimensionDimensionValue = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionDimensionValue]
  }
}

