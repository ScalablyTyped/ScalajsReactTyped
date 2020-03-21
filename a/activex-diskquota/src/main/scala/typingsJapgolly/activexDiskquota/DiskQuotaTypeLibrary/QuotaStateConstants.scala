package typingsJapgolly.activexDiskquota.DiskQuotaTypeLibrary

import typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`0`
import typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`1`
import typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`0`
  - typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`2`
  - typingsJapgolly.activexDiskquota.activexDiskquotaNumbers.`1`
*/
trait QuotaStateConstants extends js.Object

object QuotaStateConstants {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dqStateDisable: `0` = this.cast(0)
  @scala.inline
  def dqStateEnforce: `2` = this.cast(2)
  @scala.inline
  def dqStateTrack: `1` = this.cast(1)
}

