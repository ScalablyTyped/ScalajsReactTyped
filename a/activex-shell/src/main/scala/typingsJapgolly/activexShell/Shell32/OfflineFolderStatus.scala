package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellNumbers.`-1`
import typingsJapgolly.activexShell.activexShellNumbers.`0`
import typingsJapgolly.activexShell.activexShellNumbers.`1`
import typingsJapgolly.activexShell.activexShellNumbers.`2`
import typingsJapgolly.activexShell.activexShellNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for Folder2.OfflineStatus */
// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellNumbers.`3`
  - typingsJapgolly.activexShell.activexShellNumbers.`-1`
  - typingsJapgolly.activexShell.activexShellNumbers.`1`
  - typingsJapgolly.activexShell.activexShellNumbers.`0`
  - typingsJapgolly.activexShell.activexShellNumbers.`2`
*/
trait OfflineFolderStatus extends js.Object

object OfflineFolderStatus {
  @scala.inline
  def OFS_DIRTYCACHE: `3` = this.cast(3)
  @scala.inline
  def OFS_INACTIVE: `-1` = this.cast(-1)
  @scala.inline
  def OFS_OFFLINE: `1` = this.cast(1)
  @scala.inline
  def OFS_ONLINE: `0` = this.cast(0)
  @scala.inline
  def OFS_SERVERBACK: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

