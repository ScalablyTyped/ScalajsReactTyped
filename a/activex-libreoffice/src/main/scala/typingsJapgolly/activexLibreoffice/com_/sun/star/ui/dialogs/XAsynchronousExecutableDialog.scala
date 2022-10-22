package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface for an executable dialog in asynchronous mode. */
trait XAsynchronousExecutableDialog
  extends StObject
     with XInterface {
  
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setDialogTitle(aTitle: String): Unit
  
  /**
    * Executes (shows) the dialog and returns immediately.
    * @param xListener This listener will be called when the dialog is closed.
    */
  def startExecuteModal(xListener: XDialogClosedListener): Unit
}
object XAsynchronousExecutableDialog {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDialogTitle: String => Callback,
    startExecuteModal: XDialogClosedListener => Callback
  ): XAsynchronousExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDialogTitle = js.Any.fromFunction1((t0: String) => setDialogTitle(t0).runNow()), startExecuteModal = js.Any.fromFunction1((t0: XDialogClosedListener) => startExecuteModal(t0).runNow()))
    __obj.asInstanceOf[XAsynchronousExecutableDialog]
  }
  
  extension [Self <: XAsynchronousExecutableDialog](x: Self) {
    
    inline def setSetDialogTitle(value: String => Callback): Self = StObject.set(x, "setDialogTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartExecuteModal(value: XDialogClosedListener => Callback): Self = StObject.set(x, "startExecuteModal", js.Any.fromFunction1((t0: XDialogClosedListener) => value(t0).runNow()))
  }
}
