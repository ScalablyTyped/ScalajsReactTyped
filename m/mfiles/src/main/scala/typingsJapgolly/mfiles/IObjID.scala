package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjID extends js.Object {
  var ID: Double
  var Type: Double
  def Clone(): IObjID
  def CloneFrom(ObjID: IObjID): Unit
  def Serialize(): js.Array[Double]
  def SetIDs(ObjType: Double, ID: Double): Unit
  def ToJSON(): String
  def Unserialize(Bytes: js.Array[Double]): Unit
}

object IObjID {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjID],
    CloneFrom: IObjID => Callback,
    ID: Double,
    Serialize: CallbackTo[js.Array[Double]],
    SetIDs: (Double, Double) => Callback,
    ToJSON: CallbackTo[String],
    Type: Double,
    Unserialize: js.Array[Double] => Callback
  ): IObjID = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjID) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("Serialize")(Serialize.toJsFn)
    __obj.updateDynamic("SetIDs")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => SetIDs(t0, t1).runNow()))
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.updateDynamic("Unserialize")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => Unserialize(t0).runNow()))
    __obj.asInstanceOf[IObjID]
  }
}

