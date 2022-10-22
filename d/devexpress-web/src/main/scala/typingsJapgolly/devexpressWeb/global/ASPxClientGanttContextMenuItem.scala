package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A context menu item.
  */
@JSGlobal("ASPxClientGanttContextMenuItem")
@js.native
open class ASPxClientGanttContextMenuItem ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuItem {
  
  /**
    * Returns the context menu item's subitem with the specified index. The subitem.
    * @param index The subitem's index.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuItem = js.native
  
  /**
    * Returns the context menu item's subitem with the specified name. The context menu item.
    * @param name The context menu item's name.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuItem = js.native
  
  /**
    * Returns the number of the context menu item's subitems.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Returns the context menu item's subitems.
    */
  /* CompleteClass */
  override def GetSubItems(): typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuItemCollection = js.native
  
  /**
    * Specifies whether an item separator is displayed before the context menu item.
    */
  /* CompleteClass */
  var beginGroup: Boolean = js.native
  
  /**
    * Specifies whether the item is enabled.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Specifies the name of the CSS class that defines the context menu item's image.
    */
  /* CompleteClass */
  var imageClassName: String = js.native
  
  /**
    * Specifies the Url of the menu item's image.
    */
  /* CompleteClass */
  var imageUrl: String = js.native
  
  /**
    * Specifies the context menu item's name.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Specifies the context menu item's navigation Url.
    */
  /* CompleteClass */
  var navigateUrl: String = js.native
  
  /**
    * Gets the parent context menu item to which the current item belongs.
    */
  /* CompleteClass */
  var parent: typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuItem = js.native
  
  /**
    * Gets or sets the window or frame where to locate the content of the Url associated with the current menu item.
    */
  /* CompleteClass */
  var target: String = js.native
  
  /**
    * Specifies the context menu item's text.
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * Specifies the context menu item's tooltip.
    */
  /* CompleteClass */
  var tooltip: String = js.native
}
