package typingsJapgolly.rsocketCore.rsocketbufferutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.ascii
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.base64
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.hex
  - typingsJapgolly.rsocketCore.rsocketCoreStrings.utf8
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsJapgolly.rsocketCore.rsocketCoreStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsJapgolly.rsocketCore.rsocketCoreStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.rsocketCore.rsocketCoreStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typingsJapgolly.rsocketCore.rsocketCoreStrings.utf8 = this.cast("utf8")
}

