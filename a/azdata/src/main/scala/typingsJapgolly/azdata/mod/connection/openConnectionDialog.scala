package typingsJapgolly.azdata.mod.connection

import typingsJapgolly.azdata.mod.IConnectionCompletionOptions
import typingsJapgolly.azdata.mod.IConnectionProfile
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.openConnectionDialog")
@js.native
object openConnectionDialog extends js.Object {
  def apply(): Thenable[Connection] = js.native
  def apply(providers: js.Array[String]): Thenable[Connection] = js.native
  def apply(providers: js.Array[String], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = js.native
  def apply(
    providers: js.Array[String],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
}

