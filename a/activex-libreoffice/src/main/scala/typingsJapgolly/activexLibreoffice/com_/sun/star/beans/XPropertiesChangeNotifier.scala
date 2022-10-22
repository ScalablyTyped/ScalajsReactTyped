package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a notifier for changed property values
  * @see XPropertiesChangeListener
  */
trait XPropertiesChangeNotifier
  extends StObject
     with XInterface {
  
  /** adds an {@link XPropertiesChangeListener} to the specified properties with the specified names. */
  def addPropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit
  
  /** removes an {@link XPropertiesChangeListener} from the listener list. */
  def removePropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit
}
object XPropertiesChangeNotifier {
  
  inline def apply(
    acquire: Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback
  ): XPropertiesChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (removePropertiesChangeListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XPropertiesChangeNotifier]
  }
  
  extension [Self <: XPropertiesChangeNotifier](x: Self) {
    
    inline def setAddPropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Callback): Self = StObject.set(x, "addPropertiesChangeListener", js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setRemovePropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Callback): Self = StObject.set(x, "removePropertiesChangeListener", js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (value(t0, t1)).runNow()))
  }
}
