package typingsJapgolly.ckeditorCkeditor5Utils.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "FocusTracker")
@js.native
class FocusTracker () extends Observable {
  val focusedElement: HTMLElement = js.native
  val isFocused: Boolean = js.native
  def add(element: HTMLElement): Unit = js.native
  def remove(element: HTMLElement): Unit = js.native
}

