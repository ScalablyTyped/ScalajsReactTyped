package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackAndroidRevoker extends StObject {
  
  def remove(): Unit
}
object BackAndroidRevoker {
  
  inline def apply(remove: Callback): BackAndroidRevoker = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[BackAndroidRevoker]
  }
  
  extension [Self <: BackAndroidRevoker](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
