package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
class CrossSlidingEventArgs () extends ICrossSlidingEventArgs {
  /* CompleteClass */
  override var crossSlidingState: CrossSlidingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

