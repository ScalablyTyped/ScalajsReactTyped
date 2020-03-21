package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.entriesMod.Entry
import typingsJapgolly.fastGlob.entriesMod.EntryItem
import typingsJapgolly.fastGlob.tasksMod.ITask
import typingsJapgolly.mrmlncReaddirEnhanced.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-sync", JSImport.Namespace)
@js.native
object readerSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typingsJapgolly.fastGlob.readerMod.default[js.Array[EntryItem]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typingsJapgolly.fastGlob.fsSyncMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): js.Array[Entry] = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): js.Array[Entry] = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): js.Array[Entry] = js.native
  }
  
  @js.native
  class default () extends ReaderSync
  
}

