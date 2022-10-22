package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the print progress of an {@link XPrintJob} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintJob} having changed its state
  *
  * .
  * @since OOo 1.1.2
  */
trait PrintJobEvent
  extends StObject
     with EventObject {
  
  var State: PrintableState
}
object PrintJobEvent {
  
  inline def apply(Source: XInterface, State: PrintableState): PrintJobEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobEvent]
  }
  
  extension [Self <: PrintJobEvent](x: Self) {
    
    inline def setState(value: PrintableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
