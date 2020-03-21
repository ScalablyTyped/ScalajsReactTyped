package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.managersTasksMod.ITask
import typingsJapgolly.fastGlob.typesEntriesMod.EntryItem
import typingsJapgolly.mrmlncReaddirEnhanced.mod.Options
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader-async", JSImport.Namespace)
@js.native
object providersReaderAsyncMod extends js.Object {
  @js.native
  trait ReaderAsync
    extends typingsJapgolly.fastGlob.providersReaderMod.default[js.Promise[js.Array[EntryItem]]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typingsJapgolly.fastGlob.adaptersFsStreamMod.default = js.native
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

