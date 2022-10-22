package typingsJapgolly.mustacheExpress

import org.scalajs.dom.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExpessEngine = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExpessEngine]
  inline def apply(partialsPath: String): ExpessEngine = ^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any]).asInstanceOf[ExpessEngine]
  inline def apply(partialsPath: String, partialsExt: String): ExpessEngine = (^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any], partialsExt.asInstanceOf[js.Any])).asInstanceOf[ExpessEngine]
  inline def apply(partialsPath: Unit, partialsExt: String): ExpessEngine = (^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any], partialsExt.asInstanceOf[js.Any])).asInstanceOf[ExpessEngine]
  
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ExpessEngine extends StObject {
    
    def apply(path: String, options: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var cache: Cache = js.native
  }
  
  type TemplateCache = Cache
}
