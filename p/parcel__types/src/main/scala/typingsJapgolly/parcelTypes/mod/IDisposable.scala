package typingsJapgolly.parcelTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisposable extends StObject {
  
  def dispose(): Any
}
object IDisposable {
  
  inline def apply(dispose: CallbackTo[Any]): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[IDisposable]
  }
  
  extension [Self <: IDisposable](x: Self) {
    
    inline def setDispose(value: CallbackTo[Any]): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
