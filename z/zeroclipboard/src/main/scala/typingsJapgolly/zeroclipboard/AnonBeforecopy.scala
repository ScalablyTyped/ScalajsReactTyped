package typingsJapgolly.zeroclipboard

import typingsJapgolly.zeroclipboard.ZC.EventListenerOrEventListenerObject
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardAfterCopyEvent
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardBeforeCopyEvent
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardCopyEvent
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardDestroyEvent
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardErrorEvent
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardReadyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeforecopy extends js.Object {
  var aftercopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]] = js.undefined
  var beforecopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]] = js.undefined
  var copy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]] = js.undefined
  var destroy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]] = js.undefined
  var error: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]] = js.undefined
  var ready: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]] = js.undefined
}

object AnonBeforecopy {
  @scala.inline
  def apply(
    aftercopy: js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = null,
    beforecopy: js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = null,
    copy: js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = null,
    destroy: js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = null,
    error: js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = null,
    ready: js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = null
  ): AnonBeforecopy = {
    val __obj = js.Dynamic.literal()
    if (aftercopy != null) __obj.updateDynamic("aftercopy")(aftercopy.asInstanceOf[js.Any])
    if (beforecopy != null) __obj.updateDynamic("beforecopy")(beforecopy.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeforecopy]
  }
}

