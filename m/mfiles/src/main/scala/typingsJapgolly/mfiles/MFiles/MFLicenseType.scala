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
trait MFLicenseType extends js.Object

object MFLicenseType {
  @scala.inline
  def ConcurrentUserLicense: `2` = this.cast(2)
  @scala.inline
  def NamedUserLicense: `1` = this.cast(1)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def ReadOnlyLicense: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

