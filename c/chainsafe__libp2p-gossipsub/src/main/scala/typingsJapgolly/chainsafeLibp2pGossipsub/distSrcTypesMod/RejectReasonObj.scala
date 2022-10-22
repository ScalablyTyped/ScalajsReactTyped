package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chainsafeLibp2pGossipsub.anon.ErrorReason
  - typingsJapgolly.chainsafeLibp2pGossipsub.anon.ReasonExclude
*/
trait RejectReasonObj extends StObject
object RejectReasonObj {
  
  inline def ErrorReason(error: ValidateError, reason: Error): typingsJapgolly.chainsafeLibp2pGossipsub.anon.ErrorReason = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chainsafeLibp2pGossipsub.anon.ErrorReason]
  }
  
  inline def ReasonExclude(reason: Exclude[RejectReason, Error]): typingsJapgolly.chainsafeLibp2pGossipsub.anon.ReasonExclude = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chainsafeLibp2pGossipsub.anon.ReasonExclude]
  }
}
