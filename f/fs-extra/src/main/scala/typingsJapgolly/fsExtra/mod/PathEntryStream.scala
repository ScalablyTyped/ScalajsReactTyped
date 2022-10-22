package typingsJapgolly.fsExtra.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEntryStream extends StObject {
  
  def read(): PathEntry | Null
}
object PathEntryStream {
  
  inline def apply(read: CallbackTo[PathEntry | Null]): PathEntryStream = {
    val __obj = js.Dynamic.literal(read = read.toJsFn)
    __obj.asInstanceOf[PathEntryStream]
  }
  
  extension [Self <: PathEntryStream](x: Self) {
    
    inline def setRead(value: CallbackTo[PathEntry | Null]): Self = StObject.set(x, "read", value.toJsFn)
  }
}
