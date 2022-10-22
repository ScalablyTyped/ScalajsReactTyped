package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableCellPropertiesCommandArguments")
@js.native
open class ASPxClientHtmlEditorTableCellPropertiesCommandArguments protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableCellPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditor, selectedElement: Any) = this()
  
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    */
  /* CompleteClass */
  var applyForAll: Boolean = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: Any = js.native
  
  /**
    * Contains the style settings defining the appearance of the target cell element.
    */
  /* CompleteClass */
  var styleSettings: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}
