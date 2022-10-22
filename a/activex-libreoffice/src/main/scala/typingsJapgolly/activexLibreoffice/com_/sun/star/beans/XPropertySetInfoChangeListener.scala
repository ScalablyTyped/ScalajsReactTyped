package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeNotifier
  */
trait XPropertySetInfoChangeListener
  extends StObject
     with XEventListener {
  
  /** is called whenever changes of a {@link XPropertySetInfo} shall be propagated. */
  def propertySetInfoChange(evt: PropertySetInfoChangeEvent): Unit
}
object XPropertySetInfoChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    propertySetInfoChange: PropertySetInfoChangeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertySetInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), propertySetInfoChange = js.Any.fromFunction1((t0: PropertySetInfoChangeEvent) => propertySetInfoChange(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertySetInfoChangeListener]
  }
  
  extension [Self <: XPropertySetInfoChangeListener](x: Self) {
    
    inline def setPropertySetInfoChange(value: PropertySetInfoChangeEvent => Callback): Self = StObject.set(x, "propertySetInfoChange", js.Any.fromFunction1((t0: PropertySetInfoChangeEvent) => value(t0).runNow()))
  }
}
