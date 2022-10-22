package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxObjectContainer control.
  */
trait ASPxClientObjectContainer
  extends StObject
     with ASPxClientControl {
  
  /**
    * Play the Flash movie backwards.
    */
  def Back(): Unit
  
  /**
    * Occurs on the client side when the FSCommand action is called within the associated flash object's action script.
    */
  var FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]]
  
  /**
    * Play the Flash movie forwards.
    */
  def Forward(): Unit
  
  /**
    * Returns the value of the Flash variable specified. A string value that represents the Flash variable's value.
    * @param name A string value that specifies the Flash variable.
    */
  def GetVariable(name: String): String
  
  /**
    * Activates the specified frame in the Flash movie.
    * @param frameNumber An integer value that specifies the requested frame.
    */
  def GotoFrame(frameNumber: Double): Unit
  
  /**
    * Indicates whether the Flash movie is currently playing.
    */
  def IsPlaying(): Boolean
  
  /**
    * Loads the Flash movie to the specified layer.
    * @param layerNumber An integer value that identifies a layer in which to load the movie.
    * @param url A string value that specifies the movie's URL.
    */
  def LoadMovie(layerNumber: Double, url: String): Unit
  
  /**
    * Pans a zoomed-in Flash movie to the specified coordinates.
    * @param x An integer value that specifies the X-coordinate.
    * @param y An integer value that specifies the Y-coordinate.
    * @param mode 0 the coordinates are pixels; 1 the coordinates are a percentage of the window.
    */
  def Pan(x: Double, y: Double, mode: Double): Unit
  
  /**
    * Returns the percent of the Flash Player movie that has streamed into the browser so far.
    */
  def PercentLoaded(): String
  
  /**
    * Starts playing media files.
    */
  def Play(): Unit
  
  /**
    * Starts playing a Quick Time movie.
    */
  def QTPlay(): Unit
  
  /**
    * Rewinds a Quick Time movie to the first frame.
    */
  def QTRewind(): Unit
  
  /**
    * Steps through a Quick Time video stream by a specified number of frames.
    * @param count An integer value that specifies the number of frames to step.
    */
  def QTStep(count: Double): Unit
  
  /**
    * Stops playing a Quick Time movie.
    */
  def QTStopPlay(): Unit
  
  /**
    * Rewinds the Flash movie to the first frame.
    */
  def Rewind(): Unit
  
  /**
    * Sets the value of the specified Flash variable.
    * @param name A string value that specifies the Flash variable.
    * @param value A string value that represents a new value.
    */
  def SetVariable(name: String, value: String): Unit
  
  /**
    * Zooms in on the specified rectangular area of the Flash movie.
    * @param left An integer value that specifies the x-coordinate of the rectangle's left side, in twips.
    * @param top An integer value that specifies the y-coordinate of the rectangle's top side, in twips.
    * @param right An integer value that specifies the x-coordinate of the rectangle's right side, in twips.
    * @param bottom An integer value that specifies the y-coordinate of the rectangle's bottom side, in twips.
    */
  def SetZoomRect(left: Double, top: Double, right: Double, bottom: Double): Unit
  
  /**
    * Stops playing the Flash movie.
    */
  def StopPlay(): Unit
  
  /**
    * Returns the total number of frames in the Flash movie.
    */
  def TotalFrames(): Double
  
  /**
    * Zooms the Flash view by a relative scale factor.
    * @param percent An integer value that specifies the relative scale factor, as a  percentage.
    */
  def Zoom(percent: Double): Unit
}
object ASPxClientObjectContainer {
  
  inline def apply(
    AdjustControl: Callback,
    Back: Callback,
    FlashScriptCommand: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]],
    Forward: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVariable: String => String,
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotoFrame: Double => Callback,
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsPlaying: CallbackTo[Boolean],
    LoadMovie: (Double, String) => Callback,
    Pan: (Double, Double, Double) => Callback,
    PercentLoaded: CallbackTo[String],
    Play: Callback,
    QTPlay: Callback,
    QTRewind: Callback,
    QTStep: Double => Callback,
    QTStopPlay: Callback,
    Rewind: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVariable: (String, String) => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    SetZoomRect: (Double, Double, Double, Double) => Callback,
    StopPlay: Callback,
    TotalFrames: CallbackTo[Double],
    Zoom: Double => Callback,
    name: String
  ): ASPxClientObjectContainer = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Back = Back.toJsFn, FlashScriptCommand = FlashScriptCommand.asInstanceOf[js.Any], Forward = Forward.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVariable = js.Any.fromFunction1(GetVariable), GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotoFrame = js.Any.fromFunction1((t0: Double) => GotoFrame(t0).runNow()), InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], IsPlaying = IsPlaying.toJsFn, LoadMovie = js.Any.fromFunction2((t0: Double, t1: String) => (LoadMovie(t0, t1)).runNow()), Pan = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (Pan(t0, t1, t2)).runNow()), PercentLoaded = PercentLoaded.toJsFn, Play = Play.toJsFn, QTPlay = QTPlay.toJsFn, QTRewind = QTRewind.toJsFn, QTStep = js.Any.fromFunction1((t0: Double) => QTStep(t0).runNow()), QTStopPlay = QTStopPlay.toJsFn, Rewind = Rewind.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVariable = js.Any.fromFunction2((t0: String, t1: String) => (SetVariable(t0, t1)).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), SetZoomRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (SetZoomRect(t0, t1, t2, t3)).runNow()), StopPlay = StopPlay.toJsFn, TotalFrames = TotalFrames.toJsFn, Zoom = js.Any.fromFunction1((t0: Double) => Zoom(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientObjectContainer]
  }
  
  extension [Self <: ASPxClientObjectContainer](x: Self) {
    
    inline def setBack(value: Callback): Self = StObject.set(x, "Back", value.toJsFn)
    
    inline def setFlashScriptCommand(value: ASPxClientEvent[ASPxClientFlashScriptCommandEventHandler[ASPxClientObjectContainer]]): Self = StObject.set(x, "FlashScriptCommand", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Callback): Self = StObject.set(x, "Forward", value.toJsFn)
    
    inline def setGetVariable(value: String => String): Self = StObject.set(x, "GetVariable", js.Any.fromFunction1(value))
    
    inline def setGotoFrame(value: Double => Callback): Self = StObject.set(x, "GotoFrame", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIsPlaying(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsPlaying", value.toJsFn)
    
    inline def setLoadMovie(value: (Double, String) => Callback): Self = StObject.set(x, "LoadMovie", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setPan(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "Pan", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setPercentLoaded(value: CallbackTo[String]): Self = StObject.set(x, "PercentLoaded", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "Play", value.toJsFn)
    
    inline def setQTPlay(value: Callback): Self = StObject.set(x, "QTPlay", value.toJsFn)
    
    inline def setQTRewind(value: Callback): Self = StObject.set(x, "QTRewind", value.toJsFn)
    
    inline def setQTStep(value: Double => Callback): Self = StObject.set(x, "QTStep", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setQTStopPlay(value: Callback): Self = StObject.set(x, "QTStopPlay", value.toJsFn)
    
    inline def setRewind(value: Callback): Self = StObject.set(x, "Rewind", value.toJsFn)
    
    inline def setSetVariable(value: (String, String) => Callback): Self = StObject.set(x, "SetVariable", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetZoomRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "SetZoomRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStopPlay(value: Callback): Self = StObject.set(x, "StopPlay", value.toJsFn)
    
    inline def setTotalFrames(value: CallbackTo[Double]): Self = StObject.set(x, "TotalFrames", value.toJsFn)
    
    inline def setZoom(value: Double => Callback): Self = StObject.set(x, "Zoom", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
