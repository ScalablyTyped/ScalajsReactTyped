package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTVIDEO_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertVideoCommandArguments
  extends StObject
     with ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  
  /**
    * Defines the URL of an image that is shown while the video file is downloading, or until an end-user clicks the play button.
    */
  var posterUrl: String
}
object ASPxClientHtmlEditorInsertVideoCommandArguments {
  
  inline def apply(
    GetCommandName: CallbackTo[String],
    align: String,
    autoPlay: Boolean,
    id: String,
    loop: Boolean,
    posterUrl: String,
    preloadMode: String,
    selectedElement: Any,
    showPlayerControls: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName.toJsFn, align = align.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], posterUrl = posterUrl.asInstanceOf[js.Any], preloadMode = preloadMode.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertVideoCommandArguments]
  }
  
  extension [Self <: ASPxClientHtmlEditorInsertVideoCommandArguments](x: Self) {
    
    inline def setPosterUrl(value: String): Self = StObject.set(x, "posterUrl", value.asInstanceOf[js.Any])
  }
}
