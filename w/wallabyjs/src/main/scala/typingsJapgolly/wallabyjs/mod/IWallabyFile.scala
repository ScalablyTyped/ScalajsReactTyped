package typingsJapgolly.wallabyjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyFile extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  def changeExt(newExt: String): Unit
  def rename(newPath: String): Unit
}

object IWallabyFile {
  @scala.inline
  def apply(
    changeExt: String => Callback,
    rename: String => Callback,
    content: String = null,
    path: String = null
  ): IWallabyFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeExt")(js.Any.fromFunction1((t0: java.lang.String) => changeExt(t0).runNow()))
    __obj.updateDynamic("rename")(js.Any.fromFunction1((t0: java.lang.String) => rename(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyFile]
  }
}

