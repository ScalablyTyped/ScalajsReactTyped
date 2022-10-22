package typingsJapgolly.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStateChangeInfo extends StObject {
  
  var viewState: ViewportProps
}
object ViewStateChangeInfo {
  
  inline def apply(viewState: ViewportProps): ViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStateChangeInfo]
  }
  
  extension [Self <: ViewStateChangeInfo](x: Self) {
    
    inline def setViewState(value: ViewportProps): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
