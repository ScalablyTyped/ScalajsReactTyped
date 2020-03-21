package typingsJapgolly.nodeSnap7.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarWrite extends js.Object {
  var Amount: Double
  var Area: typingsJapgolly.nodeSnap7.mod.Area
  var DBNumber: js.UndefOr[Double] = js.undefined
  var Data: Buffer
  var Start: Double
  var WordLen: typingsJapgolly.nodeSnap7.mod.WordLen
}

object MultiVarWrite {
  @scala.inline
  def apply(
    Amount: Double,
    Area: Area,
    Data: Buffer,
    Start: Double,
    WordLen: WordLen,
    DBNumber: Int | Double = null
  ): MultiVarWrite = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    if (DBNumber != null) __obj.updateDynamic("DBNumber")(DBNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarWrite]
  }
}

