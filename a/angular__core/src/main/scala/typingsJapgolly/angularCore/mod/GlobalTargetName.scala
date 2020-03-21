package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreStrings.document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreStrings.document_
  - typingsJapgolly.angularCore.angularCoreStrings.window
  - typingsJapgolly.angularCore.angularCoreStrings.body
*/
trait GlobalTargetName extends js.Object

object GlobalTargetName {
  @scala.inline
  def body: typingsJapgolly.angularCore.angularCoreStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: document_ = this.cast("document")
  @scala.inline
  def window: typingsJapgolly.angularCore.angularCoreStrings.window = this.cast("window")
}

