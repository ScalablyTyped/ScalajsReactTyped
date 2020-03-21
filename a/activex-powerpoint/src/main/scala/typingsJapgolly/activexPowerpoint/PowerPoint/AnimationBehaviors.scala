package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationBehaviors")
@js.native
class AnimationBehaviors protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationBehaviors_typekey")
  var PowerPointDotAnimationBehaviors_typekey: AnimationBehaviors = js.native
  /** @param number [Index=-1] */
  def Add(Type: MsoAnimType): AnimationBehavior = js.native
  def Add(Type: MsoAnimType, Index: Double): AnimationBehavior = js.native
  def Item(Index: Double): AnimationBehavior = js.native
}

