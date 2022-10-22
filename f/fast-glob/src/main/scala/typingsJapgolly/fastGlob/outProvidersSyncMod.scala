package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.outManagersTasksMod.Task
import typingsJapgolly.fastGlob.outTypesMod.Entry
import typingsJapgolly.fastGlob.outTypesMod.EntryItem
import typingsJapgolly.fastGlob.outTypesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersSyncMod {
  
  @JSImport("fast-glob/out/providers/sync", JSImport.Default)
  @js.native
  open class default () extends ProviderSync
  
  @js.native
  trait ProviderSync
    extends typingsJapgolly.fastGlob.outProvidersProviderMod.default[js.Array[EntryItem]] {
    
    /* protected */ var _reader: typingsJapgolly.fastGlob.outReadersSyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
}
