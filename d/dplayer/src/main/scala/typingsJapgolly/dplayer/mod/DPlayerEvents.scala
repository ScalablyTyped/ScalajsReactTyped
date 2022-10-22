package typingsJapgolly.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DPlayerEvents extends StObject
@JSImport("dplayer", "DPlayerEvents")
@js.native
object DPlayerEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DPlayerEvents & String] = js.native
  
  @js.native
  sealed trait abort
    extends StObject
       with DPlayerEvents
  /* "abort" */ val abort: typingsJapgolly.dplayer.mod.DPlayerEvents.abort & String = js.native
  
  @js.native
  sealed trait canplay
    extends StObject
       with DPlayerEvents
  /* "canplay" */ val canplay: typingsJapgolly.dplayer.mod.DPlayerEvents.canplay & String = js.native
  
  @js.native
  sealed trait canplaythrough
    extends StObject
       with DPlayerEvents
  /* "canplaythrough" */ val canplaythrough: typingsJapgolly.dplayer.mod.DPlayerEvents.canplaythrough & String = js.native
  
  @js.native
  sealed trait contextmenu_hide
    extends StObject
       with DPlayerEvents
  /* "contextmenu_hide" */ val contextmenu_hide: typingsJapgolly.dplayer.mod.DPlayerEvents.contextmenu_hide & String = js.native
  
  @js.native
  sealed trait contextmenu_show
    extends StObject
       with DPlayerEvents
  /* "contextmenu_show" */ val contextmenu_show: typingsJapgolly.dplayer.mod.DPlayerEvents.contextmenu_show & String = js.native
  
  @js.native
  sealed trait danmaku_clear
    extends StObject
       with DPlayerEvents
  /* "danmaku_clear" */ val danmaku_clear: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_clear & String = js.native
  
  @js.native
  sealed trait danmaku_hide
    extends StObject
       with DPlayerEvents
  /* "danmaku_hide" */ val danmaku_hide: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_hide & String = js.native
  
  @js.native
  sealed trait danmaku_loaded
    extends StObject
       with DPlayerEvents
  /* "danmaku_loaded" */ val danmaku_loaded: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_loaded & String = js.native
  
  @js.native
  sealed trait danmaku_opacity
    extends StObject
       with DPlayerEvents
  /* "danmaku_opacity" */ val danmaku_opacity: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_opacity & String = js.native
  
  @js.native
  sealed trait danmaku_send
    extends StObject
       with DPlayerEvents
  /* "danmaku_send" */ val danmaku_send: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_send & String = js.native
  
  @js.native
  sealed trait danmaku_show
    extends StObject
       with DPlayerEvents
  /* "danmaku_show" */ val danmaku_show: typingsJapgolly.dplayer.mod.DPlayerEvents.danmaku_show & String = js.native
  
  @js.native
  sealed trait destroy
    extends StObject
       with DPlayerEvents
  /* "destroy" */ val destroy: typingsJapgolly.dplayer.mod.DPlayerEvents.destroy & String = js.native
  
  @js.native
  sealed trait durationchange
    extends StObject
       with DPlayerEvents
  /* "durationchange" */ val durationchange: typingsJapgolly.dplayer.mod.DPlayerEvents.durationchange & String = js.native
  
  @js.native
  sealed trait emptied
    extends StObject
       with DPlayerEvents
  /* "emptied" */ val emptied: typingsJapgolly.dplayer.mod.DPlayerEvents.emptied & String = js.native
  
  @js.native
  sealed trait ended
    extends StObject
       with DPlayerEvents
  /* "ended" */ val ended: typingsJapgolly.dplayer.mod.DPlayerEvents.ended & String = js.native
  
  @js.native
  sealed trait error
    extends StObject
       with DPlayerEvents
  /* "error" */ val error: typingsJapgolly.dplayer.mod.DPlayerEvents.error & String = js.native
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with DPlayerEvents
  /* "fullscreen" */ val fullscreen: typingsJapgolly.dplayer.mod.DPlayerEvents.fullscreen & String = js.native
  
  @js.native
  sealed trait fullscreen_cancel
    extends StObject
       with DPlayerEvents
  /* "fullscreen_cancel" */ val fullscreen_cancel: typingsJapgolly.dplayer.mod.DPlayerEvents.fullscreen_cancel & String = js.native
  
  @js.native
  sealed trait loadeddata
    extends StObject
       with DPlayerEvents
  /* "loadeddata" */ val loadeddata: typingsJapgolly.dplayer.mod.DPlayerEvents.loadeddata & String = js.native
  
  @js.native
  sealed trait loadedmetadata
    extends StObject
       with DPlayerEvents
  /* "loadedmetadata" */ val loadedmetadata: typingsJapgolly.dplayer.mod.DPlayerEvents.loadedmetadata & String = js.native
  
  @js.native
  sealed trait loadstart
    extends StObject
       with DPlayerEvents
  /* "loadstart" */ val loadstart: typingsJapgolly.dplayer.mod.DPlayerEvents.loadstart & String = js.native
  
  @js.native
  sealed trait mozaudioavailable
    extends StObject
       with DPlayerEvents
  /* "mozaudioavailable" */ val mozaudioavailable: typingsJapgolly.dplayer.mod.DPlayerEvents.mozaudioavailable & String = js.native
  
  @js.native
  sealed trait notice_hide
    extends StObject
       with DPlayerEvents
  /* "notice_hide" */ val notice_hide: typingsJapgolly.dplayer.mod.DPlayerEvents.notice_hide & String = js.native
  
  @js.native
  sealed trait notice_show
    extends StObject
       with DPlayerEvents
  /* "notice_show" */ val notice_show: typingsJapgolly.dplayer.mod.DPlayerEvents.notice_show & String = js.native
  
  @js.native
  sealed trait pause
    extends StObject
       with DPlayerEvents
  /* "pause" */ val pause: typingsJapgolly.dplayer.mod.DPlayerEvents.pause & String = js.native
  
  @js.native
  sealed trait play
    extends StObject
       with DPlayerEvents
  /* "play" */ val play: typingsJapgolly.dplayer.mod.DPlayerEvents.play & String = js.native
  
  @js.native
  sealed trait playing
    extends StObject
       with DPlayerEvents
  /* "playing" */ val playing: typingsJapgolly.dplayer.mod.DPlayerEvents.playing & String = js.native
  
  @js.native
  sealed trait progress
    extends StObject
       with DPlayerEvents
  /* "progress" */ val progress: typingsJapgolly.dplayer.mod.DPlayerEvents.progress & String = js.native
  
  @js.native
  sealed trait quality_end
    extends StObject
       with DPlayerEvents
  /* "quality_end" */ val quality_end: typingsJapgolly.dplayer.mod.DPlayerEvents.quality_end & String = js.native
  
  @js.native
  sealed trait quality_start
    extends StObject
       with DPlayerEvents
  /* "quality_start" */ val quality_start: typingsJapgolly.dplayer.mod.DPlayerEvents.quality_start & String = js.native
  
  @js.native
  sealed trait ratechange
    extends StObject
       with DPlayerEvents
  /* "ratechange" */ val ratechange: typingsJapgolly.dplayer.mod.DPlayerEvents.ratechange & String = js.native
  
  @js.native
  sealed trait resize
    extends StObject
       with DPlayerEvents
  /* "resize" */ val resize: typingsJapgolly.dplayer.mod.DPlayerEvents.resize & String = js.native
  
  @js.native
  sealed trait screenshot
    extends StObject
       with DPlayerEvents
  /* "screenshot" */ val screenshot: typingsJapgolly.dplayer.mod.DPlayerEvents.screenshot & String = js.native
  
  @js.native
  sealed trait seeked
    extends StObject
       with DPlayerEvents
  /* "seeked" */ val seeked: typingsJapgolly.dplayer.mod.DPlayerEvents.seeked & String = js.native
  
  @js.native
  sealed trait seeking
    extends StObject
       with DPlayerEvents
  /* "seeking" */ val seeking: typingsJapgolly.dplayer.mod.DPlayerEvents.seeking & String = js.native
  
  @js.native
  sealed trait stalled
    extends StObject
       with DPlayerEvents
  /* "stalled" */ val stalled: typingsJapgolly.dplayer.mod.DPlayerEvents.stalled & String = js.native
  
  @js.native
  sealed trait subtitle_change
    extends StObject
       with DPlayerEvents
  /* "subtitle_change" */ val subtitle_change: typingsJapgolly.dplayer.mod.DPlayerEvents.subtitle_change & String = js.native
  
  @js.native
  sealed trait subtitle_hide
    extends StObject
       with DPlayerEvents
  /* "subtitle_hide" */ val subtitle_hide: typingsJapgolly.dplayer.mod.DPlayerEvents.subtitle_hide & String = js.native
  
  @js.native
  sealed trait subtitle_show
    extends StObject
       with DPlayerEvents
  /* "subtitle_show" */ val subtitle_show: typingsJapgolly.dplayer.mod.DPlayerEvents.subtitle_show & String = js.native
  
  @js.native
  sealed trait suspend
    extends StObject
       with DPlayerEvents
  /* "suspend" */ val suspend: typingsJapgolly.dplayer.mod.DPlayerEvents.suspend & String = js.native
  
  @js.native
  sealed trait thumbnails_hide
    extends StObject
       with DPlayerEvents
  /* "thumbnails_hide" */ val thumbnails_hide: typingsJapgolly.dplayer.mod.DPlayerEvents.thumbnails_hide & String = js.native
  
  @js.native
  sealed trait thumbnails_show
    extends StObject
       with DPlayerEvents
  /* "thumbnails_show" */ val thumbnails_show: typingsJapgolly.dplayer.mod.DPlayerEvents.thumbnails_show & String = js.native
  
  @js.native
  sealed trait timeupdate
    extends StObject
       with DPlayerEvents
  /* "timeupdate" */ val timeupdate: typingsJapgolly.dplayer.mod.DPlayerEvents.timeupdate & String = js.native
  
  @js.native
  sealed trait volumechange
    extends StObject
       with DPlayerEvents
  /* "volumechange" */ val volumechange: typingsJapgolly.dplayer.mod.DPlayerEvents.volumechange & String = js.native
  
  @js.native
  sealed trait waiting
    extends StObject
       with DPlayerEvents
  /* "waiting" */ val waiting: typingsJapgolly.dplayer.mod.DPlayerEvents.waiting & String = js.native
}
