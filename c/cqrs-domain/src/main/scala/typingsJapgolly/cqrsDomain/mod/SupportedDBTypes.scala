package typingsJapgolly.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cqrsDomain.cqrsDomainStrings.mongodb
  - typingsJapgolly.cqrsDomain.cqrsDomainStrings.redis
  - typingsJapgolly.cqrsDomain.cqrsDomainStrings.tingodb
  - typingsJapgolly.cqrsDomain.cqrsDomainStrings.azuretable
  - typingsJapgolly.cqrsDomain.cqrsDomainStrings.inmemory
*/
trait SupportedDBTypes extends js.Object

object SupportedDBTypes {
  @scala.inline
  def azuretable: typingsJapgolly.cqrsDomain.cqrsDomainStrings.azuretable = this.cast("azuretable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inmemory: typingsJapgolly.cqrsDomain.cqrsDomainStrings.inmemory = this.cast("inmemory")
  @scala.inline
  def mongodb: typingsJapgolly.cqrsDomain.cqrsDomainStrings.mongodb = this.cast("mongodb")
  @scala.inline
  def redis: typingsJapgolly.cqrsDomain.cqrsDomainStrings.redis = this.cast("redis")
  @scala.inline
  def tingodb: typingsJapgolly.cqrsDomain.cqrsDomainStrings.tingodb = this.cast("tingodb")
}

