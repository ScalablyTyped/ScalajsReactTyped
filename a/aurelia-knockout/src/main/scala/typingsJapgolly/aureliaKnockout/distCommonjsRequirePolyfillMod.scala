package typingsJapgolly.aureliaKnockout

import typingsJapgolly.aureliaLoader.mod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsRequirePolyfillMod {
  
  @JSImport("aurelia-knockout/dist/commonjs/require-polyfill", "RequirePolyfill")
  @js.native
  open class RequirePolyfill protected () extends StObject {
    def this(loader: Loader) = this()
    
    var loader: Loader = js.native
    
    /**
      * Registers the `require` function if not set.
      */
    def register(): Unit = js.native
  }
}
