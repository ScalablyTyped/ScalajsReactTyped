package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Effect")
@js.native
class Effect protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Behaviors: AnimationBehaviors = js.native
  val DisplayName: String = js.native
  val EffectInformation: typingsJapgolly.activexPowerpoint.PowerPoint.EffectInformation = js.native
  val EffectParameters: typingsJapgolly.activexPowerpoint.PowerPoint.EffectParameters = js.native
  var EffectType: MsoAnimEffect = js.native
  var Exit: MsoTriState = js.native
  val Index: Double = js.native
  var Paragraph: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect = js.native
  var Shape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape = js.native
  val TextRangeLength: Double = js.native
  val TextRangeStart: Double = js.native
  val Timing: typingsJapgolly.activexPowerpoint.PowerPoint.Timing = js.native
  def Delete(): Unit = js.native
  def MoveAfter(Effect: Effect): Unit = js.native
  def MoveBefore(Effect: Effect): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

