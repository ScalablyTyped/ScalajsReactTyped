package typingsJapgolly.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 0 is PROD, 1 is DEV.
// Might add PROFILE later.
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactReconciler.reactReconcilerNumbers.`0`
  - typingsJapgolly.reactReconciler.reactReconcilerNumbers.`1`
*/
trait BundleType extends js.Object

object BundleType {
  @scala.inline
  def `0`: typingsJapgolly.reactReconciler.reactReconcilerNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsJapgolly.reactReconciler.reactReconcilerNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

