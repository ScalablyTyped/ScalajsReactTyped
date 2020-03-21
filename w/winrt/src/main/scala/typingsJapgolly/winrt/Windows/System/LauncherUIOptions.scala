package typingsJapgolly.winrt.Windows.System

import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.LauncherUIOptions")
@js.native
class LauncherUIOptions () extends ILauncherUIOptions {
  /* CompleteClass */
  override var invocationPoint: Point = js.native
  /* CompleteClass */
  override var preferredPlacement: Placement = js.native
  /* CompleteClass */
  override var selectionRect: Rect = js.native
}

