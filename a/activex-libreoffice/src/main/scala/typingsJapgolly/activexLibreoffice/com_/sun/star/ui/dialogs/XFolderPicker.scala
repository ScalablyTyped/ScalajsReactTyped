package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a {@link FolderPicker} interface. */
trait XFolderPicker
  extends StObject
     with XExecutableDialog {
  
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  val Directory: String
  
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  var DisplayDirectory: String
  
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  def getDirectory(): String
  
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  def getDisplayDirectory(): String
  
  /**
    * The implementation may optionally show the given text as a description for the user within the dialog, e.g. "Please select a directory". If the client
    * doesn't set a description the dialog may show a default description.
    */
  def setDescription(aDescription: String): Unit
  
  /**
    * Sets the root directory that the {@link FolderPicker} should display. It is not specified which root directory the {@link FolderPicker} chooses if the
    * specified root directory doesn't exist.
    * @param aDirectory Specifies the root directory in url format, conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @throws com::sun::star::lang::IllegalArgumentException if the given url is invalid.
    */
  def setDisplayDirectory(aDirectory: String): Unit
}
object XFolderPicker {
  
  inline def apply(
    Directory: String,
    DisplayDirectory: String,
    acquire: Callback,
    execute: CallbackTo[Double],
    getDirectory: CallbackTo[String],
    getDisplayDirectory: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setDescription: String => Callback,
    setDisplayDirectory: String => Callback,
    setTitle: String => Callback
  ): XFolderPicker = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], acquire = acquire.toJsFn, execute = execute.toJsFn, getDirectory = getDirectory.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XFolderPicker]
  }
  
  extension [Self <: XFolderPicker](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
    
    inline def setDisplayDirectory(value: String): Self = StObject.set(x, "DisplayDirectory", value.asInstanceOf[js.Any])
    
    inline def setGetDirectory(value: CallbackTo[String]): Self = StObject.set(x, "getDirectory", value.toJsFn)
    
    inline def setGetDisplayDirectory(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayDirectory", value.toJsFn)
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDisplayDirectory(value: String => Callback): Self = StObject.set(x, "setDisplayDirectory", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
