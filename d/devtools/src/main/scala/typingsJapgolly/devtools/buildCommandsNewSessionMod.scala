package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.Capabilities
import typingsJapgolly.devtools.anon.SessionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsNewSessionMod {
  
  @JSImport("devtools/build/commands/newSession", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasCapabilities: Capabilities): js.Promise[SessionId] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasCapabilities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SessionId]]
}
