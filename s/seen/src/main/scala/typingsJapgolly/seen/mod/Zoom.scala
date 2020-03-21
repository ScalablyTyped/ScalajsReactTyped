package typingsJapgolly.seen.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.seen.AnonSmooth
import typingsJapgolly.seen.AnonSmoothBoolean
import typingsJapgolly.seen.mod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Zoom")
@js.native
class Zoom protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: AnonSmoothBoolean) = this()
  def this(elementOrId: HTMLElement, options: AnonSmoothBoolean) = this()
  var defaults: AnonSmooth = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var speed: Double = js.native
}

