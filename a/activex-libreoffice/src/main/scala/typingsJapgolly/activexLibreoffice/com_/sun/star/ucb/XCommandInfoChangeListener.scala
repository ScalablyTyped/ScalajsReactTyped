package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to changing XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeNotifier
  * @version 1.0
  */
trait XCommandInfoChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever changes of a {@link XCommandInfo} shall be propagated.
    * @param evt the event.
    */
  def commandInfoChange(evt: CommandInfoChangeEvent): Unit
}
object XCommandInfoChangeListener {
  
  inline def apply(
    acquire: Callback,
    commandInfoChange: CommandInfoChangeEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCommandInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, commandInfoChange = js.Any.fromFunction1((t0: CommandInfoChangeEvent) => commandInfoChange(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCommandInfoChangeListener]
  }
  
  extension [Self <: XCommandInfoChangeListener](x: Self) {
    
    inline def setCommandInfoChange(value: CommandInfoChangeEvent => Callback): Self = StObject.set(x, "commandInfoChange", js.Any.fromFunction1((t0: CommandInfoChangeEvent) => value(t0).runNow()))
  }
}
