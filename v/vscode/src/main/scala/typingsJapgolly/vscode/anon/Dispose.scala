package typingsJapgolly.vscode.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  def dispose(): Any
}
object Dispose {
  
  inline def apply(dispose: CallbackTo[Any]): Dispose = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setDispose(value: CallbackTo[Any]): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
