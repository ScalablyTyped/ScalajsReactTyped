package typingsJapgolly.reactNativeReanimated.mod.Animated

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringUtils extends StObject {
  
  def makeConfigFromBouncinessAndSpeed(prevConfig: SpringConfigWithBouncinessAndSpeed): SpringConfig
  
  def makeConfigFromOrigamiTensionAndFriction(prevConfig: SpringConfigWithOrigamiTensionAndFriction): SpringConfig
  
  def makeDefaultConfig(): SpringConfig
}
object SpringUtils {
  
  inline def apply(
    makeConfigFromBouncinessAndSpeed: SpringConfigWithBouncinessAndSpeed => SpringConfig,
    makeConfigFromOrigamiTensionAndFriction: SpringConfigWithOrigamiTensionAndFriction => SpringConfig,
    makeDefaultConfig: CallbackTo[SpringConfig]
  ): SpringUtils = {
    val __obj = js.Dynamic.literal(makeConfigFromBouncinessAndSpeed = js.Any.fromFunction1(makeConfigFromBouncinessAndSpeed), makeConfigFromOrigamiTensionAndFriction = js.Any.fromFunction1(makeConfigFromOrigamiTensionAndFriction), makeDefaultConfig = makeDefaultConfig.toJsFn)
    __obj.asInstanceOf[SpringUtils]
  }
  
  extension [Self <: SpringUtils](x: Self) {
    
    inline def setMakeConfigFromBouncinessAndSpeed(value: SpringConfigWithBouncinessAndSpeed => SpringConfig): Self = StObject.set(x, "makeConfigFromBouncinessAndSpeed", js.Any.fromFunction1(value))
    
    inline def setMakeConfigFromOrigamiTensionAndFriction(value: SpringConfigWithOrigamiTensionAndFriction => SpringConfig): Self = StObject.set(x, "makeConfigFromOrigamiTensionAndFriction", js.Any.fromFunction1(value))
    
    inline def setMakeDefaultConfig(value: CallbackTo[SpringConfig]): Self = StObject.set(x, "makeDefaultConfig", value.toJsFn)
  }
}
