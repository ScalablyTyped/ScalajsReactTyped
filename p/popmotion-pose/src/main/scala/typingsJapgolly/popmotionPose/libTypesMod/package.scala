package typingsJapgolly.popmotionPose.libTypesMod

import typingsJapgolly.popmotionPose.anon.Ease
import typingsJapgolly.popmotionPose.anon.Type
import typingsJapgolly.popmotionPose.popmotionPoseBooleans.`false`
import typingsJapgolly.tsEssentials.distTypesMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationDef = TransitionDefinition

type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.popmotionPose.popmotionPoseStrings.x
  - typingsJapgolly.popmotionPose.popmotionPoseStrings.y
*/
type Draggable = _Draggable | Boolean

type Pose = typingsJapgolly.poseCore.libTypesMod.Pose[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoseMap = typingsJapgolly.poseCore.libTypesMod.PoseMap[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoserState = typingsJapgolly.poseCore.libTypesMod.PoserState[
Value, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
DomPopmotionPoser]

type Transformer = js.Function1[/* v */ Any, Any]

type Transition = js.Function1[
/* props */ ResolverProps, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any) | `false`]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.popmotionPose.libTypesMod.TweenDefinition
  - typingsJapgolly.popmotionPose.libTypesMod.PhysicsDefinition
  - typingsJapgolly.popmotionPose.libTypesMod.SpringDefinition
  - typingsJapgolly.popmotionPose.libTypesMod.DecayDefinition
  - typingsJapgolly.popmotionPose.libTypesMod.KeyframesDefinition
*/
type TransitionDefinition = _TransitionDefinition | TweenDefinition

type TweenDefinition = Merge[
Type & TransitionDefinitionCommonProps & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ Any), 
Ease]
