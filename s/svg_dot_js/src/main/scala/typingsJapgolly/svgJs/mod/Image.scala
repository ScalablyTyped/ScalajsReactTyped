package typingsJapgolly.svgJs.mod

import typingsJapgolly.std.Event_
import typingsJapgolly.svgJs.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends Shape {
  def error(cb: js.Function1[/* event */ Event_, Unit]): this.type = js.native
  def load(): this.type = js.native
  def load(url: String): this.type = js.native
  def loaded(cb: js.Function1[/* info */ AnonHeight, Unit]): this.type = js.native
}

