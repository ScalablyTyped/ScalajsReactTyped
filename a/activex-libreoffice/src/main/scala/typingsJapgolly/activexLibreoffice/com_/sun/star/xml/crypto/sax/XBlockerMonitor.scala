package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Blocker Monitor.
  *
  * This interface is used to manipulate a blocker.
  */
trait XBlockerMonitor
  extends StObject
     with XInterface {
  
  /**
    * Configures the blocker's id.
    * @param id the keeper id of the blocker
    */
  def setBlockerId(id: Double): Unit
}
object XBlockerMonitor {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setBlockerId: Double => Callback
  ): XBlockerMonitor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setBlockerId = js.Any.fromFunction1((t0: Double) => setBlockerId(t0).runNow()))
    __obj.asInstanceOf[XBlockerMonitor]
  }
  
  extension [Self <: XBlockerMonitor](x: Self) {
    
    inline def setSetBlockerId(value: Double => Callback): Self = StObject.set(x, "setBlockerId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
