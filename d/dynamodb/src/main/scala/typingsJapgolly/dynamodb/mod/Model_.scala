package typingsJapgolly.dynamodb.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bunyan.mod.^
import typingsJapgolly.dynamodb.AnonDynamodb
import typingsJapgolly.dynamodb.TypeofModel
import typingsJapgolly.dynamodb.callbackMod.Callback
import typingsJapgolly.dynamodb.modelMod.Model
import typingsJapgolly.dynamodb.modelMod.Model.CreateOperation
import typingsJapgolly.dynamodb.modelMod.Model.DestroyOperation
import typingsJapgolly.dynamodb.modelMod.Model.GetItemsOperation
import typingsJapgolly.dynamodb.modelMod.Model.GetOperation
import typingsJapgolly.dynamodb.modelMod.Model.UpdateOperation
import typingsJapgolly.dynamodb.queryMod.Query
import typingsJapgolly.dynamodb.scanMod.ParallelScan
import typingsJapgolly.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", "Model")
@js.native
class Model_ protected () extends Model {
  def this(attrs: js.Any) = this()
}

@JSImport("dynamodb", "Model")
@js.native
object Model_ extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: CreateOperation = js.native
  val destroy: DestroyOperation = js.native
  val get: GetOperation = js.native
  val getItems: GetItemsOperation = js.native
  val itemFactory: TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
  val log: ^ = js.native
  val update: UpdateOperation = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def config(config: AnonDynamodb): js.Any = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def deleteTable(): js.Promise[_] = js.native
  def deleteTable(callback: Callback): Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def parallelScan(totalSegments: Double): ParallelScan = js.native
  def query(hashKey: String): Query = js.native
  def scan(): Scan = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}

