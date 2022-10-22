package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a change of the active sheet. The new active sheet is given with this event.
  * @since OOo 2.0
  */
trait ActivationEvent
  extends StObject
     with EventObject {
  
  /** specifies the new active {@link Spreadsheet} . */
  var ActiveSheet: XSpreadsheet
}
object ActivationEvent {
  
  inline def apply(ActiveSheet: XSpreadsheet, Source: XInterface): ActivationEvent = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationEvent]
  }
  
  extension [Self <: ActivationEvent](x: Self) {
    
    inline def setActiveSheet(value: XSpreadsheet): Self = StObject.set(x, "ActiveSheet", value.asInstanceOf[js.Any])
  }
}
