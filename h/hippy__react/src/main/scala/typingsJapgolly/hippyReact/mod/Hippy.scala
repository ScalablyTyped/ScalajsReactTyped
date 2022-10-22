package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hippy extends StObject {
  
  var config: HippyReactConfig
  
  // Keep forward comaptatble.
  def regist(): Unit
  
  var rootContainer: Any
  
  def start(): Unit
}
object Hippy {
  
  inline def apply(config: HippyReactConfig, regist: Callback, rootContainer: Any, start: Callback): Hippy = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], regist = regist.toJsFn, rootContainer = rootContainer.asInstanceOf[js.Any], start = start.toJsFn)
    __obj.asInstanceOf[Hippy]
  }
  
  extension [Self <: Hippy](x: Self) {
    
    inline def setConfig(value: HippyReactConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRegist(value: Callback): Self = StObject.set(x, "regist", value.toJsFn)
    
    inline def setRootContainer(value: Any): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
