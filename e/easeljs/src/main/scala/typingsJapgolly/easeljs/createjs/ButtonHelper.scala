package typingsJapgolly.easeljs.createjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHelper extends StObject {
  
  // properties
  var downLabel: String | Double
  
  var enabled: Boolean
  
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def getEnabled(): Boolean
  
  var outLabel: String | Double
  
  var overLabel: String | Double
  
  var play: Boolean
  
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def setEnabled(value: Boolean): Unit
  
  var target: MovieClip | Sprite
}
object ButtonHelper {
  
  inline def apply(
    downLabel: String | Double,
    enabled: Boolean,
    getEnabled: CallbackTo[Boolean],
    outLabel: String | Double,
    overLabel: String | Double,
    play: Boolean,
    setEnabled: Boolean => Callback,
    target: MovieClip | Sprite
  ): ButtonHelper = {
    val __obj = js.Dynamic.literal(downLabel = downLabel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getEnabled = getEnabled.toJsFn, outLabel = outLabel.asInstanceOf[js.Any], overLabel = overLabel.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1((t0: Boolean) => setEnabled(t0).runNow()), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonHelper]
  }
  
  extension [Self <: ButtonHelper](x: Self) {
    
    inline def setDownLabel(value: String | Double): Self = StObject.set(x, "downLabel", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnabled", value.toJsFn)
    
    inline def setOutLabel(value: String | Double): Self = StObject.set(x, "outLabel", value.asInstanceOf[js.Any])
    
    inline def setOverLabel(value: String | Double): Self = StObject.set(x, "overLabel", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setTarget(value: MovieClip | Sprite): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
