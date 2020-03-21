package typingsJapgolly.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus

import typingsJapgolly.phosphorCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the EditorSyntax status item.
  */
trait IOptions extends js.Object {
  /**
    * The application command registry.
    */
  var commands: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

