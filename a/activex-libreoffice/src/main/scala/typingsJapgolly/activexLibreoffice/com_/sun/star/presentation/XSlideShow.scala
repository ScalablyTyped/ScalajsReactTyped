package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.animations.XAnimationNode
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPagesSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slide show interface to perform slide show presentations.
  *
  * This interface provides the necessary methods to run and control a slide show from a given set of XDrawPage slides. The slide show can be displayed
  * simultaneously on multiple targets.
  *
  * Note: To control a running slide show inside a presentation, please use {@link XPresentation2} and {@link XSlideShowController} .
  * @since OOo 3.0
  */
trait XSlideShow
  extends StObject
     with XInterface {
  
  /**
    * Query the currently displayed slide.
    * @returns the instance of the current slide. If there's no slide show running at the moment, this method returns an empty reference.
    */
  val CurrentSlide: XDrawPage
  
  /**
    * Add a shape event listener.
    *
    * This method adds a listener to the slide show, which will get notified when a mouse click is performed on the given shape. This can be used by clients
    * of the slide show to trigger external actions, such as jumps to different slides.
    * @param xListener Listener to add.
    * @param xShape The {@link Shape} to register a listener for.
    */
  def addShapeEventListener(xListener: XShapeEventListener, xShape: XShape): Unit
  
  /**
    * Add a slide show listener.
    *
    * This method adds a listener to the slide show, which will get notified when a registered shape is clicked upon, or a new slide is about to be
    * displayed. Note that the listeners will **not** be notified, when the slide change is directly requested by one of the nextSlide(), previousSlide() or
    * {@link displaySlide()} methods.
    * @param xListener Listener to add.
    */
  def addSlideShowListener(xListener: XSlideShowListener): Unit
  
  /**
    * Add a view to the slide show.
    *
    * This method adds a view to the slide show. After successful completion of this method, the slide show will be visible on the added view, scaled
    * according to the view's output area.
    * @param xView The view to add
    * @returns `TRUE` , if the view has been successfully added. Otherwise, `FALSE` is returned (e.g. if the view is already added).
    */
  def addView(xView: XSlideShowView): Boolean
  
  /**
    * Jump to the given slide.
    *
    * This method ends all effects on the current slide, displays a possible slide transition, followed by the given slide. If the current slide is equal to
    * the requested slide here, this method does nothing (this especially means, that any currently active effects will remain running).
    * @param xSlide The slide to display.
    * @param xDrawPages For future use.
    * @param AnimationNode The animation node determine the animations to display.
    * @param aProperties Sequence of property values, which influence the way the slide is displayed. Currently, the following values are recognized: name: Pr
    */
  def displaySlide(
    xSlide: XDrawPage,
    xDrawPages: XDrawPagesSupplier,
    AnimationNode: XAnimationNode,
    aProperties: SeqEquiv[PropertyValue]
  ): Unit
  
  /**
    * Query the currently displayed slide.
    * @returns the instance of the current slide. If there's no slide show running at the moment, this method returns an empty reference.
    */
  def getCurrentSlide(): XDrawPage
  
  /**
    * Trigger the next effect of the slide show.
    *
    * This method triggers the next effect on the currently displayed slide. If there is currently no slide show running, this method does nothing. If there
    * are no more effects on the current slide, a possible slide transition effect is issued and the next slide is displayed.
    * @returns `TRUE` , if the next effect was successfully triggered. This method returns `FALSE` , if there is no show running, the last effect on the last sl
    */
  def nextEffect(): Boolean
  
  /**
    * Change the pause state of the slide show.
    *
    * This method either pauses the slide show (all currently running effects are stopped), or starts a previously stopped show again (all paused effects
    * start again).
    * @param bPauseShow When `TRUE` , the show is paused. When `FALSE` , and the show was paused, it starts running at the paused position again.
    * @returns `TRUE` , if the requested action was successfully performed.
    */
  def pause(bPauseShow: Boolean): Boolean
  
  /**
    * Undo the last effect in the main sequence of the slide show.
    *
    * The current slide is displayed as if the last user-triggered effect has never been triggered. If there is no previous effect on the current slide then
    * slideEnded(true) is called at the registered {@link XSlideShowListener} objects, which can then trigger a change to the previous slide. Note that this
    * command is executed asynchronously. Multiple calls to {@link update()} may be necessary to complete its execution. If there is currently no slide show
    * running, this method does nothing.
    * @returns `TRUE` , if the previous effect was successfully triggered. This method returns `FALSE` , if there is no show running, the first effect on the fi
    */
  def previousEffect(): Boolean
  
  /**
    * Register drawn polygons in presentation mode
    * @param xDocFactory
    */
  def registerUserPaintPolygons(xDocFactory: XMultiServiceFactory): Unit
  
  /**
    * Revoke a previously registered shape event listener.
    * @param xListener Listener interface to revoke from being called.
    * @param xShape for which the listener should be revoked.
    */
  def removeShapeEventListener(xListener: XShapeEventListener, xShape: XShape): Unit
  
  /**
    * Revoke a previously registered slide show listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeSlideShowListener(xListener: XSlideShowListener): Unit
  
  /**
    * Remove view from the slide show.
    *
    * This method removes the given view from the slide show. After successful completion of this method, the slide show will cease to display on this view.
    * @param xView View to remove
    * @returns `TRUE` , if the view was successfully removed, `FALSE` otherwise (e.g. if the view was not added in the first place).
    */
  def removeView(xView: XSlideShowView): Boolean
  
  /**
    * Change a property of the slide show.
    * @param aShowProperty Property values, which influence the way the slides are shown. Note that this might possibly be a subset of what is supported on sh
    */
  def setProperty(aShowProperty: PropertyValue): Boolean
  
  /**
    * Set a special mouse cursor for a shape.
    *
    * This method requests the slide show to display a special cursor, whenever the mouse is hovering over the given shape.
    * @param xShape The {@link Shape} to display a special mouse cursor.
    * @param nPointerShape Type of mouse cursor to display. Must be one of the {@link com.sun.star.awt.SystemPointer} values.
    */
  def setShapeCursor(xShape: XShape, nPointerShape: Double): Unit
  
  /**
    * Start a shape-intrinsic animation or activity.
    *
    * This method starts an animation or activity intrinsic to the given shape. Shape-intrinsic activities are things like video playback for multimedia
    * shapes, sounds, GIF animations and drawing layer animations (flipping between shapes in a group, or scroll text).
    * @param xShape The shape to start the activity for
    */
  def startShapeActivity(xShape: XShape): Boolean
  
  /**
    * Stop a shape-intrinsic animation or activity.
    *
    * This method stops an animation or activity intrinsic to the given shape. Shape-intrinsic activities are things like video playback for multimedia
    * shapes, sounds, GIF animations and drawing layer animations (flipping between shapes in a group, or scroll text).
    * @param xShape The shape to stop the activity for
    */
  def stopShapeActivity(xShape: XShape): Boolean
  
  /**
    * Update the animations.
    *
    * This method updates all currently active slide animations. The {@link XSlideShow} implementations do not render animations automatically, but must be
    * called from their clients. This allows for various update mechanisms to be employed, ranging from a dedicated rendering thread, over timer-based
    * updates, to rendering in an idle function. Either way, the client of this interface decide about the details.
    * @param nNextTimeout Via this value, the implementation can return a timeout value, denoting the maximal time span that must not be exceeded from the ret
    * @returns `TRUE` , if further update calls are required. If `FALSE` is returned, no further update calls are necessary, until anyone of the other interface
    */
  def update(nNextTimeout: js.Array[Double]): Boolean
}
object XSlideShow {
  
  inline def apply(
    CurrentSlide: XDrawPage,
    acquire: Callback,
    addShapeEventListener: (XShapeEventListener, XShape) => Callback,
    addSlideShowListener: XSlideShowListener => Callback,
    addView: XSlideShowView => Boolean,
    displaySlide: (XDrawPage, XDrawPagesSupplier, XAnimationNode, SeqEquiv[PropertyValue]) => Callback,
    getCurrentSlide: CallbackTo[XDrawPage],
    nextEffect: CallbackTo[Boolean],
    pause: Boolean => Boolean,
    previousEffect: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    registerUserPaintPolygons: XMultiServiceFactory => Callback,
    release: Callback,
    removeShapeEventListener: (XShapeEventListener, XShape) => Callback,
    removeSlideShowListener: XSlideShowListener => Callback,
    removeView: XSlideShowView => Boolean,
    setProperty: PropertyValue => Boolean,
    setShapeCursor: (XShape, Double) => Callback,
    startShapeActivity: XShape => Boolean,
    stopShapeActivity: XShape => Boolean,
    update: js.Array[Double] => Boolean
  ): XSlideShow = {
    val __obj = js.Dynamic.literal(CurrentSlide = CurrentSlide.asInstanceOf[js.Any], acquire = acquire.toJsFn, addShapeEventListener = js.Any.fromFunction2((t0: XShapeEventListener, t1: XShape) => (addShapeEventListener(t0, t1)).runNow()), addSlideShowListener = js.Any.fromFunction1((t0: XSlideShowListener) => addSlideShowListener(t0).runNow()), addView = js.Any.fromFunction1(addView), displaySlide = js.Any.fromFunction4((t0: XDrawPage, t1: XDrawPagesSupplier, t2: XAnimationNode, t3: SeqEquiv[PropertyValue]) => (displaySlide(t0, t1, t2, t3)).runNow()), getCurrentSlide = getCurrentSlide.toJsFn, nextEffect = nextEffect.toJsFn, pause = js.Any.fromFunction1(pause), previousEffect = previousEffect.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerUserPaintPolygons = js.Any.fromFunction1((t0: XMultiServiceFactory) => registerUserPaintPolygons(t0).runNow()), release = release.toJsFn, removeShapeEventListener = js.Any.fromFunction2((t0: XShapeEventListener, t1: XShape) => (removeShapeEventListener(t0, t1)).runNow()), removeSlideShowListener = js.Any.fromFunction1((t0: XSlideShowListener) => removeSlideShowListener(t0).runNow()), removeView = js.Any.fromFunction1(removeView), setProperty = js.Any.fromFunction1(setProperty), setShapeCursor = js.Any.fromFunction2((t0: XShape, t1: Double) => (setShapeCursor(t0, t1)).runNow()), startShapeActivity = js.Any.fromFunction1(startShapeActivity), stopShapeActivity = js.Any.fromFunction1(stopShapeActivity), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[XSlideShow]
  }
  
  extension [Self <: XSlideShow](x: Self) {
    
    inline def setAddShapeEventListener(value: (XShapeEventListener, XShape) => Callback): Self = StObject.set(x, "addShapeEventListener", js.Any.fromFunction2((t0: XShapeEventListener, t1: XShape) => (value(t0, t1)).runNow()))
    
    inline def setAddSlideShowListener(value: XSlideShowListener => Callback): Self = StObject.set(x, "addSlideShowListener", js.Any.fromFunction1((t0: XSlideShowListener) => value(t0).runNow()))
    
    inline def setAddView(value: XSlideShowView => Boolean): Self = StObject.set(x, "addView", js.Any.fromFunction1(value))
    
    inline def setCurrentSlide(value: XDrawPage): Self = StObject.set(x, "CurrentSlide", value.asInstanceOf[js.Any])
    
    inline def setDisplaySlide(value: (XDrawPage, XDrawPagesSupplier, XAnimationNode, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "displaySlide", js.Any.fromFunction4((t0: XDrawPage, t1: XDrawPagesSupplier, t2: XAnimationNode, t3: SeqEquiv[PropertyValue]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetCurrentSlide(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getCurrentSlide", value.toJsFn)
    
    inline def setNextEffect(value: CallbackTo[Boolean]): Self = StObject.set(x, "nextEffect", value.toJsFn)
    
    inline def setPause(value: Boolean => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPreviousEffect(value: CallbackTo[Boolean]): Self = StObject.set(x, "previousEffect", value.toJsFn)
    
    inline def setRegisterUserPaintPolygons(value: XMultiServiceFactory => Callback): Self = StObject.set(x, "registerUserPaintPolygons", js.Any.fromFunction1((t0: XMultiServiceFactory) => value(t0).runNow()))
    
    inline def setRemoveShapeEventListener(value: (XShapeEventListener, XShape) => Callback): Self = StObject.set(x, "removeShapeEventListener", js.Any.fromFunction2((t0: XShapeEventListener, t1: XShape) => (value(t0, t1)).runNow()))
    
    inline def setRemoveSlideShowListener(value: XSlideShowListener => Callback): Self = StObject.set(x, "removeSlideShowListener", js.Any.fromFunction1((t0: XSlideShowListener) => value(t0).runNow()))
    
    inline def setRemoveView(value: XSlideShowView => Boolean): Self = StObject.set(x, "removeView", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: PropertyValue => Boolean): Self = StObject.set(x, "setProperty", js.Any.fromFunction1(value))
    
    inline def setSetShapeCursor(value: (XShape, Double) => Callback): Self = StObject.set(x, "setShapeCursor", js.Any.fromFunction2((t0: XShape, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStartShapeActivity(value: XShape => Boolean): Self = StObject.set(x, "startShapeActivity", js.Any.fromFunction1(value))
    
    inline def setStopShapeActivity(value: XShape => Boolean): Self = StObject.set(x, "stopShapeActivity", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: js.Array[Double] => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
