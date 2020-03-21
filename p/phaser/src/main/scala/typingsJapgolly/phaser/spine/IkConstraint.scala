package typingsJapgolly.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.IkConstraint")
@js.native
class IkConstraint protected () extends Updatable {
  def this(data: IkConstraintData, skeleton: Skeleton) = this()
  var active: Boolean = js.native
  var bendDirection: Double = js.native
  var bones: js.Array[Bone] = js.native
  var compress: Boolean = js.native
  var data: IkConstraintData = js.native
  var mix: Double = js.native
  var softness: Double = js.native
  var stretch: Boolean = js.native
  var target: Bone = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

