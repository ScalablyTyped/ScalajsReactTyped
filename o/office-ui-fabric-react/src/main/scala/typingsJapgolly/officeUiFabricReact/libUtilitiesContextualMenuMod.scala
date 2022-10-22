package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesContextualMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/contextualMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIsChecked(item: IContextualMenuItem): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsChecked")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getMenuItemAriaRole(item: IContextualMenuItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemAriaRole")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasSubmenu(item: IContextualMenuItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSubmenu")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isItemDisabled(item: IContextualMenuItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItemDisabled")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
