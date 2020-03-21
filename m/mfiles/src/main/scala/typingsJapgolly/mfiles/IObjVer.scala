package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVer extends js.Object {
  var ID: Double
  var ObjID: IObjID
  var Type: Double
  var Version: Double
  def Clone(): IObjVer
  def CloneFrom(ObjVer: IObjVer): Unit
  def Serialize(): js.Array[Double]
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit
  def ToJSON(): String
  def Unserialize(Bytes: js.Array[Double]): Unit
}

object IObjVer {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjVer],
    CloneFrom: IObjVer => Callback,
    ID: Double,
    ObjID: IObjID,
    Serialize: CallbackTo[js.Array[Double]],
    SetIDs: (Double, Double, Double) => Callback,
    SetObjIDAndVersion: (IObjID, Double) => Callback,
    ToJSON: CallbackTo[String],
    Type: Double,
    Unserialize: js.Array[Double] => Callback,
    Version: Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], ObjID = ObjID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("Serialize")(Serialize.toJsFn)
    __obj.updateDynamic("SetIDs")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => SetIDs(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetObjIDAndVersion")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjID, t1: scala.Double) => SetObjIDAndVersion(t0, t1).runNow()))
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.updateDynamic("Unserialize")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => Unserialize(t0).runNow()))
    __obj.asInstanceOf[IObjVer]
  }
}

