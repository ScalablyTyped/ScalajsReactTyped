package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.astTypesStrings.AmpersandAmpersand
import typingsJapgolly.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.astTypes.astTypesStrings.VerticallineVerticalline
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait LogicalExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.LogicalExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.LogicalExpression")
@js.native
object LogicalExpression extends TopLevel[Type[LogicalExpression]]

