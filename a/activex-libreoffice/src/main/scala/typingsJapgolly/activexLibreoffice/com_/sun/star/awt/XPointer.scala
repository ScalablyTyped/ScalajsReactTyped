package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the type of mouse pointer. */
trait XPointer
  extends StObject
     with XInterface {
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  var Type: Double
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  def getType(): Double
  
  /** selects a {@link SystemPointer} for this mouse pointer. */
  def setType(nType: Double): Unit
}
object XPointer {
  
  inline def apply(
    Type: Double,
    acquire: Callback,
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setType: Double => Callback
  ): XPointer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setType = js.Any.fromFunction1((t0: Double) => setType(t0).runNow()))
    __obj.asInstanceOf[XPointer]
  }
  
  extension [Self <: XPointer](x: Self) {
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetType(value: Double => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
