package typingsJapgolly.angularCli.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: Boolean
  
  var files: Set[String]
  
  def unsubscribe(): Unit
}
object Error {
  
  inline def apply(error: Boolean, files: Set[String], unsubscribe: Callback): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Set[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
