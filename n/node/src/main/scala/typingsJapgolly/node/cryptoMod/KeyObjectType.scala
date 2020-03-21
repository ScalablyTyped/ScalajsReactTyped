package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.secret
  - typingsJapgolly.node.nodeStrings.public
  - typingsJapgolly.node.nodeStrings.`private`
*/
trait KeyObjectType extends js.Object

object KeyObjectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.node.nodeStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsJapgolly.node.nodeStrings.public = this.cast("public")
  @scala.inline
  def secret: typingsJapgolly.node.nodeStrings.secret = this.cast("secret")
}

