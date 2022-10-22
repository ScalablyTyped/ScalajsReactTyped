package typingsJapgolly.winrt.global.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError
import typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionState
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlayTo {
  
  @JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
  @js.native
  open class CurrentTimeChangeRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs {
    
    /* CompleteClass */
    var time: Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.MuteChangeRequestedEventArgs")
  @js.native
  open class MuteChangeRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.MuteChangeRequestedEventArgs {
    
    /* CompleteClass */
    var mute: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnection")
  @js.native
  open class PlayToConnection ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnection {
    
    /* CompleteClass */
    var onerror: Any = js.native
    
    /* CompleteClass */
    var onstatechanged: Any = js.native
    
    /* CompleteClass */
    var ontransferred: Any = js.native
    
    /* CompleteClass */
    var state: PlayToConnectionState = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
  @js.native
  object PlayToConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError & Double] = js.native
    
    /* 2 */ val deviceError: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError & Double = js.native
    
    /* 3 */ val deviceLocked: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked & Double = js.native
    
    /* 1 */ val deviceNotResponding: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionError.none & Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
  @js.native
  open class PlayToConnectionErrorEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs {
    
    /* CompleteClass */
    var code: PlayToConnectionError = js.native
    
    /* CompleteClass */
    var message: String = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
  @js.native
  object PlayToConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionState & Double] = js.native
    
    /* 1 */ val connected: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected & Double = js.native
    
    /* 0 */ val disconnected: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected & Double = js.native
    
    /* 2 */ val rendering: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering & Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
  @js.native
  open class PlayToConnectionStateChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs {
    
    /* CompleteClass */
    var currentState: PlayToConnectionState = js.native
    
    /* CompleteClass */
    var previousState: PlayToConnectionState = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
  @js.native
  open class PlayToConnectionTransferredEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs {
    
    /* CompleteClass */
    var currentSource: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    
    /* CompleteClass */
    var previousSource: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToManager")
  @js.native
  open class PlayToManager ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToManager {
    
    /* CompleteClass */
    var defaultSourceSelection: Boolean = js.native
    
    /* CompleteClass */
    var onsourcerequested: Any = js.native
    
    /* CompleteClass */
    var onsourceselected: Any = js.native
  }
  /* static members */
  object PlayToManager {
    
    @JSGlobal("Windows.Media.PlayTo.PlayToManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToManager]
    
    inline def showPlayToUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showPlayToUI")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
  @js.native
  open class PlayToReceiver ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToReceiver {
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    override def notifyDurationChange(duration: Double): Unit = js.native
    
    /* CompleteClass */
    override def notifyEnded(): Unit = js.native
    
    /* CompleteClass */
    override def notifyError(): Unit = js.native
    
    /* CompleteClass */
    override def notifyLoadedMetadata(): Unit = js.native
    
    /* CompleteClass */
    override def notifyPaused(): Unit = js.native
    
    /* CompleteClass */
    override def notifyPlaying(): Unit = js.native
    
    /* CompleteClass */
    override def notifyRateChange(rate: Double): Unit = js.native
    
    /* CompleteClass */
    override def notifySeeked(): Unit = js.native
    
    /* CompleteClass */
    override def notifySeeking(): Unit = js.native
    
    /* CompleteClass */
    override def notifyStopped(): Unit = js.native
    
    /* CompleteClass */
    override def notifyTimeUpdate(currentTime: Double): Unit = js.native
    
    /* CompleteClass */
    override def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
    
    /* CompleteClass */
    var oncurrenttimechangerequested: Any = js.native
    
    /* CompleteClass */
    var onmutechangerequested: Any = js.native
    
    /* CompleteClass */
    var onpauserequested: Any = js.native
    
    /* CompleteClass */
    var onplaybackratechangerequested: Any = js.native
    
    /* CompleteClass */
    var onplayrequested: Any = js.native
    
    /* CompleteClass */
    var onsourcechangerequested: Any = js.native
    
    /* CompleteClass */
    var onstoprequested: Any = js.native
    
    /* CompleteClass */
    var ontimeupdaterequested: Any = js.native
    
    /* CompleteClass */
    var onvolumechangerequested: Any = js.native
    
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /* CompleteClass */
    override def startAsync(): IAsyncAction = js.native
    
    /* CompleteClass */
    override def stopAsync(): IAsyncAction = js.native
    
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /* CompleteClass */
    var supportsImage: Boolean = js.native
    
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSource")
  @js.native
  open class PlayToSource ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource {
    
    /* CompleteClass */
    var connection: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToConnection = js.native
    
    /* CompleteClass */
    var next: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    
    /* CompleteClass */
    override def playNext(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
  @js.native
  open class PlayToSourceDeferral ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
  @js.native
  open class PlayToSourceRequest ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceRequest {
    
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /* CompleteClass */
    override def displayErrorString(errorString: String): Unit = js.native
    
    /* CompleteClass */
    override def getDeferral(): typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceDeferral = js.native
    
    /* CompleteClass */
    override def setSource(value: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
  @js.native
  open class PlayToSourceRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs {
    
    /* CompleteClass */
    var sourceRequest: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceRequest = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
  @js.native
  open class PlayToSourceSelectedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs {
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var icon: IRandomAccessStreamWithContentType = js.native
    
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /* CompleteClass */
    var supportsImage: Boolean = js.native
    
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs")
  @js.native
  open class PlaybackRateChangeRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs {
    
    /* CompleteClass */
    var rate: Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
  @js.native
  open class SourceChangeRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.SourceChangeRequestedEventArgs {
    
    /* CompleteClass */
    var album: String = js.native
    
    /* CompleteClass */
    var author: String = js.native
    
    /* CompleteClass */
    var date: js.Date = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var genre: String = js.native
    
    /* CompleteClass */
    var properties: IMapView[String, Any] = js.native
    
    /* CompleteClass */
    var rating: Double = js.native
    
    /* CompleteClass */
    var stream: IRandomAccessStreamWithContentType = js.native
    
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.VolumeChangeRequestedEventArgs")
  @js.native
  open class VolumeChangeRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs {
    
    /* CompleteClass */
    var volume: Double = js.native
  }
}
