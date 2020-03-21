package typingsJapgolly.bootstrap3Dialog.BootstrapDialog

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: JQuery_[HTMLElement] = js.native
  @JSName("$modalBody")
  var $modalBody: JQuery_[HTMLElement] = js.native
  @JSName("$modalContent")
  var $modalContent: JQuery_[HTMLElement] = js.native
  @JSName("$modalDialog")
  var $modalDialog: JQuery_[HTMLElement] = js.native
  @JSName("$modalFooter")
  var $modalFooter: JQuery_[HTMLElement] = js.native
  @JSName("$modalHeader")
  var $modalHeader: JQuery_[HTMLElement] = js.native
  var opened: Boolean = js.native
  var options: DialogOptions = js.native
}

