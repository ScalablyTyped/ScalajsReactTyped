package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to be implemented in order to support listener management. */
trait XFilePickerNotifier
  extends StObject
     with XInterface {
  
  /**
    * Interface for clients to register as {@link XFilePickerListener}
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def addFilePickerListener(xListener: XFilePickerListener): Unit
  
  /**
    * Interface for clients to unregister as {@link XFilePickerListener} .
    * @param xListener The {@link XFilePickerListener} interface of the listener that wants to receive events of type {@link FilePickerEvent} . Invalid interf
    */
  def removeFilePickerListener(xListener: XFilePickerListener): Unit
}
object XFilePickerNotifier {
  
  inline def apply(
    acquire: Callback,
    addFilePickerListener: XFilePickerListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeFilePickerListener: XFilePickerListener => Callback
  ): XFilePickerNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addFilePickerListener = js.Any.fromFunction1((t0: XFilePickerListener) => addFilePickerListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFilePickerListener = js.Any.fromFunction1((t0: XFilePickerListener) => removeFilePickerListener(t0).runNow()))
    __obj.asInstanceOf[XFilePickerNotifier]
  }
  
  extension [Self <: XFilePickerNotifier](x: Self) {
    
    inline def setAddFilePickerListener(value: XFilePickerListener => Callback): Self = StObject.set(x, "addFilePickerListener", js.Any.fromFunction1((t0: XFilePickerListener) => value(t0).runNow()))
    
    inline def setRemoveFilePickerListener(value: XFilePickerListener => Callback): Self = StObject.set(x, "removeFilePickerListener", js.Any.fromFunction1((t0: XFilePickerListener) => value(t0).runNow()))
  }
}
