package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.orientjsStrings.Javascript
import typingsJapgolly.orientjs.orientjsStrings.SQL
import typingsJapgolly.orientjs.orientjsStrings.a
import typingsJapgolly.orientjs.orientjsStrings.l
import typingsJapgolly.orientjs.orientjsStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var fetchPlan: js.UndefOr[js.Any] = js.undefined
  var language: js.UndefOr[SQL | Javascript] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[s | a | l] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var token: js.UndefOr[js.Any] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    `class`: String = null,
    fetchPlan: js.Any = null,
    language: SQL | Javascript = null,
    limit: Int | Double = null,
    mode: s | a | l = null,
    params: js.Any = null,
    token: js.Any = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (fetchPlan != null) __obj.updateDynamic("fetchPlan")(fetchPlan.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

