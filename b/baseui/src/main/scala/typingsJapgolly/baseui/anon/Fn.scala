package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.layerTypesMod.PopperDataObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  def fn(data: PopperDataObject): Unit
}
object Fn {
  
  inline def apply(fn: PopperDataObject => Callback): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1((t0: PopperDataObject) => fn(t0).runNow()))
    __obj.asInstanceOf[Fn]
  }
  
  extension [Self <: Fn](x: Self) {
    
    inline def setFn(value: PopperDataObject => Callback): Self = StObject.set(x, "fn", js.Any.fromFunction1((t0: PopperDataObject) => value(t0).runNow()))
  }
}
