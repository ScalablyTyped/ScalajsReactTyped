package typingsJapgolly.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.cypress.AnonAt
import typingsJapgolly.cypress.JQuery_
import typingsJapgolly.cypress.PartialLogConfig
import typingsJapgolly.cypress.cypressStrings.$el
import typingsJapgolly.cypress.cypressStrings.displayName
import typingsJapgolly.cypress.cypressStrings.message
import typingsJapgolly.cypress.cypressStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  def end(): Log = js.native
  def finish(): Unit = js.native
  def get(): LogConfig = js.native
  @JSName("get")
  def get_displayName(attr: displayName): String = js.native
  @JSName("get")
  def get_el(attr: $el): JQuery_[HTMLElement] = js.native
  @JSName("get")
  def get_message(attr: message): js.Array[_] = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  def set(options: PartialLogConfig): Log = js.native
  @JSName("set")
  def set_displayName(key: displayName, value: String): Log = js.native
  @JSName("set")
  def set_el(key: $el, value: JQuery_[HTMLElement]): Log = js.native
  @JSName("set")
  def set_message(key: message, value: js.Array[_]): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  def snapshot(): Log = js.native
  def snapshot(name: String): Log = js.native
  def snapshot(name: String, options: AnonAt): Log = js.native
}

