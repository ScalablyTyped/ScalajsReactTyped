package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controls extends StObject {
  
  var controls: Boolean
  
  var `data-hook`: String
  
  var height: Double
  
  var loop: Boolean
  
  var muted: Boolean
  
  def onEnd(): String
  
  def onPause(): String
  
  def onPlay(): String
  
  def onReady(): String
  
  var playing: Boolean
  
  var src: String
  
  var width: Double
}
object Controls {
  
  inline def apply(
    controls: Boolean,
    `data-hook`: String,
    height: Double,
    loop: Boolean,
    muted: Boolean,
    onEnd: CallbackTo[String],
    onPause: CallbackTo[String],
    onPlay: CallbackTo[String],
    onReady: CallbackTo[String],
    playing: Boolean,
    src: String,
    width: Double
  ): Controls = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], onEnd = onEnd.toJsFn, onPause = onPause.toJsFn, onPlay = onPlay.toJsFn, onReady = onReady.toJsFn, playing = playing.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
  
  extension [Self <: Controls](x: Self) {
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: CallbackTo[String]): Self = StObject.set(x, "onEnd", value.toJsFn)
    
    inline def setOnPause(value: CallbackTo[String]): Self = StObject.set(x, "onPause", value.toJsFn)
    
    inline def setOnPlay(value: CallbackTo[String]): Self = StObject.set(x, "onPlay", value.toJsFn)
    
    inline def setOnReady(value: CallbackTo[String]): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
