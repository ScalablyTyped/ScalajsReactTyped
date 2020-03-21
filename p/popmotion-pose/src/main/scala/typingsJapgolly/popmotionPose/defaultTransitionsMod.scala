package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotion.mod.Action_
import typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
import typingsJapgolly.poseCore.typesMod.TransitionMap
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
@js.native
object defaultTransitionsMod extends js.Object {
  val default: Map[String, TransitionMap[Action_, TransitionDefinition]] = js.native
  def just(from: js.Any): Action_ = js.native
}

