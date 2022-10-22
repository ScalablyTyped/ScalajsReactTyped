package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileForSaleStatus extends StObject
@JSImport("steam-user", "EPublishedFileForSaleStatus")
@js.native
object EPublishedFileForSaleStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileForSaleStatus & Double] = js.native
  
  @js.native
  sealed trait ApprovedForSale
    extends StObject
       with EPublishedFileForSaleStatus
  /* 2 */ val ApprovedForSale: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.ApprovedForSale & Double = js.native
  
  @js.native
  sealed trait NoLongerForSale
    extends StObject
       with EPublishedFileForSaleStatus
  /* 4 */ val NoLongerForSale: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.NoLongerForSale & Double = js.native
  
  @js.native
  sealed trait NotForSale
    extends StObject
       with EPublishedFileForSaleStatus
  /* 0 */ val NotForSale: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.NotForSale & Double = js.native
  
  @js.native
  sealed trait PendingApproval
    extends StObject
       with EPublishedFileForSaleStatus
  /* 1 */ val PendingApproval: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.PendingApproval & Double = js.native
  
  @js.native
  sealed trait RejectedForSale
    extends StObject
       with EPublishedFileForSaleStatus
  /* 3 */ val RejectedForSale: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.RejectedForSale & Double = js.native
  
  @js.native
  sealed trait TentativeApproval
    extends StObject
       with EPublishedFileForSaleStatus
  /* 5 */ val TentativeApproval: typingsJapgolly.steamUser.mod.EPublishedFileForSaleStatus.TentativeApproval & Double = js.native
}
