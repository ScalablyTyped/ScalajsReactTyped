package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.sha512
  - typingsJapgolly.arangodb.arangodbStrings.sha384
  - typingsJapgolly.arangodb.arangodbStrings.sha256
  - typingsJapgolly.arangodb.arangodbStrings.sha224
  - typingsJapgolly.arangodb.arangodbStrings.sha1
  - typingsJapgolly.arangodb.arangodbStrings.md5
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typingsJapgolly.arangodb.arangodbStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typingsJapgolly.arangodb.arangodbStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsJapgolly.arangodb.arangodbStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsJapgolly.arangodb.arangodbStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsJapgolly.arangodb.arangodbStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsJapgolly.arangodb.arangodbStrings.sha512 = this.cast("sha512")
}

