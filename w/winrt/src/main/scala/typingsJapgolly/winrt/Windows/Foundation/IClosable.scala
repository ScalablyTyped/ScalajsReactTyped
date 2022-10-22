package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClosable extends StObject {
  
  def close(): Unit
}
object IClosable {
  
  inline def apply(close: Callback): IClosable = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[IClosable]
  }
  
  extension [Self <: IClosable](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
