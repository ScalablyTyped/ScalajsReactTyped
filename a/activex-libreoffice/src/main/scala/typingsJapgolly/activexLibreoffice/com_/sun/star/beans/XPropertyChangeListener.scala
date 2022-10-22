package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to receive PropertyChangeEvents whenever a bound property is changed. */
trait XPropertyChangeListener
  extends StObject
     with XEventListener {
  
  /** is called when a bound property is changed. */
  def propertyChange(evt: PropertyChangeEvent): Unit
}
object XPropertyChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    propertyChange: PropertyChangeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertyChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), propertyChange = js.Any.fromFunction1((t0: PropertyChangeEvent) => propertyChange(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertyChangeListener]
  }
  
  extension [Self <: XPropertyChangeListener](x: Self) {
    
    inline def setPropertyChange(value: PropertyChangeEvent => Callback): Self = StObject.set(x, "propertyChange", js.Any.fromFunction1((t0: PropertyChangeEvent) => value(t0).runNow()))
  }
}
