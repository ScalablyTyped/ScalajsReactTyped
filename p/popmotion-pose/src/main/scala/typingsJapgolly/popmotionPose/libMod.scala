package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotionPose.libTypesMod.PoseFactoryConfig
import typingsJapgolly.popmotionPose.libTypesMod.Poser
import typingsJapgolly.popmotionPose.libTypesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/pose-core/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  def default[V, A, C, P, TD](
    hasGetDefaultPropsDefaultTransitionsBindOnChangeStartActionStopActionReadValueReadValueFromSourceResolveTargetSetValueSetValueNativeCreateValueConvertValueGetInstantTransitionGetTransitionPropsAddActionDelaySelectValueToReadConvertTransitionDefinitionTransformPosePosePriorityForceRenderExtendAPI: PoseFactoryConfig[V, A, C, P, TD]
  ): js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]] = js.native
}

