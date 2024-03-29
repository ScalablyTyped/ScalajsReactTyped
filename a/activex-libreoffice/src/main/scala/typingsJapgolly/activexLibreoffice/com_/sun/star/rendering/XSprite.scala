package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to control a sprite object.
  *
  * This is the basic interface to control a sprite object on a {@link XSpriteCanvas} . Sprites are moving, back-buffered objects.
  */
trait XSprite
  extends StObject
     with XInterface {
  
  /**
    * Apply a clipping to the shape output.
    *
    * The given clip poly-polygon is always interpreted in device coordinate space. As the sprite has its own local coordinate system, with its origin on
    * screen being equal to its current position, the clip poly-polygon's origin will always coincide with the sprite's origin. Furthermore, if any sprite
    * transformation is set via {@link transform()} , the clip is subject to this transformation, too. The implementation is free, if it has a cached
    * representation of the sprite at hand, to clip-output only this cached representation (e.g. a bitmap), instead of re-rendering the sprite from first
    * principles. This is usually the case for an implementation of a {@link XCustomSprite} interface, since it typically has no other cached pictorial
    * information at hand.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    *
    * Specifying an empty interface denotes no clipping, i.e. everything contained in the sprite will be visible (subject to device-dependent constraints,
    * of course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing from the sprite will be visible.
    * @param aClip The clip poly-polygon to apply.
    */
  def clip(aClip: XPolyPolygon2D): Unit
  
  /**
    * Make the sprite invisible.
    *
    * This method makes the sprite invisible.
    */
  def hide(): Unit
  
  /**
    * Move sprite to the specified position.
    *
    * The position specified here is first transformed by the combined view and render transformation. The resulting position is then used as the output
    * position (also in device coordinates) of the rendered sprite content.
    *
    * Please note that if this sprite is not animated, the associated XSpriteCanva does not update changed sprites automatically, but has to be told to do
    * so via {@link XSpriteCanvas.updateScreen()} .
    * @param aNewPos The new position, in user coordinate space, to move the sprite to.
    * @param aViewState The view state to be used when interpreting aNewPos.
    * @param aRenderState The render state to be used when interpreting aNewPos.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def move(aNewPos: RealPoint2D, aViewState: ViewState, aRenderState: RenderState): Unit
  
  /**
    * Set overall transparency of the sprite.
    *
    * This method is useful for e.g. fading in/out of animations.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param nAlpha New global alpha value to composite this sprite with the background. Valid range is [0,1].
    * @throws com::sun::star::lang::IllegalArgumentException if nAlpha is not within the permissible range.
    */
  def setAlpha(nAlpha: Double): Unit
  
  /**
    * Set sprite priority.
    *
    * The sprite priority determines the order of rendering relative to all other sprites of the associated canvas. The higher the priority, the later will
    * the sprite be rendered, or, in other words, the closer to the screen surface the sprite is shown.
    * @param nPriority New sprite priority value to serve as the sort key when determining sprite rendering order. Avoid NaNs and other irregular floating poi
    */
  def setPriority(nPriority: Double): Unit
  
  /**
    * Make the sprite visible.
    *
    * This method makes the sprite visible on the canvas it was created on.
    */
  def show(): Unit
  
  /**
    * Apply a local transformation to the sprite.
    *
    * The given transformation matrix locally transforms the sprite shape. If this transformation contains translational components, be aware that sprite
    * content moved beyond the sprite area (a box from (0,0) to (spriteWidth,spriteHeight)) might (but need not) be clipped. Use {@link XSprite.move()} to
    * change the sprite location on screen. The canvas implementations are free, if they have a cached representation of the sprite at hand, to transform
    * only this cached representation (e.g. a bitmap), instead of re-rendering the sprite from first principles. This is usually the case for an
    * implementation of a {@link XCustomSprite} interface, since it typically has no other cached pictorial information at hand.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param aTransformation The transformation to apply to the sprite shape.
    * @throws com::sun::star::lang::IllegalArgumentException if the given transformation matrix is singular.
    */
  def transform(aTransformation: AffineMatrix2D): Unit
}
object XSprite {
  
  inline def apply(
    acquire: Callback,
    clip: XPolyPolygon2D => Callback,
    hide: Callback,
    move: (RealPoint2D, ViewState, RenderState) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setAlpha: Double => Callback,
    setPriority: Double => Callback,
    show: Callback,
    transform: AffineMatrix2D => Callback
  ): XSprite = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, clip = js.Any.fromFunction1((t0: XPolyPolygon2D) => clip(t0).runNow()), hide = hide.toJsFn, move = js.Any.fromFunction3((t0: RealPoint2D, t1: ViewState, t2: RenderState) => (move(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAlpha = js.Any.fromFunction1((t0: Double) => setAlpha(t0).runNow()), setPriority = js.Any.fromFunction1((t0: Double) => setPriority(t0).runNow()), show = show.toJsFn, transform = js.Any.fromFunction1((t0: AffineMatrix2D) => transform(t0).runNow()))
    __obj.asInstanceOf[XSprite]
  }
  
  extension [Self <: XSprite](x: Self) {
    
    inline def setClip(value: XPolyPolygon2D => Callback): Self = StObject.set(x, "clip", js.Any.fromFunction1((t0: XPolyPolygon2D) => value(t0).runNow()))
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setMove(value: (RealPoint2D, ViewState, RenderState) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction3((t0: RealPoint2D, t1: ViewState, t2: RenderState) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetAlpha(value: Double => Callback): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPriority(value: Double => Callback): Self = StObject.set(x, "setPriority", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setTransform(value: AffineMatrix2D => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction1((t0: AffineMatrix2D) => value(t0).runNow()))
  }
}
