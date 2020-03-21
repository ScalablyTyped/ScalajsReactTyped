package typingsJapgolly.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.markJs.markJsStrings.partially
  - typingsJapgolly.markJs.markJsStrings.complementary
  - typingsJapgolly.markJs.markJsStrings.exactly
*/
trait MarkAccuracy extends js.Object

object MarkAccuracy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complementary: typingsJapgolly.markJs.markJsStrings.complementary = this.cast("complementary")
  @scala.inline
  def exactly: typingsJapgolly.markJs.markJsStrings.exactly = this.cast("exactly")
  @scala.inline
  def partially: typingsJapgolly.markJs.markJsStrings.partially = this.cast("partially")
}

