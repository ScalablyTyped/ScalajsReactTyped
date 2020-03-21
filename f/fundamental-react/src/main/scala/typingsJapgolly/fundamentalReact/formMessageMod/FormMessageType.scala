package typingsJapgolly.fundamentalReact.formMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.error
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.help
*/
trait FormMessageType extends js.Object

object FormMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def help: typingsJapgolly.fundamentalReact.fundamentalReactStrings.help = this.cast("help")
  @scala.inline
  def warning: typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

