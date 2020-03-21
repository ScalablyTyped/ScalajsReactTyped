package typingsJapgolly.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// { level: 'warn+' }
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.seneca.senecaStrings.none
  - typingsJapgolly.seneca.senecaStrings.debugPlussign
  - typingsJapgolly.seneca.senecaStrings.infoPlussign
  - typingsJapgolly.seneca.senecaStrings.warnPlussign
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debugPlussign: typingsJapgolly.seneca.senecaStrings.debugPlussign = this.cast("debug+")
  @scala.inline
  def infoPlussign: typingsJapgolly.seneca.senecaStrings.infoPlussign = this.cast("info+")
  @scala.inline
  def none: typingsJapgolly.seneca.senecaStrings.none = this.cast("none")
  @scala.inline
  def warnPlussign: typingsJapgolly.seneca.senecaStrings.warnPlussign = this.cast("warn+")
}

