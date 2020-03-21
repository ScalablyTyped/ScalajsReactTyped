package typingsJapgolly.firebasePerformance.apiServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.mark
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.measure
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.paint
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.resource
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.frame
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.navigation
*/
trait EntryType extends js.Object

object EntryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def frame: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.frame = this.cast("frame")
  @scala.inline
  def mark: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.mark = this.cast("mark")
  @scala.inline
  def measure: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.measure = this.cast("measure")
  @scala.inline
  def navigation: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.navigation = this.cast("navigation")
  @scala.inline
  def paint: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.paint = this.cast("paint")
  @scala.inline
  def resource: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.resource = this.cast("resource")
}

