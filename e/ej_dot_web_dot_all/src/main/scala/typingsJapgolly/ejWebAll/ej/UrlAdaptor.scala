package typingsJapgolly.ejWebAll.ej

import typingsJapgolly.ejWebAll.AnonContentType
import typingsJapgolly.ejWebAll.AnonData
import typingsJapgolly.ejWebAll.AnonType
import typingsJapgolly.ejWebAll.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.UrlAdaptor")
@js.native
class UrlAdaptor () extends Adaptor {
  def batchRequest(dm: DataManager, changes: Changes, e: js.Any): Unit = js.native
  def beforeSend(dm: DataManager, request: js.Any): Unit = js.native
  def beforeSend(dm: DataManager, request: js.Any, settings: js.Any): Unit = js.native
  def getFiltersFrom(data: js.Any, query: Query): Predicate = js.native
  def insert(dm: DataManager, data: js.Any, tableName: String): AnonData = js.native
  def onAggregates(e: js.Any): Unit = js.native
  def onGroup(e: js.Any): Unit = js.native
  def processQuery(dm: DataManager, query: Query, hierarchyFilters: js.Any): AnonContentType = js.native
  def remove(dm: DataManager, keyField: String, value: js.Any, tableName: String): AnonType = js.native
  def update(dm: DataManager, keyField: String, value: js.Any, tableName: String): AnonUrl = js.native
}

