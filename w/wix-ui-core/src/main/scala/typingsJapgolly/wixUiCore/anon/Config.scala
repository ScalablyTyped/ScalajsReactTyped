package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var controls: Boolean
  
  var fillAllSpace: Boolean
  
  var loop: Boolean
  
  var muted: Boolean
  
  def onDuration(): Any
  
  def onEnded(): Any
  
  def onError(): Any
  
  def onFirstEnded(): Any
  
  def onFirstPlay(): Any
  
  def onInit(): Any
  
  def onPause(): Any
  
  def onPlay(): Any
  
  def onProgress(): Any
  
  def onReady(): Any
  
  var showTitle: Boolean
  
  var volume: Double
}
object Config {
  
  inline def apply(
    controls: Boolean,
    fillAllSpace: Boolean,
    loop: Boolean,
    muted: Boolean,
    onDuration: CallbackTo[Any],
    onEnded: CallbackTo[Any],
    onError: CallbackTo[Any],
    onFirstEnded: CallbackTo[Any],
    onFirstPlay: CallbackTo[Any],
    onInit: CallbackTo[Any],
    onPause: CallbackTo[Any],
    onPlay: CallbackTo[Any],
    onProgress: CallbackTo[Any],
    onReady: CallbackTo[Any],
    showTitle: Boolean,
    volume: Double
  ): Config = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], onDuration = onDuration.toJsFn, onEnded = onEnded.toJsFn, onError = onError.toJsFn, onFirstEnded = onFirstEnded.toJsFn, onFirstPlay = onFirstPlay.toJsFn, onInit = onInit.toJsFn, onPause = onPause.toJsFn, onPlay = onPlay.toJsFn, onProgress = onProgress.toJsFn, onReady = onReady.toJsFn, showTitle = showTitle.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOnDuration(value: CallbackTo[Any]): Self = StObject.set(x, "onDuration", value.toJsFn)
    
    inline def setOnEnded(value: CallbackTo[Any]): Self = StObject.set(x, "onEnded", value.toJsFn)
    
    inline def setOnError(value: CallbackTo[Any]): Self = StObject.set(x, "onError", value.toJsFn)
    
    inline def setOnFirstEnded(value: CallbackTo[Any]): Self = StObject.set(x, "onFirstEnded", value.toJsFn)
    
    inline def setOnFirstPlay(value: CallbackTo[Any]): Self = StObject.set(x, "onFirstPlay", value.toJsFn)
    
    inline def setOnInit(value: CallbackTo[Any]): Self = StObject.set(x, "onInit", value.toJsFn)
    
    inline def setOnPause(value: CallbackTo[Any]): Self = StObject.set(x, "onPause", value.toJsFn)
    
    inline def setOnPlay(value: CallbackTo[Any]): Self = StObject.set(x, "onPlay", value.toJsFn)
    
    inline def setOnProgress(value: CallbackTo[Any]): Self = StObject.set(x, "onProgress", value.toJsFn)
    
    inline def setOnReady(value: CallbackTo[Any]): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
