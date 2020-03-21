package typingsJapgolly.uikit.mod.UIkit

import typingsJapgolly.uikit.AnonCancel
import typingsJapgolly.uikit.mod.UIkitElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal_ extends js.Object {
  var labels: AnonCancel = js.native
  def apply(element: UIkitElement): UIkitModalElement = js.native
  def apply(element: UIkitElement, options: UIkitModalOptions): UIkitModalElement = js.native
  def alert(message: String): js.Promise[Unit] = js.native
  def alert(message: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  def confirm(message: String): js.Promise[Unit] = js.native
  def confirm(message: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  def dialog(content: String): js.Promise[Unit] = js.native
  def dialog(content: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  def prompt(content: String, value: String): js.Promise[Unit] = js.native
  def prompt(content: String, value: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
}

