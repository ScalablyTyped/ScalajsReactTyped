package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XWindowArranger
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def arrange(nCommand: Double): Unit
  
  /** @deprecated Deprecated */
  def hasArrangeCommand(nCommand: Double): Boolean
}
object XWindowArranger {
  
  inline def apply(
    acquire: Callback,
    arrange: Double => Callback,
    hasArrangeCommand: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, arrange = js.Any.fromFunction1((t0: Double) => arrange(t0).runNow()), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XWindowArranger]
  }
  
  extension [Self <: XWindowArranger](x: Self) {
    
    inline def setArrange(value: Double => Callback): Self = StObject.set(x, "arrange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setHasArrangeCommand(value: Double => Boolean): Self = StObject.set(x, "hasArrangeCommand", js.Any.fromFunction1(value))
  }
}
