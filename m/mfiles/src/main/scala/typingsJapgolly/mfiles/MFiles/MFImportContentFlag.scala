package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`128`
import typingsJapgolly.mfiles.mfilesNumbers.`16384`
import typingsJapgolly.mfiles.mfilesNumbers.`16`
import typingsJapgolly.mfiles.mfilesNumbers.`1`
import typingsJapgolly.mfiles.mfilesNumbers.`32768`
import typingsJapgolly.mfiles.mfilesNumbers.`32`
import typingsJapgolly.mfiles.mfilesNumbers.`4`
import typingsJapgolly.mfiles.mfilesNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`1`
  - typingsJapgolly.mfiles.mfilesNumbers.`4`
  - typingsJapgolly.mfiles.mfilesNumbers.`16`
  - typingsJapgolly.mfiles.mfilesNumbers.`32`
  - typingsJapgolly.mfiles.mfilesNumbers.`64`
  - typingsJapgolly.mfiles.mfilesNumbers.`128`
  - typingsJapgolly.mfiles.mfilesNumbers.`16384`
  - typingsJapgolly.mfiles.mfilesNumbers.`32768`
*/
trait MFImportContentFlag extends js.Object

object MFImportContentFlag {
  @scala.inline
  def DeleteContentPackage: `4` = this.cast(4)
  @scala.inline
  def DoNotImportObjectDestructions: `64` = this.cast(64)
  @scala.inline
  def ForceNoStructureIdUpdate: `16384` = this.cast(16384)
  @scala.inline
  def ImportCheckoutStates: `16` = this.cast(16)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def OmitDoneFile: `32768` = this.cast(32768)
  @scala.inline
  def ResetExportTimestamps: `32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: `1` = this.cast(1)
  @scala.inline
  def UseNamesAsAliases: `128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

