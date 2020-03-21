package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.astTypesStrings.AmpersandEqualssign
import typingsJapgolly.astTypes.astTypesStrings.AsteriskEqualssign
import typingsJapgolly.astTypes.astTypesStrings.Equalssign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.PercentsignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.PlussignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.SlashEqualssign
import typingsJapgolly.astTypes.astTypesStrings.VerticallineEqualssign
import typingsJapgolly.astTypes.astTypesStrings.`-Equalssign`
import typingsJapgolly.astTypes.astTypesStrings.`^Equalssign`
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.MemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait AssignmentExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: PatternKind | MemberExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.AssignmentExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
@js.native
object AssignmentExpression extends TopLevel[Type[AssignmentExpression]]

