package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.outManagersTasksMod.Task
import typingsJapgolly.fastGlob.outTypesMod.ReaderOptions
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersStreamMod {
  
  @JSImport("fast-glob/out/providers/stream", JSImport.Default)
  @js.native
  open class default () extends ProviderStream
  
  @js.native
  trait ProviderStream
    extends typingsJapgolly.fastGlob.outProvidersProviderMod.default[Readable] {
    
    /* protected */ var _reader: typingsJapgolly.fastGlob.outReadersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
