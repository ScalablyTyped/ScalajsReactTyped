package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonData")
@js.native
open class SkeletonData ()
  extends StObject
     with typingsJapgolly.phaser.spine.SkeletonData {
  
  /* CompleteClass */
  var animations: js.Array[typingsJapgolly.phaser.spine.Animation] = js.native
  
  /* CompleteClass */
  var audioPath: String = js.native
  
  /* CompleteClass */
  var bones: js.Array[typingsJapgolly.phaser.spine.BoneData] = js.native
  
  /* CompleteClass */
  var defaultSkin: typingsJapgolly.phaser.spine.Skin = js.native
  
  /* CompleteClass */
  var events: js.Array[typingsJapgolly.phaser.spine.EventData] = js.native
  
  /* CompleteClass */
  override def findAnimation(animationName: String): typingsJapgolly.phaser.spine.Animation = js.native
  
  /* CompleteClass */
  override def findBone(boneName: String): typingsJapgolly.phaser.spine.BoneData = js.native
  
  /* CompleteClass */
  override def findBoneIndex(boneName: String): Double = js.native
  
  /* CompleteClass */
  override def findEvent(eventDataName: String): typingsJapgolly.phaser.spine.EventData = js.native
  
  /* CompleteClass */
  override def findIkConstraint(constraintName: String): typingsJapgolly.phaser.spine.IkConstraintData = js.native
  
  /* CompleteClass */
  override def findPathConstraint(constraintName: String): typingsJapgolly.phaser.spine.PathConstraintData = js.native
  
  /* CompleteClass */
  override def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  
  /* CompleteClass */
  override def findSkin(skinName: String): typingsJapgolly.phaser.spine.Skin = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): typingsJapgolly.phaser.spine.SlotData = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /* CompleteClass */
  override def findTransformConstraint(constraintName: String): typingsJapgolly.phaser.spine.TransformConstraintData = js.native
  
  /* CompleteClass */
  var fps: Double = js.native
  
  /* CompleteClass */
  var hash: String = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  /* CompleteClass */
  var ikConstraints: js.Array[typingsJapgolly.phaser.spine.IkConstraintData] = js.native
  
  /* CompleteClass */
  var imagesPath: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var pathConstraints: js.Array[typingsJapgolly.phaser.spine.PathConstraintData] = js.native
  
  /* CompleteClass */
  var skins: js.Array[typingsJapgolly.phaser.spine.Skin] = js.native
  
  /* CompleteClass */
  var slots: js.Array[typingsJapgolly.phaser.spine.SlotData] = js.native
  
  /* CompleteClass */
  var transformConstraints: js.Array[typingsJapgolly.phaser.spine.TransformConstraintData] = js.native
  
  /* CompleteClass */
  var version: String = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
