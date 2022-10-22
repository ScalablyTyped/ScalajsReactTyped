package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.AdjustPitch
import typingsJapgolly.babylonjs.anon.BendAxis
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonesIndexMod {
  
  @JSImport("babylonjs/Bones/index", "Bone")
  @js.native
  open class Bone protected ()
    extends typingsJapgolly.babylonjs.bonesBoneMod.Bone {
    /**
      * Create a new bone
      * @param name defines the bone name
      * @param skeleton defines the parent skeleton
      * @param parentBone defines the parent (can be null if the bone is the root)
      * @param localMatrix defines the local matrix
      * @param restPose defines the rest pose matrix
      * @param baseMatrix defines the base matrix
      * @param index defines index of the bone in the hierarchy
      */
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
  }
  /* static members */
  object Bone {
    
    @JSImport("babylonjs/Bones/index", "Bone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "Bone._TmpMats")
    @js.native
    def _TmpMats: Any = js.native
    inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "Bone._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "Bone._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "BoneIKController")
  @js.native
  open class BoneIKController protected ()
    extends typingsJapgolly.babylonjs.bonesBoneIKControllerMod.BoneIKController {
    /**
      * Creates a new BoneIKController
      * @param mesh defines the TransformNode to control
      * @param bone defines the bone to control
      * @param options defines options to set up the controller
      * @param options.targetMesh
      * @param options.poleTargetMesh
      * @param options.poleTargetBone
      * @param options.poleTargetLocalOffset
      * @param options.poleAngle
      * @param options.bendAxis
      * @param options.maxAngle
      * @param options.slerpAmount
      */
    def this(mesh: TransformNode, bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone) = this()
    def this(mesh: TransformNode, bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone, options: BendAxis) = this()
  }
  /* static members */
  object BoneIKController {
    
    @JSImport("babylonjs/Bones/index", "BoneIKController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._TmpMats")
    @js.native
    def _TmpMats: Any = js.native
    inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneIKController._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "BoneLookController")
  @js.native
  open class BoneLookController protected ()
    extends typingsJapgolly.babylonjs.bonesBoneLookControllerMod.BoneLookController {
    /**
      * Create a BoneLookController
      * @param mesh the TransformNode that the bone belongs to
      * @param bone the bone that will be looking to the target
      * @param target the target Vector3 to look at
      * @param options optional settings:
      * * maxYaw: the maximum angle the bone will yaw to
      * * minYaw: the minimum angle the bone will yaw to
      * * maxPitch: the maximum angle the bone will pitch to
      * * minPitch: the minimum angle the bone will yaw to
      * * slerpAmount: set the between 0 and 1 to make the bone slerp to the target.
      * * upAxis: the up axis of the coordinate system
      * * upAxisSpace: the space that the up axis is in - Space.BONE, Space.LOCAL (default), or Space.WORLD.
      * * yawAxis: set yawAxis if the bone does not yaw on the y axis
      * * pitchAxis: set pitchAxis if the bone does not pitch on the x axis
      * * adjustYaw: used to make an adjustment to the yaw of the bone
      * * adjustPitch: used to make an adjustment to the pitch of the bone
      * * adjustRoll: used to make an adjustment to the roll of the bone
      * @param options.maxYaw
      * @param options.minYaw
      * @param options.maxPitch
      * @param options.minPitch
      * @param options.slerpAmount
      * @param options.upAxis
      * @param options.upAxisSpace
      * @param options.yawAxis
      * @param options.pitchAxis
      * @param options.adjustYaw
      * @param options.adjustPitch
      * @param options.adjustRoll
      **/
    def this(mesh: TransformNode, bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone, target: Vector3) = this()
    def this(
      mesh: TransformNode,
      bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone,
      target: Vector3,
      options: AdjustPitch
    ) = this()
  }
  /* static members */
  object BoneLookController {
    
    @JSImport("babylonjs/Bones/index", "BoneLookController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._TmpMats")
    @js.native
    def _TmpMats: Any = js.native
    inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/index", "BoneLookController._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Bones/index", "Skeleton")
  @js.native
  open class Skeleton protected ()
    extends typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton {
    /**
      * Creates a new skeleton
      * @param name defines the skeleton name
      * @param id defines the skeleton Id
      * @param scene defines the hosting scene
      */
    def this(
      /** defines the skeleton name */
    name: String,
      /** defines the skeleton Id */
    id: String,
      scene: Scene
    ) = this()
  }
  /* static members */
  object Skeleton {
    
    @JSImport("babylonjs/Bones/index", "Skeleton")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
      * @param skeleton defines the Skeleton containing the animation range to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
      * @returns the original skeleton
      */
    inline def MakeAnimationAdditive(
      skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
      referenceFrame: Double,
      range: String
    ): Nullable[typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton]]
    inline def MakeAnimationAdditive(skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton, referenceFrame: Unit, range: String): Nullable[typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton]]
    
    /**
      * Creates a new skeleton from serialized data
      * @param parsedSkeleton defines the serialized data
      * @param scene defines the hosting scene
      * @returns a new skeleton
      */
    inline def Parse(parsedSkeleton: Any, scene: Scene): typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSkeleton.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton]
  }
}
