package typingsJapgolly.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertStatic extends js.Object {
  def alert(title: String): Unit = js.native
  def alert(title: String, message: String): Unit = js.native
  def alert(title: String, message: String, buttons: js.Array[AlertButton]): Unit = js.native
  def alert(title: String, message: String, buttons: js.Array[AlertButton], options: AlertOptions): Unit = js.native
  def prompt(title: String): Unit = js.native
  def prompt(title: String, message: String): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Array[AlertButton]): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Array[AlertButton], `type`: AlertType): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Array[AlertButton],
    `type`: AlertType,
    defaultValue: String
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Array[AlertButton],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: String
  ): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Function1[/* text */ String, Unit]): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* text */ String, Unit],
    `type`: AlertType
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* text */ String, Unit],
    `type`: AlertType,
    defaultValue: String
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* text */ String, Unit],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: String
  ): Unit = js.native
}

