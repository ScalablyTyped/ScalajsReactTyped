package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileWatcher extends StObject {
  
  def close(): Unit
}
object FileWatcher {
  
  inline def apply(close: Callback): FileWatcher = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[FileWatcher]
  }
  
  extension [Self <: FileWatcher](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
