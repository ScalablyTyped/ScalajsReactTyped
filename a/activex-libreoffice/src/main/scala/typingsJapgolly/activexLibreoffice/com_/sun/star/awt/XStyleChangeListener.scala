package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * to be implemented by components which wish to be notified about changes in the style of a component
  * @see XStyleSettings
  */
trait XStyleChangeListener
  extends StObject
     with XEventListener {
  
  def styleSettingsChanged(Event: EventObject): Unit
}
object XStyleChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    styleSettingsChanged: EventObject => Callback
  ): XStyleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, styleSettingsChanged = js.Any.fromFunction1((t0: EventObject) => styleSettingsChanged(t0).runNow()))
    __obj.asInstanceOf[XStyleChangeListener]
  }
  
  extension [Self <: XStyleChangeListener](x: Self) {
    
    inline def setStyleSettingsChanged(value: EventObject => Callback): Self = StObject.set(x, "styleSettingsChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
