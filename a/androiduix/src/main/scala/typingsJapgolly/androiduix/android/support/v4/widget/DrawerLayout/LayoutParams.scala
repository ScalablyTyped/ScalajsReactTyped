package typingsJapgolly.androiduix.android.support.v4.widget.DrawerLayout

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.view.ViewGroup.MarginLayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.DrawerLayout.LayoutParams")
@js.native
class LayoutParams protected () extends MarginLayoutParams {
  def this(source: LayoutParams) = this()
  def this(source: typingsJapgolly.androiduix.android.view.ViewGroup.LayoutParams) = this()
  def this(source: MarginLayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, gravity: Double) = this()
  var gravity: Double = js.native
  var isPeeking: Boolean = js.native
  var knownOpen: Boolean = js.native
  var onScreen: Double = js.native
}

