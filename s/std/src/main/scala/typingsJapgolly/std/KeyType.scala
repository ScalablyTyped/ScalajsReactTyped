package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.`private`
  - typingsJapgolly.std.stdStrings.public
  - typingsJapgolly.std.stdStrings.secret
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.std.stdStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsJapgolly.std.stdStrings.public = this.cast("public")
  @scala.inline
  def secret: typingsJapgolly.std.stdStrings.secret = this.cast("secret")
}

