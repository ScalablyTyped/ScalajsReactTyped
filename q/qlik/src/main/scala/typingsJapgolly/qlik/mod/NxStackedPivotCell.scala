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

trait NxStackedPivotCell extends js.Object {
  var qAttrDims: NxAttributeDimValues
  var qAttrExps: NxAttributeExpressionValues
  var qCanCollapse: Boolean
  var qCanExpand: Boolean
  var qDown: Double
  var qElemNo: Double
  var qMaxPos: Double
  var qMinNeg: Double
  var qRow: Double
  var qSubNodes: js.Array[NxStackedPivotCell]
  var qText: String
  var qType: V | E | N | T | P | R | U
  var qUp: Double
  var qValue: Double
}

object NxStackedPivotCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[NxStackedPivotCell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qMaxPos = qMaxPos.asInstanceOf[js.Any], qMinNeg = qMinNeg.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxStackedPivotCell]
  }
}

