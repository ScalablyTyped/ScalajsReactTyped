package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides unified interface for {@link FilePicker} service.
  * @since LibreOffice 4.1
  */
trait XFilePicker3
  extends StObject
     with XFilePicker2
     with XFilePickerNotifier
     with XFilterManager
     with XFilePreview
     with XFilterGroupManager
     with XCancellable
     with XComponent
object XFilePicker3 {
  
  inline def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    CurrentFilter: String,
    DisplayDirectory: String,
    Files: SafeArray[String],
    SelectedFiles: SafeArray[String],
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addFilePickerListener: XFilePickerListener => Callback,
    appendFilter: (String, String) => Callback,
    appendFilterGroup: (String, SeqEquiv[StringPair]) => Callback,
    cancel: Callback,
    dispose: Callback,
    execute: CallbackTo[Double],
    getAvailableHeight: CallbackTo[Double],
    getAvailableWidth: CallbackTo[Double],
    getCurrentFilter: CallbackTo[String],
    getDisplayDirectory: CallbackTo[String],
    getFiles: CallbackTo[SafeArray[String]],
    getSelectedFiles: CallbackTo[SafeArray[String]],
    getShowState: CallbackTo[Boolean],
    getSupportedImageFormats: CallbackTo[SafeArray[Double]],
    getTargetColorDepth: CallbackTo[Color],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFilePickerListener: XFilePickerListener => Callback,
    setCurrentFilter: String => Callback,
    setDefaultName: String => Callback,
    setDisplayDirectory: String => Callback,
    setImage: (Double, Any) => Callback,
    setMultiSelectionMode: Boolean => Callback,
    setShowState: Boolean => Boolean,
    setTitle: String => Callback
  ): XFilePicker3 = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], CurrentFilter = CurrentFilter.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], SelectedFiles = SelectedFiles.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFilePickerListener = js.Any.fromFunction1((t0: XFilePickerListener) => addFilePickerListener(t0).runNow()), appendFilter = js.Any.fromFunction2((t0: String, t1: String) => (appendFilter(t0, t1)).runNow()), appendFilterGroup = js.Any.fromFunction2((t0: String, t1: SeqEquiv[StringPair]) => (appendFilterGroup(t0, t1)).runNow()), cancel = cancel.toJsFn, dispose = dispose.toJsFn, execute = execute.toJsFn, getAvailableHeight = getAvailableHeight.toJsFn, getAvailableWidth = getAvailableWidth.toJsFn, getCurrentFilter = getCurrentFilter.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, getFiles = getFiles.toJsFn, getSelectedFiles = getSelectedFiles.toJsFn, getShowState = getShowState.toJsFn, getSupportedImageFormats = getSupportedImageFormats.toJsFn, getTargetColorDepth = getTargetColorDepth.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFilePickerListener = js.Any.fromFunction1((t0: XFilePickerListener) => removeFilePickerListener(t0).runNow()), setCurrentFilter = js.Any.fromFunction1((t0: String) => setCurrentFilter(t0).runNow()), setDefaultName = js.Any.fromFunction1((t0: String) => setDefaultName(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setImage = js.Any.fromFunction2((t0: Double, t1: Any) => (setImage(t0, t1)).runNow()), setMultiSelectionMode = js.Any.fromFunction1((t0: Boolean) => setMultiSelectionMode(t0).runNow()), setShowState = js.Any.fromFunction1(setShowState), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XFilePicker3]
  }
}
