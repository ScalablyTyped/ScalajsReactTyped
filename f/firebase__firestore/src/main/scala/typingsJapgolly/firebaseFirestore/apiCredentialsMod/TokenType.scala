package typingsJapgolly.firebaseFirestore.apiCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OAuth
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.FirstParty
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def FirstParty: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.FirstParty = this.cast("FirstParty")
  @scala.inline
  def OAuth: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OAuth = this.cast("OAuth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

