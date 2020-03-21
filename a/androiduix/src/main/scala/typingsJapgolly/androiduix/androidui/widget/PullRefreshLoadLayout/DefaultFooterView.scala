package typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.widget.ProgressBar
import typingsJapgolly.androiduix.android.widget.TextView
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.DefaultFooterView")
@js.native
class DefaultFooterView protected () extends FooterView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var progressBar: ProgressBar = js.native
  var textView: TextView = js.native
}

