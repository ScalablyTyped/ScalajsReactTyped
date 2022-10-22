package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessClass extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessClass & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with ProcessClass
  /* 2 */ val Custom: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Custom & Double = js.native
  
  @js.native
  sealed trait Derived
    extends StObject
       with ProcessClass
  /* 1 */ val Derived: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Derived & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ProcessClass
  /* 0 */ val System: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.System & Double = js.native
}
