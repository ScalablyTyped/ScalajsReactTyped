package typingsJapgolly.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPopoverOpen extends StObject {
  
  var isPopoverOpen: Boolean
  
  var popoverId: String
}
object IsPopoverOpen {
  
  inline def apply(isPopoverOpen: Boolean, popoverId: String): IsPopoverOpen = {
    val __obj = js.Dynamic.literal(isPopoverOpen = isPopoverOpen.asInstanceOf[js.Any], popoverId = popoverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPopoverOpen]
  }
  
  extension [Self <: IsPopoverOpen](x: Self) {
    
    inline def setIsPopoverOpen(value: Boolean): Self = StObject.set(x, "isPopoverOpen", value.asInstanceOf[js.Any])
    
    inline def setPopoverId(value: String): Self = StObject.set(x, "popoverId", value.asInstanceOf[js.Any])
  }
}
