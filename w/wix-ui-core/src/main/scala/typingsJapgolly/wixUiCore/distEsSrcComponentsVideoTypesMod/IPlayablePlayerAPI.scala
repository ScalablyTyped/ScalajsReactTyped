package typingsJapgolly.wixUiCore.distEsSrcComponentsVideoTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayablePlayerAPI
  extends StObject
     with IPlayerAPI {
  
  var attachToElement: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.undefined
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var hideFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hidePictureInPictureControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hidePlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var isMuted: js.UndefOr[Boolean] = js.undefined
  
  var mute: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var on: js.UndefOr[js.Function2[/* event */ String, /* fn */ js.UndefOr[js.Function], Unit]] = js.undefined
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var seekTo: js.UndefOr[js.Function1[/* amount */ Double, Unit]] = js.undefined
  
  var setAlwaysShowLogo: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
  
  var setLogo: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  
  var setLogoClickCallback: js.UndefOr[js.Function1[/* cb */ js.Function, Unit]] = js.undefined
  
  var setVolume: js.UndefOr[js.Function1[/* fraction */ Double, Unit]] = js.undefined
  
  var showFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showPictureInPictureControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showPlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var unmute: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IPlayablePlayerAPI {
  
  inline def apply(): IPlayablePlayerAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlayablePlayerAPI]
  }
  
  extension [Self <: IPlayablePlayerAPI](x: Self) {
    
    inline def setAttachToElement(value: /* el */ HTMLDivElement => Callback): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1((t0: /* el */ HTMLDivElement) => value(t0).runNow()))
    
    inline def setAttachToElementUndefined: Self = StObject.set(x, "attachToElement", js.undefined)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setGetCurrentTime(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTime", value.toJsFn)
    
    inline def setGetCurrentTimeUndefined: Self = StObject.set(x, "getCurrentTime", js.undefined)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
    
    inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
    
    inline def setHideFullScreenControl(value: Callback): Self = StObject.set(x, "hideFullScreenControl", value.toJsFn)
    
    inline def setHideFullScreenControlUndefined: Self = StObject.set(x, "hideFullScreenControl", js.undefined)
    
    inline def setHidePictureInPictureControl(value: Callback): Self = StObject.set(x, "hidePictureInPictureControl", value.toJsFn)
    
    inline def setHidePictureInPictureControlUndefined: Self = StObject.set(x, "hidePictureInPictureControl", js.undefined)
    
    inline def setHidePlayControl(value: Callback): Self = StObject.set(x, "hidePlayControl", value.toJsFn)
    
    inline def setHidePlayControlUndefined: Self = StObject.set(x, "hidePlayControl", js.undefined)
    
    inline def setHideProgressControl(value: Callback): Self = StObject.set(x, "hideProgressControl", value.toJsFn)
    
    inline def setHideProgressControlUndefined: Self = StObject.set(x, "hideProgressControl", js.undefined)
    
    inline def setHideTimeControl(value: Callback): Self = StObject.set(x, "hideTimeControl", value.toJsFn)
    
    inline def setHideTimeControlUndefined: Self = StObject.set(x, "hideTimeControl", js.undefined)
    
    inline def setHideTitle(value: Callback): Self = StObject.set(x, "hideTitle", value.toJsFn)
    
    inline def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
    
    inline def setHideVolumeControl(value: Callback): Self = StObject.set(x, "hideVolumeControl", value.toJsFn)
    
    inline def setHideVolumeControlUndefined: Self = StObject.set(x, "hideVolumeControl", js.undefined)
    
    inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    inline def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
    
    inline def setMute(value: Callback): Self = StObject.set(x, "mute", value.toJsFn)
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setOn(value: (/* event */ String, /* fn */ js.UndefOr[js.Function]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: /* event */ String, t1: /* fn */ js.UndefOr[js.Function]) => (value(t0, t1)).runNow()))
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSeekTo(value: /* amount */ Double => Callback): Self = StObject.set(x, "seekTo", js.Any.fromFunction1((t0: /* amount */ Double) => value(t0).runNow()))
    
    inline def setSeekToUndefined: Self = StObject.set(x, "seekTo", js.undefined)
    
    inline def setSetAlwaysShowLogo(value: /* show */ Boolean => Callback): Self = StObject.set(x, "setAlwaysShowLogo", js.Any.fromFunction1((t0: /* show */ Boolean) => value(t0).runNow()))
    
    inline def setSetAlwaysShowLogoUndefined: Self = StObject.set(x, "setAlwaysShowLogo", js.undefined)
    
    inline def setSetLogo(value: /* url */ String => Callback): Self = StObject.set(x, "setLogo", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
    
    inline def setSetLogoClickCallback(value: /* cb */ js.Function => Callback): Self = StObject.set(x, "setLogoClickCallback", js.Any.fromFunction1((t0: /* cb */ js.Function) => value(t0).runNow()))
    
    inline def setSetLogoClickCallbackUndefined: Self = StObject.set(x, "setLogoClickCallback", js.undefined)
    
    inline def setSetLogoUndefined: Self = StObject.set(x, "setLogo", js.undefined)
    
    inline def setSetVolume(value: /* fraction */ Double => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction1((t0: /* fraction */ Double) => value(t0).runNow()))
    
    inline def setSetVolumeUndefined: Self = StObject.set(x, "setVolume", js.undefined)
    
    inline def setShowFullScreenControl(value: Callback): Self = StObject.set(x, "showFullScreenControl", value.toJsFn)
    
    inline def setShowFullScreenControlUndefined: Self = StObject.set(x, "showFullScreenControl", js.undefined)
    
    inline def setShowPictureInPictureControl(value: Callback): Self = StObject.set(x, "showPictureInPictureControl", value.toJsFn)
    
    inline def setShowPictureInPictureControlUndefined: Self = StObject.set(x, "showPictureInPictureControl", js.undefined)
    
    inline def setShowPlayControl(value: Callback): Self = StObject.set(x, "showPlayControl", value.toJsFn)
    
    inline def setShowPlayControlUndefined: Self = StObject.set(x, "showPlayControl", js.undefined)
    
    inline def setShowProgressControl(value: Callback): Self = StObject.set(x, "showProgressControl", value.toJsFn)
    
    inline def setShowProgressControlUndefined: Self = StObject.set(x, "showProgressControl", js.undefined)
    
    inline def setShowTimeControl(value: Callback): Self = StObject.set(x, "showTimeControl", value.toJsFn)
    
    inline def setShowTimeControlUndefined: Self = StObject.set(x, "showTimeControl", js.undefined)
    
    inline def setShowTitle(value: Callback): Self = StObject.set(x, "showTitle", value.toJsFn)
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setShowVolumeControl(value: Callback): Self = StObject.set(x, "showVolumeControl", value.toJsFn)
    
    inline def setShowVolumeControlUndefined: Self = StObject.set(x, "showVolumeControl", js.undefined)
    
    inline def setUnmute(value: Callback): Self = StObject.set(x, "unmute", value.toJsFn)
    
    inline def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
  }
}
