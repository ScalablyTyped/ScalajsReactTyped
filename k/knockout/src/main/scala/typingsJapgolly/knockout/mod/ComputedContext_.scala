package typingsJapgolly.knockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedContext_ extends StObject {
  
  def getDependencies(): js.Array[Subscribable_[Any]]
  
  def getDependenciesCount(): Double
  
  def isInitial(): Boolean
  
  def registerDependency(subscribable: Subscribable_[Any]): Unit
}
object ComputedContext_ {
  
  inline def apply(
    getDependencies: CallbackTo[js.Array[Subscribable_[Any]]],
    getDependenciesCount: CallbackTo[Double],
    isInitial: CallbackTo[Boolean],
    registerDependency: Subscribable_[Any] => Callback
  ): ComputedContext_ = {
    val __obj = js.Dynamic.literal(getDependencies = getDependencies.toJsFn, getDependenciesCount = getDependenciesCount.toJsFn, isInitial = isInitial.toJsFn, registerDependency = js.Any.fromFunction1((t0: Subscribable_[Any]) => registerDependency(t0).runNow()))
    __obj.asInstanceOf[ComputedContext_]
  }
  
  extension [Self <: ComputedContext_](x: Self) {
    
    inline def setGetDependencies(value: CallbackTo[js.Array[Subscribable_[Any]]]): Self = StObject.set(x, "getDependencies", value.toJsFn)
    
    inline def setGetDependenciesCount(value: CallbackTo[Double]): Self = StObject.set(x, "getDependenciesCount", value.toJsFn)
    
    inline def setIsInitial(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInitial", value.toJsFn)
    
    inline def setRegisterDependency(value: Subscribable_[Any] => Callback): Self = StObject.set(x, "registerDependency", js.Any.fromFunction1((t0: Subscribable_[Any]) => value(t0).runNow()))
  }
}
