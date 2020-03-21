package typingsJapgolly.mfiles.MFiles

import typingsJapgolly.mfiles.mfilesNumbers.`0`
import typingsJapgolly.mfiles.mfilesNumbers.`131072`
import typingsJapgolly.mfiles.mfilesNumbers.`262144`
import typingsJapgolly.mfiles.mfilesNumbers.`268435456`
import typingsJapgolly.mfiles.mfilesNumbers.`4`
import typingsJapgolly.mfiles.mfilesNumbers.`536870912`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mfiles.mfilesNumbers.`0`
  - typingsJapgolly.mfiles.mfilesNumbers.`4`
  - typingsJapgolly.mfiles.mfilesNumbers.`131072`
  - typingsJapgolly.mfiles.mfilesNumbers.`262144`
  - typingsJapgolly.mfiles.mfilesNumbers.`268435456`
  - typingsJapgolly.mfiles.mfilesNumbers.`536870912`
*/
trait MFFullTextSearchFlags extends js.Object

object MFFullTextSearchFlags {
  @scala.inline
  def LookInFileData: `536870912` = this.cast(536870912)
  @scala.inline
  def LookInMetaData: `268435456` = this.cast(268435456)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Stemming: `4` = this.cast(4)
  @scala.inline
  def TypeAllWords: `131072` = this.cast(131072)
  @scala.inline
  def TypeAnyWords: `262144` = this.cast(262144)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

