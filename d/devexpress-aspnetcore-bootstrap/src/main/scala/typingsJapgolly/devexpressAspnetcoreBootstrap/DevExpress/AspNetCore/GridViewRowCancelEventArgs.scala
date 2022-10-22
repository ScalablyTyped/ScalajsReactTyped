package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewRowCancelEventArgs
  extends StObject
     with CancelEventArgs {
  
  val visibleIndex: Double
}
object GridViewRowCancelEventArgs {
  
  inline def apply(cancel: Boolean, sender: Control, visibleIndex: Double): GridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewRowCancelEventArgs]
  }
  
  extension [Self <: GridViewRowCancelEventArgs](x: Self) {
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
