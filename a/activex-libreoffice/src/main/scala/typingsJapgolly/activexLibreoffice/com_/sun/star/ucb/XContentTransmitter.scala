package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @author Dirk Voelzke
  * @deprecated Deprecated
  * @see
  * @version 1.0
  */
trait XContentTransmitter
  extends StObject
     with XInterface {
  
  def transmit(Source: String, Destination: String, Flags: Double): Unit
}
object XContentTransmitter {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    transmit: (String, String, Double) => Callback
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, transmit = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (transmit(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XContentTransmitter]
  }
  
  extension [Self <: XContentTransmitter](x: Self) {
    
    inline def setTransmit(value: (String, String, Double) => Callback): Self = StObject.set(x, "transmit", js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
