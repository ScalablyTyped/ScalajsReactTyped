package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.sidebarMod.SidebarWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var onAttach: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function0[_]] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var title: String
  var url: String
}

object AnonId {
  @scala.inline
  def apply(
    title: String,
    url: String,
    id: String = null,
    onAttach: /* worker */ SidebarWorker => CallbackTo[js.Any] = null,
    onDetach: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onHide: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onReady: /* worker */ SidebarWorker => CallbackTo[js.Any] = null,
    onShow: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): AnonId = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1((t0: /* worker */ typingsJapgolly.jpm.sidebarMod.SidebarWorker) => onAttach(t0).runNow()))
    onDetach.foreach(p => __obj.updateDynamic("onDetach")(p.toJsFn))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* worker */ typingsJapgolly.jpm.sidebarMod.SidebarWorker) => onReady(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    __obj.asInstanceOf[AnonId]
  }
}

