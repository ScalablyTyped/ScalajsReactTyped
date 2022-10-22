package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorPredefinedToolbarItem
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorToolbar extends StObject {
  
  /**
    * Specifies the container in which to place the toolbar.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Configures toolbar items. These items allow users to format text and execute commands.
    */
  var items: js.UndefOr[js.Array[ToolbarItem | HtmlEditorPredefinedToolbarItem]] = js.undefined
  
  /**
    * Specifies whether or not items are arranged into multiple lines when their combined width exceeds the toolbar width.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
}
object dxHtmlEditorToolbar {
  
  inline def apply(): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
  
  extension [Self <: dxHtmlEditorToolbar](x: Self) {
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setItems(value: js.Array[ToolbarItem | HtmlEditorPredefinedToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ToolbarItem | HtmlEditorPredefinedToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
  }
}
