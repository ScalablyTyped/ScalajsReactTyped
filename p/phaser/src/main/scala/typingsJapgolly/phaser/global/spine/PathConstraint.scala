package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.PathConstraint")
@js.native
open class PathConstraint protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.PathConstraint {
  def this(
    data: typingsJapgolly.phaser.spine.PathConstraintData,
    skeleton: typingsJapgolly.phaser.spine.Skeleton
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  /* CompleteClass */
  override def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  /* CompleteClass */
  override def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  
  /* CompleteClass */
  var bones: js.Array[typingsJapgolly.phaser.spine.Bone] = js.native
  
  /* CompleteClass */
  override def computeWorldPositions(
    path: typingsJapgolly.phaser.spine.PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  
  /* CompleteClass */
  var curves: js.Array[Double] = js.native
  
  /* CompleteClass */
  var data: typingsJapgolly.phaser.spine.PathConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var lengths: js.Array[Double] = js.native
  
  /* CompleteClass */
  var position: Double = js.native
  
  /* CompleteClass */
  var positions: js.Array[Double] = js.native
  
  /* CompleteClass */
  var rotateMix: Double = js.native
  
  /* CompleteClass */
  var segments: js.Array[Double] = js.native
  
  /* CompleteClass */
  var spaces: js.Array[Double] = js.native
  
  /* CompleteClass */
  var spacing: Double = js.native
  
  /* CompleteClass */
  var target: typingsJapgolly.phaser.spine.Slot = js.native
  
  /* CompleteClass */
  var translateMix: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var world: js.Array[Double] = js.native
}
object PathConstraint {
  
  @JSGlobal("spine.PathConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.PathConstraint.AFTER")
  @js.native
  def AFTER: Double = js.native
  inline def AFTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.BEFORE")
  @js.native
  def BEFORE: Double = js.native
  inline def BEFORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.NONE")
  @js.native
  def NONE: Double = js.native
  inline def NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.epsilon")
  @js.native
  def epsilon: Double = js.native
  inline def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
}
