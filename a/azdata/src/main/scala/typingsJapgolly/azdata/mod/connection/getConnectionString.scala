package typingsJapgolly.azdata.mod.connection

import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getConnectionString")
@js.native
object getConnectionString extends js.Object {
  def apply(connectionId: String, includePassword: Boolean): Thenable[String] = js.native
}

