package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionGroupEventArgs
  extends StObject
     with EventArgs {
  
  val group: BootstrapAccordionGroup
}
object AccordionGroupEventArgs {
  
  inline def apply(group: BootstrapAccordionGroup, sender: Control): AccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionGroupEventArgs]
  }
  
  extension [Self <: AccordionGroupEventArgs](x: Self) {
    
    inline def setGroup(value: BootstrapAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
