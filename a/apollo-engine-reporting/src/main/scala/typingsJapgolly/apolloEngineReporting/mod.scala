package typingsJapgolly.apolloEngineReporting

import typingsJapgolly.apolloEngineReporting.agentMod.EngineReportingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class EngineFederatedTracingExtension[TContext] protected ()
    extends typingsJapgolly.apolloEngineReporting.federatedExtensionMod.EngineFederatedTracingExtension[TContext] {
    def this(options: AnonRewriteError) = this()
  }
  
  @js.native
  class EngineReportingAgent[TContext] ()
    extends typingsJapgolly.apolloEngineReporting.agentMod.EngineReportingAgent[TContext] {
    def this(options: EngineReportingOptions[TContext]) = this()
  }
  
}

