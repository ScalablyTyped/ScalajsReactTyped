package typingsJapgolly.poseCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.poseCore.libTypesMod.Pose
import typingsJapgolly.poseCore.libTypesMod.PoseMap
import typingsJapgolly.poseCore.libTypesMod.PoserConfig
import typingsJapgolly.poseCore.libTypesMod.SelectValueToRead
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIncSelectorsMod {
  
  @JSImport("pose-core/lib/inc/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoseValues")(hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps.asInstanceOf[js.Any]).asInstanceOf[Pose[A, TD]]
  
  inline def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAllValues")(values.asInstanceOf[js.Any], selectValue.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectPoses")(hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses.asInstanceOf[js.Any]).asInstanceOf[PoseMap[A, TD]]
}
