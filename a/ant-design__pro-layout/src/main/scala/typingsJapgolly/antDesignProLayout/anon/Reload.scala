package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reload extends StObject {
  
  def reload(): Unit
}
object Reload {
  
  inline def apply(reload: Callback): Reload = {
    val __obj = js.Dynamic.literal(reload = reload.toJsFn)
    __obj.asInstanceOf[Reload]
  }
  
  extension [Self <: Reload](x: Self) {
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
  }
}
