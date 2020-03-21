package typingsJapgolly.androiduix.androidui.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlDataAdapter extends js.Object {
  def onInflateAdapter(bindElement: HTMLElement): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context, parent: ViewGroup): Unit = js.native
}

