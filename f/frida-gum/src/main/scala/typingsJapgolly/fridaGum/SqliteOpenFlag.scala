package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.readonly
  - typingsJapgolly.fridaGum.fridaGumStrings.readwrite
  - typingsJapgolly.fridaGum.fridaGumStrings.create
*/
trait SqliteOpenFlag extends js.Object

object SqliteOpenFlag {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.fridaGum.fridaGumStrings.create = this.cast("create")
  @scala.inline
  def readonly: typingsJapgolly.fridaGum.fridaGumStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typingsJapgolly.fridaGum.fridaGumStrings.readwrite = this.cast("readwrite")
}

