package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
class CoreWindow () extends ICoreWindow {
  /* CompleteClass */
  override var automationHostProvider: js.Any = js.native
  /* CompleteClass */
  override var bounds: Rect = js.native
  /* CompleteClass */
  override var customProperties: IPropertySet = js.native
  /* CompleteClass */
  override var dispatcher: CoreDispatcher = js.native
  /* CompleteClass */
  override var flowDirection: CoreWindowFlowDirection = js.native
  /* CompleteClass */
  override var isInputEnabled: Boolean = js.native
  /* CompleteClass */
  override var onactivated: js.Any = js.native
  /* CompleteClass */
  override var onautomationproviderrequested: js.Any = js.native
  /* CompleteClass */
  override var oncharacterreceived: js.Any = js.native
  /* CompleteClass */
  override var onclosed: js.Any = js.native
  /* CompleteClass */
  override var oninputenabled: js.Any = js.native
  /* CompleteClass */
  override var onkeydown: js.Any = js.native
  /* CompleteClass */
  override var onkeyup: js.Any = js.native
  /* CompleteClass */
  override var onpointercapturelost: js.Any = js.native
  /* CompleteClass */
  override var onpointerentered: js.Any = js.native
  /* CompleteClass */
  override var onpointerexited: js.Any = js.native
  /* CompleteClass */
  override var onpointermoved: js.Any = js.native
  /* CompleteClass */
  override var onpointerpressed: js.Any = js.native
  /* CompleteClass */
  override var onpointerreleased: js.Any = js.native
  /* CompleteClass */
  override var onpointerwheelchanged: js.Any = js.native
  /* CompleteClass */
  override var onsizechanged: js.Any = js.native
  /* CompleteClass */
  override var ontouchhittesting: js.Any = js.native
  /* CompleteClass */
  override var onvisibilitychanged: js.Any = js.native
  /* CompleteClass */
  override var pointerCursor: CoreCursor = js.native
  /* CompleteClass */
  override var pointerPosition: Point = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
  /* CompleteClass */
  override def activate(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def releasePointerCapture(): Unit = js.native
  /* CompleteClass */
  override def setPointerCapture(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
object CoreWindow extends js.Object {
  def getForCurrentThread(): CoreWindow = js.native
}

