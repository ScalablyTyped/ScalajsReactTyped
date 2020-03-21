package typingsJapgolly.winrtUwp.Windows.Globalization.NumberFormatting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoundingAlgorithm extends js.Object

/** Specifies the algorithm used to round numbers. */
@JSGlobal("Windows.Globalization.NumberFormatting.RoundingAlgorithm")
@js.native
object RoundingAlgorithm extends js.Object {
  /** No rounding is performed. */
  @js.native
  sealed trait none extends RoundingAlgorithm
  
  /** Round away from zero. This is the equivalent of RoundUp if the input is positive, or RoundDown if the input is negative. */
  @js.native
  sealed trait roundAwayFromZero extends RoundingAlgorithm
  
  /** Round towards negative infinity. (Return the largest integer, increment, or significant digit which does not exceed the input.) */
  @js.native
  sealed trait roundDown extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundAwayFromZero. */
  @js.native
  sealed trait roundHalfAwayFromZero extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundDown. */
  @js.native
  sealed trait roundHalfDown extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest even output. */
  @js.native
  sealed trait roundHalfToEven extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest odd output. */
  @js.native
  sealed trait roundHalfToOdd extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundTowardsZero. */
  @js.native
  sealed trait roundHalfTowardsZero extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundUp. */
  @js.native
  sealed trait roundHalfUp extends RoundingAlgorithm
  
  /** Round towards zero. This is the equivalent of RoundDown if the input is positive, or RoundUp if the input is negative. */
  @js.native
  sealed trait roundTowardsZero extends RoundingAlgorithm
  
  /** Round towards infinity. (Return the smallest integer, increment, or significant digit which is not less than the input.) */
  @js.native
  sealed trait roundUp extends RoundingAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoundingAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object roundAwayFromZero extends TopLevel[roundAwayFromZero with Double]
  
  /* 1 */ @js.native
  object roundDown extends TopLevel[roundDown with Double]
  
  /* 8 */ @js.native
  object roundHalfAwayFromZero extends TopLevel[roundHalfAwayFromZero with Double]
  
  /* 5 */ @js.native
  object roundHalfDown extends TopLevel[roundHalfDown with Double]
  
  /* 9 */ @js.native
  object roundHalfToEven extends TopLevel[roundHalfToEven with Double]
  
  /* 10 */ @js.native
  object roundHalfToOdd extends TopLevel[roundHalfToOdd with Double]
  
  /* 7 */ @js.native
  object roundHalfTowardsZero extends TopLevel[roundHalfTowardsZero with Double]
  
  /* 6 */ @js.native
  object roundHalfUp extends TopLevel[roundHalfUp with Double]
  
  /* 3 */ @js.native
  object roundTowardsZero extends TopLevel[roundTowardsZero with Double]
  
  /* 2 */ @js.native
  object roundUp extends TopLevel[roundUp with Double]
  
}

