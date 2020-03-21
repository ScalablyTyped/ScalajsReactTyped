package typingsJapgolly.reactable

import typingsJapgolly.reactable.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactableStrings {
  @js.native
  sealed trait asc extends SortDirection
  
  @js.native
  sealed trait desc extends SortDirection
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

