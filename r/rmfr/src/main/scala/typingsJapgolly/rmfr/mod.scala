package typingsJapgolly.rmfr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(path: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("rmfr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with typingsJapgolly.rimraf.mod.Options
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
