package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.IHandle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`track-error`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.track
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackViewModel
  extends StObject
     with Accessor
     with Evented
     with GeolocationPositioning
     with GoTo {
  
  @JSName("on")
  def on_track(name: track, eventHandler: TrackViewModelTrackEventHandler): IHandle = js.native
  @JSName("on")
  def on_trackerror(name: `track-error`, eventHandler: TrackViewModelTrackErrorEventHandler): IHandle = js.native
  
  /**
    * When executed, [tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking) starts at the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#start)
    */
  def start(): scala.Unit = js.native
  
  /**
    * The current state of the widget.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#state)
    */
  val state: disabled | ready | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tracking | waiting = js.native
  
  /**
    * Stops tracking the user's location when executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#stop)
    */
  def stop(): scala.Unit = js.native
  
  /**
    * Indicates whether new positions are being watched.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking)
    */
  val tracking: Boolean = js.native
}
