package typingsJapgolly.snapsvg

import typingsJapgolly.mina.mina.AnimationDescriptor
import typingsJapgolly.snapsvg.mod.Animation_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnim extends js.Object {
  var anim: Animation_ = js.native
  var curStatus: Double = js.native
  var mina: AnimationDescriptor = js.native
  def status(): Double = js.native
  def status(n: Double): Double = js.native
  def stop(): Unit = js.native
}

