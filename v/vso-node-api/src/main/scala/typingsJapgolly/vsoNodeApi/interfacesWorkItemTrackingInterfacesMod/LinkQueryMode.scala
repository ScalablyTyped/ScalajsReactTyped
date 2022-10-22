package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkQueryMode extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkQueryMode")
@js.native
object LinkQueryMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkQueryMode & Double] = js.native
  
  /**
    * Returns work items that satisfy the source, only if no linked work item satisfies the link and target criteria.
    */
  @js.native
  sealed trait LinksOneHopDoesNotContain
    extends StObject
       with LinkQueryMode
  /* 3 */ val LinksOneHopDoesNotContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopDoesNotContain & Double = js.native
  
  /**
    * Returns work items that satisfy the source and link criteria, even if no linked work item satisfies the target criteria.
    */
  @js.native
  sealed trait LinksOneHopMayContain
    extends StObject
       with LinkQueryMode
  /* 2 */ val LinksOneHopMayContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMayContain & Double = js.native
  
  /**
    * Returns work items where the source, target, and link criteria are all satisfied.
    */
  @js.native
  sealed trait LinksOneHopMustContain
    extends StObject
       with LinkQueryMode
  /* 1 */ val LinksOneHopMustContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMustContain & Double = js.native
  
  @js.native
  sealed trait LinksRecursiveDoesNotContain
    extends StObject
       with LinkQueryMode
  /* 6 */ val LinksRecursiveDoesNotContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveDoesNotContain & Double = js.native
  
  /**
    * Returns work items a hierarchy of work items that by default satisfy the source
    */
  @js.native
  sealed trait LinksRecursiveMayContain
    extends StObject
       with LinkQueryMode
  /* 5 */ val LinksRecursiveMayContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMayContain & Double = js.native
  
  @js.native
  sealed trait LinksRecursiveMustContain
    extends StObject
       with LinkQueryMode
  /* 4 */ val LinksRecursiveMustContain: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMustContain & Double = js.native
  
  @js.native
  sealed trait WorkItems
    extends StObject
       with LinkQueryMode
  /* 0 */ val WorkItems: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.WorkItems & Double = js.native
}
