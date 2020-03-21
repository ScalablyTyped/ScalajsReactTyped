package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`-1`
import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`1024`
import typingsJapgolly.mfiles.mfilesNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`-1`
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`1`
  - typingsJapgolly.mfiles.mfilesNumbers.`1024`
*/
trait MFFolderListingItemGroupingMode extends js.Object

object MFFolderListingItemGroupingMode {
  @scala.inline
  def GroupObjectsByObjectType: `1` = this.cast(1)
  @scala.inline
  def GroupViewsAndFoldersByType: `1024` = this.cast(1024)
  @scala.inline
  def NoGrouping: `0` = this.cast(0)
  @scala.inline
  def Unspecified: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

