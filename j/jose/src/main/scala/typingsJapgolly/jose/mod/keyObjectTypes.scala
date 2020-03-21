package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.secret
  - typingsJapgolly.jose.joseStrings.`private`
  - typingsJapgolly.jose.joseStrings.public
*/
trait keyObjectTypes extends js.Object

object keyObjectTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.jose.joseStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsJapgolly.jose.joseStrings.public = this.cast("public")
  @scala.inline
  def secret: typingsJapgolly.jose.joseStrings.secret = this.cast("secret")
}

