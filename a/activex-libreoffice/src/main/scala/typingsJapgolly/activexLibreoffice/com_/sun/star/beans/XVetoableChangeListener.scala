package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to receive PropertyChangeEvents whenever a "constrained" property is changed.
  *
  * You can register an {@link XVetoableChangeListener} with a source object so as to be notified of any constrained property updates.
  */
trait XVetoableChangeListener
  extends StObject
     with XEventListener {
  
  /** gets called when a constrained property is changed. */
  def vetoableChange(aEvent: PropertyChangeEvent): Unit
}
object XVetoableChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    vetoableChange: PropertyChangeEvent => Callback
  ): XVetoableChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, vetoableChange = js.Any.fromFunction1((t0: PropertyChangeEvent) => vetoableChange(t0).runNow()))
    __obj.asInstanceOf[XVetoableChangeListener]
  }
  
  extension [Self <: XVetoableChangeListener](x: Self) {
    
    inline def setVetoableChange(value: PropertyChangeEvent => Callback): Self = StObject.set(x, "vetoableChange", js.Any.fromFunction1((t0: PropertyChangeEvent) => value(t0).runNow()))
  }
}
