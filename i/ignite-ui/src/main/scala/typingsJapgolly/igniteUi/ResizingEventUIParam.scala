package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizingEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to igScroll.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ResizingEventUIParam {
  
  inline def apply(): ResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizingEventUIParam]
  }
  
  extension [Self <: ResizingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
