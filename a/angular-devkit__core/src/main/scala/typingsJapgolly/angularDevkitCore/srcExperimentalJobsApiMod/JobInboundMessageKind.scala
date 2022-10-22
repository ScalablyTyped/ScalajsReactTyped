package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobInboundMessageKind extends StObject
@JSImport("@angular-devkit/core/src/experimental/jobs/api", "JobInboundMessageKind")
@js.native
object JobInboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobInboundMessageKind & String] = js.native
  
  @js.native
  sealed trait Input
    extends StObject
       with JobInboundMessageKind
  /* "in" */ val Input: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Input & String = js.native
  
  @js.native
  sealed trait Ping
    extends StObject
       with JobInboundMessageKind
  /* "ip" */ val Ping: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Ping & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with JobInboundMessageKind
  /* "is" */ val Stop: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Stop & String = js.native
}
