package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.CodeLens")
@js.native
open class CodeLens protected ()
  extends typingsJapgolly.vscode.mod.CodeLens {
  /**
    * Creates a new code lens object.
    *
    * @param range The range to which this code lens applies.
    * @param command The command associated to this code lens.
    */
  def this(range: typingsJapgolly.vscode.mod.Range) = this()
  def this(range: typingsJapgolly.vscode.mod.Range, command: Command) = this()
}
