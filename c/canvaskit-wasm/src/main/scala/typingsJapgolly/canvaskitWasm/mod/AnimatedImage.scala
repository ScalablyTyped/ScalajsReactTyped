package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedImage
  extends StObject
     with EmbindObject[AnimatedImage] {
  
  /**
    * Returns the length of the current frame in ms.
    */
  def currentFrameDuration(): Double
  
  /**
    * Decodes the next frame. Returns the length of that new frame in ms.
    * Returns -1 when the animation is on the last frame.
    */
  def decodeNextFrame(): Double
  
  /**
    * Return the total number of frames in the animation.
    */
  def getFrameCount(): Double
  
  /**
    * Return the repetition count for this animation.
    */
  def getRepetitionCount(): Double
  
  /**
    * Returns the possibly scaled height of the image.
    */
  def height(): Double
  
  /**
    * Returns a still image of the current frame or null if there is no current frame.
    */
  def makeImageAtCurrentFrame(): Image | Null
  
  /**
    * Reset the animation to the beginning.
    */
  def reset(): Unit
  
  /**
    * Returns the possibly scaled width of the image.
    */
  def width(): Double
}
object AnimatedImage {
  
  inline def apply(
    currentFrameDuration: CallbackTo[Double],
    decodeNextFrame: CallbackTo[Double],
    delete: Callback,
    deleteLater: Callback,
    getFrameCount: CallbackTo[Double],
    getRepetitionCount: CallbackTo[Double],
    height: CallbackTo[Double],
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    makeImageAtCurrentFrame: CallbackTo[Image | Null],
    reset: Callback,
    width: CallbackTo[Double]
  ): AnimatedImage = {
    val __obj = js.Dynamic.literal(currentFrameDuration = currentFrameDuration.toJsFn, decodeNextFrame = decodeNextFrame.toJsFn, delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, getFrameCount = getFrameCount.toJsFn, getRepetitionCount = getRepetitionCount.toJsFn, height = height.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, makeImageAtCurrentFrame = makeImageAtCurrentFrame.toJsFn, reset = reset.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[AnimatedImage]
  }
  
  extension [Self <: AnimatedImage](x: Self) {
    
    inline def setCurrentFrameDuration(value: CallbackTo[Double]): Self = StObject.set(x, "currentFrameDuration", value.toJsFn)
    
    inline def setDecodeNextFrame(value: CallbackTo[Double]): Self = StObject.set(x, "decodeNextFrame", value.toJsFn)
    
    inline def setGetFrameCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameCount", value.toJsFn)
    
    inline def setGetRepetitionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getRepetitionCount", value.toJsFn)
    
    inline def setHeight(value: CallbackTo[Double]): Self = StObject.set(x, "height", value.toJsFn)
    
    inline def setMakeImageAtCurrentFrame(value: CallbackTo[Image | Null]): Self = StObject.set(x, "makeImageAtCurrentFrame", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
  }
}
