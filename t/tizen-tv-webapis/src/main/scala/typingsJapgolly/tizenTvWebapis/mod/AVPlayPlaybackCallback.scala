package typingsJapgolly.tizenTvWebapis.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlayPlaybackCallback extends StObject {
  
  /**
    * Callback method for asynchronous buffering complete notifications.
    *
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onbufferingcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback method for asynchronous buffering progress notifications.
    *
    *
    * @param percent unsigned long
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onbufferingprogress: js.UndefOr[js.Function1[/* percent */ Double, Unit]] = js.undefined
  
  /**
    * Callback method for asynchronous buffering started notifications.
    *
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onbufferingstart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback method for the current playback time.
    *
    * @param currentTime unsigned long
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var oncurrentplaytime: js.UndefOr[js.Function1[/* currentTime */ Double, Unit]] = js.undefined
  
  /**
    * Callback method for DRM information notifications.
    *
    * @param type AVPlayDrmType object
    *
    * @param data drmData
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var ondrmevent: js.UndefOr[js.Function2[/* type */ AVPlayDrmType, /* data */ js.Object, Unit]] = js.undefined
  
  /**
    * Callback method for AVPlay error notifications.
    *
    * @param eventid AVPlayError object
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onerror: js.UndefOr[js.Function1[/* eventid */ AVPlayError, Unit]] = js.undefined
  
  /**
    * Callback method for asynchronous event notifications.
    *
    * @param eventid AVPlayEvent object
    *
    * @param data DOMString
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onevent: js.UndefOr[js.Function2[/* eventid */ AVPlayEvent, /* data */ String, Unit]] = js.undefined
  
  /**
    * Callback method for asynchronous playback finished notifications.
    *
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onstreamcompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback method for asynchronous subtitle change notifications.
    *
    * @param duration unsigned long
    *
    * @param subtitles DOMString
    *
    * @param type unsigned long
    *
    * @param attributes AVPlaySubtitleAttribute "attr_type": "AttributeType:value"; "start_pos": start position as long; "stop_pos": stop position as long
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var onsubtitlechange: js.UndefOr[
    js.Function4[
      /* duration */ Double, 
      /* subtitles */ String, 
      /* type */ Double, 
      /* attributes */ AVPlaySubtitleAttribute, 
      Unit
    ]
  ] = js.undefined
}
object AVPlayPlaybackCallback {
  
  inline def apply(): AVPlayPlaybackCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AVPlayPlaybackCallback]
  }
  
  extension [Self <: AVPlayPlaybackCallback](x: Self) {
    
    inline def setOnbufferingcomplete(value: Callback): Self = StObject.set(x, "onbufferingcomplete", value.toJsFn)
    
    inline def setOnbufferingcompleteUndefined: Self = StObject.set(x, "onbufferingcomplete", js.undefined)
    
    inline def setOnbufferingprogress(value: /* percent */ Double => Callback): Self = StObject.set(x, "onbufferingprogress", js.Any.fromFunction1((t0: /* percent */ Double) => value(t0).runNow()))
    
    inline def setOnbufferingprogressUndefined: Self = StObject.set(x, "onbufferingprogress", js.undefined)
    
    inline def setOnbufferingstart(value: Callback): Self = StObject.set(x, "onbufferingstart", value.toJsFn)
    
    inline def setOnbufferingstartUndefined: Self = StObject.set(x, "onbufferingstart", js.undefined)
    
    inline def setOncurrentplaytime(value: /* currentTime */ Double => Callback): Self = StObject.set(x, "oncurrentplaytime", js.Any.fromFunction1((t0: /* currentTime */ Double) => value(t0).runNow()))
    
    inline def setOncurrentplaytimeUndefined: Self = StObject.set(x, "oncurrentplaytime", js.undefined)
    
    inline def setOndrmevent(value: (/* type */ AVPlayDrmType, /* data */ js.Object) => Callback): Self = StObject.set(x, "ondrmevent", js.Any.fromFunction2((t0: /* type */ AVPlayDrmType, t1: /* data */ js.Object) => (value(t0, t1)).runNow()))
    
    inline def setOndrmeventUndefined: Self = StObject.set(x, "ondrmevent", js.undefined)
    
    inline def setOnerror(value: /* eventid */ AVPlayError => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* eventid */ AVPlayError) => value(t0).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnevent(value: (/* eventid */ AVPlayEvent, /* data */ String) => Callback): Self = StObject.set(x, "onevent", js.Any.fromFunction2((t0: /* eventid */ AVPlayEvent, t1: /* data */ String) => (value(t0, t1)).runNow()))
    
    inline def setOneventUndefined: Self = StObject.set(x, "onevent", js.undefined)
    
    inline def setOnstreamcompleted(value: Callback): Self = StObject.set(x, "onstreamcompleted", value.toJsFn)
    
    inline def setOnstreamcompletedUndefined: Self = StObject.set(x, "onstreamcompleted", js.undefined)
    
    inline def setOnsubtitlechange(
      value: (/* duration */ Double, /* subtitles */ String, /* type */ Double, /* attributes */ AVPlaySubtitleAttribute) => Callback
    ): Self = StObject.set(x, "onsubtitlechange", js.Any.fromFunction4((t0: /* duration */ Double, t1: /* subtitles */ String, t2: /* type */ Double, t3: /* attributes */ AVPlaySubtitleAttribute) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnsubtitlechangeUndefined: Self = StObject.set(x, "onsubtitlechange", js.undefined)
  }
}
