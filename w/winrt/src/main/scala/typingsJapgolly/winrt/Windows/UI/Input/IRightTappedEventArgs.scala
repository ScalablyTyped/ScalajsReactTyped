package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRightTappedEventArgs extends js.Object {
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object IRightTappedEventArgs {
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point): IRightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRightTappedEventArgs]
  }
}

