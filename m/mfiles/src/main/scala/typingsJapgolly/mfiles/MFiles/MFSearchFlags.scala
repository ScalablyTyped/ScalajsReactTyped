package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`16`
import typingsJapgolly.mfiles.mfilesNumbers.`1`
import typingsJapgolly.mfiles.mfilesNumbers.`2`
import typingsJapgolly.mfiles.mfilesNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`1`
  - typingsJapgolly.mfiles.mfilesNumbers.`2`
  - typingsJapgolly.mfiles.mfilesNumbers.`4`
  - typingsJapgolly.mfiles.mfilesNumbers.`16`
*/
trait MFSearchFlags extends js.Object

object MFSearchFlags {
  @scala.inline
  def DisableRelevancyRanking: `16` = this.cast(16)
  @scala.inline
  def LookAllObjectTypes: `4` = this.cast(4)
  @scala.inline
  def LookInAllVersions: `1` = this.cast(1)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def ReturnLatestVisibleVersion: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

