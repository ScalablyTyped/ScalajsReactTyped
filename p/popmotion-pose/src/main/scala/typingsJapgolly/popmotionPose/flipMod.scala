package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotion.mod.Action_
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.popmotionPose.libTypesMod.Pose
import typingsJapgolly.popmotionPose.libTypesMod.PoserState
import typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
import typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
import typingsJapgolly.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object flipMod extends js.Object {
  @js.native
  class Action ()
    extends typingsJapgolly.popmotion.actionMod.Action
  
  def flipPose(
    props: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action_, TransitionDefinition]
  ): Pose[Action_, TransitionDefinition] = js.native
  def isFlipPose(flip: Boolean, key: String, state: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser]): Boolean = js.native
  def setValue(
    hasValuesProps: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser],
    key: String,
    to: js.Any
  ): Unit = js.native
}

