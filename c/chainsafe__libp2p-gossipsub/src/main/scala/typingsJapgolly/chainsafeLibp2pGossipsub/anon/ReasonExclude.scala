package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReasonObj
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonExclude
  extends StObject
     with RejectReasonObj {
  
  var reason: Exclude[
    RejectReason, 
    typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error
  ]
}
object ReasonExclude {
  
  inline def apply(
    reason: Exclude[
      RejectReason, 
      typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error
    ]
  ): ReasonExclude = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonExclude]
  }
  
  extension [Self <: ReasonExclude](x: Self) {
    
    inline def setReason(
      value: Exclude[
          RejectReason, 
          typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error
        ]
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
