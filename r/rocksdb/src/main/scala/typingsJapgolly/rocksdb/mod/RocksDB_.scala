package typingsJapgolly.rocksdb.mod

import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractChainedBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback
import typingsJapgolly.rocksdb.mod.RocksDB.BatchOptions
import typingsJapgolly.rocksdb.mod.RocksDB.Bytes
import typingsJapgolly.rocksdb.mod.RocksDB.DelOptions
import typingsJapgolly.rocksdb.mod.RocksDB.ErrorSizeCallback
import typingsJapgolly.rocksdb.mod.RocksDB.GetOptions
import typingsJapgolly.rocksdb.mod.RocksDB.Iterator
import typingsJapgolly.rocksdb.mod.RocksDB.IteratorOptions
import typingsJapgolly.rocksdb.mod.RocksDB.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RocksDB_ extends AbstractLevelDOWN[Bytes, Bytes] {
  def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
  def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
  def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def destroy(location: String, cb: ErrorCallback): Unit = js.native
  def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
  def getProperty(property: String): String = js.native
  def iterator(options: IteratorOptions): Iterator = js.native
  def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
  def repair(location: String, cb: ErrorCallback): Unit = js.native
}

