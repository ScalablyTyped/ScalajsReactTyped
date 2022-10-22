package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface to control a running slide show.
  * @see XPresentation2
  * @since OOo 3.0
  */
trait XSlideShowController extends StObject {
  
  /** If this attribute is set to `TRUE` , the window of the slide show is always on top of all other windows. */
  var AlwaysOnTop: Boolean
  
  /** returns slide that is currently displayed */
  val CurrentSlide: XDrawPage
  
  /** returns the index of the current slide. */
  val CurrentSlideIndex: Double
  
  /** If this attribute is `TRUE` , the mouse is visible during the slide show. */
  var MouseVisible: Boolean
  
  /** the index for the slide that is displayed next. */
  val NextSlideIndex: Double
  
  /** This attribute changes the color of the pen. */
  var PenColor: Double
  
  /**
    * This attribute changes the width of the pen.
    * @since LibreOffice 4.2
    */
  var PenWidth: Double
  
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  val SlideCount: Double
  
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  val SlideShow: XSlideShow
  
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: Boolean
  
  /**
    * activates the user interface of this slide show.
    * @see deactivate()
    * @see isActive()
    */
  def activate(): Unit
  
  /** adds a listener that receives events while the slide show is running. */
  def addSlideShowListener(Listener: XSlideShowListener): Unit
  
  /**
    * pauses the slide show and blanks the screen in the given color.
    *
    * Change attribute Pause to false to unpause the slide show.
    */
  def blankScreen(Color: Double): Unit
  
  /**
    * can be called to deactivate the user interface of this slide show.
    *
    * A deactivated
    * @see activate()
    * @see isActive()
    */
  def deactivate(): Unit
  
  /** returns slide that is currently displayed */
  def getCurrentSlide(): XDrawPage
  
  /** returns the index of the current slide. */
  def getCurrentSlideIndex(): Double
  
  /** the index for the slide that is displayed next. */
  def getNextSlideIndex(): Double
  
  /**
    * gives access to the slides that will be shown in this slide show.
    *
    * Slides are returned in the order they will be displayed in the presentation which can be different than the orders of slides in the document. Not all
    * slides must be present and each slide can be used more than once.
    * @param Index specifies the position in the list of slides that are displayed in this slide show. The first index is 0.
    * @returns the slide at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getSlideByIndex(Index: Double): XDrawPage
  
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  def getSlideCount(): Double
  
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  def getSlideShow(): XSlideShow
  
  /** goto the given textual bookmark */
  def gotoBookmark(Bookmark: String): Unit
  
  /** goto and display first slide */
  def gotoFirstSlide(): Unit
  
  /**
    * goto and display last slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoLastSlide(): Unit
  
  /**
    * start next effects that wait on a generic trigger.
    *
    * If no generic triggers are waiting the next slide will be displayed.
    */
  def gotoNextEffect(): Unit
  
  /**
    * goto and display next slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoNextSlide(): Unit
  
  /**
    * undo the last effects that where triggered by a generic trigger.
    *
    * If there is no previous effect that can be undone then the previous slide will be displayed.
    */
  def gotoPreviousEffect(): Unit
  
  /**
    * goto and display previous slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoPreviousSlide(): Unit
  
  /**
    * jumps to the given slide.
    *
    * The slide can also be a slide that would normally not be shown during the current slide show.
    * @throws com::sun::star::lang::IllegalArgumentException if the given page is not a valid slide of the document for which this slide show is started. Also
    */
  def gotoSlide(Page: XDrawPage): Unit
  
  /** jumps to the slide at the given index. */
  def gotoSlideIndex(Index: Double): Unit
  
  /**
    * determines if the slide show is active.
    * @returns `TRUE` for UI active slide show ; `FALSE` otherwise
    */
  def isActive(): Boolean
  
  /** returns `TRUE` if the slide show was started to run endlessly. */
  def isEndless(): Boolean
  
  /** Returns `TRUE` if the slide show was started in full-screen mode. */
  def isFullScreen(): Boolean
  
  /**
    * returns `TRUE` if the slide show is currently paused.
    * @see pause()
    * @see resume()
    */
  def isPaused(): Boolean
  
  /**
    * returns true if the slide show is still running. If this returns false, this component is already disposed. You can start a new slide show and get a
    * new instance of {@link XSlideShowController} from {@link XPresentation2}
    */
  def isRunning(): Boolean
  
  /**
    * pauses the slide show. All effects are paused.
    *
    * The slide show continues on next user input or if {@link resume()} is called.
    */
  def pause(): Unit
  
  /** removes a listener. */
  def removeSlideShowListener(Listener: XSlideShowListener): Unit
  
  /** resumes a paused slide show. */
  def resume(): Unit
  
  /** stop all currently played sounds */
  def stopSound(): Unit
}
object XSlideShowController {
  
  inline def apply(
    AlwaysOnTop: Boolean,
    CurrentSlide: XDrawPage,
    CurrentSlideIndex: Double,
    MouseVisible: Boolean,
    NextSlideIndex: Double,
    PenColor: Double,
    PenWidth: Double,
    SlideCount: Double,
    SlideShow: XSlideShow,
    UsePen: Boolean,
    activate: Callback,
    addSlideShowListener: XSlideShowListener => Callback,
    blankScreen: Double => Callback,
    deactivate: Callback,
    getCurrentSlide: CallbackTo[XDrawPage],
    getCurrentSlideIndex: CallbackTo[Double],
    getNextSlideIndex: CallbackTo[Double],
    getSlideByIndex: Double => XDrawPage,
    getSlideCount: CallbackTo[Double],
    getSlideShow: CallbackTo[XSlideShow],
    gotoBookmark: String => Callback,
    gotoFirstSlide: Callback,
    gotoLastSlide: Callback,
    gotoNextEffect: Callback,
    gotoNextSlide: Callback,
    gotoPreviousEffect: Callback,
    gotoPreviousSlide: Callback,
    gotoSlide: XDrawPage => Callback,
    gotoSlideIndex: Double => Callback,
    isActive: CallbackTo[Boolean],
    isEndless: CallbackTo[Boolean],
    isFullScreen: CallbackTo[Boolean],
    isPaused: CallbackTo[Boolean],
    isRunning: CallbackTo[Boolean],
    pause: Callback,
    removeSlideShowListener: XSlideShowListener => Callback,
    resume: Callback,
    stopSound: Callback
  ): XSlideShowController = {
    val __obj = js.Dynamic.literal(AlwaysOnTop = AlwaysOnTop.asInstanceOf[js.Any], CurrentSlide = CurrentSlide.asInstanceOf[js.Any], CurrentSlideIndex = CurrentSlideIndex.asInstanceOf[js.Any], MouseVisible = MouseVisible.asInstanceOf[js.Any], NextSlideIndex = NextSlideIndex.asInstanceOf[js.Any], PenColor = PenColor.asInstanceOf[js.Any], PenWidth = PenWidth.asInstanceOf[js.Any], SlideCount = SlideCount.asInstanceOf[js.Any], SlideShow = SlideShow.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], activate = activate.toJsFn, addSlideShowListener = js.Any.fromFunction1((t0: XSlideShowListener) => addSlideShowListener(t0).runNow()), blankScreen = js.Any.fromFunction1((t0: Double) => blankScreen(t0).runNow()), deactivate = deactivate.toJsFn, getCurrentSlide = getCurrentSlide.toJsFn, getCurrentSlideIndex = getCurrentSlideIndex.toJsFn, getNextSlideIndex = getNextSlideIndex.toJsFn, getSlideByIndex = js.Any.fromFunction1(getSlideByIndex), getSlideCount = getSlideCount.toJsFn, getSlideShow = getSlideShow.toJsFn, gotoBookmark = js.Any.fromFunction1((t0: String) => gotoBookmark(t0).runNow()), gotoFirstSlide = gotoFirstSlide.toJsFn, gotoLastSlide = gotoLastSlide.toJsFn, gotoNextEffect = gotoNextEffect.toJsFn, gotoNextSlide = gotoNextSlide.toJsFn, gotoPreviousEffect = gotoPreviousEffect.toJsFn, gotoPreviousSlide = gotoPreviousSlide.toJsFn, gotoSlide = js.Any.fromFunction1((t0: XDrawPage) => gotoSlide(t0).runNow()), gotoSlideIndex = js.Any.fromFunction1((t0: Double) => gotoSlideIndex(t0).runNow()), isActive = isActive.toJsFn, isEndless = isEndless.toJsFn, isFullScreen = isFullScreen.toJsFn, isPaused = isPaused.toJsFn, isRunning = isRunning.toJsFn, pause = pause.toJsFn, removeSlideShowListener = js.Any.fromFunction1((t0: XSlideShowListener) => removeSlideShowListener(t0).runNow()), resume = resume.toJsFn, stopSound = stopSound.toJsFn)
    __obj.asInstanceOf[XSlideShowController]
  }
  
  extension [Self <: XSlideShowController](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
    
    inline def setAddSlideShowListener(value: XSlideShowListener => Callback): Self = StObject.set(x, "addSlideShowListener", js.Any.fromFunction1((t0: XSlideShowListener) => value(t0).runNow()))
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "AlwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setBlankScreen(value: Double => Callback): Self = StObject.set(x, "blankScreen", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCurrentSlide(value: XDrawPage): Self = StObject.set(x, "CurrentSlide", value.asInstanceOf[js.Any])
    
    inline def setCurrentSlideIndex(value: Double): Self = StObject.set(x, "CurrentSlideIndex", value.asInstanceOf[js.Any])
    
    inline def setDeactivate(value: Callback): Self = StObject.set(x, "deactivate", value.toJsFn)
    
    inline def setGetCurrentSlide(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getCurrentSlide", value.toJsFn)
    
    inline def setGetCurrentSlideIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentSlideIndex", value.toJsFn)
    
    inline def setGetNextSlideIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getNextSlideIndex", value.toJsFn)
    
    inline def setGetSlideByIndex(value: Double => XDrawPage): Self = StObject.set(x, "getSlideByIndex", js.Any.fromFunction1(value))
    
    inline def setGetSlideCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSlideCount", value.toJsFn)
    
    inline def setGetSlideShow(value: CallbackTo[XSlideShow]): Self = StObject.set(x, "getSlideShow", value.toJsFn)
    
    inline def setGotoBookmark(value: String => Callback): Self = StObject.set(x, "gotoBookmark", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGotoFirstSlide(value: Callback): Self = StObject.set(x, "gotoFirstSlide", value.toJsFn)
    
    inline def setGotoLastSlide(value: Callback): Self = StObject.set(x, "gotoLastSlide", value.toJsFn)
    
    inline def setGotoNextEffect(value: Callback): Self = StObject.set(x, "gotoNextEffect", value.toJsFn)
    
    inline def setGotoNextSlide(value: Callback): Self = StObject.set(x, "gotoNextSlide", value.toJsFn)
    
    inline def setGotoPreviousEffect(value: Callback): Self = StObject.set(x, "gotoPreviousEffect", value.toJsFn)
    
    inline def setGotoPreviousSlide(value: Callback): Self = StObject.set(x, "gotoPreviousSlide", value.toJsFn)
    
    inline def setGotoSlide(value: XDrawPage => Callback): Self = StObject.set(x, "gotoSlide", js.Any.fromFunction1((t0: XDrawPage) => value(t0).runNow()))
    
    inline def setGotoSlideIndex(value: Double => Callback): Self = StObject.set(x, "gotoSlideIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setIsEndless(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEndless", value.toJsFn)
    
    inline def setIsFullScreen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFullScreen", value.toJsFn)
    
    inline def setIsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPaused", value.toJsFn)
    
    inline def setIsRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRunning", value.toJsFn)
    
    inline def setMouseVisible(value: Boolean): Self = StObject.set(x, "MouseVisible", value.asInstanceOf[js.Any])
    
    inline def setNextSlideIndex(value: Double): Self = StObject.set(x, "NextSlideIndex", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPenColor(value: Double): Self = StObject.set(x, "PenColor", value.asInstanceOf[js.Any])
    
    inline def setPenWidth(value: Double): Self = StObject.set(x, "PenWidth", value.asInstanceOf[js.Any])
    
    inline def setRemoveSlideShowListener(value: XSlideShowListener => Callback): Self = StObject.set(x, "removeSlideShowListener", js.Any.fromFunction1((t0: XSlideShowListener) => value(t0).runNow()))
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSlideCount(value: Double): Self = StObject.set(x, "SlideCount", value.asInstanceOf[js.Any])
    
    inline def setSlideShow(value: XSlideShow): Self = StObject.set(x, "SlideShow", value.asInstanceOf[js.Any])
    
    inline def setStopSound(value: Callback): Self = StObject.set(x, "stopSound", value.toJsFn)
    
    inline def setUsePen(value: Boolean): Self = StObject.set(x, "UsePen", value.asInstanceOf[js.Any])
  }
}
