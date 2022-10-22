package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a text range by method to modify its position. */
trait XMarkingAccess extends StObject {
  
  def invalidateMarkings(nType: Double): Unit
}
object XMarkingAccess {
  
  inline def apply(invalidateMarkings: Double => Callback): XMarkingAccess = {
    val __obj = js.Dynamic.literal(invalidateMarkings = js.Any.fromFunction1((t0: Double) => invalidateMarkings(t0).runNow()))
    __obj.asInstanceOf[XMarkingAccess]
  }
  
  extension [Self <: XMarkingAccess](x: Self) {
    
    inline def setInvalidateMarkings(value: Double => Callback): Self = StObject.set(x, "invalidateMarkings", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
