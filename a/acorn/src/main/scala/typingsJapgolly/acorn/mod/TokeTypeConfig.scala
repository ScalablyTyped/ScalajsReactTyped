package typingsJapgolly.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokeTypeConfig extends js.Object {
  var beforeExpr: js.UndefOr[Boolean] = js.undefined
  var binop: js.UndefOr[Double] = js.undefined
  var isAssign: js.UndefOr[Boolean] = js.undefined
  var isLoop: js.UndefOr[Boolean] = js.undefined
  var keyword: String
  var postfix: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[Boolean] = js.undefined
  var startsExpr: js.UndefOr[Boolean] = js.undefined
}

object TokeTypeConfig {
  @scala.inline
  def apply(
    keyword: String,
    beforeExpr: js.UndefOr[Boolean] = js.undefined,
    binop: Int | Double = null,
    isAssign: js.UndefOr[Boolean] = js.undefined,
    isLoop: js.UndefOr[Boolean] = js.undefined,
    postfix: js.UndefOr[Boolean] = js.undefined,
    prefix: js.UndefOr[Boolean] = js.undefined,
    startsExpr: js.UndefOr[Boolean] = js.undefined
  ): TokeTypeConfig = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeExpr)) __obj.updateDynamic("beforeExpr")(beforeExpr.asInstanceOf[js.Any])
    if (binop != null) __obj.updateDynamic("binop")(binop.asInstanceOf[js.Any])
    if (!js.isUndefined(isAssign)) __obj.updateDynamic("isAssign")(isAssign.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoop)) __obj.updateDynamic("isLoop")(isLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(postfix)) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(startsExpr)) __obj.updateDynamic("startsExpr")(startsExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokeTypeConfig]
  }
}

