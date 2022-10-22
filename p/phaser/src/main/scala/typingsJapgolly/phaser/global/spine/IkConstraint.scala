package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.IkConstraint")
@js.native
open class IkConstraint protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.IkConstraint {
  def this(
    data: typingsJapgolly.phaser.spine.IkConstraintData,
    skeleton: typingsJapgolly.phaser.spine.Skeleton
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  
  /* CompleteClass */
  override def apply1(
    bone: typingsJapgolly.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def apply2(
    parent: typingsJapgolly.phaser.spine.Bone,
    child: typingsJapgolly.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var bendDirection: Double = js.native
  
  /* CompleteClass */
  var bones: js.Array[typingsJapgolly.phaser.spine.Bone] = js.native
  
  /* CompleteClass */
  var compress: Boolean = js.native
  
  /* CompleteClass */
  var data: typingsJapgolly.phaser.spine.IkConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var softness: Double = js.native
  
  /* CompleteClass */
  var stretch: Boolean = js.native
  
  /* CompleteClass */
  var target: typingsJapgolly.phaser.spine.Bone = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
