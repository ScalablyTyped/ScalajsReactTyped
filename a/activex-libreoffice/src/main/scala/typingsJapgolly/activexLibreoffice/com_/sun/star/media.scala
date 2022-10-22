package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  /** a {@link com.sun.star.media.XPlayer} factory. This helps creating new players. */
  type Manager = XManager
  
  /** This interface provides an easy access to a stream images using their position in the time. */
  trait XFrameGrabber extends StObject {
    
    /**
      * returns the image of the underlying stream at a given position
      * @param fMediaTime the time in seconds of the image to get. This time has to be a positive value inferior to the stream duration.
      */
    def grabFrame(fMediaTime: Double): XGraphic
  }
  object XFrameGrabber {
    
    inline def apply(grabFrame: Double => XGraphic): XFrameGrabber = {
      val __obj = js.Dynamic.literal(grabFrame = js.Any.fromFunction1(grabFrame))
      __obj.asInstanceOf[XFrameGrabber]
    }
    
    extension [Self <: XFrameGrabber](x: Self) {
      
      inline def setGrabFrame(value: Double => XGraphic): Self = StObject.set(x, "grabFrame", js.Any.fromFunction1(value))
    }
  }
  
  /** the {@link com.sun.star.media.XPlayer} factory interface */
  trait XManager extends StObject {
    
    /**
      * creates a new media player
      * @param aURL the URL of the media to play
      */
    def createPlayer(aURL: String): XPlayer
  }
  object XManager {
    
    inline def apply(createPlayer: String => XPlayer): XManager = {
      val __obj = js.Dynamic.literal(createPlayer = js.Any.fromFunction1(createPlayer))
      __obj.asInstanceOf[XManager]
    }
    
    extension [Self <: XManager](x: Self) {
      
      inline def setCreatePlayer(value: String => XPlayer): Self = StObject.set(x, "createPlayer", js.Any.fromFunction1(value))
    }
  }
  
  /** is the multimedia stream handling interface. This allows to perform every basic operation on videos and sounds. */
  trait XPlayer extends StObject {
    
    /**
      * gets the stream length
      * @returns the stream length in second
      */
    val Duration: Double
    
    /**
      * gets the current position of the cursor in the stream
      * @returns the cursor position in seconds
      */
    var MediaTime: Double
    
    /**
      * gets the preferred window size
      * @returns the {@link com.sun.star.awt.Size}
      */
    val PreferredPlayerWindowSize: Size
    
    /**
      * gets the current audio volume in decibel
      * @returns the volume in decibel
      */
    var VolumeDB: Double
    
    /** gets a frame grabber for this stream. */
    def createFrameGrabber(): XFrameGrabber
    
    /**
      * gets a new player window for this stream control
      * @param aArguments arguments passed to the window during its creation.
      */
    def createPlayerWindow(aArguments: SeqEquiv[Any]): XPlayerWindow
    
    /**
      * gets the stream length
      * @returns the stream length in second
      */
    def getDuration(): Double
    
    /**
      * gets the current position of the cursor in the stream
      * @returns the cursor position in seconds
      */
    def getMediaTime(): Double
    
    /**
      * gets the preferred window size
      * @returns the {@link com.sun.star.awt.Size}
      */
    def getPreferredPlayerWindowSize(): Size
    
    /**
      * gets the current audio volume in decibel
      * @returns the volume in decibel
      */
    def getVolumeDB(): Double
    
    /**
      * gets whether the volume is temporarily down to `0` or not.
      * @returns `TRUE` if the volume is temporarily set to `0` , `FALSE` otherwise.
      */
    def isMute(): Boolean
    
    /**
      * indicates whether the stream reading will restart after the end of the stream.
      * @returns `TRUE` if the stream will loop, `FALSE` otherwise.
      */
    def isPlaybackLoop(): Boolean
    
    /**
      * indicates whether the stream is played or not.
      * @returns `TRUE` if the stream is played, `FALSE` otherwise
      */
    def isPlaying(): Boolean
    
    /**
      * sets the new cursor position in the media stream. After using this method the stream is stopped.
      * @param fTime the new position to set in seconds
      */
    def setMediaTime(fTime: Double): Unit
    
    /**
      * sets the volume to `0` or to its previous value.
      * @param bSet sets the volume to `0` if `TRUE` , and switch to the previous non-null value if `FALSE`
      */
    def setMute(bSet: Boolean): Unit
    
    /**
      * sets whether the stream reading should restart at the stream start after the end of the stream.
      * @param bSet loops if set to `TRUE` , otherwise stops at the end of the stream.
      */
    def setPlaybackLoop(bSet: Boolean): Unit
    
    /**
      * sets the audio volume in decibel.
      * @param nDB the new volume in Decibel
      */
    def setVolumeDB(nDB: Double): Unit
    
    /** starts reading the stream from the current position. */
    def start(): Unit
    
    /** stops reading the stream and leave the cursor at its current position. */
    def stop(): Unit
  }
  object XPlayer {
    
    inline def apply(
      Duration: Double,
      MediaTime: Double,
      PreferredPlayerWindowSize: Size,
      VolumeDB: Double,
      createFrameGrabber: CallbackTo[XFrameGrabber],
      createPlayerWindow: SeqEquiv[Any] => XPlayerWindow,
      getDuration: CallbackTo[Double],
      getMediaTime: CallbackTo[Double],
      getPreferredPlayerWindowSize: CallbackTo[Size],
      getVolumeDB: CallbackTo[Double],
      isMute: CallbackTo[Boolean],
      isPlaybackLoop: CallbackTo[Boolean],
      isPlaying: CallbackTo[Boolean],
      setMediaTime: Double => Callback,
      setMute: Boolean => Callback,
      setPlaybackLoop: Boolean => Callback,
      setVolumeDB: Double => Callback,
      start: Callback,
      stop: Callback
    ): XPlayer = {
      val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], MediaTime = MediaTime.asInstanceOf[js.Any], PreferredPlayerWindowSize = PreferredPlayerWindowSize.asInstanceOf[js.Any], VolumeDB = VolumeDB.asInstanceOf[js.Any], createFrameGrabber = createFrameGrabber.toJsFn, createPlayerWindow = js.Any.fromFunction1(createPlayerWindow), getDuration = getDuration.toJsFn, getMediaTime = getMediaTime.toJsFn, getPreferredPlayerWindowSize = getPreferredPlayerWindowSize.toJsFn, getVolumeDB = getVolumeDB.toJsFn, isMute = isMute.toJsFn, isPlaybackLoop = isPlaybackLoop.toJsFn, isPlaying = isPlaying.toJsFn, setMediaTime = js.Any.fromFunction1((t0: Double) => setMediaTime(t0).runNow()), setMute = js.Any.fromFunction1((t0: Boolean) => setMute(t0).runNow()), setPlaybackLoop = js.Any.fromFunction1((t0: Boolean) => setPlaybackLoop(t0).runNow()), setVolumeDB = js.Any.fromFunction1((t0: Double) => setVolumeDB(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[XPlayer]
    }
    
    extension [Self <: XPlayer](x: Self) {
      
      inline def setCreateFrameGrabber(value: CallbackTo[XFrameGrabber]): Self = StObject.set(x, "createFrameGrabber", value.toJsFn)
      
      inline def setCreatePlayerWindow(value: SeqEquiv[Any] => XPlayerWindow): Self = StObject.set(x, "createPlayerWindow", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
      
      inline def setGetMediaTime(value: CallbackTo[Double]): Self = StObject.set(x, "getMediaTime", value.toJsFn)
      
      inline def setGetPreferredPlayerWindowSize(value: CallbackTo[Size]): Self = StObject.set(x, "getPreferredPlayerWindowSize", value.toJsFn)
      
      inline def setGetVolumeDB(value: CallbackTo[Double]): Self = StObject.set(x, "getVolumeDB", value.toJsFn)
      
      inline def setIsMute(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMute", value.toJsFn)
      
      inline def setIsPlaybackLoop(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPlaybackLoop", value.toJsFn)
      
      inline def setIsPlaying(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPlaying", value.toJsFn)
      
      inline def setMediaTime(value: Double): Self = StObject.set(x, "MediaTime", value.asInstanceOf[js.Any])
      
      inline def setPreferredPlayerWindowSize(value: Size): Self = StObject.set(x, "PreferredPlayerWindowSize", value.asInstanceOf[js.Any])
      
      inline def setSetMediaTime(value: Double => Callback): Self = StObject.set(x, "setMediaTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMute(value: Boolean => Callback): Self = StObject.set(x, "setMute", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetPlaybackLoop(value: Boolean => Callback): Self = StObject.set(x, "setPlaybackLoop", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetVolumeDB(value: Double => Callback): Self = StObject.set(x, "setVolumeDB", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setVolumeDB(value: Double): Self = StObject.set(x, "VolumeDB", value.asInstanceOf[js.Any])
    }
  }
  
  /** interacts with the media player window */
  trait XPlayerWindow
    extends StObject
       with XWindow {
    
    /** gets the current media ratio. */
    var ZoomLevel: typingsJapgolly.activexLibreoffice.com_.sun.star.media.ZoomLevel
    
    /** gets the current media ratio. */
    def getZoomLevel(): ZoomLevel
    
    /**
      * changes the pointer for the player window.
      * @param SystemPointerType a {@link com.sun.star.awt.SystemPointer}
      */
    def setPointerType(SystemPointerType: Double): Unit
    
    /** changes the zoom of the media played by the window. */
    def setZoomLevel(ZoomLevel: ZoomLevel): Boolean
    
    /** redraws the player window */
    def update(): Unit
  }
  object XPlayerWindow {
    
    inline def apply(
      PosSize: Rectangle,
      ZoomLevel: ZoomLevel,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      dispose: Callback,
      getPosSize: CallbackTo[Rectangle],
      getZoomLevel: CallbackTo[ZoomLevel],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setPointerType: Double => Callback,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoomLevel: ZoomLevel => Boolean,
      update: Callback
    ): XPlayerWindow = {
      val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], ZoomLevel = ZoomLevel.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), dispose = dispose.toJsFn, getPosSize = getPosSize.toJsFn, getZoomLevel = getZoomLevel.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setPointerType = js.Any.fromFunction1((t0: Double) => setPointerType(t0).runNow()), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoomLevel = js.Any.fromFunction1(setZoomLevel), update = update.toJsFn)
      __obj.asInstanceOf[XPlayerWindow]
    }
    
    extension [Self <: XPlayerWindow](x: Self) {
      
      inline def setGetZoomLevel(value: CallbackTo[ZoomLevel]): Self = StObject.set(x, "getZoomLevel", value.toJsFn)
      
      inline def setSetPointerType(value: Double => Callback): Self = StObject.set(x, "setPointerType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetZoomLevel(value: ZoomLevel => Boolean): Self = StObject.set(x, "setZoomLevel", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setZoomLevel(value: ZoomLevel): Self = StObject.set(x, "ZoomLevel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
  */
  trait ZoomLevel extends StObject
  object ZoomLevel {
    
    /** specifies that the video should be zoomed to window size */
    inline def FIT_TO_WINDOW: `2` = 2.asInstanceOf[`2`]
    
    /** specifies that the video should be zoomed to window size with using a fixed aspect ratio */
    inline def FIT_TO_WINDOW_FIXED_ASPECT: `3` = 3.asInstanceOf[`3`]
    
    /** specifies that the video should be displayed in fullscreen mode, if available */
    inline def FULLSCREEN: `4` = 4.asInstanceOf[`4`]
    
    /** specifies that the video window itself is not available at all, e.g. in cases of pure audio playback */
    inline def NOT_AVAILABLE: `0` = 0.asInstanceOf[`0`]
    
    /** specifies that the video should be displayed with its original size */
    inline def ORIGINAL: `1` = 1.asInstanceOf[`1`]
    
    /** specifies that the video should be zoomed to a factor of 1:2 */
    inline def ZOOM_1_TO_2: `6` = 6.asInstanceOf[`6`]
    
    /** specifies that the video should be zoomed to a factor of 1:4 */
    inline def ZOOM_1_TO_4: `5` = 5.asInstanceOf[`5`]
    
    /** specifies that the video should be zoomed to a factor of 2:1 */
    inline def ZOOM_2_TO_1: `7` = 7.asInstanceOf[`7`]
    
    /** specifies that the video should be zoomed to a factor of 4:1 */
    inline def ZOOM_4_TO_1: `8` = 8.asInstanceOf[`8`]
  }
}
