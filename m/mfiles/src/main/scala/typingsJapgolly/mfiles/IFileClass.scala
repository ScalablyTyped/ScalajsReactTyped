package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClass extends js.Object {
  var DisplayName: String
  val DotAndExtension: String
  val Extension: String
  val FileClass: String
  def Clone(): IFileClass
  def LoadByExtension(Extension: String): Unit
  def LoadByFileClass(Extension: String, FileClass: String): Unit
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit
}

object IFileClass {
  @scala.inline
  def apply(
    Clone: CallbackTo[IFileClass],
    DisplayName: String,
    DotAndExtension: String,
    Extension: String,
    FileClass: String,
    LoadByExtension: String => Callback,
    LoadByFileClass: (String, String) => Callback,
    SetFileClassInfo: (String, String, String) => Callback
  ): IFileClass = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], DotAndExtension = DotAndExtension.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileClass = FileClass.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("LoadByExtension")(js.Any.fromFunction1((t0: java.lang.String) => LoadByExtension(t0).runNow()))
    __obj.updateDynamic("LoadByFileClass")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => LoadByFileClass(t0, t1).runNow()))
    __obj.updateDynamic("SetFileClassInfo")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => SetFileClassInfo(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IFileClass]
  }
}

