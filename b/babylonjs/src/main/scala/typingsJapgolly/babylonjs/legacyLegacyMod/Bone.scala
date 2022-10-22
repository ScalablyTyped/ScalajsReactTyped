package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Bone")
@js.native
open class Bone protected ()
  extends typingsJapgolly.babylonjs.indexMod.Bone {
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
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
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
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
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
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
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
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.bonesSkeletonMod.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.bonesBoneMod.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
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
    localMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    index: Nullable[Double]
  ) = this()
}
/* static members */
object Bone {
  
  @JSImport("babylonjs/Legacy/legacy", "Bone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._TmpMats")
  @js.native
  def _TmpMats: Any = js.native
  inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._TmpQuat")
  @js.native
  def _TmpQuat: Any = js.native
  inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Bone._TmpVecs")
  @js.native
  def _TmpVecs: Any = js.native
  inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
}
