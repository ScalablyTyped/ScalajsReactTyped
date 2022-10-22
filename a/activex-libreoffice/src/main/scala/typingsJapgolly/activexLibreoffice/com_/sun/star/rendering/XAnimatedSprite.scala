package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface can be used to control an animated sprite object.
  *
  * This interface can be used to control an animated sprite object on an {@link XSpriteCanvas} . Sprites are moving, animated objects.
  * @since OOo 2.0
  */
trait XAnimatedSprite
  extends StObject
     with XSprite {
  
  /**
    * Reset the animation sequence to start with the first frame.
    *
    * If the animation is currently running, the next frame that is drawn after this method has finished, will be the first one. Please note that if an
    * animation is not started, the associated {@link XSpriteCanvas} does not update changed sprites automatically.
    */
  def resetAnimation(): Unit
  
  /**
    * Changes all of the sprite's attributes at one atomic instance.
    *
    * This is useful at times where one does not want multiple redraws for every state change.
    *
    * Please note that if an animation is not started, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param aNewPos New left,top output position of the sprite. This position gets transformed by the view and render state.
    * @param aViewState New view state of the sprite, and part of the transformation that is applied to aNewPos. The view transformation matrix must not be si
    * @param aRenderState New render state of the sprite, and part of the transformation that is applied to aNewPos. The render transformation matrix must not
    * @param nAlpha New alpha value of the sprite. This value must be within the [0,1] range.
    * @param bUpdateAnimation Whether this method should implicitly call XSpriteCanvas::updateAnimation() or not.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the passed parameters does not lie in the specified, permissible range.
    */
  def setAll(
    aNewPos: RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    nAlpha: Double,
    bUpdateAnimation: Boolean
  ): Unit
  
  /**
    * Changes the view state in place for this sprite's animation.
    *
    * The state given here is used when calling the {@link XAnimation.render()} method, or when drawing the sprite's bitmaps, respectively. There's no need
    * to call XSpriteCanvas::updateAnimation() after this method, as it automatically rerenders, if necessary. Please note that if an animation is not
    * started, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be told to do so via {@link
    * XSpriteCanvas.updateScreen()} .
    * @param aViewState The state given here is used when calling the {@link XAnimation.render()} method, or when drawing the sprite's bitmaps, respectively.
    * @throws com::sun::star::lang::IllegalArgumentException if the view transformation matrix is singular.
    */
  def setViewState(aViewState: ViewState): Unit
  
  /**
    * Start animation sequence of this sprite.
    *
    * The speed of the animation is given in cycles per second (where a cycle is defined as one full animation run, i.e. the full [0,1] range of the {@link
    * XAnimation.render()} 's t parameter, or a full sequence of sprite bitmaps drawn). Once an animation is running, the associated {@link XSpriteCanvas}
    * handles screen updates automatically. That means, changes to position or alpha are reflected on screen automatically. Please note further that sprite
    * visibility and animation are unrelated, i.e. a hidden sprite can have a running animation, which then displays in the middle of the animation
    * sequence, when a {@link show()} is called later on.
    * @param nSpeed The speed of the animation in cycles per second (where a cycle is defined as one full animation run, i.e. the full [0,1] range of the {@li
    */
  def startAnimation(nSpeed: Double): Unit
  
  /**
    * Stop the animation sequence.
    *
    * A subsequent {@link XAnimatedSprite.startAnimation()} will commence the sequence at the point where it was stopped with here. Once an animation is
    * stopped, the associated {@link XSpriteCanvas} does not update changed sprites anymore.
    */
  def stopAnimation(): Unit
  
  /**
    * Issue an additional render call to this sprite's animation.
    *
    * This method has no effect when called for a bitmap-sequence sprite. Please note that if an animation is not started, the associated {@link
    * XSpriteCanvas} does not update changed sprites automatically, but has to be told to do so via {@link XSpriteCanvas.updateScreen()} .
    */
  def updateAnimation(): Unit
}
object XAnimatedSprite {
  
  inline def apply(
    acquire: Callback,
    clip: XPolyPolygon2D => Callback,
    hide: Callback,
    move: (RealPoint2D, ViewState, RenderState) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resetAnimation: Callback,
    setAll: (RealPoint2D, ViewState, RenderState, Double, Boolean) => Callback,
    setAlpha: Double => Callback,
    setPriority: Double => Callback,
    setViewState: ViewState => Callback,
    show: Callback,
    startAnimation: Double => Callback,
    stopAnimation: Callback,
    transform: AffineMatrix2D => Callback,
    updateAnimation: Callback
  ): XAnimatedSprite = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, clip = js.Any.fromFunction1((t0: XPolyPolygon2D) => clip(t0).runNow()), hide = hide.toJsFn, move = js.Any.fromFunction3((t0: RealPoint2D, t1: ViewState, t2: RenderState) => (move(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetAnimation = resetAnimation.toJsFn, setAll = js.Any.fromFunction5((t0: RealPoint2D, t1: ViewState, t2: RenderState, t3: Double, t4: Boolean) => (setAll(t0, t1, t2, t3, t4)).runNow()), setAlpha = js.Any.fromFunction1((t0: Double) => setAlpha(t0).runNow()), setPriority = js.Any.fromFunction1((t0: Double) => setPriority(t0).runNow()), setViewState = js.Any.fromFunction1((t0: ViewState) => setViewState(t0).runNow()), show = show.toJsFn, startAnimation = js.Any.fromFunction1((t0: Double) => startAnimation(t0).runNow()), stopAnimation = stopAnimation.toJsFn, transform = js.Any.fromFunction1((t0: AffineMatrix2D) => transform(t0).runNow()), updateAnimation = updateAnimation.toJsFn)
    __obj.asInstanceOf[XAnimatedSprite]
  }
  
  extension [Self <: XAnimatedSprite](x: Self) {
    
    inline def setResetAnimation(value: Callback): Self = StObject.set(x, "resetAnimation", value.toJsFn)
    
    inline def setSetAll(value: (RealPoint2D, ViewState, RenderState, Double, Boolean) => Callback): Self = StObject.set(x, "setAll", js.Any.fromFunction5((t0: RealPoint2D, t1: ViewState, t2: RenderState, t3: Double, t4: Boolean) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetViewState(value: ViewState => Callback): Self = StObject.set(x, "setViewState", js.Any.fromFunction1((t0: ViewState) => value(t0).runNow()))
    
    inline def setStartAnimation(value: Double => Callback): Self = StObject.set(x, "startAnimation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStopAnimation(value: Callback): Self = StObject.set(x, "stopAnimation", value.toJsFn)
    
    inline def setUpdateAnimation(value: Callback): Self = StObject.set(x, "updateAnimation", value.toJsFn)
  }
}
