package typingsJapgolly.androiduix.android.app.AlertController

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.widget.ListView
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController.RecycleListView")
@js.native
class RecycleListView protected () extends ListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mRecycleOnMeasure: Boolean = js.native
}

