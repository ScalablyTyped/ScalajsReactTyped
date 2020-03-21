package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.FrameEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var onAttach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ FrameEvent, _]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var url: String
}

object AnonName {
  @scala.inline
  def apply(
    url: String,
    name: String = null,
    onAttach: /* event */ FrameEvent => CallbackTo[js.Any] = null,
    onDetach: /* event */ FrameEvent => CallbackTo[js.Any] = null,
    onLoad: /* event */ FrameEvent => CallbackTo[js.Any] = null,
    onMessage: /* message */ FrameEvent => CallbackTo[js.Any] = null,
    onReady: /* event */ FrameEvent => CallbackTo[js.Any] = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.jpm.FFAddonSDK.FrameEvent) => onAttach(t0).runNow()))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.jpm.FFAddonSDK.FrameEvent) => onDetach(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.jpm.FFAddonSDK.FrameEvent) => onLoad(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.jpm.FFAddonSDK.FrameEvent) => onMessage(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.jpm.FFAddonSDK.FrameEvent) => onReady(t0).runNow()))
    __obj.asInstanceOf[AnonName]
  }
}

