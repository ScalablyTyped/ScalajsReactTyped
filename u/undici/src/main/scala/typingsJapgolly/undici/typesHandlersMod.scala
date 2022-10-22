package typingsJapgolly.undici

import typingsJapgolly.undici.typesDispatcherMod.DispatchHandlers
import typingsJapgolly.undici.typesDispatcherMod.DispatchOptions
import typingsJapgolly.undici.typesDispatcherMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHandlersMod {
  
  @JSImport("undici/types/handlers", "DecoratorHandler")
  @js.native
  open class DecoratorHandler protected ()
    extends StObject
       with DispatchHandlers {
    def this(handler: DispatchHandlers) = this()
  }
  
  @JSImport("undici/types/handlers", "RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends StObject
       with DispatchHandlers {
    def this(dispatch: ^, maxRedirections: Double, opts: DispatchOptions, handler: DispatchHandlers) = this()
  }
}
