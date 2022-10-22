package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellClickEventArgs
  extends StObject
     with EventArgs {
  
  val htmlElement: js.Object
  
  val interval: BootstrapTimeInterval
  
  val resource: String
}
object CellClickEventArgs {
  
  inline def apply(htmlElement: js.Object, interval: BootstrapTimeInterval, resource: String, sender: Control): CellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellClickEventArgs]
  }
  
  extension [Self <: CellClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Object): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
