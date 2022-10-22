package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobOutboundMessageKind extends StObject
@JSImport("@angular-devkit/core/src/experimental/jobs/api", "JobOutboundMessageKind")
@js.native
object JobOutboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobOutboundMessageKind & String] = js.native
  
  @js.native
  sealed trait ChannelComplete
    extends StObject
       with JobOutboundMessageKind
  /* "cc" */ val ChannelComplete: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelComplete & String = js.native
  
  @js.native
  sealed trait ChannelCreate
    extends StObject
       with JobOutboundMessageKind
  /* "cn" */ val ChannelCreate: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelCreate & String = js.native
  
  @js.native
  sealed trait ChannelError
    extends StObject
       with JobOutboundMessageKind
  /* "ce" */ val ChannelError: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelError & String = js.native
  
  @js.native
  sealed trait ChannelMessage
    extends StObject
       with JobOutboundMessageKind
  /* "cm" */ val ChannelMessage: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelMessage & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with JobOutboundMessageKind
  /* "e" */ val End: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.End & String = js.native
  
  @js.native
  sealed trait OnReady
    extends StObject
       with JobOutboundMessageKind
  /* "c" */ val OnReady: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.OnReady & String = js.native
  
  @js.native
  sealed trait Output
    extends StObject
       with JobOutboundMessageKind
  /* "o" */ val Output: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Output & String = js.native
  
  @js.native
  sealed trait Pong
    extends StObject
       with JobOutboundMessageKind
  /* "p" */ val Pong: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Pong & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with JobOutboundMessageKind
  /* "s" */ val Start: typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Start & String = js.native
}
