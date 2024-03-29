package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CodeLens")
@js.native
open class CodeLens protected () extends StObject {
  /**
    * Creates a new code lens object.
    *
    * @param range The range to which this code lens applies.
    * @param command The command associated to this code lens.
    */
  def this(range: Range) = this()
  def this(range: Range, command: Command) = this()
  
  /**
    * The command this code lens represents.
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * `true` when there is a command associated.
    */
  val isResolved: Boolean = js.native
  
  /**
    * The range in which this code lens is valid. Should only span a single line.
    */
  var range: Range = js.native
}
