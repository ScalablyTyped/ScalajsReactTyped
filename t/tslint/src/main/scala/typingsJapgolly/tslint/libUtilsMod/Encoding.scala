package typingsJapgolly.tslint.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tslint.tslintStrings.utf8
  - typingsJapgolly.tslint.tslintStrings.`utf8-bom`
  - typingsJapgolly.tslint.tslintStrings.utf16le
  - typingsJapgolly.tslint.tslintStrings.utf16be
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf16be: typingsJapgolly.tslint.tslintStrings.utf16be = this.cast("utf16be")
  @scala.inline
  def utf16le: typingsJapgolly.tslint.tslintStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typingsJapgolly.tslint.tslintStrings.utf8 = this.cast("utf8")
  @scala.inline
  def `utf8-bom`: typingsJapgolly.tslint.tslintStrings.`utf8-bom` = this.cast("utf8-bom")
}

