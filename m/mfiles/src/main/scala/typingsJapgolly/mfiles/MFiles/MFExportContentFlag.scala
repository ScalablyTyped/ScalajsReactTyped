package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`1024`
import typingsJapgolly.mfiles.mfilesNumbers.`128`
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
  - typingsJapgolly.mfiles.mfilesNumbers.`2`
  - typingsJapgolly.mfiles.mfilesNumbers.`4`
  - typingsJapgolly.mfiles.mfilesNumbers.`8`
  - typingsJapgolly.mfiles.mfilesNumbers.`32`
  - typingsJapgolly.mfiles.mfilesNumbers.`64`
  - typingsJapgolly.mfiles.mfilesNumbers.`128`
  - typingsJapgolly.mfiles.mfilesNumbers.`1024`
*/
trait MFExportContentFlag extends js.Object

object MFExportContentFlag {
  @scala.inline
  def ClearArchivalMarker: `8` = this.cast(8)
  @scala.inline
  def DestroyAfterExport: `4` = this.cast(4)
  @scala.inline
  def ExportInformationOnDestroyedData: `64` = this.cast(64)
  @scala.inline
  def IndicateDropouts: `1024` = this.cast(1024)
  @scala.inline
  def LatestVersionsOnly: `2` = this.cast(2)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def SaveFilesAlsoAsPDFA: `32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: `128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

