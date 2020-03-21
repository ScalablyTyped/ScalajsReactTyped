package typingsJapgolly.reactAlert.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertManager extends js.Object {
  var alerts: js.Array[AlertComponentProps] = js.native
  var root: js.UndefOr[HTMLElement] = js.native
  def error(): AlertComponentProps = js.native
  def error(message: Node): AlertComponentProps = js.native
  def error(message: Node, options: AlertCustomOptions): AlertComponentProps = js.native
  def info(): AlertComponentProps = js.native
  def info(message: Node): AlertComponentProps = js.native
  def info(message: Node, options: AlertCustomOptions): AlertComponentProps = js.native
  def remove(alert: AlertComponentProps): Unit = js.native
  def show(): AlertComponentProps = js.native
  def show(message: Node): AlertComponentProps = js.native
  def show(message: Node, options: AlertCustomOptionsWithType): AlertComponentProps = js.native
  def success(): AlertComponentProps = js.native
  def success(message: Node): AlertComponentProps = js.native
  def success(message: Node, options: AlertCustomOptions): AlertComponentProps = js.native
}

