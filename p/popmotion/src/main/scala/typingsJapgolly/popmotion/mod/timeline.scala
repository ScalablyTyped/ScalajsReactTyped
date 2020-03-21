package typingsJapgolly.popmotion.mod

import typingsJapgolly.popmotion.actionMod.Action
import typingsJapgolly.popmotion.timelineTypesMod.Instruction
import typingsJapgolly.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "timeline")
@js.native
object timeline extends js.Object {
  def apply(instructions: js.Array[Instruction]): Action = js.native
  def apply(instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action = js.native
}

