package typingsJapgolly.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jws.jwsStrings.HS256
  - typingsJapgolly.jws.jwsStrings.HS384
  - typingsJapgolly.jws.jwsStrings.HS512
  - typingsJapgolly.jws.jwsStrings.RS256
  - typingsJapgolly.jws.jwsStrings.RS384
  - typingsJapgolly.jws.jwsStrings.RS512
  - typingsJapgolly.jws.jwsStrings.ES256
  - typingsJapgolly.jws.jwsStrings.ES384
  - typingsJapgolly.jws.jwsStrings.ES512
  - typingsJapgolly.jws.jwsStrings.PS256
  - typingsJapgolly.jws.jwsStrings.PS384
  - typingsJapgolly.jws.jwsStrings.PS512
  - typingsJapgolly.jws.jwsStrings.none
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  def ES256: typingsJapgolly.jws.jwsStrings.ES256 = this.cast("ES256")
  @scala.inline
  def ES384: typingsJapgolly.jws.jwsStrings.ES384 = this.cast("ES384")
  @scala.inline
  def ES512: typingsJapgolly.jws.jwsStrings.ES512 = this.cast("ES512")
  @scala.inline
  def HS256: typingsJapgolly.jws.jwsStrings.HS256 = this.cast("HS256")
  @scala.inline
  def HS384: typingsJapgolly.jws.jwsStrings.HS384 = this.cast("HS384")
  @scala.inline
  def HS512: typingsJapgolly.jws.jwsStrings.HS512 = this.cast("HS512")
  @scala.inline
  def PS256: typingsJapgolly.jws.jwsStrings.PS256 = this.cast("PS256")
  @scala.inline
  def PS384: typingsJapgolly.jws.jwsStrings.PS384 = this.cast("PS384")
  @scala.inline
  def PS512: typingsJapgolly.jws.jwsStrings.PS512 = this.cast("PS512")
  @scala.inline
  def RS256: typingsJapgolly.jws.jwsStrings.RS256 = this.cast("RS256")
  @scala.inline
  def RS384: typingsJapgolly.jws.jwsStrings.RS384 = this.cast("RS384")
  @scala.inline
  def RS512: typingsJapgolly.jws.jwsStrings.RS512 = this.cast("RS512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.jws.jwsStrings.none = this.cast("none")
}

