package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for parameters related to inserting or changing HTML5 media elements (Audio and Video) in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments
  extends StObject
     with ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  /**
    * Determines if a media file will start playing automatically.
    */
  var autoPlay: Boolean
  
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean
  
  /**
    * Determines how a media file should be loaded when the page loads.
    */
  var preloadMode: String
  
  /**
    * Determines if the media player controls should be displayed.
    */
  var showPlayerControls: Boolean
}
object ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  
  inline def apply(
    GetCommandName: CallbackTo[String],
    align: String,
    autoPlay: Boolean,
    id: String,
    loop: Boolean,
    preloadMode: String,
    selectedElement: Any,
    showPlayerControls: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName.toJsFn, align = align.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], preloadMode = preloadMode.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments]
  }
  
  extension [Self <: ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments](x: Self) {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setPreloadMode(value: String): Self = StObject.set(x, "preloadMode", value.asInstanceOf[js.Any])
    
    inline def setShowPlayerControls(value: Boolean): Self = StObject.set(x, "showPlayerControls", value.asInstanceOf[js.Any])
  }
}
