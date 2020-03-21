package typingsJapgolly.dc.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Units extends js.Object {
  var fp: FloatPointUnits = js.native
  @JSName("integers")
  var integers_Original: UnitFunction = js.native
  @JSName("ordinal")
  var ordinal_Original: UnitFunction = js.native
  def integers(start: Double, end: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Double, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Double, end: Date): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Double, end: Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Double, end: Date, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Date): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def integers(start: Date, end: Date, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Date): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Double, end: Date, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Date): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String]) = js.native
  def ordinal(start: Date, end: Date, domain: Double): Double | (js.Array[Double | js.Date | String]) = js.native
}

