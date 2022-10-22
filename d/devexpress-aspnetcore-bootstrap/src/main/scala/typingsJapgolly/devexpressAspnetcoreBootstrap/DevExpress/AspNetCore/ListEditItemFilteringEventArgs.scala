package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEditItemFilteringEventArgs
  extends StObject
     with EventArgs {
  
  val filter: String
  
  var isFit: Boolean
  
  val item: BootstrapListBoxItem
}
object ListEditItemFilteringEventArgs {
  
  inline def apply(filter: String, isFit: Boolean, item: BootstrapListBoxItem, sender: Control): ListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemFilteringEventArgs]
  }
  
  extension [Self <: ListEditItemFilteringEventArgs](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setIsFit(value: Boolean): Self = StObject.set(x, "isFit", value.asInstanceOf[js.Any])
    
    inline def setItem(value: BootstrapListBoxItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
