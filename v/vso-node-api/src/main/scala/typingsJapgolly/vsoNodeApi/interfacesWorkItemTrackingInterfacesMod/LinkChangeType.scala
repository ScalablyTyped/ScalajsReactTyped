package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkChangeType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkChangeType & Double] = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with LinkChangeType
  /* 0 */ val Create: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkChangeType.Create & Double = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with LinkChangeType
  /* 1 */ val Remove: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkChangeType.Remove & Double = js.native
}
