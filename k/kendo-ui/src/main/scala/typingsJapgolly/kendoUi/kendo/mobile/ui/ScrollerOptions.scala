package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerOptions extends js.Object {
  var elastic: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[ScrollerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.undefined
  var pullOffset: js.UndefOr[Double] = js.undefined
  var pullToRefresh: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, Unit]] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
  var visibleScrollHints: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
}

object ScrollerOptions {
  @scala.inline
  def apply(
    elastic: js.UndefOr[Boolean] = js.undefined,
    messages: ScrollerMessages = null,
    name: String = null,
    pull: /* e */ ScrollerEvent => Callback = null,
    pullOffset: Int | Double = null,
    pullToRefresh: js.UndefOr[Boolean] = js.undefined,
    resize: /* e */ ScrollerEvent => Callback = null,
    scroll: /* e */ ScrollerScrollEvent => Callback = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    visibleScrollHints: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Boolean] = js.undefined
  ): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elastic)) __obj.updateDynamic("elastic")(elastic.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollerEvent) => pull(t0).runNow()))
    if (pullOffset != null) __obj.updateDynamic("pullOffset")(pullOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(pullToRefresh)) __obj.updateDynamic("pullToRefresh")(pullToRefresh.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollerEvent) => resize(t0).runNow()))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollerScrollEvent) => scroll(t0).runNow()))
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleScrollHints)) __obj.updateDynamic("visibleScrollHints")(visibleScrollHints.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerOptions]
  }
}

