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

/**
  * This is an extension to the interface {@link XSimpleFileAccess2} .
  * @since OOo 1.1.2
  */
trait XSimpleFileAccess3
  extends StObject
     with XSimpleFileAccess2 {
  
  /**
    * Checks if a file is "hidden"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "hidden", false otherwise
    */
  def isHidden(FileURL: String): Boolean
  
  /**
    * Sets the "hidden" of a file according to the boolean parameter, if the actual process has the right to do so and the used operation system supports
    * this operation.
    * @param FileURL URL of the file
    * @param bHidden true; "hidden" flag will be set, false; "hidden" flag will be reset
    */
  def setHidden(FileURL: String, bHidden: Boolean): Unit
}
object XSimpleFileAccess3 {
  
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
    isHidden: String => Boolean,
    isReadOnly: String => Boolean,
    kill: String => Callback,
    move: (String, String) => Callback,
    openFileRead: String => XInputStream,
    openFileReadWrite: String => XStream,
    openFileWrite: String => XOutputStream,
    queryInterface: `type` => Any,
    release: Callback,
    setHidden: (String, Boolean) => Callback,
    setInteractionHandler: XInteractionHandler => Callback,
    setReadOnly: (String, Boolean) => Callback,
    writeFile: (String, XInputStream) => Callback
  ): XSimpleFileAccess3 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, copy = js.Any.fromFunction2((t0: String, t1: String) => (copy(t0, t1)).runNow()), createFolder = js.Any.fromFunction1((t0: String) => createFolder(t0).runNow()), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isHidden = js.Any.fromFunction1(isHidden), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1((t0: String) => kill(t0).runNow()), move = js.Any.fromFunction2((t0: String, t1: String) => (move(t0, t1)).runNow()), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setHidden = js.Any.fromFunction2((t0: String, t1: Boolean) => (setHidden(t0, t1)).runNow()), setInteractionHandler = js.Any.fromFunction1((t0: XInteractionHandler) => setInteractionHandler(t0).runNow()), setReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setReadOnly(t0, t1)).runNow()), writeFile = js.Any.fromFunction2((t0: String, t1: XInputStream) => (writeFile(t0, t1)).runNow()))
    __obj.asInstanceOf[XSimpleFileAccess3]
  }
  
  extension [Self <: XSimpleFileAccess3](x: Self) {
    
    inline def setIsHidden(value: String => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction1(value))
    
    inline def setSetHidden(value: (String, Boolean) => Callback): Self = StObject.set(x, "setHidden", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
