package typingsJapgolly.seen.mod

import typingsJapgolly.seen.seenStrings.ambient
import typingsJapgolly.seen.seenStrings.directional
import typingsJapgolly.seen.seenStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Light")
@js.native
class Light protected () extends Transformable {
  def this(`type`: ambient) = this()
  def this(`type`: directional) = this()
  def this(`type`: point) = this()
  def this(`type`: ambient, options: LightOptions) = this()
  def this(`type`: directional, options: LightOptions) = this()
  def this(`type`: point, options: LightOptions) = this()
  var color: Color = js.native
  var defaults: LightOptions = js.native
  var enabled: Boolean = js.native
  var id: String = js.native
  var intensity: Double = js.native
  var normal: Point = js.native
  var point: Point = js.native
  var `type`: String = js.native
  def render(): Unit = js.native
}

