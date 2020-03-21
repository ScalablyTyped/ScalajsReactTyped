package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellNumbers.`1`
import typingsJapgolly.activexShell.activexShellNumbers.`2`
import typingsJapgolly.activexShell.activexShellNumbers.`4`
import typingsJapgolly.activexShell.activexShellNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellNumbers.`1`
  - typingsJapgolly.activexShell.activexShellNumbers.`2`
  - typingsJapgolly.activexShell.activexShellNumbers.`4`
  - typingsJapgolly.activexShell.activexShellNumbers.`8`
*/
trait HotkeyModifiers extends js.Object

object HotkeyModifiers {
  @scala.inline
  def ALT: `4` = this.cast(4)
  @scala.inline
  def CTRL: `2` = this.cast(2)
  @scala.inline
  def Extended: `8` = this.cast(8)
  @scala.inline
  def SHIFT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

