package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorChangeMediaElementCommandArguments
  extends StObject
     with ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  def GetCommandName(): String
  
  /**
    * Determines the position of the target media element.
    */
  var align: String
  
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    */
  var id: String
  
  /**
    * Defines the source of the target media element.
    */
  var src: String
  
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}
object ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  inline def apply(
    GetCommandName: CallbackTo[String],
    align: String,
    id: String,
    selectedElement: Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeMediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName.toJsFn, align = align.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeMediaElementCommandArguments]
  }
  
  extension [Self <: ASPxClientHtmlEditorChangeMediaElementCommandArguments](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setGetCommandName(value: CallbackTo[String]): Self = StObject.set(x, "GetCommandName", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = StObject.set(x, "styleSettings", value.asInstanceOf[js.Any])
  }
}
