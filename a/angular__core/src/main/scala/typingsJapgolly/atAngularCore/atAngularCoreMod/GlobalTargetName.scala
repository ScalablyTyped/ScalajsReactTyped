package typingsJapgolly.atAngularCore.atAngularCoreMod

import typingsJapgolly.atAngularCore.atAngularCoreStrings.document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreStrings.document_
  - typings.atAngularCore.atAngularCoreStrings.window
  - typings.atAngularCore.atAngularCoreStrings.body
*/
trait GlobalTargetName extends js.Object

object GlobalTargetName {
  @scala.inline
  def body: typingsJapgolly.atAngularCore.atAngularCoreStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: document_ = this.cast("document")
  @scala.inline
  def window: typingsJapgolly.atAngularCore.atAngularCoreStrings.window = this.cast("window")
}

