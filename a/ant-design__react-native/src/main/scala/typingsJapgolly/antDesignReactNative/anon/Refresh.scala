package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refresh extends StObject {
  
  def refresh(): Unit
}
object Refresh {
  
  inline def apply(refresh: Callback): Refresh = {
    val __obj = js.Dynamic.literal(refresh = refresh.toJsFn)
    __obj.asInstanceOf[Refresh]
  }
  
  extension [Self <: Refresh](x: Self) {
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
