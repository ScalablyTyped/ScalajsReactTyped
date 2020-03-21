package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.popmotionPose.flipMod.Action
import typingsJapgolly.popmotionPose.libTypesMod.Pose
import typingsJapgolly.popmotionPose.libTypesMod.PoserState
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
import typingsJapgolly.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object unitConversionMod extends js.Object {
  def convertPositionalUnits(
    state: PoserState[Value, Action, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action, TransitionDefinition]
  ): Pose[Action, TransitionDefinition] = js.native
  def isPositional(pose: Pose[Action, TransitionDefinition]): Boolean = js.native
}

