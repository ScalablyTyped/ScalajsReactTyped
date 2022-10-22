package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ContextMenuItem
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.FileManagerPredefinedContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerContextMenuItem
  extends StObject
     with dxContextMenuItem {
  
  /**
    * Configures settings of a context menu item&apos;s subitems.
    */
  @JSName("items")
  var items_dxFileManagerContextMenuItem: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
  
  /**
    * Specifies the context menu item&apos;s name.
    */
  var name: js.UndefOr[FileManagerPredefinedContextMenuItem | String] = js.undefined
  
  /**
    * 
    */
  @JSName("template")
  var template_dxFileManagerContextMenuItem: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxFileManagerContextMenuItem {
  
  inline def apply(): dxFileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenuItem]
  }
  
  extension [Self <: dxFileManagerContextMenuItem](x: Self) {
    
    inline def setItems(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ContextMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: FileManagerPredefinedContextMenuItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateCallbackTo(value: CallbackTo[String | UserDefinedElement[Element]]): Self = StObject.set(x, "template", value.toJsFn)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
