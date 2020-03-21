package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLeft
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
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.MemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def from(params: AnonCommentsLeft): AssignmentExpression = js.native
}

