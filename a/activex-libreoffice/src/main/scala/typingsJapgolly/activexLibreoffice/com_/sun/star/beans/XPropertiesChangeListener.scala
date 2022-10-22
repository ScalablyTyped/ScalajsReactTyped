package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events which get fired whenever a bound property is changed. */
trait XPropertiesChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called when bound properties are changed.
    * @param aEvent contains a sequence of {@link PropertyChangeEvent} objects which describe the event source and the properites that have changed.
    */
  def propertiesChange(aEvent: SeqEquiv[PropertyChangeEvent]): Unit
}
object XPropertiesChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    propertiesChange: SeqEquiv[PropertyChangeEvent] => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertiesChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), propertiesChange = js.Any.fromFunction1((t0: SeqEquiv[PropertyChangeEvent]) => propertiesChange(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertiesChangeListener]
  }
  
  extension [Self <: XPropertiesChangeListener](x: Self) {
    
    inline def setPropertiesChange(value: SeqEquiv[PropertyChangeEvent] => Callback): Self = StObject.set(x, "propertiesChange", js.Any.fromFunction1((t0: SeqEquiv[PropertyChangeEvent]) => value(t0).runNow()))
  }
}
