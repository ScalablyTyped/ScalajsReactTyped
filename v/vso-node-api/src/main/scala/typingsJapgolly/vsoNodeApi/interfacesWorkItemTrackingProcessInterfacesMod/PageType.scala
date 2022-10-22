package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType & Double] = js.native
  
  @js.native
  sealed trait Attachments
    extends StObject
       with PageType
  /* 4 */ val Attachments: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Attachments & Double = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with PageType
  /* 1 */ val Custom: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Custom & Double = js.native
  
  @js.native
  sealed trait History
    extends StObject
       with PageType
  /* 2 */ val History: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.History & Double = js.native
  
  @js.native
  sealed trait Links
    extends StObject
       with PageType
  /* 3 */ val Links: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Links & Double = js.native
}
