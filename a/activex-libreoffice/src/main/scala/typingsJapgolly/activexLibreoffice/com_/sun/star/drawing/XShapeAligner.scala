package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to align {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeAligner
  extends StObject
     with XInterface {
  
  /** aligns the specified {@link Shapes} . */
  def alignShapes(aShapes: js.Array[XShapes], eType: Alignment): Unit
}
object XShapeAligner {
  
  inline def apply(
    acquire: Callback,
    alignShapes: (js.Array[XShapes], Alignment) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XShapeAligner = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, alignShapes = js.Any.fromFunction2((t0: js.Array[XShapes], t1: Alignment) => (alignShapes(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XShapeAligner]
  }
  
  extension [Self <: XShapeAligner](x: Self) {
    
    inline def setAlignShapes(value: (js.Array[XShapes], Alignment) => Callback): Self = StObject.set(x, "alignShapes", js.Any.fromFunction2((t0: js.Array[XShapes], t1: Alignment) => (value(t0, t1)).runNow()))
  }
}
