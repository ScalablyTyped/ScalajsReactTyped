package typingsJapgolly.vanillaSwipe

import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.TouchEvent
import typingsJapgolly.vanillaSwipe.calculateMovingPositionMod.E
import typingsJapgolly.vanillaSwipe.calculatePositionMod.Value
import typingsJapgolly.vanillaSwipe.calculatePositionMod.nextPosition
import typingsJapgolly.vanillaSwipe.calculatePositionMod.prevPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def calculateDuration(): Double = js.native
  def calculateDuration(prevTime: Double): Double = js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  def calculateMovingPosition[T /* <: E */](e: T): AnonX = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): AnonX = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): AnonX = js.native
  def calculatePosition(prevPos: prevPosition, nextPos: nextPosition): Value = js.native
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  def createOptions(): js.Object = js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  def getInitialProps(): AnonDelta = js.native
  def getInitialProps(props: js.Object): AnonDelta = js.native
  def getInitialState(): AnonIsSwiping = js.native
  def getOptions(): AnonPassive | AnonPassiveUndefined = js.native
  def getOptions(isPassiveSupported: Boolean): AnonPassive | AnonPassiveUndefined = js.native
  def noop(): Unit = js.native
  def rotateByAngle(position: AnonY): typingsJapgolly.vanillaSwipe.rotateByAngleMod.Value = js.native
  def rotateByAngle(position: AnonY, angle: Double): typingsJapgolly.vanillaSwipe.rotateByAngleMod.Value = js.native
}

