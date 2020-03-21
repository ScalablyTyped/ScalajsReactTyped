package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "FoldingRange")
@js.native
object FoldingRange extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: Double, endLine: Double): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}

