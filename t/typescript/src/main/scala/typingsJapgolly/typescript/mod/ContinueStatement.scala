package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatement
  extends Statement
     with BreakOrContinueStatement {
  @JSName("kind")
  var kind_ContinueStatement: typingsJapgolly.typescript.mod.SyntaxKind.ContinueStatement = js.native
  var label: js.UndefOr[Identifier] = js.native
}

