package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFDocListCtrl extends StObject {
  
  def AttachToListingWindow(shellListing: Any): Unit
}
object IMFDocListCtrl {
  
  inline def apply(AttachToListingWindow: Any => Callback): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1((t0: Any) => AttachToListingWindow(t0).runNow()))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
  
  extension [Self <: IMFDocListCtrl](x: Self) {
    
    inline def setAttachToListingWindow(value: Any => Callback): Self = StObject.set(x, "AttachToListingWindow", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
