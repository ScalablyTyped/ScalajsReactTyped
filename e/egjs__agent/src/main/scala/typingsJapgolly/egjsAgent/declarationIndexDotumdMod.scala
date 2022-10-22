package typingsJapgolly.egjsAgent

import typingsJapgolly.egjsAgent.declarationTypesMod.AgentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationIndexDotumdMod {
  
  @JSImport("@egjs/agent/declaration/index.umd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[AgentInfo]
  inline def default(userAgent: String): AgentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userAgent.asInstanceOf[js.Any]).asInstanceOf[AgentInfo]
}
