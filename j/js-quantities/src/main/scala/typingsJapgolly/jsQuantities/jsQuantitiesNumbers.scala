package typingsJapgolly.jsQuantities

import typingsJapgolly.jsQuantities.mod.ComparisonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsQuantitiesNumbers {
  @js.native
  sealed trait `-1` extends ComparisonResult
  
  @js.native
  sealed trait `0` extends ComparisonResult
  
  @js.native
  sealed trait `1` extends ComparisonResult
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

