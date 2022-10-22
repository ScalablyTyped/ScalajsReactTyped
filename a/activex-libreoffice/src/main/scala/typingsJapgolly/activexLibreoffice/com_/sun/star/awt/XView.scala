package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to attach an output device to the object.
  *
  * This kind of object is called view-object.
  */
trait XView
  extends StObject
     with XInterface {
  
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  var Graphics: XGraphics
  
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  val Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * draws the object at the specified position.
    *
    * If the output should be clipped, the caller has to set the clipping region.
    */
  def draw(nX: Double, nY: Double): Unit
  
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  def getGraphics(): XGraphics
  
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  def getSize(): typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /** sets the output device. */
  def setGraphics(aDevice: XGraphics): Boolean
  
  /**
    * sets the zoom factor.
    *
    * The zoom factor only affects the content of the view, not the size.
    */
  def setZoom(fZoomX: Double, fZoomY: Double): Unit
}
object XView {
  
  inline def apply(
    Graphics: XGraphics,
    Size: Size,
    acquire: Callback,
    draw: (Double, Double) => Callback,
    getGraphics: CallbackTo[XGraphics],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    setGraphics: XGraphics => Boolean,
    setZoom: (Double, Double) => Callback
  ): XView = {
    val __obj = js.Dynamic.literal(Graphics = Graphics.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getGraphics = getGraphics.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
    __obj.asInstanceOf[XView]
  }
  
  extension [Self <: XView](x: Self) {
    
    inline def setDraw(value: (Double, Double) => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetGraphics(value: CallbackTo[XGraphics]): Self = StObject.set(x, "getGraphics", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGraphics(value: XGraphics): Self = StObject.set(x, "Graphics", value.asInstanceOf[js.Any])
    
    inline def setSetGraphics(value: XGraphics => Boolean): Self = StObject.set(x, "setGraphics", js.Any.fromFunction1(value))
    
    inline def setSetZoom(value: (Double, Double) => Callback): Self = StObject.set(x, "setZoom", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
