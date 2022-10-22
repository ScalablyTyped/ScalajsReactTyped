package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on accordion groups.
  */
trait BootstrapClientAccordionGroupCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup
}
object BootstrapClientAccordionGroupCancelEventArgs {
  
  inline def apply(cancel: Boolean, group: BootstrapClientAccordionGroup, processOnServer: Boolean): BootstrapClientAccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupCancelEventArgs]
  }
  
  extension [Self <: BootstrapClientAccordionGroupCancelEventArgs](x: Self) {
    
    inline def setGroup(value: BootstrapClientAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
