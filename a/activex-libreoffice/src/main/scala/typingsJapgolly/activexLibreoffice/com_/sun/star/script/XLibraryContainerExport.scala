package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XLibraryContainer} to provide functionality to store a library to a location represented by a URL. */
trait XLibraryContainerExport
  extends StObject
     with XInterface {
  
  /**
    * Exports a library specified by Name to the location specified by the passed URL string.
    *
    * An interaction handler can be passed to be used for internal ucb operations. Exceptions not processed by this handler will be passed as {@link
    * com.sun.star.uno.Exception} . If this parameter is null this applies to all exceptions thrown by ucb.
    * @see com.sun.star.task.InteractionHandler If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def exportLibrary(Name: String, URL: String, Handler: XInteractionHandler): Unit
}
object XLibraryContainerExport {
  
  inline def apply(
    acquire: Callback,
    exportLibrary: (String, String, XInteractionHandler) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLibraryContainerExport = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, exportLibrary = js.Any.fromFunction3((t0: String, t1: String, t2: XInteractionHandler) => (exportLibrary(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLibraryContainerExport]
  }
  
  extension [Self <: XLibraryContainerExport](x: Self) {
    
    inline def setExportLibrary(value: (String, String, XInteractionHandler) => Callback): Self = StObject.set(x, "exportLibrary", js.Any.fromFunction3((t0: String, t1: String, t2: XInteractionHandler) => (value(t0, t1, t2)).runNow()))
  }
}
