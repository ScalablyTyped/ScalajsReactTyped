package typingsJapgolly.reactNotifyToast.mod

import typingsJapgolly.reactNotifyToast.reactNotifyToastStrings.custom
import typingsJapgolly.reactNotifyToast.reactNotifyToastStrings.error
import typingsJapgolly.reactNotifyToast.reactNotifyToastStrings.success
import typingsJapgolly.reactNotifyToast.reactNotifyToastStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait reactNotifyToast extends js.Object {
  def createShowQueue(): reactNotifyToast = js.native
  def hide(): Unit = js.native
  def show(text: String): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom, timeout: Double): Unit = js.native
  @JSName("show")
  def show_custom(text: String, `type`: custom, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error, timeout: Double): Unit = js.native
  @JSName("show")
  def show_error(text: String, `type`: error, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success, timeout: Double): Unit = js.native
  @JSName("show")
  def show_success(text: String, `type`: success, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning, timeout: Double): Unit = js.native
  @JSName("show")
  def show_warning(text: String, `type`: warning, timeout: Double, color: reactNotifyToastColor): Unit = js.native
}

