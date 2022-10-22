package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends file picker interface to workaround some design problems. */
trait XFilePicker2
  extends StObject
     with XFilePicker {
  
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the user closed the dialog with OK a list of all selected files will be returned.
    *
    *  Instead to the method {@link getFiles()} of base interface {@link XFilePicker} the new method return full qualified URLs for every selected file.
    * @returns A list of all selected file as complete URLs.  ;   **Notes for the implementation of a FileSave dialog:** If there exists a checkbox "Automatic F
    */
  val SelectedFiles: SafeArray[String]
  
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the user closed the dialog with OK a list of all selected files will be returned.
    *
    *  Instead to the method {@link getFiles()} of base interface {@link XFilePicker} the new method return full qualified URLs for every selected file.
    * @returns A list of all selected file as complete URLs.  ;   **Notes for the implementation of a FileSave dialog:** If there exists a checkbox "Automatic F
    */
  def getSelectedFiles(): SafeArray[String]
}
object XFilePicker2 {
  
  inline def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    SelectedFiles: SafeArray[String],
    acquire: Callback,
    execute: CallbackTo[Double],
    getDisplayDirectory: CallbackTo[String],
    getFiles: CallbackTo[SafeArray[String]],
    getSelectedFiles: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultName: String => Callback,
    setDisplayDirectory: String => Callback,
    setMultiSelectionMode: Boolean => Callback,
    setTitle: String => Callback
  ): XFilePicker2 = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], SelectedFiles = SelectedFiles.asInstanceOf[js.Any], acquire = acquire.toJsFn, execute = execute.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, getFiles = getFiles.toJsFn, getSelectedFiles = getSelectedFiles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultName = js.Any.fromFunction1((t0: String) => setDefaultName(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setMultiSelectionMode = js.Any.fromFunction1((t0: Boolean) => setMultiSelectionMode(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XFilePicker2]
  }
  
  extension [Self <: XFilePicker2](x: Self) {
    
    inline def setGetSelectedFiles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSelectedFiles", value.toJsFn)
    
    inline def setSelectedFiles(value: SafeArray[String]): Self = StObject.set(x, "SelectedFiles", value.asInstanceOf[js.Any])
  }
}
