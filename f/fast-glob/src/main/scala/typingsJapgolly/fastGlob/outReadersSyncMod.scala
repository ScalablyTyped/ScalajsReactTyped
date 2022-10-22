package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.anon.FnCallDirectoryOptionsOrSettings
import typingsJapgolly.fastGlob.anon.FnCallPathOptionsOrSettings
import typingsJapgolly.fastGlob.outTypesMod.Entry
import typingsJapgolly.nodelibFsStat.outSettingsMod.Options
import typingsJapgolly.nodelibFsStat.outTypesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersSyncMod {
  
  @JSImport("fast-glob/out/readers/sync", JSImport.Default)
  @js.native
  open class default () extends ReaderSync
  
  @js.native
  trait ReaderSync
    extends typingsJapgolly.fastGlob.outReadersReaderMod.default[js.Array[Entry]] {
    
    /* private */ var _getEntry: Any = js.native
    
    /* private */ var _getStat: Any = js.native
    
    /* protected */ def _statSync(path: String): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: Options): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: typingsJapgolly.nodelibFsStat.outSettingsMod.default): Stats = js.native
    /* protected */ @JSName("_statSync")
    var _statSync_Original: FnCallPathOptionsOrSettings = js.native
    
    /* protected */ def _walkSync(directory: String): js.Array[typingsJapgolly.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typingsJapgolly.nodelibFsWalk.outSettingsMod.Options): js.Array[typingsJapgolly.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default): js.Array[typingsJapgolly.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ @JSName("_walkSync")
    var _walkSync_Original: FnCallDirectoryOptionsOrSettings = js.native
  }
}
