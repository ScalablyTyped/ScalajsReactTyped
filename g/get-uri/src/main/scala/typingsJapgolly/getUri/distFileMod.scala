package typingsJapgolly.getUri

import typingsJapgolly.getUri.anon.Cache
import typingsJapgolly.getUri.mod.GetUriOptions
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.urlMod.UrlWithStringQuery
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileMod {
  
  @JSImport("get-uri/dist/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasUri: UrlWithStringQuery, opts: FileOptions): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasUri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
  
  type FileOptions = GetUriOptions & ReadStreamOptions & Cache
  
  @js.native
  trait FileReadable extends Readable {
    
    var stat: js.UndefOr[Stats] = js.native
  }
  
  type ReadStreamOptions = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<get-uri.anon.FnCall>[1] */ js.Any, 
    String
  ]
}
