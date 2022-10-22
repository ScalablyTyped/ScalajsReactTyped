package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "Plane")
@js.native
/**
  * Constructs a new plane with the given values.
  *
  * @param [normal=Vector3( 0, 0, 1 )] - The normal vector of the plane.
  * @param [constant=0] - The distance of the plane from the origin.
  */
open class Plane ()
  extends typingsJapgolly.yuka.srcMathPlaneMod.Plane {
  def this(normal: typingsJapgolly.yuka.srcMathVector3Mod.Vector3) = this()
  def this(normal: Unit, constant: Double) = this()
  def this(normal: typingsJapgolly.yuka.srcMathVector3Mod.Vector3, constant: Double) = this()
}
