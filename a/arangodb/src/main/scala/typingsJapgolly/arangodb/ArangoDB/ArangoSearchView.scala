package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Views
@js.native
trait ArangoSearchView extends js.Object {
  var _dbName: String = js.native
  var _id: String = js.native
  def name(): String = js.native
  def properties(): ArangoSearchViewProperties = js.native
  def properties(newProperties: ArangoSearchViewPropertiesOptions): ArangoSearchViewProperties = js.native
  def rename(newName: String): Unit = js.native
  def `type`(): ViewType = js.native
}

