package typingsJapgolly.electronUtil.mod

import typingsJapgolly.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "runJS")
@js.native
object runJS extends js.Object {
  def apply(code: String): js.Promise[_] = js.native
  def apply(code: String, window: BrowserWindow): js.Promise[_] = js.native
}

