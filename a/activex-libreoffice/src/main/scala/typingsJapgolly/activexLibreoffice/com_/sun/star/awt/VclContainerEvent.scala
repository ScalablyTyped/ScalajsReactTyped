package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a container event.
  *
  * These events are provided **only** for notification purposes.
  * @see XVclContainerListener
  */
trait VclContainerEvent
  extends StObject
     with EventObject {
  
  /** returns the child component that was added or removed. */
  var Child: XInterface
}
object VclContainerEvent {
  
  inline def apply(Child: XInterface, Source: XInterface): VclContainerEvent = {
    val __obj = js.Dynamic.literal(Child = Child.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VclContainerEvent]
  }
  
  extension [Self <: VclContainerEvent](x: Self) {
    
    inline def setChild(value: XInterface): Self = StObject.set(x, "Child", value.asInstanceOf[js.Any])
  }
}
