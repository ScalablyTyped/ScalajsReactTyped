package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasExtra extends StObject {
  
  def getExtra(name: String): Any
  
  def putExtra(name: String, value: Any): Unit
}
object IHasExtra {
  
  inline def apply(getExtra: String => Any, putExtra: (String, Any) => Callback): IHasExtra = {
    val __obj = js.Dynamic.literal(getExtra = js.Any.fromFunction1(getExtra), putExtra = js.Any.fromFunction2((t0: String, t1: Any) => (putExtra(t0, t1)).runNow()))
    __obj.asInstanceOf[IHasExtra]
  }
  
  extension [Self <: IHasExtra](x: Self) {
    
    inline def setGetExtra(value: String => Any): Self = StObject.set(x, "getExtra", js.Any.fromFunction1(value))
    
    inline def setPutExtra(value: (String, Any) => Callback): Self = StObject.set(x, "putExtra", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
