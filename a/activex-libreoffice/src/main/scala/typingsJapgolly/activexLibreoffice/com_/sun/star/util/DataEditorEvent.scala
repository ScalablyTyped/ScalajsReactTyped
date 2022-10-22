package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an event broadcasted by an {@link XDataEditor} . */
trait DataEditorEvent
  extends StObject
     with EventObject {
  
  /** specifies the type of the event. */
  var Type: DataEditorEventType
}
object DataEditorEvent {
  
  inline def apply(Source: XInterface, Type: DataEditorEventType): DataEditorEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEditorEvent]
  }
  
  extension [Self <: DataEditorEvent](x: Self) {
    
    inline def setType(value: DataEditorEventType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
