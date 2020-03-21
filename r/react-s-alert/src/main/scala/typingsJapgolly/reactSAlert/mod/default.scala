package typingsJapgolly.reactSAlert.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertConfigProps
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-s-alert", JSImport.Default)
@js.native
class default ()
  extends Component[SAlertProps, js.Object, js.Any]

@JSImport("react-s-alert", JSImport.Default)
@js.native
object default extends js.Object {
  def close(id: Double): Unit = js.native
  def closeAll(): Unit = js.native
  def error(): Double = js.native
  def error(msg: String): Double = js.native
  def error(msg: String, data: SAlertConfigProps): Double = js.native
  def info(): Double = js.native
  def info(msg: String): Double = js.native
  def info(msg: String, data: SAlertConfigProps): Double = js.native
  def success(): Double = js.native
  def success(msg: String): Double = js.native
  def success(msg: String, data: SAlertConfigProps): Double = js.native
  def warning(): Double = js.native
  def warning(msg: String): Double = js.native
  def warning(msg: String, data: SAlertConfigProps): Double = js.native
}

