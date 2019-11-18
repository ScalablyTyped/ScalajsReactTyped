package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitLexicalEnvironment")
@js.native
object visitLexicalEnvironment extends js.Object {
  /**
    * Starts a new lexical environment and visits a statement list, ending the lexical environment
    * and merging hoisted declarations upon completion.
    */
  def apply(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext): NodeArray[Statement] = js.native
  def apply(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext, start: Double): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: Double,
    ensureUseStrict: Boolean
  ): NodeArray[Statement] = js.native
}

