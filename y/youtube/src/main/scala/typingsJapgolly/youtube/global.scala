package typingsJapgolly.youtube

import org.scalajs.dom.HTMLElement
import typingsJapgolly.youtube.YT.PlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object YT {
    
    @JSGlobal("YT.AutoHide")
    @js.native
    object AutoHide extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.AutoHide & Double] = js.native
      
      /* 0 */ val AlwaysVisible: typingsJapgolly.youtube.YT.AutoHide.AlwaysVisible & Double = js.native
      
      /* 1 */ val HideAllControls: typingsJapgolly.youtube.YT.AutoHide.HideAllControls & Double = js.native
      
      /* 2 */ val HideProgressBar: typingsJapgolly.youtube.YT.AutoHide.HideProgressBar & Double = js.native
    }
    
    @JSGlobal("YT.AutoPlay")
    @js.native
    object AutoPlay extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.AutoPlay & Double] = js.native
      
      /* 1 */ val AutoPlay: typingsJapgolly.youtube.YT.AutoPlay.AutoPlay & Double = js.native
      
      /* 0 */ val NoAutoPlay: typingsJapgolly.youtube.YT.AutoPlay.NoAutoPlay & Double = js.native
    }
    
    @JSGlobal("YT.ClosedCaptionsLoadPolicy")
    @js.native
    object ClosedCaptionsLoadPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.ClosedCaptionsLoadPolicy & Double] = js.native
      
      /* 1 */ val ForceOn: typingsJapgolly.youtube.YT.ClosedCaptionsLoadPolicy.ForceOn & Double = js.native
      
      /* 0 */ val UserDefault: typingsJapgolly.youtube.YT.ClosedCaptionsLoadPolicy.UserDefault & Double = js.native
    }
    
    @JSGlobal("YT.Controls")
    @js.native
    object Controls extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.Controls & Double] = js.native
      
      /* 0 */ val Hide: typingsJapgolly.youtube.YT.Controls.Hide & Double = js.native
      
      /* 2 */ val ShowDelayLoadPlayer: typingsJapgolly.youtube.YT.Controls.ShowDelayLoadPlayer & Double = js.native
      
      /* 1 */ val ShowLoadPlayer: typingsJapgolly.youtube.YT.Controls.ShowLoadPlayer & Double = js.native
    }
    
    @JSGlobal("YT.FullscreenButton")
    @js.native
    object FullscreenButton extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.FullscreenButton & Double] = js.native
      
      /* 0 */ val Hide: typingsJapgolly.youtube.YT.FullscreenButton.Hide & Double = js.native
      
      /* 1 */ val Show: typingsJapgolly.youtube.YT.FullscreenButton.Show & Double = js.native
    }
    
    @JSGlobal("YT.IvLoadPolicy")
    @js.native
    object IvLoadPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.IvLoadPolicy & Double] = js.native
      
      /* 3 */ val Hide: typingsJapgolly.youtube.YT.IvLoadPolicy.Hide & Double = js.native
      
      /* 1 */ val Show: typingsJapgolly.youtube.YT.IvLoadPolicy.Show & Double = js.native
    }
    
    @JSGlobal("YT.JsApi")
    @js.native
    object JsApi extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.JsApi & Double] = js.native
      
      /* 0 */ val Disable: typingsJapgolly.youtube.YT.JsApi.Disable & Double = js.native
      
      /* 1 */ val Enable: typingsJapgolly.youtube.YT.JsApi.Enable & Double = js.native
    }
    
    @JSGlobal("YT.KeyboardControls")
    @js.native
    object KeyboardControls extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.KeyboardControls & Double] = js.native
      
      /* 1 */ val Disable: typingsJapgolly.youtube.YT.KeyboardControls.Disable & Double = js.native
      
      /* 0 */ val Enable: typingsJapgolly.youtube.YT.KeyboardControls.Enable & Double = js.native
    }
    
    @JSGlobal("YT.Loop")
    @js.native
    object Loop extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.Loop & Double] = js.native
      
      /* 1 */ val Loop: typingsJapgolly.youtube.YT.Loop.Loop & Double = js.native
      
      /* 0 */ val SinglePlay: typingsJapgolly.youtube.YT.Loop.SinglePlay & Double = js.native
    }
    
    @JSGlobal("YT.ModestBranding")
    @js.native
    object ModestBranding extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.ModestBranding & Double] = js.native
      
      /* 0 */ val Full: typingsJapgolly.youtube.YT.ModestBranding.Full & Double = js.native
      
      /* 1 */ val Modest: typingsJapgolly.youtube.YT.ModestBranding.Modest & Double = js.native
    }
    
    @JSGlobal("YT.Mute")
    @js.native
    object Mute extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.Mute & Double] = js.native
      
      /* 1 */ val Muted: typingsJapgolly.youtube.YT.Mute.Muted & Double = js.native
      
      /* 0 */ val NotMuted: typingsJapgolly.youtube.YT.Mute.NotMuted & Double = js.native
    }
    
    @JSGlobal("YT.Player")
    @js.native
    open class Player protected ()
      extends StObject
         with typingsJapgolly.youtube.YT.Player {
      /**
        * Initializes a new instance of the Player class.
        *
        * @param container   DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(elt: HTMLElement) = this()
      /**
        * Initializes a new instance of the Player class.
        *
        * @param id   ID of the DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(id: String) = this()
      def this(elt: HTMLElement, options: PlayerOptions) = this()
      def this(id: String, options: PlayerOptions) = this()
    }
    
    @JSGlobal("YT.PlayerError")
    @js.native
    object PlayerError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.PlayerError & Double] = js.native
      
      /* 101 */ val EmbeddingNotAllowed: typingsJapgolly.youtube.YT.PlayerError.EmbeddingNotAllowed & Double = js.native
      
      /* 150 */ val EmbeddingNotAllowed2: typingsJapgolly.youtube.YT.PlayerError.EmbeddingNotAllowed2 & Double = js.native
      
      /* 5 */ val Html5Error: typingsJapgolly.youtube.YT.PlayerError.Html5Error & Double = js.native
      
      /* 2 */ val InvalidParam: typingsJapgolly.youtube.YT.PlayerError.InvalidParam & Double = js.native
      
      /* 100 */ val VideoNotFound: typingsJapgolly.youtube.YT.PlayerError.VideoNotFound & Double = js.native
    }
    
    @JSGlobal("YT.PlayerState")
    @js.native
    object PlayerState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.PlayerState & Double] = js.native
      
      /* 3 */ val BUFFERING: typingsJapgolly.youtube.YT.PlayerState.BUFFERING & Double = js.native
      
      /* 5 */ val CUED: typingsJapgolly.youtube.YT.PlayerState.CUED & Double = js.native
      
      /* 0 */ val ENDED: typingsJapgolly.youtube.YT.PlayerState.ENDED & Double = js.native
      
      /* 2 */ val PAUSED: typingsJapgolly.youtube.YT.PlayerState.PAUSED & Double = js.native
      
      /* 1 */ val PLAYING: typingsJapgolly.youtube.YT.PlayerState.PLAYING & Double = js.native
      
      /* -1 */ val UNSTARTED: typingsJapgolly.youtube.YT.PlayerState.UNSTARTED & Double = js.native
    }
    
    @JSGlobal("YT.PlaysInline")
    @js.native
    object PlaysInline extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.PlaysInline & Double] = js.native
      
      /* 0 */ val Fullscreen: typingsJapgolly.youtube.YT.PlaysInline.Fullscreen & Double = js.native
      
      /* 1 */ val Inline: typingsJapgolly.youtube.YT.PlaysInline.Inline & Double = js.native
    }
    
    @JSGlobal("YT.RelatedVideos")
    @js.native
    object RelatedVideos extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.RelatedVideos & Double] = js.native
      
      /* 0 */ val Hide: typingsJapgolly.youtube.YT.RelatedVideos.Hide & Double = js.native
      
      /* 1 */ val Show: typingsJapgolly.youtube.YT.RelatedVideos.Show & Double = js.native
    }
    
    @JSGlobal("YT.ShowInfo")
    @js.native
    object ShowInfo extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.youtube.YT.ShowInfo & Double] = js.native
      
      /* 0 */ val Hide: typingsJapgolly.youtube.YT.ShowInfo.Hide & Double = js.native
      
      /* 1 */ val Show: typingsJapgolly.youtube.YT.ShowInfo.Show & Double = js.native
    }
  }
}
