package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DirectiveKind
import typingsJapgolly.astTypes.kindsMod.InterpreterDirectiveKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var interpreter: js.UndefOr[InterpreterDirectiveKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    comments: js.Array[CommentKind] = null,
    directives: js.Array[DirectiveKind] = null,
    interpreter: InterpreterDirectiveKind = null,
    loc: SourceLocationKind = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

