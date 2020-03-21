package typingsJapgolly.astTypes

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
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsLeft extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: PatternKind | MemberExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
}

object AnonCommentsLeft {
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsLeft]
  }
}

