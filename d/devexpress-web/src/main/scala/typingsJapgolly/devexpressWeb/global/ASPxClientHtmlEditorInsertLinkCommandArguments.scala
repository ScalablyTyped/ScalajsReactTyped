package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertLinkCommandArguments")
@js.native
open class ASPxClientHtmlEditorInsertLinkCommandArguments protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorInsertLinkCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertLinkCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param selectedElement An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted link.
    */
  def this(htmlEditor: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditor, selectedElement: Any) = this()
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: Any = js.native
  
  /**
    * Contains the style settings defining the appearance of the target link element.
    */
  /* CompleteClass */
  var styleSettings: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  
  /**
    * Determines where to open the target link.
    */
  /* CompleteClass */
  var target: String = js.native
  
  /**
    * Specifiies the text of the target link.
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * Defines the title of the target link.
    */
  /* CompleteClass */
  var title: String = js.native
  
  /**
    * Specifies the url of the page the target link goes to.
    */
  /* CompleteClass */
  var url: String = js.native
}
