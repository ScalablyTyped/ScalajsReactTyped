package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersAsyncMod {
  
  @JSImport("fast-glob/out/readers/async", JSImport.Default)
  @js.native
  open class default () extends ReaderAsync
  
  @js.native
  trait ReaderAsync
    extends typingsJapgolly.fastGlob.outReadersReaderMod.default[js.Promise[js.Array[Entry]]] {
    
    /* protected */ var _readerStream: typingsJapgolly.fastGlob.outReadersStreamMod.default = js.native
    
    /* protected */ var _walkAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fsWalk.walk */ Any = js.native
  }
}
