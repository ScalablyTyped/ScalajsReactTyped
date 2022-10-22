package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Bone")
@js.native
open class Bone protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.Bone {
  def this(
    data: typingsJapgolly.phaser.spine.BoneData,
    skeleton: typingsJapgolly.phaser.spine.Skeleton,
    parent: typingsJapgolly.phaser.spine.Bone
  ) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  var appliedValid: Boolean = js.native
  
  /* CompleteClass */
  var arotation: Double = js.native
  
  /* CompleteClass */
  var ascaleX: Double = js.native
  
  /* CompleteClass */
  var ascaleY: Double = js.native
  
  /* CompleteClass */
  var ashearX: Double = js.native
  
  /* CompleteClass */
  var ashearY: Double = js.native
  
  /* CompleteClass */
  var ax: Double = js.native
  
  /* CompleteClass */
  var ay: Double = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  var c: Double = js.native
  
  /* CompleteClass */
  var children: js.Array[typingsJapgolly.phaser.spine.Bone] = js.native
  
  /* CompleteClass */
  var d: Double = js.native
  
  /* CompleteClass */
  var data: typingsJapgolly.phaser.spine.BoneData = js.native
  
  /* CompleteClass */
  override def getWorldRotationX(): Double = js.native
  
  /* CompleteClass */
  override def getWorldRotationY(): Double = js.native
  
  /* CompleteClass */
  override def getWorldScaleX(): Double = js.native
  
  /* CompleteClass */
  override def getWorldScaleY(): Double = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  override def localToWorld(local: typingsJapgolly.phaser.spine.Vector2): typingsJapgolly.phaser.spine.Vector2 = js.native
  
  /* CompleteClass */
  override def localToWorldRotation(localRotation: Double): Double = js.native
  
  /* CompleteClass */
  var parent: typingsJapgolly.phaser.spine.Bone = js.native
  
  /* CompleteClass */
  override def rotateWorld(degrees: Double): Unit = js.native
  
  /* CompleteClass */
  var rotation: Double = js.native
  
  /* CompleteClass */
  var scaleX: Double = js.native
  
  /* CompleteClass */
  var scaleY: Double = js.native
  
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
  
  /* CompleteClass */
  var shearX: Double = js.native
  
  /* CompleteClass */
  var shearY: Double = js.native
  
  /* CompleteClass */
  var skeleton: typingsJapgolly.phaser.spine.Skeleton = js.native
  
  /* CompleteClass */
  var sorted: Boolean = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  override def updateAppliedTransform(): Unit = js.native
  
  /* CompleteClass */
  override def updateWorldTransform(): Unit = js.native
  
  /* CompleteClass */
  override def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def worldToLocal(world: typingsJapgolly.phaser.spine.Vector2): typingsJapgolly.phaser.spine.Vector2 = js.native
  
  /* CompleteClass */
  override def worldToLocalRotation(worldRotation: Double): Double = js.native
  
  /* CompleteClass */
  var worldX: Double = js.native
  
  /* CompleteClass */
  var worldY: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
