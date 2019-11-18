package typingsJapgolly.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends typingsJapgolly.three.srcMathTriangleMod.Triangle {
  def this(a: typingsJapgolly.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
  def this(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
}

/* static members */
@JSImport("three", "Triangle")
@js.native
object Triangle extends js.Object {
  def containsPoint(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
  def getBarycoord(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    target: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): typingsJapgolly.three.srcMathVector3Mod.Vector3 = js.native
  def getNormal(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    target: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): typingsJapgolly.three.srcMathVector3Mod.Vector3 = js.native
  def getUV(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p1: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p2: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p3: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    uv1: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    uv2: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    uv3: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    target: typingsJapgolly.three.srcMathVector2Mod.Vector2
  ): typingsJapgolly.three.srcMathVector2Mod.Vector2 = js.native
  def isFrontFacing(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    direction: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): Boolean = js.native
}

