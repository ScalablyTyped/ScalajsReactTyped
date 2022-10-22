package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTYOUTUBEVIDEO_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments
  extends StObject
     with ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  /**
    * Determines if the target YouTube video can be displayed in fullscreen mode.
    */
  var allowFullscreen: Boolean
  
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    */
  var enablePrivacyEnhancedMode: Boolean
  
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    */
  var showPlayerControls: Boolean
  
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    */
  var showRelatedVideos: Boolean
  
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    */
  var showVideoInfo: Boolean
}
object ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  
  inline def apply(
    GetCommandName: CallbackTo[String],
    align: String,
    allowFullscreen: Boolean,
    enablePrivacyEnhancedMode: Boolean,
    id: String,
    selectedElement: Any,
    showPlayerControls: Boolean,
    showRelatedVideos: Boolean,
    showVideoInfo: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName.toJsFn, align = align.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], enablePrivacyEnhancedMode = enablePrivacyEnhancedMode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], showRelatedVideos = showRelatedVideos.asInstanceOf[js.Any], showVideoInfo = showVideoInfo.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments]
  }
  
  extension [Self <: ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments](x: Self) {
    
    inline def setAllowFullscreen(value: Boolean): Self = StObject.set(x, "allowFullscreen", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivacyEnhancedMode(value: Boolean): Self = StObject.set(x, "enablePrivacyEnhancedMode", value.asInstanceOf[js.Any])
    
    inline def setShowPlayerControls(value: Boolean): Self = StObject.set(x, "showPlayerControls", value.asInstanceOf[js.Any])
    
    inline def setShowRelatedVideos(value: Boolean): Self = StObject.set(x, "showRelatedVideos", value.asInstanceOf[js.Any])
    
    inline def setShowVideoInfo(value: Boolean): Self = StObject.set(x, "showVideoInfo", value.asInstanceOf[js.Any])
  }
}
