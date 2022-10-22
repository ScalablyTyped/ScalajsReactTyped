package typingsJapgolly.agentBase

import typingsJapgolly.agentBase.mod.AgentCallbackCallback
import typingsJapgolly.agentBase.mod.AgentCallbackPromise
import typingsJapgolly.agentBase.mod.ClientRequest
import typingsJapgolly.agentBase.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPromisifyMod {
  
  @JSImport("agent-base/dist/src/promisify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: LegacyCallback): AgentCallbackPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[AgentCallbackPromise]
  
  type LegacyCallback = js.Function3[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    /* fn */ AgentCallbackCallback, 
    Unit
  ]
}
