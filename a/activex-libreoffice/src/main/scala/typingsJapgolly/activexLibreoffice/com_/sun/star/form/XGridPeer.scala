package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the window peer of a GridControl and allows you to set and retrieve the model data.
  *
  * Usually, the columns used are the columns as supplied by the grid control model.
  *
  * You should use this interface only if you know exactly what you are doing. Tampering with the columns of a grid control which is part of a complex
  * form can really hurt ....
  * @deprecated Deprecated
  * @see com.sun.star.awt.XWindowPeer
  * @see com.sun.star.form.component.GridControl
  */
trait XGridPeer
  extends StObject
     with XInterface {
  
  /** retrieves the currently used column definitions of the peer. */
  var Columns: XIndexContainer
  
  /** retrieves the currently used column definitions of the peer. */
  def getColumns(): XIndexContainer
  
  /** sets the column definition for the peer. */
  def setColumns(aColumns: XIndexContainer): Unit
}
object XGridPeer {
  
  inline def apply(
    Columns: XIndexContainer,
    acquire: Callback,
    getColumns: CallbackTo[XIndexContainer],
    queryInterface: `type` => Any,
    release: Callback,
    setColumns: XIndexContainer => Callback
  ): XGridPeer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumns = getColumns.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setColumns = js.Any.fromFunction1((t0: XIndexContainer) => setColumns(t0).runNow()))
    __obj.asInstanceOf[XGridPeer]
  }
  
  extension [Self <: XGridPeer](x: Self) {
    
    inline def setColumns(value: XIndexContainer): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumns(value: CallbackTo[XIndexContainer]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setSetColumns(value: XIndexContainer => Callback): Self = StObject.set(x, "setColumns", js.Any.fromFunction1((t0: XIndexContainer) => value(t0).runNow()))
  }
}
