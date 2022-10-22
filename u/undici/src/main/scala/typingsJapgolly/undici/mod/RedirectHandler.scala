package typingsJapgolly.undici.mod

import typingsJapgolly.undici.typesDispatcherMod.DispatchHandlers
import typingsJapgolly.undici.typesDispatcherMod.DispatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("undici", "RedirectHandler")
@js.native
open class RedirectHandler protected ()
  extends typingsJapgolly.undici.typesHandlersMod.RedirectHandler {
  def this(
    dispatch: typingsJapgolly.undici.typesDispatcherMod.^,
    maxRedirections: Double,
    opts: DispatchOptions,
    handler: DispatchHandlers
  ) = this()
}
