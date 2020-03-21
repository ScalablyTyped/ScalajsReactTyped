package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsequent extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var consequent: js.Array[StatementKind]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind | Null
}

object AnonConsequent {
  @scala.inline
  def apply(
    consequent: js.Array[StatementKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null
  ): AnonConsequent = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsequent]
  }
}

