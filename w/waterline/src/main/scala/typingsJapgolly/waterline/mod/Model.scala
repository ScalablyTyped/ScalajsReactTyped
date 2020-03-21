package typingsJapgolly.waterline.mod

import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends ModelInstance {
  def count(criteria: js.Any): WaterlinePromise[Double] = js.native
  def count(criteria: js.Array[_]): WaterlinePromise[Double] = js.native
  def create(params: js.Any): WaterlinePromise[_] = js.native
  def create(params: js.Any, cb: Callback[_]): WaterlinePromise[_] = js.native
  def create(params: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def create(params: js.Array[_], cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Any): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Any, cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_], cb: Callback[js.Array[_]]): WaterlinePromise[js.Array[_]] = js.native
  def find(): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any, cb: Callback[js.Array[_]]): QueryBuilder[js.Array[_]] = js.native
  def findOne(): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  def findOrCreate(): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  def native(cb: js.Function2[/* err */ js.Error, /* collection */ js.Any, Unit]): Unit = js.native
  def query(sqlQuery: String, cb: Callback[_]): Unit = js.native
  def query(sqlQuery: String, data: js.Any, cb: Callback[_]): Unit = js.native
  def stream(criteria: js.Any, writeEnd: js.Any): WritableStream | js.Error = js.native
  def update(criteria: js.Any, changes: js.Any): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Any, cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Array[_], cb: Callback[js.Array[_]]): WaterlinePromise[js.Array[_]] = js.native
}

