package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`1`
import typingsJapgolly.mfiles.mfilesNumbers.`2`
import typingsJapgolly.mfiles.mfilesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`1`
  - typingsJapgolly.mfiles.mfilesNumbers.`2`
  - typingsJapgolly.mfiles.mfilesNumbers.`3`
*/
trait CommandState extends js.Object

object CommandState {
  @scala.inline
  def Active: `1` = this.cast(1)
  @scala.inline
  def Hidden: `3` = this.cast(3)
  @scala.inline
  def Inactive: `2` = this.cast(2)
  @scala.inline
  def Undefined: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

