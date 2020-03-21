package typingsJapgolly.activexScripting.Scripting

import typingsJapgolly.activexScripting.activexScriptingNumbers.`-1`
import typingsJapgolly.activexScripting.activexScriptingNumbers.`-2`
import typingsJapgolly.activexScripting.activexScriptingNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexScripting.activexScriptingNumbers.`0`
  - typingsJapgolly.activexScripting.activexScriptingNumbers.`-2`
  - typingsJapgolly.activexScripting.activexScriptingNumbers.`-1`
*/
trait Tristate extends js.Object

object Tristate {
  @scala.inline
  def TristateFalse: `0` = this.cast(0)
  @scala.inline
  def TristateMixed: `-2` = this.cast(-2)
  @scala.inline
  def TristateTrue: `-1` = this.cast(-1)
  @scala.inline
  def TristateUseDefault: `-2` = this.cast(-2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

