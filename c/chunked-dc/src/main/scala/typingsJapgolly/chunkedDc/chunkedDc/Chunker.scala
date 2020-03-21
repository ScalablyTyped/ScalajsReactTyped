package typingsJapgolly.chunkedDc.chunkedDc

import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** chunker.ts **/
@js.native
trait Chunker extends IterableIterator[Uint8Array] {
  var hasNext: Boolean = js.native
  def next(): IteratorResult[scala.scalajs.js.typedarray.Uint8Array, _] = js.native
}

