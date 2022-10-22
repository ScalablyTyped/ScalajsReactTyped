package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryReader extends StObject {
  
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit
}
object DirectoryReader {
  
  inline def apply(
    readEntries: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Callback
  ): DirectoryReader = {
    val __obj = js.Dynamic.literal(readEntries = js.Any.fromFunction2((t0: js.Function1[/* entries */ FileSystemEntry, Unit], t1: js.Function1[/* error */ FileError, Unit]) => (readEntries(t0, t1)).runNow()))
    __obj.asInstanceOf[DirectoryReader]
  }
  
  extension [Self <: DirectoryReader](x: Self) {
    
    inline def setReadEntries(
      value: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Callback
    ): Self = StObject.set(x, "readEntries", js.Any.fromFunction2((t0: js.Function1[/* entries */ FileSystemEntry, Unit], t1: js.Function1[/* error */ FileError, Unit]) => (value(t0, t1)).runNow()))
  }
}
