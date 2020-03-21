package typingsJapgolly.reduxStorageEngineLocalstorage

import typingsJapgolly.reduxStorage.mod.StorageEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage-engine-localstorage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(key: String): StorageEngine = js.native
  def default(key: String, replacer: Replacer): StorageEngine = js.native
  def default(key: String, replacer: Replacer, reviver: Reviver): StorageEngine = js.native
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Reviver = Replacer
}

