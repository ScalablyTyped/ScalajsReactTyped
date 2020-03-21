package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDRange extends js.Object {
  var MaxID: Double
  var MaxID_32bit: String
  var MinID: Double
  var MinID_32bit: String
  def Clone(): IIDRange
  def SetIDs(MinID: Double, MaxID: Double): Unit
  def SetIDs_32bit(MinID: String, MaxID: String): Unit
}

object IIDRange {
  @scala.inline
  def apply(
    Clone: CallbackTo[IIDRange],
    MaxID: Double,
    MaxID_32bit: String,
    MinID: Double,
    MinID_32bit: String,
    SetIDs: (Double, Double) => Callback,
    SetIDs_32bit: (String, String) => Callback
  ): IIDRange = {
    val __obj = js.Dynamic.literal(MaxID = MaxID.asInstanceOf[js.Any], MaxID_32bit = MaxID_32bit.asInstanceOf[js.Any], MinID = MinID.asInstanceOf[js.Any], MinID_32bit = MinID_32bit.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetIDs")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => SetIDs(t0, t1).runNow()))
    __obj.updateDynamic("SetIDs_32bit")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => SetIDs_32bit(t0, t1).runNow()))
    __obj.asInstanceOf[IIDRange]
  }
}

