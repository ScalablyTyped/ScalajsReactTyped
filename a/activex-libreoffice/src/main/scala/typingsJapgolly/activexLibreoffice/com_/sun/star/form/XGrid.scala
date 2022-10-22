package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of setting and retrieving the position of the current cell in a grid control.
  *
  * Note that a grid control does not allow free control over the current row: In such a control, every line represents a row of data of the underlying
  * {@link com.sun.star.form.component.DataForm} . Thus, the **current row** of the grid control always equals the current row of the {@link
  * com.sun.star.form.component.DataForm} , and can be affected only by changing the latter. ;  The current column of a grid control, whoever, can be
  * freely controlled.
  * @deprecated Deprecated
  * @see com.sun.star.form.component.GridControl
  * @see com.sun.star.form.control.GridControl
  */
trait XGrid
  extends StObject
     with XInterface {
  
  /** retrieves the current column position. */
  var CurrentColumnPosition: Double
  
  /** retrieves the current column position. */
  def getCurrentColumnPosition(): Double
  
  /** sets the current column position. */
  def setCurrentColumnPosition(nPos: Double): Unit
}
object XGrid {
  
  inline def apply(
    CurrentColumnPosition: Double,
    acquire: Callback,
    getCurrentColumnPosition: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentColumnPosition: Double => Callback
  ): XGrid = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentColumnPosition = getCurrentColumnPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentColumnPosition = js.Any.fromFunction1((t0: Double) => setCurrentColumnPosition(t0).runNow()))
    __obj.asInstanceOf[XGrid]
  }
  
  extension [Self <: XGrid](x: Self) {
    
    inline def setCurrentColumnPosition(value: Double): Self = StObject.set(x, "CurrentColumnPosition", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentColumnPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentColumnPosition", value.toJsFn)
    
    inline def setSetCurrentColumnPosition(value: Double => Callback): Self = StObject.set(x, "setCurrentColumnPosition", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
