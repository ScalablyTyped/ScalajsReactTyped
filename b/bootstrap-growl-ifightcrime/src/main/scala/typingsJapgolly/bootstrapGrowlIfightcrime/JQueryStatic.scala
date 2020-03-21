package typingsJapgolly.bootstrapGrowlIfightcrime

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime.Options
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * Show standard Bootstrap alerts into hovering "Growl-like" notifications
    * @param message to show.
    * @param options should be an options object.
    * @returns The element.
    */
  def bootstrapGrowl(message: String): JQuery_[HTMLElement] = js.native
  def bootstrapGrowl(message: String, options: Options): JQuery_[HTMLElement] = js.native
}

