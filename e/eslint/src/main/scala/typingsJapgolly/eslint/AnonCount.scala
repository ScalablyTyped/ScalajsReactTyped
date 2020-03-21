package typingsJapgolly.eslint

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.eslint.mod.AST.Token
import typingsJapgolly.eslint.mod.SourceCode.FilterPredicate
import typingsJapgolly.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    count: Int | Double = null,
    filter: /* tokenOrComment */ Token | Comment => CallbackTo[Boolean] = null,
    includeComments: js.UndefOr[Boolean] = js.undefined
  ): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* tokenOrComment */ typingsJapgolly.eslint.mod.AST.Token | typingsJapgolly.estree.mod.Comment) => filter(t0).runNow()))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

