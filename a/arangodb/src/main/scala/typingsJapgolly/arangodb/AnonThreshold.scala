package typingsJapgolly.arangodb

import typingsJapgolly.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThreshold extends js.Object {
  var segmentThreshold: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[ArangoSearchViewConsolidationType] = js.undefined
}

object AnonThreshold {
  @scala.inline
  def apply(
    segmentThreshold: Int | Double = null,
    threshold: Int | Double = null,
    `type`: ArangoSearchViewConsolidationType = null
  ): AnonThreshold = {
    val __obj = js.Dynamic.literal()
    if (segmentThreshold != null) __obj.updateDynamic("segmentThreshold")(segmentThreshold.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThreshold]
  }
}

