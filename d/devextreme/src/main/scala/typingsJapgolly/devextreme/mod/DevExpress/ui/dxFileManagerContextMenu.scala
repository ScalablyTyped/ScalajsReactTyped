package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ContextMenuItem
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.FileManagerPredefinedContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerContextMenu extends StObject {
  
  /**
    * Configures context menu items&apos; settings.
    */
  var items: js.UndefOr[js.Array[ContextMenuItem | FileManagerPredefinedContextMenuItem]] = js.undefined
}
object dxFileManagerContextMenu {
  
  inline def apply(): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
  
  extension [Self <: dxFileManagerContextMenu](x: Self) {
    
    inline def setItems(value: js.Array[ContextMenuItem | FileManagerPredefinedContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ContextMenuItem | FileManagerPredefinedContextMenuItem)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
