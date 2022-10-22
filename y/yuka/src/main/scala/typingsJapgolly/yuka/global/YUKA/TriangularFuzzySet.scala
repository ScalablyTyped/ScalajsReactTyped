package typingsJapgolly.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.TriangularFuzzySet")
@js.native
/**
  * Constructs a new triangular fuzzy set with the given values.
  *
  * @param [left=0] - Represents the left border of this fuzzy set.
  * @param [midpoint=0] - Represents the peak value of this fuzzy set.
  * @param [right=0] - Represents the right border of this fuzzy set.
  */
open class TriangularFuzzySet ()
  extends typingsJapgolly.yuka.mod.TriangularFuzzySet {
  def this(left: Double) = this()
  def this(left: Double, midpoint: Double) = this()
  def this(left: Unit, midpoint: Double) = this()
  def this(left: Double, midpoint: Double, right: Double) = this()
  def this(left: Double, midpoint: Unit, right: Double) = this()
  def this(left: Unit, midpoint: Double, right: Double) = this()
  def this(left: Unit, midpoint: Unit, right: Double) = this()
}
