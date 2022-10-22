package typingsJapgolly.iarnaToml

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseAsyncMod {
  
  inline def apply(str: String): js.Promise[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Record[String, Any]]]
  inline def apply(str: String, opts: Options): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  
  @JSImport("@iarna/toml/parse-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** The amount text to parser per pass through the event loop. Defaults to 40kb. */
    var blocksize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlocksize(value: Double): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
      
      inline def setBlocksizeUndefined: Self = StObject.set(x, "blocksize", js.undefined)
    }
  }
}
