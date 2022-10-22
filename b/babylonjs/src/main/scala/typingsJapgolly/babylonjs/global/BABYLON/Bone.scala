package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Bone")
@js.native
open class Bone protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Bone {
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
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
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
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Unit,
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
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
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Unit,
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Unit,
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Unit,
    index: Nullable[Double]
  ) = this()
  def this(
    /**
    * defines the bone name
    */
  name: String,
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
    parentBone: Nullable[typingsJapgolly.babylonjs.BABYLON.Bone],
    localMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    restPose: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    baseMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix],
    index: Nullable[Double]
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsJapgolly.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
}
/* static members */
object Bone {
  
  @JSGlobal("BABYLON.Bone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.Bone._TmpMats")
  @js.native
  def _TmpMats: Any = js.native
  inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Bone._TmpQuat")
  @js.native
  def _TmpQuat: Any = js.native
  inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Bone._TmpVecs")
  @js.native
  def _TmpVecs: Any = js.native
  inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
}
