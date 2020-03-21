package typingsJapgolly.xstream.tweenMod

import typingsJapgolly.xstream.AnonEase
import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenFactory extends js.Object {
  var back: Easings = js.native
  var bounce: Easings = js.native
  var circular: Easings = js.native
  var elastic: Easings = js.native
  var exponential: Easings = js.native
  var linear: AnonEase = js.native
  var power2: Easings = js.native
  var power3: Easings = js.native
  var power4: Easings = js.native
  var sine: Easings = js.native
  def apply(config: TweenConfig): Stream[Double] = js.native
}

