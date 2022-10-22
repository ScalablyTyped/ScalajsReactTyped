package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintableBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintableListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintableListener
  */
trait XPrintableBroadcaster
  extends StObject
     with XInterface {
  
  /** adds an {@link XPrintableListener} to be notified about print progress. */
  def addPrintableListener(xListener: XPrintableListener): Unit
  
  /** removes an {@link XPrintableListener} . */
  def removePrintableListener(xListener: XPrintableListener): Unit
}
object XPrintableBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addPrintableListener: XPrintableListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePrintableListener: XPrintableListener => Callback
  ): XPrintableBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPrintableListener = js.Any.fromFunction1((t0: XPrintableListener) => addPrintableListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePrintableListener = js.Any.fromFunction1((t0: XPrintableListener) => removePrintableListener(t0).runNow()))
    __obj.asInstanceOf[XPrintableBroadcaster]
  }
  
  extension [Self <: XPrintableBroadcaster](x: Self) {
    
    inline def setAddPrintableListener(value: XPrintableListener => Callback): Self = StObject.set(x, "addPrintableListener", js.Any.fromFunction1((t0: XPrintableListener) => value(t0).runNow()))
    
    inline def setRemovePrintableListener(value: XPrintableListener => Callback): Self = StObject.set(x, "removePrintableListener", js.Any.fromFunction1((t0: XPrintableListener) => value(t0).runNow()))
  }
}
