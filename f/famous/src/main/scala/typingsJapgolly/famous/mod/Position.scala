package typingsJapgolly.famous.mod

import typingsJapgolly.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Position")
@js.native
class Position protected () extends js.Object {
  def this(node: Node) = this()
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZ(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(x: Double): Position = js.native
  def set(x: Double, y: Double): Position = js.native
  def set(x: Double, y: Double, z: Double): Position = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): Position = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): Position = js.native
  def setX(`val`: Double): Position = js.native
  def setX(`val`: Double, transition: js.Any): Position = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): Position = js.native
  def setY(`val`: Double): Position = js.native
  def setY(`val`: Double, transition: js.Any): Position = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): Position = js.native
  def setZ(`val`: Double): Position = js.native
  def setZ(`val`: Double, transition: js.Any): Position = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): Position = js.native
  def update(): Unit = js.native
}

