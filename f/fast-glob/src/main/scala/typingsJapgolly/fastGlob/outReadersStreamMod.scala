package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.anon.FnCall
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.nodelibFsWalk.outSettingsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersStreamMod {
  
  @JSImport("fast-glob/out/readers/stream", JSImport.Default)
  @js.native
  open class default () extends ReaderStream
  
  @js.native
  trait ReaderStream
    extends typingsJapgolly.fastGlob.outReadersReaderMod.default[Readable] {
    
    /* private */ var _getEntry: Any = js.native
    
    /* private */ var _getStat: Any = js.native
    
    /* protected */ var _stat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fsStat.stat */ Any = js.native
    
    /* protected */ def _walkStream(directory: String): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: typingsJapgolly.nodelibFsWalk.outSettingsMod.default): Readable = js.native
    /* protected */ @JSName("_walkStream")
    var _walkStream_Original: FnCall = js.native
  }
}
