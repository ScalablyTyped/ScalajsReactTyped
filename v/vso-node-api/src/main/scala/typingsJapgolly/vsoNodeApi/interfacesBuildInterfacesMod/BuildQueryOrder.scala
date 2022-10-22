package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildQueryOrder")
@js.native
object BuildQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildQueryOrder & Double] = js.native
  
  /**
    * Order by finish time ascending.
    */
  @js.native
  sealed trait FinishTimeAscending
    extends StObject
       with BuildQueryOrder
  /* 2 */ val FinishTimeAscending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.FinishTimeAscending & Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait FinishTimeDescending
    extends StObject
       with BuildQueryOrder
  /* 3 */ val FinishTimeDescending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.FinishTimeDescending & Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeAscending
    extends StObject
       with BuildQueryOrder
  /* 5 */ val QueueTimeAscending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.QueueTimeAscending & Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeDescending
    extends StObject
       with BuildQueryOrder
  /* 4 */ val QueueTimeDescending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.QueueTimeDescending & Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeAscending
    extends StObject
       with BuildQueryOrder
  /* 7 */ val StartTimeAscending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.StartTimeAscending & Double = js.native
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeDescending
    extends StObject
       with BuildQueryOrder
  /* 6 */ val StartTimeDescending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildQueryOrder.StartTimeDescending & Double = js.native
}
