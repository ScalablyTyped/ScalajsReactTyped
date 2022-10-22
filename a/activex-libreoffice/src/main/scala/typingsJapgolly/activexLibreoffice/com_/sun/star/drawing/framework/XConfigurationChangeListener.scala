package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A listener for configuration changes is called when it has been registered at the configuration controller and a configuration change occurs. */
trait XConfigurationChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * The exact time of when a listener is called (before the change takes place, during the change, or when the change has been made) depends on the change
    * event. The order in which listeners are called is the order in which they are registered (First registered, first called.)
    */
  def notifyConfigurationChange(aEvent: ConfigurationChangeEvent): Unit
}
object XConfigurationChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notifyConfigurationChange: ConfigurationChangeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XConfigurationChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyConfigurationChange = js.Any.fromFunction1((t0: ConfigurationChangeEvent) => notifyConfigurationChange(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConfigurationChangeListener]
  }
  
  extension [Self <: XConfigurationChangeListener](x: Self) {
    
    inline def setNotifyConfigurationChange(value: ConfigurationChangeEvent => Callback): Self = StObject.set(x, "notifyConfigurationChange", js.Any.fromFunction1((t0: ConfigurationChangeEvent) => value(t0).runNow()))
  }
}
