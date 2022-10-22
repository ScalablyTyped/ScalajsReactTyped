package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseQueryOrder & Double] = js.native
  
  @js.native
  sealed trait Ascending
    extends StObject
       with ReleaseQueryOrder
  /* 1 */ val Ascending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseQueryOrder.Ascending & Double = js.native
  
  @js.native
  sealed trait Descending
    extends StObject
       with ReleaseQueryOrder
  /* 0 */ val Descending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseQueryOrder.Descending & Double = js.native
}
