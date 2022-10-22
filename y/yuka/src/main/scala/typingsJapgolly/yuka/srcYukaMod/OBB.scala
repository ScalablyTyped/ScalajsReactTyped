package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "OBB")
@js.native
/**
  * Constructs a new OBB with the given values.
  *
  * @param [center=Vector3(0,0,0)] - The center of this OBB.
  * @param [halfSizes=Vector3(0,0,0)] - The half sizes of the OBB (defines its width, height and depth).
  * @param [rotation=Matrix()] - The rotation of this OBB.
  */
open class OBB ()
  extends typingsJapgolly.yuka.srcMathObbMod.OBB {
  def this(center: typingsJapgolly.yuka.srcMathVector3Mod.Vector3) = this()
  def this(center: Unit, halfSizes: typingsJapgolly.yuka.srcMathVector3Mod.Vector3) = this()
  def this(
    center: typingsJapgolly.yuka.srcMathVector3Mod.Vector3,
    halfSizes: typingsJapgolly.yuka.srcMathVector3Mod.Vector3
  ) = this()
  def this(center: Unit, halfSizes: Unit, rotation: typingsJapgolly.yuka.srcMathMatrix3Mod.Matrix3) = this()
  def this(
    center: Unit,
    halfSizes: typingsJapgolly.yuka.srcMathVector3Mod.Vector3,
    rotation: typingsJapgolly.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
  def this(
    center: typingsJapgolly.yuka.srcMathVector3Mod.Vector3,
    halfSizes: Unit,
    rotation: typingsJapgolly.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
  def this(
    center: typingsJapgolly.yuka.srcMathVector3Mod.Vector3,
    halfSizes: typingsJapgolly.yuka.srcMathVector3Mod.Vector3,
    rotation: typingsJapgolly.yuka.srcMathMatrix3Mod.Matrix3
  ) = this()
}
