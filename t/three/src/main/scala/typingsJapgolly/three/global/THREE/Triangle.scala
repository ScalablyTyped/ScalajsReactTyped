package typingsJapgolly.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Triangle")
@js.native
open class Triangle ()
  extends typingsJapgolly.three.mod.Triangle {
  def this(a: typingsJapgolly.three.srcMathVector3Mod.Vector3) = this()
  def this(a: Unit, b: typingsJapgolly.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
  def this(a: Unit, b: Unit, c: typingsJapgolly.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: Unit,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
  def this(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: Unit,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
  def this(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ) = this()
}
/* static members */
object Triangle {
  
  @JSGlobal("THREE.Triangle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsPoint(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getBarycoord(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    target: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): typingsJapgolly.three.srcMathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getBarycoord")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcMathVector3Mod.Vector3]
  
  inline def getNormal(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    target: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): typingsJapgolly.three.srcMathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcMathVector3Mod.Vector3]
  
  inline def getUV(
    point: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p1: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p2: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    p3: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    uv1: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    uv2: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    uv3: typingsJapgolly.three.srcMathVector2Mod.Vector2,
    target: typingsJapgolly.three.srcMathVector2Mod.Vector2
  ): typingsJapgolly.three.srcMathVector2Mod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getUV")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], uv1.asInstanceOf[js.Any], uv2.asInstanceOf[js.Any], uv3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcMathVector2Mod.Vector2]
  
  inline def isFrontFacing(
    a: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    b: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    c: typingsJapgolly.three.srcMathVector3Mod.Vector3,
    direction: typingsJapgolly.three.srcMathVector3Mod.Vector3
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFrontFacing")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
