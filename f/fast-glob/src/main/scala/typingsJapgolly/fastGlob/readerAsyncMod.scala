package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.entriesMod.EntryItem
import typingsJapgolly.fastGlob.tasksMod.ITask
import typingsJapgolly.mrmlncReaddirEnhanced.mod.Options
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-async", JSImport.Namespace)
@js.native
object readerAsyncMod extends js.Object {
  @js.native
  trait ReaderAsync
    extends typingsJapgolly.fastGlob.readerMod.default[js.Promise[js.Array[EntryItem]]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typingsJapgolly.fastGlob.fsStreamMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): ReadableStream = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): ReadableStream = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): ReadableStream = js.native
  }
  
  @js.native
  class default () extends ReaderAsync
  
}

