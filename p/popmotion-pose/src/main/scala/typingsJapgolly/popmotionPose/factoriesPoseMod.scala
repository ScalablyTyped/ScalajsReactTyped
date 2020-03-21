package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotion.mod.Action_
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import typingsJapgolly.popmotionPose.libTypesMod.PoserConfig
import typingsJapgolly.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
import typingsJapgolly.popmotionPose.typesMod.Value
import typingsJapgolly.poseCore.typesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object factoriesPoseMod extends js.Object {
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[/* config */ PoserConfig[Value], Poser[Value, Action_, ColdSubscription, P]] = js.native
}

