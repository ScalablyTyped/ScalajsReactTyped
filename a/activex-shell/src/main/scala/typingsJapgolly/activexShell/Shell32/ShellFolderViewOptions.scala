package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellNumbers.`0x00000001`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000002`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000008`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000020`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000040`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000080`
import typingsJapgolly.activexShell.activexShellNumbers.`0x00000200`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000001`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000002`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000008`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000020`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000040`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000080`
  - typingsJapgolly.activexShell.activexShellNumbers.`0x00000200`
*/
trait ShellFolderViewOptions extends js.Object

object ShellFolderViewOptions {
  /** The **Active Desktop – View as Web Page** option is enabled. */
  @scala.inline
  def SFVVO_DESKTOPHTML: `0x00000200` = this.cast(0x00000200)
  /** The **Double-Click to Open an Item** option is enabled. */
  @scala.inline
  def SFVVO_DOUBLECLICKINWEBVIEW: `0x00000080` = this.cast(0x00000080)
  /** The **Show All Files** option is enabled. */
  @scala.inline
  def SFVVO_SHOWALLOBJECTS: `0x00000001` = this.cast(0x00000001)
  /** The **Display Compressed Files and Folders with Alternate Color** option is enabled. */
  @scala.inline
  def SFVVO_SHOWCOMPCOLOR: `0x00000008` = this.cast(0x00000008)
  /** The **Hide extensions for known file types** option is disabled. */
  @scala.inline
  def SFVVO_SHOWEXTENSIONS: `0x00000002` = this.cast(0x00000002)
  /** The **Do Not Show Hidden Files** option is enabled. */
  @scala.inline
  def SFVVO_SHOWSYSFILES: `0x00000020` = this.cast(0x00000020)
  /** The **Classic Style** option is enabled. */
  @scala.inline
  def SFVVO_WIN95CLASSIC: `0x00000040` = this.cast(0x00000040)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

