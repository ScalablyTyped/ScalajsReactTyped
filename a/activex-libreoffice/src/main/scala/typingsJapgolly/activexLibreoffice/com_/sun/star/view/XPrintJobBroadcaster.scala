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
  * {@link XPrintJobBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintJobListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJobBroadcaster
  extends StObject
     with XInterface {
  
  /** adds an {@link XPrintJobListener} to be notified about print progress. */
  def addPrintJobListener(xListener: XPrintJobListener): Unit
  
  /** removes an {@link XPrintJobListener} . */
  def removePrintJobListener(xListener: XPrintJobListener): Unit
}
object XPrintJobBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addPrintJobListener: XPrintJobListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePrintJobListener: XPrintJobListener => Callback
  ): XPrintJobBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPrintJobListener = js.Any.fromFunction1((t0: XPrintJobListener) => addPrintJobListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePrintJobListener = js.Any.fromFunction1((t0: XPrintJobListener) => removePrintJobListener(t0).runNow()))
    __obj.asInstanceOf[XPrintJobBroadcaster]
  }
  
  extension [Self <: XPrintJobBroadcaster](x: Self) {
    
    inline def setAddPrintJobListener(value: XPrintJobListener => Callback): Self = StObject.set(x, "addPrintJobListener", js.Any.fromFunction1((t0: XPrintJobListener) => value(t0).runNow()))
    
    inline def setRemovePrintJobListener(value: XPrintJobListener => Callback): Self = StObject.set(x, "removePrintJobListener", js.Any.fromFunction1((t0: XPrintJobListener) => value(t0).runNow()))
  }
}
