package typingsJapgolly.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnimationDef = typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typingsJapgolly.popmotionPose.popmotionPoseStrings.BoundingBox with js.Any
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typingsJapgolly.popmotionPose.popmotionPoseStrings.DragBounds with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.popmotionPose.popmotionPoseStrings.x
    - typingsJapgolly.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typingsJapgolly.popmotionPose.typesMod._Draggable | scala.Boolean
  type Pose = typingsJapgolly.poseCore.typesMod.Pose[
    typingsJapgolly.popmotion.mod.Action_, 
    typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoseMap = typingsJapgolly.poseCore.typesMod.PoseMap[
    typingsJapgolly.popmotion.mod.Action_, 
    typingsJapgolly.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoserState = typingsJapgolly.poseCore.typesMod.PoserState[
    typingsJapgolly.popmotionPose.typesMod.Value, 
    typingsJapgolly.popmotion.mod.Action_, 
    typingsJapgolly.popmotion.typesMod.ColdSubscription, 
    typingsJapgolly.popmotionPose.typesMod.DomPopmotionPoser
  ]
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[
    /* props */ typingsJapgolly.popmotionPose.typesMod.ResolverProps, 
    typingsJapgolly.popmotion.mod.Action_ | typingsJapgolly.popmotionPose.popmotionPoseBooleans.`false`
  ]
}
