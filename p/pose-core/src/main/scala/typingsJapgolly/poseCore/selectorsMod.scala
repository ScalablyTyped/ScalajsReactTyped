package typingsJapgolly.poseCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.poseCore.typesMod.Pose
import typingsJapgolly.poseCore.typesMod.PoseMap
import typingsJapgolly.poseCore.typesMod.PoserConfig
import typingsJapgolly.poseCore.typesMod.SelectValueToRead
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/inc/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = js.native
  def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[js.Any] = js.native
  def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = js.native
}

