package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.sign
  - typingsJapgolly.jose.joseStrings.verify
  - typingsJapgolly.jose.joseStrings.encrypt
  - typingsJapgolly.jose.joseStrings.decrypt
  - typingsJapgolly.jose.joseStrings.wrapKey
  - typingsJapgolly.jose.joseStrings.unwrapKey
  - typingsJapgolly.jose.joseStrings.deriveKey
*/
trait keyOperation extends js.Object

object keyOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typingsJapgolly.jose.joseStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveKey: typingsJapgolly.jose.joseStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typingsJapgolly.jose.joseStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typingsJapgolly.jose.joseStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typingsJapgolly.jose.joseStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typingsJapgolly.jose.joseStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typingsJapgolly.jose.joseStrings.wrapKey = this.cast("wrapKey")
}

