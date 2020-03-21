package typingsJapgolly.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a metric.
  */
@js.native
trait SchemaMetric extends js.Object {
  /**
    * The kind of resource this is, in this case dfareporting#metric.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The metric name, e.g. dfa:impressions
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaMetric {
  @scala.inline
  def apply(kind: String = null, name: String = null): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetric]
  }
}

