package typingsJapgolly.poseCore

import typingsJapgolly.poseCore.typesMod.PoseMap
import typingsJapgolly.poseCore.typesMod.TransitionMap
import typingsJapgolly.poseCore.typesMod.TransitionMapFactory
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
@js.native
object transitionsMod extends js.Object {
  def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = js.native
}

