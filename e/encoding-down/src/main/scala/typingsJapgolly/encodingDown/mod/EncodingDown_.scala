package typingsJapgolly.encodingDown.mod

import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback
import typingsJapgolly.encodingDown.mod.EncodingDown.BatchOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.ChainedBatch
import typingsJapgolly.encodingDown.mod.EncodingDown.DelOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.GetOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.IteratorOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingDown_[K, V] extends AbstractLevelDOWN[K, V] {
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
  def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
  def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
}

