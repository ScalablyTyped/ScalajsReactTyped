package typingsJapgolly.azdata.mod.queryeditor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azdata.mod.connection.ConnectionProfile
import typingsJapgolly.azdata.mod.window.DialogTab
import typingsJapgolly.std.Map
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDocument extends js.Object {
  var providerId: String
  var uri: String
  // connect the query document using the given connection profile
  def connect(connectionProfile: ConnectionProfile): Thenable[Unit]
  // tab content is build using the modelview UI builder APIs
  // probably should rename DialogTab class since it is useful outside dialogs
  def createQueryTab(tab: DialogTab): Unit
  // set the document's execution options
  def setExecutionOptions(options: Map[String, _]): Thenable[Unit]
}

object QueryDocument {
  @scala.inline
  def apply(
    connect: ConnectionProfile => CallbackTo[Thenable[Unit]],
    createQueryTab: DialogTab => Callback,
    providerId: String,
    setExecutionOptions: Map[String, js.Any] => CallbackTo[Thenable[Unit]],
    uri: String
  ): QueryDocument = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.connection.ConnectionProfile) => connect(t0).runNow()))
    __obj.updateDynamic("createQueryTab")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.window.DialogTab) => createQueryTab(t0).runNow()))
    __obj.updateDynamic("setExecutionOptions")(js.Any.fromFunction1((t0: typingsJapgolly.std.Map[java.lang.String, js.Any]) => setExecutionOptions(t0).runNow()))
    __obj.asInstanceOf[QueryDocument]
  }
}

