package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShimmerType extends StObject {
  
  def getMaxTime(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def getMinTime(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def initFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  var maxTime: Double
  
  var minTime: Double
  
  def missFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def popFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def reset(): Unit
  
  def spawnConditions(): Boolean
  
  var spawned: Boolean | PseudoBoolean
  
  var spawnsOnTimer: Boolean
  
  var time: Double
  
  def updateFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
}
object ShimmerType {
  
  inline def apply(
    getMaxTime: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback,
    getMinTime: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback,
    initFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback,
    maxTime: Double,
    minTime: Double,
    missFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback,
    popFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback,
    reset: Callback,
    spawnConditions: CallbackTo[Boolean],
    spawned: Boolean | PseudoBoolean,
    spawnsOnTimer: Boolean,
    time: Double,
    updateFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
  ): ShimmerType = {
    val __obj = js.Dynamic.literal(getMaxTime = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => getMaxTime(t0).runNow()), getMinTime = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => getMinTime(t0).runNow()), initFunc = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => initFunc(t0).runNow()), maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], missFunc = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => missFunc(t0).runNow()), popFunc = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => popFunc(t0).runNow()), reset = reset.toJsFn, spawnConditions = spawnConditions.toJsFn, spawned = spawned.asInstanceOf[js.Any], spawnsOnTimer = spawnsOnTimer.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updateFunc = js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => updateFunc(t0).runNow()))
    __obj.asInstanceOf[ShimmerType]
  }
  
  extension [Self <: ShimmerType](x: Self) {
    
    inline def setGetMaxTime(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "getMaxTime", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
    
    inline def setGetMinTime(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "getMinTime", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
    
    inline def setInitFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "initFunc", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
    
    inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    inline def setMissFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "missFunc", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
    
    inline def setPopFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "popFunc", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSpawnConditions(value: CallbackTo[Boolean]): Self = StObject.set(x, "spawnConditions", value.toJsFn)
    
    inline def setSpawned(value: Boolean | PseudoBoolean): Self = StObject.set(x, "spawned", value.asInstanceOf[js.Any])
    
    inline def setSpawnsOnTimer(value: Boolean): Self = StObject.set(x, "spawnsOnTimer", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUpdateFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Callback
    ): Self = StObject.set(x, "updateFunc", js.Any.fromFunction1((t0: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]) => value(t0).runNow()))
  }
}
