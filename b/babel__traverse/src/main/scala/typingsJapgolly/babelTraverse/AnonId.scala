package typingsJapgolly.babelTraverse

import typingsJapgolly.babelTraverse.babelTraverseStrings.`var`
import typingsJapgolly.babelTraverse.babelTraverseStrings.const
import typingsJapgolly.babelTraverse.babelTraverseStrings.let
import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: js.UndefOr[`var` | let | const] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(
    id: LVal,
    init: Expression = null,
    kind: `var` | let | const = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

