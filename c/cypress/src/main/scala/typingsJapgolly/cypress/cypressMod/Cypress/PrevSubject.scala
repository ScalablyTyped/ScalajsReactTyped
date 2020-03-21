package typingsJapgolly.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cypress.cypressStrings.optional
  - typingsJapgolly.cypress.cypressStrings.element
  - typingsJapgolly.cypress.cypressStrings.document
  - typingsJapgolly.cypress.cypressStrings.window
*/
trait PrevSubject extends js.Object

object PrevSubject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsJapgolly.cypress.cypressStrings.document = this.cast("document")
  @scala.inline
  def element: typingsJapgolly.cypress.cypressStrings.element = this.cast("element")
  @scala.inline
  def optional: typingsJapgolly.cypress.cypressStrings.optional = this.cast("optional")
  @scala.inline
  def window: typingsJapgolly.cypress.cypressStrings.window = this.cast("window")
}

