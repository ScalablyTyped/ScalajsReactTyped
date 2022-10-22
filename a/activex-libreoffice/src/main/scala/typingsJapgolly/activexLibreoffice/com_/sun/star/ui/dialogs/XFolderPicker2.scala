package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style {@link FolderPicker} service to implement.
  * @since LibreOffice 4.0
  */
trait XFolderPicker2
  extends StObject
     with XFolderPicker
     with XCancellable
object XFolderPicker2 {
  
  inline def apply(
    Directory: String,
    DisplayDirectory: String,
    acquire: Callback,
    cancel: Callback,
    execute: CallbackTo[Double],
    getDirectory: CallbackTo[String],
    getDisplayDirectory: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setDescription: String => Callback,
    setDisplayDirectory: String => Callback,
    setTitle: String => Callback
  ): XFolderPicker2 = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, execute = execute.toJsFn, getDirectory = getDirectory.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XFolderPicker2]
  }
}
