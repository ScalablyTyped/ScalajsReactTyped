package typingsJapgolly.cacache.enMod

import typingsJapgolly.cacache.CacheObjectsizenumber
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "ls")
@js.native
object ls extends js.Object {
  def apply(cachePath: String): js.Promise[Cache] = js.native
  /**
    * Lists info for all entries currently in the cache as a single large
    * object.
    *
    * This works just like `ls`, except `get.info` entries are returned as
    * `'data'` events on the returned stream.
    */
  def stream(cachePath: String): ReadableStream = js.native
  type Cache = Record[String, CacheObjectsizenumber]
}

