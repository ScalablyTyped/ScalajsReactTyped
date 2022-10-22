package typingsJapgolly.three.mod

import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ArrowHelper")
@js.native
open class ArrowHelper protected ()
  extends typingsJapgolly.three.srcThreeMod.ArrowHelper {
  /**
    * @param [dir] Direction from origin. Must be a unit vector.
    * @param [origin] Point at which the arrow starts.
    * @param [length] Length of the arrow.
    * @param [color] Hexadecimal value to define color.
    * @param [headLength] The length of the head of the arrow.
    * @param [headWidth] The width of the head of the arrow.
    */
  def this(
    dir: js.UndefOr[typingsJapgolly.three.srcMathVector3Mod.Vector3],
    origin: js.UndefOr[typingsJapgolly.three.srcMathVector3Mod.Vector3],
    length: js.UndefOr[Double],
    color: js.UndefOr[ColorRepresentation],
    headLength: js.UndefOr[Double],
    headWidth: js.UndefOr[Double]
  ) = this()
}
