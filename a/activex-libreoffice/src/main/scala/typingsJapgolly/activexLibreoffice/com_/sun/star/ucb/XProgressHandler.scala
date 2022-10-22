package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Handle a tasks notification that it has made some progress. */
trait XProgressHandler
  extends StObject
     with XInterface {
  
  /** The task notifies the handler that it has finished its current activity. */
  def pop(): Unit
  
  /**
    * The task notifies the handler that it has started some new activity (possibly a sub-activity of another activity already making progress; therefore,
    * these notifications behave in a stack-like manner).
    * @param Status An object representing the new activity. There has to be an agreement between caller and callee of methods {@link XProgressHandler.push()}
    */
  def push(Status: Any): Unit
  
  /**
    * The task notifies the handler that its current activity is making progress.
    * @param Status An object representing the progress made. See the documentation of {@link XProgressHandler.push()} for more information.
    */
  def update(Status: Any): Unit
}
object XProgressHandler {
  
  inline def apply(
    acquire: Callback,
    pop: Callback,
    push: Any => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    update: Any => Callback
  ): XProgressHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
    __obj.asInstanceOf[XProgressHandler]
  }
  
  extension [Self <: XProgressHandler](x: Self) {
    
    inline def setPop(value: Callback): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: Any => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
