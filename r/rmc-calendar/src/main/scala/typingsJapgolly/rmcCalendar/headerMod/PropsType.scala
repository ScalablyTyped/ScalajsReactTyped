package typingsJapgolly.rmcCalendar.headerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clearIcon: js.UndefOr[Node] = js.undefined
  var closeIcon: js.UndefOr[Node] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var showClear: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    clearIcon: VdomNode = null,
    closeIcon: VdomNode = null,
    locale: Locale = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onClear: js.UndefOr[Callback] = js.undefined,
    showClear: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.rawNode.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

