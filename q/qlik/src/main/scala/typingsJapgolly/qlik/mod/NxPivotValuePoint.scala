package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.E
import typingsJapgolly.qlik.qlikStrings.N
import typingsJapgolly.qlik.qlikStrings.P
import typingsJapgolly.qlik.qlikStrings.R
import typingsJapgolly.qlik.qlikStrings.T
import typingsJapgolly.qlik.qlikStrings.U
import typingsJapgolly.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotValuePoint extends js.Object {
  var qAttrExps: NxAttributeExpressionValues
  var qLabel: js.UndefOr[String] = js.undefined
  var qNum: Double
  var qText: String
  var qType: V | E | N | T | P | R | U
}

object NxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: Double,
    qText: String,
    qType: V | E | N | T | P | R | U,
    qLabel: String = null
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotValuePoint]
  }
}

