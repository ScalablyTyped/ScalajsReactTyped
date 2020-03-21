package typingsJapgolly.proxyAgent.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConstructor
  extends Instantiable1[
      (/* options */ AgentOptions) | (/* options */ String), 
      typingsJapgolly.proxyAgent.mod.ProxyAgent.ProxyAgent
    ] {
  def apply(options: String): typingsJapgolly.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
  def apply(options: AgentOptions): typingsJapgolly.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
}

