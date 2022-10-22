package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindow
  extends StObject
     with ICoreWindow
object CoreWindow {
  
  inline def apply(
    activate: Callback,
    automationHostProvider: Any,
    bounds: Rect,
    close: Callback,
    customProperties: IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: VirtualKey => CoreVirtualKeyStates,
    getKeyState: VirtualKey => CoreVirtualKeyStates,
    isInputEnabled: Boolean,
    onactivated: Any,
    onautomationproviderrequested: Any,
    oncharacterreceived: Any,
    onclosed: Any,
    oninputenabled: Any,
    onkeydown: Any,
    onkeyup: Any,
    onpointercapturelost: Any,
    onpointerentered: Any,
    onpointerexited: Any,
    onpointermoved: Any,
    onpointerpressed: Any,
    onpointerreleased: Any,
    onpointerwheelchanged: Any,
    onsizechanged: Any,
    ontouchhittesting: Any,
    onvisibilitychanged: Any,
    pointerCursor: CoreCursor,
    pointerPosition: Point,
    releasePointerCapture: Callback,
    setPointerCapture: Callback,
    visible: Boolean
  ): CoreWindow = {
    val __obj = js.Dynamic.literal(activate = activate.toJsFn, automationHostProvider = automationHostProvider.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], close = close.toJsFn, customProperties = customProperties.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], getAsyncKeyState = js.Any.fromFunction1(getAsyncKeyState), getKeyState = js.Any.fromFunction1(getKeyState), isInputEnabled = isInputEnabled.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], onautomationproviderrequested = onautomationproviderrequested.asInstanceOf[js.Any], oncharacterreceived = oncharacterreceived.asInstanceOf[js.Any], onclosed = onclosed.asInstanceOf[js.Any], oninputenabled = oninputenabled.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onpointercapturelost = onpointercapturelost.asInstanceOf[js.Any], onpointerentered = onpointerentered.asInstanceOf[js.Any], onpointerexited = onpointerexited.asInstanceOf[js.Any], onpointermoved = onpointermoved.asInstanceOf[js.Any], onpointerpressed = onpointerpressed.asInstanceOf[js.Any], onpointerreleased = onpointerreleased.asInstanceOf[js.Any], onpointerwheelchanged = onpointerwheelchanged.asInstanceOf[js.Any], onsizechanged = onsizechanged.asInstanceOf[js.Any], ontouchhittesting = ontouchhittesting.asInstanceOf[js.Any], onvisibilitychanged = onvisibilitychanged.asInstanceOf[js.Any], pointerCursor = pointerCursor.asInstanceOf[js.Any], pointerPosition = pointerPosition.asInstanceOf[js.Any], releasePointerCapture = releasePointerCapture.toJsFn, setPointerCapture = setPointerCapture.toJsFn, visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreWindow]
  }
}
