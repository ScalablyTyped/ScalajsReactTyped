package typingsJapgolly.reduxStorage

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.reduxStorage.mod.StorageEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage-decorator-filter", JSImport.Namespace)
@js.native
object reduxStorageDecoratorFilterMod extends js.Object {
  def default(engine: StorageEngine): StorageEngine = js.native
  def default(engine: StorageEngine, whitelist: FilterList): StorageEngine = js.native
  def default(engine: StorageEngine, whitelist: FilterList, blacklist: FilterList): StorageEngine = js.native
  type FilterList = NumberDictionary[String | js.Array[String]]
}

