package typingsJapgolly.keymaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keymaster extends js.Object {
  var alt: Boolean = js.native
  var command: Boolean = js.native
  var control: Boolean = js.native
  var ctrl: Boolean = js.native
  var option: Boolean = js.native
  var shift: Boolean = js.native
  def apply(key: String, callback: KeyHandler): Unit = js.native
  def apply(key: String, scope: String, callback: KeyHandler): Unit = js.native
  def deleteScope(scopeName: String): Unit = js.native
  def filter(event: FilterEvent): Unit = js.native
  def getPressedKeyCodes(): js.Array[Double] = js.native
  def getScope(): String = js.native
  def isPressed(keyCode: Double): Boolean = js.native
  def noConflict(): Unit = js.native
  def setScope(scopeName: String): Unit = js.native
  def unbind(key: String): Unit = js.native
  def unbind(key: String, scopeName: String): Unit = js.native
}

