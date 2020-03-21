package typingsJapgolly.avoscloudSdk.mod.Object

import typingsJapgolly.avoscloudSdk.mod.Promise
import typingsJapgolly.avoscloudSdk.mod.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("avoscloud-sdk", "Object")
@js.native
object ^ extends js.Object {
  def destroyAll[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object]): Promise[T] = js.native
  def destroyAll[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object], options: DestroyAllOptions): Promise[T] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object], options: SuccessFailureOptions): Promise[T] = js.native
  def fetchAllIfNeeded[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object], options: SuccessFailureOptions): Promise[T] = js.native
  def saveAll[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object]): Promise[T] = js.native
  def saveAll[T](list: js.Array[typingsJapgolly.avoscloudSdk.mod.Object], options: SaveAllOptions): Promise[T] = js.native
}

