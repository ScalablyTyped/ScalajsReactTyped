package typingsJapgolly.dynamodb.modelMod.Model

import typingsJapgolly.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Model.updateTable")
@js.native
object updateTable extends js.Object {
  def apply(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def apply(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}

