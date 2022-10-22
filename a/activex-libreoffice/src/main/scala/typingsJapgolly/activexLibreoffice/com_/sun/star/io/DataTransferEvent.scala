package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is broadcast by a filter.
  * @see XDataTransferEventListener
  */
trait DataTransferEvent
  extends StObject
     with EventObject {
  
  /** specifies an occurred exception. */
  var aException: Any
}
object DataTransferEvent {
  
  inline def apply(Source: XInterface, aException: Any): DataTransferEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], aException = aException.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferEvent]
  }
  
  extension [Self <: DataTransferEvent](x: Self) {
    
    inline def setAException(value: Any): Self = StObject.set(x, "aException", value.asInstanceOf[js.Any])
  }
}
