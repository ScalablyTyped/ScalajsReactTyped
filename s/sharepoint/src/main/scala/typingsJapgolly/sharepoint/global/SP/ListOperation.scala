package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.anon.FsObjType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListOperation {
  
  object Overrides {
    
    @JSGlobal("SP.ListOperation.Overrides")
    @js.native
    val ^ : js.Any = js.native
    
    inline def overrideDeleteConfirmation(listId: String, overrideText: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideDeleteConfirmation")(listId.asInstanceOf[js.Any], overrideText.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Selection {
    
    @JSGlobal("SP.ListOperation.Selection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deselectAllListItems(iid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deselectAllListItems")(iid.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getSelectedItems(): js.Array[FsObjType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedItems")().asInstanceOf[js.Array[FsObjType]]
    
    inline def getSelectedList(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedList")().asInstanceOf[String]
    
    inline def getSelectedView(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedView")().asInstanceOf[String]
    
    inline def navigateUp(viewId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateUp")(viewId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def selectListItem(iid: String, bSelect: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectListItem")(iid.asInstanceOf[js.Any], bSelect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ViewOperation {
    
    @JSGlobal("SP.ListOperation.ViewOperation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSelectedView(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedView")().asInstanceOf[String]
    
    inline def navigateUp(viewId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateUp")(viewId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def refreshView(viewId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshView")(viewId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
