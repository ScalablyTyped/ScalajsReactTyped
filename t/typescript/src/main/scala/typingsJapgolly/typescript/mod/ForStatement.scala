package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatement
  extends IterationStatement
     with HasInitializer {
  var condition: js.UndefOr[Expression] = js.native
  var incrementor: js.UndefOr[Expression] = js.native
  var initializer: js.UndefOr[ForInitializer] = js.native
  @JSName("kind")
  var kind_ForStatement: typingsJapgolly.typescript.mod.SyntaxKind.ForStatement = js.native
}

