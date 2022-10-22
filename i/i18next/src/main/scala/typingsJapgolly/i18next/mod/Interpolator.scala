package typingsJapgolly.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolator extends StObject {
  
  def init(options: InterpolationOptions, reset: Boolean): Unit
  
  def interpolate(str: String, data: js.Object, lng: String, options: InterpolationOptions): String
  
  def nest(str: String, fc: js.Function1[/* repeated */ Any, Any], options: InterpolationOptions): String
  
  def reset(): Unit
  
  def resetRegExp(): Unit
}
object Interpolator {
  
  inline def apply(
    init: (InterpolationOptions, Boolean) => japgolly.scalajs.react.Callback,
    interpolate: (String, js.Object, String, InterpolationOptions) => String,
    nest: (String, js.Function1[/* repeated */ Any, Any], InterpolationOptions) => String,
    reset: japgolly.scalajs.react.Callback,
    resetRegExp: japgolly.scalajs.react.Callback
  ): Interpolator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2((t0: InterpolationOptions, t1: Boolean) => (init(t0, t1)).runNow()), interpolate = js.Any.fromFunction4(interpolate), nest = js.Any.fromFunction3(nest), reset = reset.toJsFn, resetRegExp = resetRegExp.toJsFn)
    __obj.asInstanceOf[Interpolator]
  }
  
  extension [Self <: Interpolator](x: Self) {
    
    inline def setInit(value: (InterpolationOptions, Boolean) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: InterpolationOptions, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setInterpolate(value: (String, js.Object, String, InterpolationOptions) => String): Self = StObject.set(x, "interpolate", js.Any.fromFunction4(value))
    
    inline def setNest(value: (String, js.Function1[/* repeated */ Any, Any], InterpolationOptions) => String): Self = StObject.set(x, "nest", js.Any.fromFunction3(value))
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetRegExp(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "resetRegExp", value.toJsFn)
  }
}
