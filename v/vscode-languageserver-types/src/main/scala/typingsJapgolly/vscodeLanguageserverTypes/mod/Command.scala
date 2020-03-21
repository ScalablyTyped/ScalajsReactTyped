package typingsJapgolly.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * Arguments that the command handler should be
    * invoked with.
    */
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The identifier of the actual command handler.
    */
  var command: String
  /**
    * Title of the command, like `save`.
    */
  var title: String
}

@JSImport("vscode-languageserver-types", "Command")
@js.native
object Command extends js.Object {
  /**
    * Creates a new Command literal.
    */
  def create(title: String, command: String, args: js.Any*): Command = js.native
  /**
    * Checks whether the given literal conforms to the [Command](#Command) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Command */ Boolean = js.native
}

