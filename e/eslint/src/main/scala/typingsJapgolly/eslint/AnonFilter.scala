package typingsJapgolly.eslint

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.eslint.mod.AST.Token
import typingsJapgolly.eslint.mod.SourceCode.FilterPredicate
import typingsJapgolly.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(
    filter: /* tokenOrComment */ Token | Comment => CallbackTo[Boolean] = null,
    includeComments: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null
  ): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* tokenOrComment */ typingsJapgolly.eslint.mod.AST.Token | typingsJapgolly.estree.mod.Comment) => filter(t0).runNow()))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

