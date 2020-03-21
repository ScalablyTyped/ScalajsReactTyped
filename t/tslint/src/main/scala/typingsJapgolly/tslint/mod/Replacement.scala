package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.Fix
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Replacement")
@js.native
class Replacement protected ()
  extends typingsJapgolly.tslint.ruleMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}

/* static members */
@JSImport("tslint", "Replacement")
@js.native
object Replacement extends js.Object {
  def appendText(start: Double, text: String): typingsJapgolly.tslint.ruleMod.Replacement = js.native
  def applyAll(content: String, replacements: js.Array[typingsJapgolly.tslint.ruleMod.Replacement]): String = js.native
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  def deleteFromTo(start: Double, end: Double): typingsJapgolly.tslint.ruleMod.Replacement = js.native
  def deleteText(start: Double, length: Double): typingsJapgolly.tslint.ruleMod.Replacement = js.native
  def replaceFromTo(start: Double, end: Double, text: String): typingsJapgolly.tslint.ruleMod.Replacement = js.native
  def replaceNode(node: Node, text: String): typingsJapgolly.tslint.ruleMod.Replacement = js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): typingsJapgolly.tslint.ruleMod.Replacement = js.native
}

