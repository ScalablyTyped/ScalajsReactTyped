package typingsJapgolly.featherlight

import typingsJapgolly.featherlight.Featherlight.Config
import typingsJapgolly.featherlight.Featherlight.FeatherlightStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic = js.native
  def featherlight(): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def featherlight(config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
}

