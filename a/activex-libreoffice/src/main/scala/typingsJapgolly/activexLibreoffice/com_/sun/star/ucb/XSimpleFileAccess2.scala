package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is an extension to the interface {@link XSimpleFileAccess} . */
trait XSimpleFileAccess2
  extends StObject
     with XSimpleFileAccess {
  
  /**
    * Overwrites the file content with the given data.
    *
    * If the file does not exist, it will be created.
    * @param FileURL File to write
    * @param data A stream containing the data for the file to be (over-)written
    */
  def writeFile(FileURL: String, data: XInputStream): Unit
}
object XSimpleFileAccess2 {
  
  inline def apply(
    acquire: Callback,
    copy: (String, String) => Callback,
    createFolder: String => Callback,
    exists: String => Boolean,
    getContentType: String => String,
    getDateTimeModified: String => DateTime,
    getFolderContents: (String, Boolean) => SafeArray[String],
    getSize: String => Double,
    isFolder: String => Boolean,
    isReadOnly: String => Boolean,
    kill: String => Callback,
    move: (String, String) => Callback,
    openFileRead: String => XInputStream,
    openFileReadWrite: String => XStream,
    openFileWrite: String => XOutputStream,
    queryInterface: `type` => Any,
    release: Callback,
    setInteractionHandler: XInteractionHandler => Callback,
    setReadOnly: (String, Boolean) => Callback,
    writeFile: (String, XInputStream) => Callback
  ): XSimpleFileAccess2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, copy = js.Any.fromFunction2((t0: String, t1: String) => (copy(t0, t1)).runNow()), createFolder = js.Any.fromFunction1((t0: String) => createFolder(t0).runNow()), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1((t0: String) => kill(t0).runNow()), move = js.Any.fromFunction2((t0: String, t1: String) => (move(t0, t1)).runNow()), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setInteractionHandler = js.Any.fromFunction1((t0: XInteractionHandler) => setInteractionHandler(t0).runNow()), setReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setReadOnly(t0, t1)).runNow()), writeFile = js.Any.fromFunction2((t0: String, t1: XInputStream) => (writeFile(t0, t1)).runNow()))
    __obj.asInstanceOf[XSimpleFileAccess2]
  }
  
  extension [Self <: XSimpleFileAccess2](x: Self) {
    
    inline def setWriteFile(value: (String, XInputStream) => Callback): Self = StObject.set(x, "writeFile", js.Any.fromFunction2((t0: String, t1: XInputStream) => (value(t0, t1)).runNow()))
  }
}
