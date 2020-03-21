package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVer extends js.Object {
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): IObjOrFileVer
  def IsFile(): Boolean
}

object IObjOrFileVer {
  @scala.inline
  def apply(Clone: CallbackTo[IObjOrFileVer], FileVer: IFileVer, IsFile: CallbackTo[Boolean], ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(FileVer = FileVer.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("IsFile")(IsFile.toJsFn)
    __obj.asInstanceOf[IObjOrFileVer]
  }
}

