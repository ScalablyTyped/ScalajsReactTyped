package typingsJapgolly.reactNativeReanimated.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configs extends StObject {
  
  var configs: Record[String, Any]
  
  def registerConfig(tag: Double, config: Record[String, Any]): Unit
  
  def removeConfig(tag: Double): Unit
  
  def startAnimationForTag(tag: Double, `type`: String, yogaValues: Any): Unit
}
object Configs {
  
  inline def apply(
    configs: Record[String, Any],
    registerConfig: (Double, Record[String, Any]) => Callback,
    removeConfig: Double => Callback,
    startAnimationForTag: (Double, String, Any) => Callback
  ): Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], registerConfig = js.Any.fromFunction2((t0: Double, t1: Record[String, Any]) => (registerConfig(t0, t1)).runNow()), removeConfig = js.Any.fromFunction1((t0: Double) => removeConfig(t0).runNow()), startAnimationForTag = js.Any.fromFunction3((t0: Double, t1: String, t2: Any) => (startAnimationForTag(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Configs]
  }
  
  extension [Self <: Configs](x: Self) {
    
    inline def setConfigs(value: Record[String, Any]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setRegisterConfig(value: (Double, Record[String, Any]) => Callback): Self = StObject.set(x, "registerConfig", js.Any.fromFunction2((t0: Double, t1: Record[String, Any]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveConfig(value: Double => Callback): Self = StObject.set(x, "removeConfig", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartAnimationForTag(value: (Double, String, Any) => Callback): Self = StObject.set(x, "startAnimationForTag", js.Any.fromFunction3((t0: Double, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
