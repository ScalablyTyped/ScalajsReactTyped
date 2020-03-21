package typingsJapgolly.breeze.breeze

import typingsJapgolly.breeze.AnonDataService
import typingsJapgolly.breeze.AnonInterfaceName
import typingsJapgolly.breeze.AnonResourceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataServiceAdapter")
@js.native
class DataServiceAdapter () extends js.Object {
  var JsonResultsAdapter: typingsJapgolly.breeze.breeze.JsonResultsAdapter = js.native
  def checkForRecomposition(interfaceInitializedArgs: AnonInterfaceName): Unit = js.native
  def executeQuery(mappingContext: AnonDataService): js.Promise[_] = js.native
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  def initialize(): Unit = js.native
  def saveChanges(saveContext: AnonResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}

