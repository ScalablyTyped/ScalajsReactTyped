package typingsJapgolly.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "extensions")
@js.native
object extensions extends js.Object {
  val all: js.Array[Extension[js.Any]] = js.native
  val onDidChange: Event[Unit] = js.native
  def getExtension(extensionId: String): js.UndefOr[Extension[_]] = js.native
  @JSName("getExtension")
  def getExtension_T[T](extensionId: String): js.UndefOr[Extension[T]] = js.native
}

