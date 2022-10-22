package typingsJapgolly.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteCallbacksMod {
  
  @JSImport("nodegit/remote-callbacks", "RemoteCallbacks")
  @js.native
  open class RemoteCallbacks () extends StObject {
    
    var certificateCheck: js.UndefOr[js.Function] = js.native
    
    var credentials: js.UndefOr[js.Function] = js.native
    
    var payload: Unit = js.native
    
    var transferProgress: js.UndefOr[js.Function] = js.native
    
    var transport: js.UndefOr[js.Function] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
