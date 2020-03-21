package typingsJapgolly.rrc.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenActiveOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var isActive: js.UndefOr[IsActiveCallback] = js.undefined
  var pathProp: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WhenActiveOptions {
  @scala.inline
  def apply(
    className: String = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    isActive: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    pathProp: String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): WhenActiveOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    isActive.foreach(p => __obj.updateDynamic("isActive")(p.toJsFn))
    if (pathProp != null) __obj.updateDynamic("pathProp")(pathProp.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhenActiveOptions]
  }
}

