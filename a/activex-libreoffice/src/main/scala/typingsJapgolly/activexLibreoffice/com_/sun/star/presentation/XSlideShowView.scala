package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XSpriteCanvas
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View interface to display slide show presentations on.
  *
  * This interface provides the necessary methods to enable an {@link XSlideShow} interface to display a presentation. The slide show can be displayed
  * simultaneously on multiple views
  * @since OOo 2.4
  */
trait XSlideShowView
  extends StObject
     with XInterface {
  
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  val Canvas: XSpriteCanvas
  
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  val CanvasArea: Rectangle
  
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  val Transformation: AffineMatrix2D
  
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  val TranslationOffset: IntegerSize2D
  
  /**
    * Add a mouse listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is clicked on the view.
    * @param xListener Listener interface to call when the mouse is clicked on the view.
    */
  def addMouseListener(xListener: XMouseListener): Unit
  
  /**
    * Add a mouse motion listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is moved on the view.
    * @param xListener Listener interface to call when the mouse is moved on the view.
    */
  def addMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /**
    * Add a listener to get notified when this view needs a repaint.
    *
    * This method registers a listener with the view, which will get called every time the view needs an update of their screen representation.
    * @param xListener Listener interface to call when the view needs a repaint.
    */
  def addPaintListener(xListener: XPaintListener): Unit
  
  /**
    * Add a listener to get notified when the transformation matrix changes.
    *
    * This method registers a listener with the view, which will get called every time the transformation matrix changes.
    * @param xListener Listener interface to call when the transformation matrix changes.
    */
  def addTransformationChangedListener(xListener: XModifyListener): Unit
  
  /**
    * This method clears the whole view area.
    *
    * The slide show uses this method to fully erase the view content. Since the slide show has no notion of view size, this is the only reliable way to
    * wholly clear the view.
    */
  def clear(): Unit
  
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  def getCanvas(): XSpriteCanvas
  
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  def getCanvasArea(): Rectangle
  
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  def getTransformation(): AffineMatrix2D
  
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  def getTranslationOffset(): IntegerSize2D
  
  /**
    * Revoke a previously registered mouse listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseListener(xListener: XMouseListener): Unit
  
  /**
    * Revoke a previously registered mouse move listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /**
    * Revoke a previously registered paint listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removePaintListener(xListener: XPaintListener): Unit
  
  /**
    * Revoke a previously registered transformation matrix change listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeTransformationChangedListener(xListener: XModifyListener): Unit
  
  /**
    * Change the mouse cursor currently in effect.
    *
    * This method changes the mouse cursor currently in effect, for this view.
    * @param nPointerShape New mouse cursor shape to display for this view. Must be from the {@link com.sun.star.awt.SystemPointer} constant group.
    */
  def setMouseCursor(nPointerShape: Double): Unit
}
object XSlideShowView {
  
  inline def apply(
    Canvas: XSpriteCanvas,
    CanvasArea: Rectangle,
    Transformation: AffineMatrix2D,
    TranslationOffset: IntegerSize2D,
    acquire: Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addTransformationChangedListener: XModifyListener => Callback,
    clear: Callback,
    getCanvas: CallbackTo[XSpriteCanvas],
    getCanvasArea: CallbackTo[Rectangle],
    getTransformation: CallbackTo[AffineMatrix2D],
    getTranslationOffset: CallbackTo[IntegerSize2D],
    queryInterface: `type` => Any,
    release: Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeTransformationChangedListener: XModifyListener => Callback,
    setMouseCursor: Double => Callback
  ): XSlideShowView = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], CanvasArea = CanvasArea.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], TranslationOffset = TranslationOffset.asInstanceOf[js.Any], acquire = acquire.toJsFn, addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addTransformationChangedListener = js.Any.fromFunction1((t0: XModifyListener) => addTransformationChangedListener(t0).runNow()), clear = clear.toJsFn, getCanvas = getCanvas.toJsFn, getCanvasArea = getCanvasArea.toJsFn, getTransformation = getTransformation.toJsFn, getTranslationOffset = getTranslationOffset.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeTransformationChangedListener = js.Any.fromFunction1((t0: XModifyListener) => removeTransformationChangedListener(t0).runNow()), setMouseCursor = js.Any.fromFunction1((t0: Double) => setMouseCursor(t0).runNow()))
    __obj.asInstanceOf[XSlideShowView]
  }
  
  extension [Self <: XSlideShowView](x: Self) {
    
    inline def setAddMouseListener(value: XMouseListener => Callback): Self = StObject.set(x, "addMouseListener", js.Any.fromFunction1((t0: XMouseListener) => value(t0).runNow()))
    
    inline def setAddMouseMotionListener(value: XMouseMotionListener => Callback): Self = StObject.set(x, "addMouseMotionListener", js.Any.fromFunction1((t0: XMouseMotionListener) => value(t0).runNow()))
    
    inline def setAddPaintListener(value: XPaintListener => Callback): Self = StObject.set(x, "addPaintListener", js.Any.fromFunction1((t0: XPaintListener) => value(t0).runNow()))
    
    inline def setAddTransformationChangedListener(value: XModifyListener => Callback): Self = StObject.set(x, "addTransformationChangedListener", js.Any.fromFunction1((t0: XModifyListener) => value(t0).runNow()))
    
    inline def setCanvas(value: XSpriteCanvas): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasArea(value: Rectangle): Self = StObject.set(x, "CanvasArea", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetCanvas(value: CallbackTo[XSpriteCanvas]): Self = StObject.set(x, "getCanvas", value.toJsFn)
    
    inline def setGetCanvasArea(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getCanvasArea", value.toJsFn)
    
    inline def setGetTransformation(value: CallbackTo[AffineMatrix2D]): Self = StObject.set(x, "getTransformation", value.toJsFn)
    
    inline def setGetTranslationOffset(value: CallbackTo[IntegerSize2D]): Self = StObject.set(x, "getTranslationOffset", value.toJsFn)
    
    inline def setRemoveMouseListener(value: XMouseListener => Callback): Self = StObject.set(x, "removeMouseListener", js.Any.fromFunction1((t0: XMouseListener) => value(t0).runNow()))
    
    inline def setRemoveMouseMotionListener(value: XMouseMotionListener => Callback): Self = StObject.set(x, "removeMouseMotionListener", js.Any.fromFunction1((t0: XMouseMotionListener) => value(t0).runNow()))
    
    inline def setRemovePaintListener(value: XPaintListener => Callback): Self = StObject.set(x, "removePaintListener", js.Any.fromFunction1((t0: XPaintListener) => value(t0).runNow()))
    
    inline def setRemoveTransformationChangedListener(value: XModifyListener => Callback): Self = StObject.set(x, "removeTransformationChangedListener", js.Any.fromFunction1((t0: XModifyListener) => value(t0).runNow()))
    
    inline def setSetMouseCursor(value: Double => Callback): Self = StObject.set(x, "setMouseCursor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTransformation(value: AffineMatrix2D): Self = StObject.set(x, "Transformation", value.asInstanceOf[js.Any])
    
    inline def setTranslationOffset(value: IntegerSize2D): Self = StObject.set(x, "TranslationOffset", value.asInstanceOf[js.Any])
  }
}
