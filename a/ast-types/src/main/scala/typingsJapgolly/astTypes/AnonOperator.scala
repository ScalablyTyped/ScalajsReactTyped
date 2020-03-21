package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.astTypesStrings.Exclamationmark
import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.Tilde
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.astTypesStrings.delete
import typingsJapgolly.astTypes.astTypesStrings.typeof
import typingsJapgolly.astTypes.astTypesStrings.void
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperator extends js.Object {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: js.UndefOr[Boolean] = js.undefined
}

object AnonOperator {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    prefix: js.UndefOr[Boolean] = js.undefined
  ): AnonOperator = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOperator]
  }
}

