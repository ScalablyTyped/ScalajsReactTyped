package typingsJapgolly.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.overwatchApi.overwatchApiStrings.pc
  - typingsJapgolly.overwatchApi.overwatchApiStrings.xbl
  - typingsJapgolly.overwatchApi.overwatchApiStrings.psn
*/
trait PLATFORM extends js.Object

object PLATFORM {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pc: typingsJapgolly.overwatchApi.overwatchApiStrings.pc = this.cast("pc")
  @scala.inline
  def psn: typingsJapgolly.overwatchApi.overwatchApiStrings.psn = this.cast("psn")
  @scala.inline
  def xbl: typingsJapgolly.overwatchApi.overwatchApiStrings.xbl = this.cast("xbl")
}

