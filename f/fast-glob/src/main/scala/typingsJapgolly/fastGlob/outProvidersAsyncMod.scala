package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.outManagersTasksMod.Task
import typingsJapgolly.fastGlob.outTypesMod.Entry
import typingsJapgolly.fastGlob.outTypesMod.EntryItem
import typingsJapgolly.fastGlob.outTypesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersAsyncMod {
  
  @JSImport("fast-glob/out/providers/async", JSImport.Default)
  @js.native
  open class default () extends ProviderAsync
  
  @js.native
  trait ProviderAsync
    extends typingsJapgolly.fastGlob.outProvidersProviderMod.default[js.Promise[js.Array[EntryItem]]] {
    
    /* protected */ var _reader: typingsJapgolly.fastGlob.outReadersAsyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Promise[js.Array[Entry]] = js.native
  }
}
