package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProvider extends js.Object {
  val providerId: String
  def getNavigation(notebookUri: Uri): Thenable[NavigationResult]
}

object NavigationProvider {
  @scala.inline
  def apply(getNavigation: Uri => CallbackTo[Thenable[NavigationResult]], providerId: String): NavigationProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("getNavigation")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.Uri) => getNavigation(t0).runNow()))
    __obj.asInstanceOf[NavigationProvider]
  }
}

