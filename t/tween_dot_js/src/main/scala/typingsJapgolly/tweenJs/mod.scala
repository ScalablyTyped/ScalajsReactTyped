package typingsJapgolly.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tweenjs/tween.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Group ()
    extends typingsJapgolly.tweenJs.TWEEN.Group
  
  @js.native
  class Tween ()
    extends typingsJapgolly.tweenJs.TWEEN.Tween {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, group: typingsJapgolly.tweenJs.TWEEN.Group) = this()
  }
  
  var Easing: typingsJapgolly.tweenJs.Easing = js.native
  var Interpolation: typingsJapgolly.tweenJs.Interpolation = js.native
  def add(tween: typingsJapgolly.tweenJs.TWEEN.Tween): Unit = js.native
  def getAll(): js.Array[typingsJapgolly.tweenJs.TWEEN.Tween] = js.native
  def now(): Double = js.native
  def remove(tween: typingsJapgolly.tweenJs.TWEEN.Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

