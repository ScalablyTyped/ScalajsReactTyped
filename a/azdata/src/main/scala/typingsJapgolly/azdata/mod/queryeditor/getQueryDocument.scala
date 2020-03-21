package typingsJapgolly.azdata.mod.queryeditor

import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "queryeditor.getQueryDocument")
@js.native
object getQueryDocument extends js.Object {
  def apply(fileUri: String): Thenable[QueryDocument] = js.native
}

