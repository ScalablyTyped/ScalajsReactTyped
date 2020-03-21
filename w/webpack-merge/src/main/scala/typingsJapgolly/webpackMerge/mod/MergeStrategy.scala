package typingsJapgolly.webpackMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpackMerge.webpackMergeStrings.prepend
  - typingsJapgolly.webpackMerge.webpackMergeStrings.append
  - typingsJapgolly.webpackMerge.webpackMergeStrings.replace
*/
trait MergeStrategy extends js.Object

object MergeStrategy {
  @scala.inline
  def append: typingsJapgolly.webpackMerge.webpackMergeStrings.append = this.cast("append")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def prepend: typingsJapgolly.webpackMerge.webpackMergeStrings.prepend = this.cast("prepend")
  @scala.inline
  def replace: typingsJapgolly.webpackMerge.webpackMergeStrings.replace = this.cast("replace")
}

