package typingsJapgolly.electronWinstaller

import typingsJapgolly.electronWinstaller.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-winstaller", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def convertVersion(version: String): String = js.native
  def createWindowsInstaller(options: Options): js.Promise[Unit] = js.native
}

