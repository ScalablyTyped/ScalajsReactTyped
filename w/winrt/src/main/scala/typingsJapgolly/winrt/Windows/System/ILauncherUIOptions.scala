package typingsJapgolly.winrt.Windows.System

import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncherUIOptions extends js.Object {
  var invocationPoint: Point
  var preferredPlacement: Placement
  var selectionRect: Rect
}

object ILauncherUIOptions {
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILauncherUIOptions]
  }
}

