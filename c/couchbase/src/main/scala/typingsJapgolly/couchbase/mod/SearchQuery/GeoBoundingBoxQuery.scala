package typingsJapgolly.couchbase.mod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SearchQuery.GeoBoundingBoxQuery")
@js.native
abstract class GeoBoundingBoxQuery () extends Query {
  /**
    * Defines the amount to boost the query.
    * @param boost Amount to boost the query.
    */
  def boost(boost: Double): this.type = js.native
  /**
    * Specifies the field to query.
    * @param field The field to query.
    */
  def field(field: String): this.type = js.native
}

