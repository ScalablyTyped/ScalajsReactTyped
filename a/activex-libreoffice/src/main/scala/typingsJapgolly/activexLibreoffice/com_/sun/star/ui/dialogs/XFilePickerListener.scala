package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by a {@link FilePicker} listener.
  *
  * The {@link XFilePickerListener} interface must be implemented by the clients of the {@link FilePicker} service which need to be informed about events
  * while the {@link FilePicker} service is displayed.
  */
trait XFilePickerListener
  extends StObject
     with XEventListener {
  
  /**
    * A client receives this event if the state of a control within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def controlStateChanged(aEvent: FilePickerEvent): Unit
  
  /**
    * A client receives this event if the size of the {@link FilePicker} dialog has changed. If the {@link FilePicker} dialog contains a preview the client
    * may ask for the new dimension of the preview area.
    */
  def dialogSizeChanged(): Unit
  
  /**
    * A client receives this event if the directory selection within the {@link FilePicker} dialog changes.
    * @param aEvent Of type {@link FilePickerEvent} that describes the event.
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def directoryChanged(aEvent: FilePickerEvent): Unit
  
  /**
    * A client receives this event if the file selection within the {@link FilePicker} service dialog changes.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def fileSelectionChanged(aEvent: FilePickerEvent): Unit
  
  /**
    * A client receives this event if the F1 key or the help button was pressed.
    * @param aEvent of type {@link FilePickerEvent} that describes the event
    * @returns A help string which the {@link FilePicker} dialog should use to display a help for a specific control. If the returned string is empty it is unde
    * @see com.sun.star.ui.dialogs.FilePickerEvent
    */
  def helpRequested(aEvent: FilePickerEvent): String
}
object XFilePickerListener {
  
  inline def apply(
    acquire: Callback,
    controlStateChanged: FilePickerEvent => Callback,
    dialogSizeChanged: Callback,
    directoryChanged: FilePickerEvent => Callback,
    disposing: EventObject => Callback,
    fileSelectionChanged: FilePickerEvent => Callback,
    helpRequested: FilePickerEvent => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XFilePickerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, controlStateChanged = js.Any.fromFunction1((t0: FilePickerEvent) => controlStateChanged(t0).runNow()), dialogSizeChanged = dialogSizeChanged.toJsFn, directoryChanged = js.Any.fromFunction1((t0: FilePickerEvent) => directoryChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), fileSelectionChanged = js.Any.fromFunction1((t0: FilePickerEvent) => fileSelectionChanged(t0).runNow()), helpRequested = js.Any.fromFunction1(helpRequested), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFilePickerListener]
  }
  
  extension [Self <: XFilePickerListener](x: Self) {
    
    inline def setControlStateChanged(value: FilePickerEvent => Callback): Self = StObject.set(x, "controlStateChanged", js.Any.fromFunction1((t0: FilePickerEvent) => value(t0).runNow()))
    
    inline def setDialogSizeChanged(value: Callback): Self = StObject.set(x, "dialogSizeChanged", value.toJsFn)
    
    inline def setDirectoryChanged(value: FilePickerEvent => Callback): Self = StObject.set(x, "directoryChanged", js.Any.fromFunction1((t0: FilePickerEvent) => value(t0).runNow()))
    
    inline def setFileSelectionChanged(value: FilePickerEvent => Callback): Self = StObject.set(x, "fileSelectionChanged", js.Any.fromFunction1((t0: FilePickerEvent) => value(t0).runNow()))
    
    inline def setHelpRequested(value: FilePickerEvent => String): Self = StObject.set(x, "helpRequested", js.Any.fromFunction1(value))
  }
}
