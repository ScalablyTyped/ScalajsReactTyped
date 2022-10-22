package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IterationReason extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IterationReason & Double] = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with IterationReason
  /* 2 */ val Create: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IterationReason.Create & Double = js.native
  
  @js.native
  sealed trait ForcePush
    extends StObject
       with IterationReason
  /* 1 */ val ForcePush: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IterationReason.ForcePush & Double = js.native
  
  @js.native
  sealed trait Push
    extends StObject
       with IterationReason
  /* 0 */ val Push: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IterationReason.Push & Double = js.native
  
  @js.native
  sealed trait Rebase
    extends StObject
       with IterationReason
  /* 4 */ val Rebase: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IterationReason.Rebase & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with IterationReason
  /* 8 */ val Unknown: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IterationReason.Unknown & Double = js.native
}
