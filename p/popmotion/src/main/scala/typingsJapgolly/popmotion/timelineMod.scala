package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.actionMod.Action
import typingsJapgolly.popmotion.timelineTypesMod.Instruction
import typingsJapgolly.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  def default(instructions: js.Array[Instruction]): Action = js.native
  def default(instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action = js.native
}

