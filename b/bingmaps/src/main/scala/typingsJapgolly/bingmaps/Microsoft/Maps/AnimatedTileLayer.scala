package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedTileLayer extends StObject {
  
  /**
    * Gets the frame rate of this animated tile layer.
    * @returns The frame rate of this animated tile layer.
    **/
  def getFrameRate(): Double
  
  /**
    * Gets the loading screen overlay when tiles are being fetched.
    * @returns The loading screen overlay when tiles are being fetched.
    **/
  def getLoadingScreen(): CustomOverlay
  
  /**
    * Gets the maximum total tile fetching time of this animated tile layer.
    * @returns The maximum total tile fetching time of this animated tile layer
    **/
  def getMaxTotalLoadTime(): Double
  
  /**
    * Gets the tile sources associated with this layer.
    * @returns The tile sources associated with this layer.
    **/
  def getTileSources(): js.Array[TileSource]
  
  /**
    * Gets the visibility of this animated tile layer.
    * @returns The visibility of this animated tile layer.
    **/
  def getVisible(): Boolean
  
  /** Pause the tile layer animation. **/
  def pause(): Unit
  
  /** Play the animation either from start or where it was paused. **/
  def play(): Unit
  
  /**
    * Sets the options for the animated tile layer.
    * @params Options that define how to animate between the specified tile layers.
    **/
  def setOptions(options: IAnimatedTileLayerOptions): Unit
  
  /** Stop the layer animation, hide layer, and reset frame to the beginning. **/
  def stop(): Unit
}
object AnimatedTileLayer {
  
  inline def apply(
    getFrameRate: CallbackTo[Double],
    getLoadingScreen: CallbackTo[CustomOverlay],
    getMaxTotalLoadTime: CallbackTo[Double],
    getTileSources: CallbackTo[js.Array[TileSource]],
    getVisible: CallbackTo[Boolean],
    pause: Callback,
    play: Callback,
    setOptions: IAnimatedTileLayerOptions => Callback,
    stop: Callback
  ): AnimatedTileLayer = {
    val __obj = js.Dynamic.literal(getFrameRate = getFrameRate.toJsFn, getLoadingScreen = getLoadingScreen.toJsFn, getMaxTotalLoadTime = getMaxTotalLoadTime.toJsFn, getTileSources = getTileSources.toJsFn, getVisible = getVisible.toJsFn, pause = pause.toJsFn, play = play.toJsFn, setOptions = js.Any.fromFunction1((t0: IAnimatedTileLayerOptions) => setOptions(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[AnimatedTileLayer]
  }
  
  extension [Self <: AnimatedTileLayer](x: Self) {
    
    inline def setGetFrameRate(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameRate", value.toJsFn)
    
    inline def setGetLoadingScreen(value: CallbackTo[CustomOverlay]): Self = StObject.set(x, "getLoadingScreen", value.toJsFn)
    
    inline def setGetMaxTotalLoadTime(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxTotalLoadTime", value.toJsFn)
    
    inline def setGetTileSources(value: CallbackTo[js.Array[TileSource]]): Self = StObject.set(x, "getTileSources", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSetOptions(value: IAnimatedTileLayerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IAnimatedTileLayerOptions) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
