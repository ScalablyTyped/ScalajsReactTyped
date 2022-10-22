package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEditCustomHighlightingEventArgs
  extends StObject
     with EventArgs {
  
  val filter: String
  
  var highlighting: Any
}
object ListEditCustomHighlightingEventArgs {
  
  inline def apply(filter: String, highlighting: Any, sender: Control): ListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditCustomHighlightingEventArgs]
  }
  
  extension [Self <: ListEditCustomHighlightingEventArgs](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHighlighting(value: Any): Self = StObject.set(x, "highlighting", value.asInstanceOf[js.Any])
  }
}
