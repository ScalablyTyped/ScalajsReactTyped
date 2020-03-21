package typingsJapgolly.aframe.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.tweenJs.TWEEN.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenLib extends js.Object {
  var Easing: typingsJapgolly.tweenJs.Easing = js.native
  var Group: Instantiable0[typingsJapgolly.tweenJs.mod.Group] = js.native
  var Interpolation: typingsJapgolly.tweenJs.Interpolation = js.native
  var Tween: Instantiable0[typingsJapgolly.tweenJs.mod.Tween] = js.native
  def add(tween: Tween): Unit = js.native
  def getAll(): js.Array[Tween] = js.native
  def now(): Double = js.native
  def remove(tween: Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

