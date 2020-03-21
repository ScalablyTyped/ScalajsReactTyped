package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sha1
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sha256
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.md5
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.authenticodeHash256
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.lsHash
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.ctph
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait FileHashType extends js.Object

object FileHashType {
  @scala.inline
  def authenticodeHash256: typingsJapgolly.microsoftGraph.microsoftGraphStrings.authenticodeHash256 = this.cast("authenticodeHash256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ctph: typingsJapgolly.microsoftGraph.microsoftGraphStrings.ctph = this.cast("ctph")
  @scala.inline
  def lsHash: typingsJapgolly.microsoftGraph.microsoftGraphStrings.lsHash = this.cast("lsHash")
  @scala.inline
  def md5: typingsJapgolly.microsoftGraph.microsoftGraphStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sha256 = this.cast("sha256")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

