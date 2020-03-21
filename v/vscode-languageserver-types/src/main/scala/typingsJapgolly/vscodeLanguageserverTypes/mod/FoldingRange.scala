package typingsJapgolly.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRange extends js.Object {
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: Double
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: Double
}

@JSImport("vscode-languageserver-types", "FoldingRange")
@js.native
object FoldingRange extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: Double, endLine: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}

