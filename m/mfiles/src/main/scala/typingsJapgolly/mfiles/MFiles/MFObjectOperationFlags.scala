package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`16`
import typingsJapgolly.mfiles.mfilesNumbers.`1`
import typingsJapgolly.mfiles.mfilesNumbers.`2`
import typingsJapgolly.mfiles.mfilesNumbers.`32`
import typingsJapgolly.mfiles.mfilesNumbers.`4`
import typingsJapgolly.mfiles.mfilesNumbers.`64`
import typingsJapgolly.mfiles.mfilesNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`1`
  - typingsJapgolly.mfiles.mfilesNumbers.`2`
  - typingsJapgolly.mfiles.mfilesNumbers.`4`
  - typingsJapgolly.mfiles.mfilesNumbers.`8`
  - typingsJapgolly.mfiles.mfilesNumbers.`16`
  - typingsJapgolly.mfiles.mfilesNumbers.`32`
  - typingsJapgolly.mfiles.mfilesNumbers.`64`
*/
trait MFObjectOperationFlags extends js.Object

object MFObjectOperationFlags {
  @scala.inline
  def ChangeACLInAllVersions: `32` = this.cast(32)
  @scala.inline
  def DisallowNameChange: `4` = this.cast(4)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def RequireChangeSecurityAccess: `8` = this.cast(8)
  @scala.inline
  def RequireEditAccess: `2` = this.cast(2)
  @scala.inline
  def RequireFullAccess: `16` = this.cast(16)
  @scala.inline
  def RequireReadAccess: `1` = this.cast(1)
  @scala.inline
  def RequireSomeAccess: `64` = this.cast(64)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

