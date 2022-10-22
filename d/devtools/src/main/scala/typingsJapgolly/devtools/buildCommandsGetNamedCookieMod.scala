package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.Name
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGetNamedCookieMod {
  
  @JSImport("devtools/build/commands/getNamedCookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasName: Name): js.Promise[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie]]
}
