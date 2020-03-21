package typingsJapgolly.jquerySimplemodal

import typingsJapgolly.jquerySimplemodal.SimpleModal.SimpleModalOptions
import typingsJapgolly.jquerySimplemodal.SimpleModal.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("modal")
  var modal_Original: Static = js.native
  def modal(element: JQuery): JQuery = js.native
  def modal(element: JQuery, options: SimpleModalOptions): JQuery = js.native
  def modal(html: String): JQuery = js.native
  def modal(html: String, options: SimpleModalOptions): JQuery = js.native
}

