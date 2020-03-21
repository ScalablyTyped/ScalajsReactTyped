package typingsJapgolly.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticsearch.elasticsearchStrings.internal
  - typingsJapgolly.elasticsearch.elasticsearchStrings.external
  - typingsJapgolly.elasticsearch.elasticsearchStrings.external_gte
  - typingsJapgolly.elasticsearch.elasticsearchStrings.force
*/
trait VersionType extends js.Object

object VersionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsJapgolly.elasticsearch.elasticsearchStrings.external = this.cast("external")
  @scala.inline
  def external_gte: typingsJapgolly.elasticsearch.elasticsearchStrings.external_gte = this.cast("external_gte")
  @scala.inline
  def force: typingsJapgolly.elasticsearch.elasticsearchStrings.force = this.cast("force")
  @scala.inline
  def internal: typingsJapgolly.elasticsearch.elasticsearchStrings.internal = this.cast("internal")
}

