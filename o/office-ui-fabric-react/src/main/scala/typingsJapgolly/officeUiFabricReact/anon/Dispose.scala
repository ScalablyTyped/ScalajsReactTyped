package typingsJapgolly.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  def dispose(): scala.Unit
  
  var key: String
}
object Dispose {
  
  inline def apply(dispose: japgolly.scalajs.react.Callback, key: String): Dispose = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setDispose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
