package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVer extends js.Object {
  var ID: Double
  var Version: Double
  def Clone(): IFileVer
  def CloneFrom(FileVer: IFileVer): Unit
}

object IFileVer {
  @scala.inline
  def apply(Clone: CallbackTo[IFileVer], CloneFrom: IFileVer => Callback, ID: Double, Version: Double): IFileVer = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IFileVer) => CloneFrom(t0).runNow()))
    __obj.asInstanceOf[IFileVer]
  }
}

