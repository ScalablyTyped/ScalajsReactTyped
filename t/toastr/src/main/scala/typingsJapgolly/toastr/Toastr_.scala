package typingsJapgolly.toastr

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toastr_ extends js.Object {
  /**
  	 * Create an error toast
  	 */
  @JSName("error")
  var error_Original: ToastrDisplayMethod = js.native
  /**
  	 * Create an info toast
  	 */
  @JSName("info")
  var info_Original: ToastrDisplayMethod = js.native
  /**
  	 * The toatsr options object
  	 */
  var options: ToastrOptions = js.native
  /**
  	 * Create a success toast
  	 */
  @JSName("success")
  var success_Original: ToastrDisplayMethod = js.native
  /**
  	 * Get toastr version
  	 */
  var version: String = js.native
  /**
  	 * Create a warning toast
  	 */
  @JSName("warning")
  var warning_Original: ToastrDisplayMethod = js.native
  /**
  	 * Clear toasts
  	 */
  def clear(): Unit = js.native
  def clear(toast: JQuery_[HTMLElement]): Unit = js.native
  def clear(toast: JQuery_[HTMLElement], clearOptions: AnonForce): Unit = js.native
  /**
  	 * Create an error toast
  	 */
  def error(message: String): JQuery_[HTMLElement] = js.native
  def error(message: String, title: String): JQuery_[HTMLElement] = js.native
  def error(message: String, title: String, overrides: ToastrOptions): JQuery_[HTMLElement] = js.native
  /**
  	 * Get or create a container.
  	 */
  def getContainer(): JQuery_[HTMLElement] = js.native
  def getContainer(options: ToastrOptions): JQuery_[HTMLElement] = js.native
  /**
  	 * Get or create a container.
  	 */
  def getContainer(options: ToastrOptions, create: Boolean): JQuery_[HTMLElement] = js.native
  /**
  	 * Create an info toast
  	 */
  def info(message: String): JQuery_[HTMLElement] = js.native
  def info(message: String, title: String): JQuery_[HTMLElement] = js.native
  def info(message: String, title: String, overrides: ToastrOptions): JQuery_[HTMLElement] = js.native
  /**
  	 * Removes toasts (without animation)
  	 */
  def remove(): Unit = js.native
  /**
  	 * Removes toasts (without animation)
  	 */
  def remove(toast: JQuery_[HTMLElement]): Unit = js.native
  /**
  	 * Register a callback to be called when a toast gets created or hidden.
  	 *
  	 * @param callback The function which will be passed the event details.
  	 */
  def subscribe(callback: js.Function1[/* response */ ToastrResponse, Unit]): Unit = js.native
  /**
  	 * Create a success toast
  	 */
  def success(message: String): JQuery_[HTMLElement] = js.native
  def success(message: String, title: String): JQuery_[HTMLElement] = js.native
  def success(message: String, title: String, overrides: ToastrOptions): JQuery_[HTMLElement] = js.native
  /**
  	 * Create a warning toast
  	 */
  def warning(message: String): JQuery_[HTMLElement] = js.native
  def warning(message: String, title: String): JQuery_[HTMLElement] = js.native
  def warning(message: String, title: String, overrides: ToastrOptions): JQuery_[HTMLElement] = js.native
}

