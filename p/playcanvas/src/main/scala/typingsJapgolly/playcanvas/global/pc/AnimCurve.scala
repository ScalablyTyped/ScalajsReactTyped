package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Animation curve links an input data set to an output data set and defines the interpolation
  * method to use.
  *
  * @ignore
  */
@JSGlobal("pc.AnimCurve")
@js.native
open class AnimCurve protected ()
  extends typingsJapgolly.playcanvas.mod.AnimCurve {
  /**
    * Create a new animation curve.
    *
    * @param {string[]} paths - Array of path strings identifying the targets of this curve, for
    * example "rootNode.translation".
    * @param {number} input - Index of the curve which specifies the key data.
    * @param {number} output - Index of the curve which specifies the value data.
    * @param {number} interpolation - The interpolation method to use. One of the following:
    *
    * - {@link INTERPOLATION_STEP}
    * - {@link INTERPOLATION_LINEAR}
    * - {@link INTERPOLATION_CUBIC}
    */
  def this(paths: js.Array[String], input: Double, output: Double, interpolation: Double) = this()
}
