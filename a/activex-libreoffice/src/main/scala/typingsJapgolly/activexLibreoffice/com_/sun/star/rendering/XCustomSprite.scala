package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to control a custom sprite object on a {@link XSpriteCanvas} .
  *
  * Every change performed on {@link XCustomSprite} objects is only visible after a {@link XSpriteCanvas.updateScreen()} call, to facilitate synchronized
  * screen updates.
  *
  * TODO: Maybe more than alpha has to be overridden from render state. TODO: Provide means to change the output area
  */
trait XCustomSprite
  extends StObject
     with XSprite {
  
  /**
    * Query a render canvas for this sprite's content.
    *
    * Whatever is rendered to this canvas will become visible on the screen only after a {@link XSpriteCanvas.updateScreen()} call at the associated sprite
    * canvas. This canvas is not equivalent to the host canvas of the sprite. At the very least, all output happens relative to the sprite's upper left
    * corner, i.e. the origin of the sprite's canvas device coordinate system will move with the sprite across the screen.
    * @returns the canvas the sprite content can be rendered into.
    */
  val ContentCanvas: XCanvas
  
  /**
    * Query a render canvas for this sprite's content.
    *
    * Whatever is rendered to this canvas will become visible on the screen only after a {@link XSpriteCanvas.updateScreen()} call at the associated sprite
    * canvas. This canvas is not equivalent to the host canvas of the sprite. At the very least, all output happens relative to the sprite's upper left
    * corner, i.e. the origin of the sprite's canvas device coordinate system will move with the sprite across the screen.
    * @returns the canvas the sprite content can be rendered into.
    */
  def getContentCanvas(): XCanvas
}
object XCustomSprite {
  
  inline def apply(
    ContentCanvas: XCanvas,
    acquire: Callback,
    clip: XPolyPolygon2D => Callback,
    getContentCanvas: CallbackTo[XCanvas],
    hide: Callback,
    move: (RealPoint2D, ViewState, RenderState) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setAlpha: Double => Callback,
    setPriority: Double => Callback,
    show: Callback,
    transform: AffineMatrix2D => Callback
  ): XCustomSprite = {
    val __obj = js.Dynamic.literal(ContentCanvas = ContentCanvas.asInstanceOf[js.Any], acquire = acquire.toJsFn, clip = js.Any.fromFunction1((t0: XPolyPolygon2D) => clip(t0).runNow()), getContentCanvas = getContentCanvas.toJsFn, hide = hide.toJsFn, move = js.Any.fromFunction3((t0: RealPoint2D, t1: ViewState, t2: RenderState) => (move(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAlpha = js.Any.fromFunction1((t0: Double) => setAlpha(t0).runNow()), setPriority = js.Any.fromFunction1((t0: Double) => setPriority(t0).runNow()), show = show.toJsFn, transform = js.Any.fromFunction1((t0: AffineMatrix2D) => transform(t0).runNow()))
    __obj.asInstanceOf[XCustomSprite]
  }
  
  extension [Self <: XCustomSprite](x: Self) {
    
    inline def setContentCanvas(value: XCanvas): Self = StObject.set(x, "ContentCanvas", value.asInstanceOf[js.Any])
    
    inline def setGetContentCanvas(value: CallbackTo[XCanvas]): Self = StObject.set(x, "getContentCanvas", value.toJsFn)
  }
}
