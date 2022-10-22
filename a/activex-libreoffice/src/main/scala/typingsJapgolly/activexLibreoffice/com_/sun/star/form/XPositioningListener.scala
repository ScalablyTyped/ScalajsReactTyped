package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to receive notifications about cursor movements into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} .
  * @deprecated Deprecated
  */
trait XPositioningListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the database form has been positioned on a data record. */
  def positioned(aEvent: EventObject): Unit
}
object XPositioningListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    positioned: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPositioningListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), positioned = js.Any.fromFunction1((t0: EventObject) => positioned(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPositioningListener]
  }
  
  extension [Self <: XPositioningListener](x: Self) {
    
    inline def setPositioned(value: EventObject => Callback): Self = StObject.set(x, "positioned", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
