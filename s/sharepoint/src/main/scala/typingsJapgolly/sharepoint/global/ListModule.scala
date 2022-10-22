package typingsJapgolly.sharepoint.global

import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.ListItem
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object ListModule {
  
  object Util {
    
    @JSGlobal("ListModule.Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearSelectedItemsDict(context: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSelectedItemsDict")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createItemPropertiesTitle(renderCtx: RenderContext, listItem: ListItem): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createItemPropertiesTitle")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewEditUrl")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewEditUrl")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any], useEditFormUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Boolean, appendSource: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewEditUrl")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any], useEditFormUrl.asInstanceOf[js.Any], appendSource.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createViewEditUrl(renderCtx: RenderContext, listItem: ListItem, useEditFormUrl: Unit, appendSource: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewEditUrl")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any], useEditFormUrl.asInstanceOf[js.Any], appendSource.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def ctxInitItemState(context: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ctxInitItemState")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAttributeFromItemTable(itemTableParam: HTMLElement, strAttributeName: String, strAttributeOldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeFromItemTable")(itemTableParam.asInstanceOf[js.Any], strAttributeName.asInstanceOf[js.Any], strAttributeOldName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getSelectedItemsDict(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedItemsDict")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def removeOnlyPagingArgs(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOnlyPagingArgs")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def removePagingArgs(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removePagingArgs")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def showAttachmentRows(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAttachmentRows")().asInstanceOf[Unit]
  }
}
