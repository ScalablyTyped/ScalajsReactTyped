package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateData extends StObject {
  
  var animationToMixTime: Map[Double]
  
  var defaultMix: Double
  
  def getMix(from: Animation, to: Animation): Double
  
  def setMix(fromName: String, toName: String, duration: Double): Unit
  
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit
  
  var skeletonData: SkeletonData
}
object AnimationStateData {
  
  inline def apply(
    animationToMixTime: Map[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Callback,
    setMixWith: (Animation, Animation, Double) => Callback,
    skeletonData: SkeletonData
  ): AnimationStateData = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (setMix(t0, t1, t2)).runNow()), setMixWith = js.Any.fromFunction3((t0: Animation, t1: Animation, t2: Double) => (setMixWith(t0, t1, t2)).runNow()), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateData]
  }
  
  extension [Self <: AnimationStateData](x: Self) {
    
    inline def setAnimationToMixTime(value: Map[Double]): Self = StObject.set(x, "animationToMixTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultMix(value: Double): Self = StObject.set(x, "defaultMix", value.asInstanceOf[js.Any])
    
    inline def setGetMix(value: (Animation, Animation) => Double): Self = StObject.set(x, "getMix", js.Any.fromFunction2(value))
    
    inline def setSetMix(value: (String, String, Double) => Callback): Self = StObject.set(x, "setMix", js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetMixWith(value: (Animation, Animation, Double) => Callback): Self = StObject.set(x, "setMixWith", js.Any.fromFunction3((t0: Animation, t1: Animation, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSkeletonData(value: SkeletonData): Self = StObject.set(x, "skeletonData", value.asInstanceOf[js.Any])
  }
}
