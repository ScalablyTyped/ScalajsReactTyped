package typingsJapgolly.onsenui.onsenuiMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onsenui", "createPopover")
@js.native
object createPopover extends js.Object {
  /**
    * @description Create a popover instance from a template.
    * @return Promise object that resolves to the popover component object.
    */
  def apply(page: String): js.Promise[HTMLElement] = js.native
  def apply(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
}

