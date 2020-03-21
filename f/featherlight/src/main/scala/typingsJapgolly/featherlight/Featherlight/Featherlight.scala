package typingsJapgolly.featherlight.Featherlight

import typingsJapgolly.featherlight.JQuery
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featherlight extends Config {
  @JSName("$content")
  var $content: JQuery = js.native
  @JSName("$instance")
  var $instance: JQuery = js.native
  var target: JQuery | String = js.native
  def close(): JQueryPromise[JQuery] = js.native
  def close(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def getContent(): JQuery | JQueryPromise[JQuery] = js.native
  def open(): JQueryPromise[JQuery] = js.native
  def open(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def setContent($content: JQuery): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setContent($content: JQueryPromise[JQuery]): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
}

