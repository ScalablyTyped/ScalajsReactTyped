package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindow extends js.Object {
  var automationHostProvider: js.Any
  var bounds: Rect
  var customProperties: IPropertySet
  var dispatcher: CoreDispatcher
  var flowDirection: CoreWindowFlowDirection
  var isInputEnabled: Boolean
  var onactivated: js.Any
  var onautomationproviderrequested: js.Any
  var oncharacterreceived: js.Any
  var onclosed: js.Any
  var oninputenabled: js.Any
  var onkeydown: js.Any
  var onkeyup: js.Any
  var onpointercapturelost: js.Any
  var onpointerentered: js.Any
  var onpointerexited: js.Any
  var onpointermoved: js.Any
  var onpointerpressed: js.Any
  var onpointerreleased: js.Any
  var onpointerwheelchanged: js.Any
  var onsizechanged: js.Any
  var ontouchhittesting: js.Any
  var onvisibilitychanged: js.Any
  var pointerCursor: CoreCursor
  var pointerPosition: Point
  var visible: Boolean
  def activate(): Unit
  def close(): Unit
  def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates
  def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates
  def releasePointerCapture(): Unit
  def setPointerCapture(): Unit
}

object ICoreWindow {
  @scala.inline
  def apply(
    activate: Callback,
    automationHostProvider: js.Any,
    bounds: Rect,
    close: Callback,
    customProperties: IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: VirtualKey => CallbackTo[CoreVirtualKeyStates],
    getKeyState: VirtualKey => CallbackTo[CoreVirtualKeyStates],
    isInputEnabled: Boolean,
    onactivated: js.Any,
    onautomationproviderrequested: js.Any,
    oncharacterreceived: js.Any,
    onclosed: js.Any,
    oninputenabled: js.Any,
    onkeydown: js.Any,
    onkeyup: js.Any,
    onpointercapturelost: js.Any,
    onpointerentered: js.Any,
    onpointerexited: js.Any,
    onpointermoved: js.Any,
    onpointerpressed: js.Any,
    onpointerreleased: js.Any,
    onpointerwheelchanged: js.Any,
    onsizechanged: js.Any,
    ontouchhittesting: js.Any,
    onvisibilitychanged: js.Any,
    pointerCursor: CoreCursor,
    pointerPosition: Point,
    releasePointerCapture: Callback,
    setPointerCapture: Callback,
    visible: Boolean
  ): ICoreWindow = {
    val __obj = js.Dynamic.literal(automationHostProvider = automationHostProvider.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], customProperties = customProperties.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], isInputEnabled = isInputEnabled.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], onautomationproviderrequested = onautomationproviderrequested.asInstanceOf[js.Any], oncharacterreceived = oncharacterreceived.asInstanceOf[js.Any], onclosed = onclosed.asInstanceOf[js.Any], oninputenabled = oninputenabled.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onpointercapturelost = onpointercapturelost.asInstanceOf[js.Any], onpointerentered = onpointerentered.asInstanceOf[js.Any], onpointerexited = onpointerexited.asInstanceOf[js.Any], onpointermoved = onpointermoved.asInstanceOf[js.Any], onpointerpressed = onpointerpressed.asInstanceOf[js.Any], onpointerreleased = onpointerreleased.asInstanceOf[js.Any], onpointerwheelchanged = onpointerwheelchanged.asInstanceOf[js.Any], onsizechanged = onsizechanged.asInstanceOf[js.Any], ontouchhittesting = ontouchhittesting.asInstanceOf[js.Any], onvisibilitychanged = onvisibilitychanged.asInstanceOf[js.Any], pointerCursor = pointerCursor.asInstanceOf[js.Any], pointerPosition = pointerPosition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("activate")(activate.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getAsyncKeyState")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.System.VirtualKey) => getAsyncKeyState(t0).runNow()))
    __obj.updateDynamic("getKeyState")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.System.VirtualKey) => getKeyState(t0).runNow()))
    __obj.updateDynamic("releasePointerCapture")(releasePointerCapture.toJsFn)
    __obj.updateDynamic("setPointerCapture")(setPointerCapture.toJsFn)
    __obj.asInstanceOf[ICoreWindow]
  }
}

