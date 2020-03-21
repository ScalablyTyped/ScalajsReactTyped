package typingsJapgolly.bootbox

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootboxStatic extends js.Object {
  def addLocale(name: String, values: BootboxLocaleValues): Unit = js.native
  def alert(message: String): JQuery_[HTMLElement] = js.native
  def alert(message: String, callback: js.Function0[Unit]): JQuery_[HTMLElement] = js.native
  def alert(options: BootboxAlertOptions): JQuery_[HTMLElement] = js.native
  def confirm(message: String, callback: js.Function1[/* result */ Boolean, Unit]): JQuery_[HTMLElement] = js.native
  def confirm(options: BootboxConfirmOptions): JQuery_[HTMLElement] = js.native
  def dialog(message: String): JQuery_[HTMLElement] = js.native
  def dialog(message: String, callback: js.Function1[/* result */ String, Unit]): JQuery_[HTMLElement] = js.native
  def dialog(options: BootboxDialogOptions[String]): JQuery_[HTMLElement] = js.native
  def hideAll(): Unit = js.native
  def prompt(message: String, callback: js.Function1[/* result */ String, Unit]): JQuery_[HTMLElement] = js.native
  def prompt(options: BootboxPromptOptions): JQuery_[HTMLElement] = js.native
  def removeLocale(name: String): Unit = js.native
  def setDefaults(options: BootboxDefaultOptions): Unit = js.native
  def setLocale(name: String): Unit = js.native
}

