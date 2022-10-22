package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface defines an animation sequence.
  *
  * This interface must be implemented by every animation object. It is used by the {@link XCanvas} interface to render generic animations.
  * @since OOo 2.0
  */
trait XAnimation
  extends StObject
     with XInterface {
  
  /**
    * Request the attribute information for this animation.
    *
    * This method returns the {@link AnimationAttributes} structure, which defines more closely how to play this animation.
    * @returns the requested {@link AnimationAttributes} structure.
    */
  val AnimationAttributes: typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.AnimationAttributes
  
  /**
    * Request the attribute information for this animation.
    *
    * This method returns the {@link AnimationAttributes} structure, which defines more closely how to play this animation.
    * @returns the requested {@link AnimationAttributes} structure.
    */
  def getAnimationAttributes(): typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.AnimationAttributes
  
  /**
    * Render the animation content at time t into the specified canvas.
    *
    * Note that it is perfectly legal to e.g. map t in a nonlinear fashion to internal frames, for example to achieve acceleration or deceleration effects.
    * It is required that the render method has const semantics, i.e. when called with the same parameter set, identical output must be generated. This is
    * because e.g. a Sprite might decide arbitrarily to render an animation once and cache the result, or repaint it via {@link XAnimation.render} every
    * time.
    *
    * The rendered content, although, must be exactly the same for identical viewState, canvas and t values. Or, for that matters, must call the same canvas
    * methods in the same order with the same parameter sets, for identical viewState and t values. Furthermore, when viewState has the identity
    * transformation set, rendered output must be contained in a rectangle with upper left corner at (0,0) and width and height given by the {@link
    * AnimationAttributes} ' untransformedSize member. Any content exceeding this box might get clipped off.
    * @param canvas The target canvas to render this animation to.
    * @param viewState The view state to be used when rendering this animation to the target canvas. The view transformation matrix must not be singular.
    * @param t Time instant for which animation content is requested. The range must always be [0,1], where 0 denotes the very beginning, and 1 the end of the
    * @throws com::sun::star::lang::IllegalArgumentException if one of the passed parameters does not lie in the specified, permissible range.
    */
  def render(canvas: XCanvas, viewState: ViewState, t: Double): Unit
}
object XAnimation {
  
  inline def apply(
    AnimationAttributes: AnimationAttributes,
    acquire: Callback,
    getAnimationAttributes: CallbackTo[AnimationAttributes],
    queryInterface: `type` => Any,
    release: Callback,
    render: (XCanvas, ViewState, Double) => Callback
  ): XAnimation = {
    val __obj = js.Dynamic.literal(AnimationAttributes = AnimationAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAnimationAttributes = getAnimationAttributes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, render = js.Any.fromFunction3((t0: XCanvas, t1: ViewState, t2: Double) => (render(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XAnimation]
  }
  
  extension [Self <: XAnimation](x: Self) {
    
    inline def setAnimationAttributes(value: AnimationAttributes): Self = StObject.set(x, "AnimationAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetAnimationAttributes(value: CallbackTo[AnimationAttributes]): Self = StObject.set(x, "getAnimationAttributes", value.toJsFn)
    
    inline def setRender(value: (XCanvas, ViewState, Double) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: XCanvas, t1: ViewState, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
