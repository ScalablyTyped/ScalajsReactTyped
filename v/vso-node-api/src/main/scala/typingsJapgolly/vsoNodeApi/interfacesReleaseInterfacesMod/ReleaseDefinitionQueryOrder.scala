package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder & Double] = js.native
  
  @js.native
  sealed trait IdAscending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 0 */ val IdAscending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdAscending & Double = js.native
  
  @js.native
  sealed trait IdDescending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 1 */ val IdDescending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdDescending & Double = js.native
  
  @js.native
  sealed trait NameAscending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 2 */ val NameAscending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameAscending & Double = js.native
  
  @js.native
  sealed trait NameDescending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 3 */ val NameDescending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameDescending & Double = js.native
}
