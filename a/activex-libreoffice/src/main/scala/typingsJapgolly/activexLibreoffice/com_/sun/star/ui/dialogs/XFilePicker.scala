package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface for a {@link FilePicker} */
trait XFilePicker
  extends StObject
     with XExecutableDialog {
  
  /**
    * Returns the directory that the file dialog is currently showing or was last showing before closing the dialog with Ok. If the user did cancel the
    * dialog, the returned value is undefined.
    * @returns The directory in URL format, must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    */
  var DisplayDirectory: String
  
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the dialog is in execution mode and a single file is selected the complete URL of this file will be returned.
    *
    * If the dialog is in execution mode and the selected file name is false or any other error occurs an empty sequence will be returned.
    * @deprecated Deprecateduse com::sun::star::ui::dialogs::XFilePicker2::getSelectedFiles instead
    * @returns The complete path of the file or directory currently selected in URL format. This always returns only the first entry of the sequence. ;   **Note
    */
  val Files: SafeArray[String]
  
  /**
    * Returns the directory that the file dialog is currently showing or was last showing before closing the dialog with Ok. If the user did cancel the
    * dialog, the returned value is undefined.
    * @returns The directory in URL format, must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    */
  def getDisplayDirectory(): String
  
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the dialog is in execution mode and a single file is selected the complete URL of this file will be returned.
    *
    * If the dialog is in execution mode and the selected file name is false or any other error occurs an empty sequence will be returned.
    * @deprecated Deprecateduse com::sun::star::ui::dialogs::XFilePicker2::getSelectedFiles instead
    * @returns The complete path of the file or directory currently selected in URL format. This always returns only the first entry of the sequence. ;   **Note
    */
  def getFiles(): SafeArray[String]
  
  /**
    * Sets the default string that appears in the file name box of a {@link FilePicker} .
    * @param aName  Specifies the default file name, displayed when the {@link FilePicker} is shown. The implementation may accept any string, and does not ha
    */
  def setDefaultName(aName: String): Unit
  
  /**
    * Sets the directory that the file dialog initially displays.
    * @param aDirectory Specifies the initial directory in URL format. The given URL must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738
    * @throws com::sun::star::lang::IllegalArgumentException if the URL is invalid (doesn't conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc173
    */
  def setDisplayDirectory(aDirectory: String): Unit
  
  /**
    * Enable/disable multi-selection mode
    *
    * If the multi-selection mode is enabled, multiple files may be selected by the user else only one file selection at a time is possible
    * @param bMode  A value of `TRUE` enables the multi-selection mode.  A value of `FALSE` disables the multi-selection mode, this is the default.
    */
  def setMultiSelectionMode(bMode: Boolean): Unit
}
object XFilePicker {
  
  inline def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    acquire: Callback,
    execute: CallbackTo[Double],
    getDisplayDirectory: CallbackTo[String],
    getFiles: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultName: String => Callback,
    setDisplayDirectory: String => Callback,
    setMultiSelectionMode: Boolean => Callback,
    setTitle: String => Callback
  ): XFilePicker = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], acquire = acquire.toJsFn, execute = execute.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, getFiles = getFiles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultName = js.Any.fromFunction1((t0: String) => setDefaultName(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setMultiSelectionMode = js.Any.fromFunction1((t0: Boolean) => setMultiSelectionMode(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XFilePicker]
  }
  
  extension [Self <: XFilePicker](x: Self) {
    
    inline def setDisplayDirectory(value: String): Self = StObject.set(x, "DisplayDirectory", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: SafeArray[String]): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setGetDisplayDirectory(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayDirectory", value.toJsFn)
    
    inline def setGetFiles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getFiles", value.toJsFn)
    
    inline def setSetDefaultName(value: String => Callback): Self = StObject.set(x, "setDefaultName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDisplayDirectory(value: String => Callback): Self = StObject.set(x, "setDisplayDirectory", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMultiSelectionMode(value: Boolean => Callback): Self = StObject.set(x, "setMultiSelectionMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
