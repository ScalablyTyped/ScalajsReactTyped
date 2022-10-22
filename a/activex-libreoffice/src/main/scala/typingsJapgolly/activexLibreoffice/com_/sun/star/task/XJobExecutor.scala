package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * starts action for any triggered event from outside
  *
  * If somewhere from outside trigger an event on this interface it will be used to find any registered service inside configuration of this executor. If
  * somewhere could be found it will be started and controlled by this instance. After it finish its work it's possible to deactivate further startups or
  * let it run again if a new event will be detected later.
  * @see theJobExecutor
  */
trait XJobExecutor
  extends StObject
     with XInterface {
  
  /**
    * trigger event to start registered jobs
    *
    * Jobs are registered in configuration and will be started by executor automatically, if they are registered for triggered event. The meaning of given
    * string **Event** mustn't be known. Because for the executor it's enough to use it for searching a registered job inside its own configuration. So no
    * special events will be defined here.
    * @param Event describe the event for which jobs can be registered and should be started
    */
  def trigger(Event: String): Unit
}
object XJobExecutor {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, trigger: String => Callback): XJobExecutor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, trigger = js.Any.fromFunction1((t0: String) => trigger(t0).runNow()))
    __obj.asInstanceOf[XJobExecutor]
  }
  
  extension [Self <: XJobExecutor](x: Self) {
    
    inline def setTrigger(value: String => Callback): Self = StObject.set(x, "trigger", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
