package typingsJapgolly.reactMdList

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.anon.PickListItemLinkWithCompo
import typingsJapgolly.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typingsJapgolly.reactMdList.typesGetListItemHeightMod.SimpleListItemProps
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonProps
import typingsJapgolly.reactMdList.typesListItemChildrenMod.ListItemChildrenProps
import typingsJapgolly.reactMdList.typesListItemLinkMod.ListItemLinkProps
import typingsJapgolly.reactMdList.typesListItemMod.ListItemProps
import typingsJapgolly.reactMdList.typesListItemTextMod.ListItemTextProps
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdList.typesListMod.ListProps
import typingsJapgolly.reactMdList.typesListSubheaderMod.ListSubheaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/list", "List")
  @js.native
  val List: ForwardRefExoticComponent[ListProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/list", "ListItem")
  @js.native
  val ListItem: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def ListItemAddon(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAddon")(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ListItemChildren(
    hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapPropChildren: ListItemChildrenProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemChildren")(hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapPropChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/list", "ListItemLink")
  @js.native
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps & (RefAttributes[HTMLAnchorElement | ElementType])) | PickListItemLinkWithCompo
  ] = js.native
  
  inline def ListItemText(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(hasClassNameSecondaryTextClassNameSecondaryTextChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/list", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/list", "SimpleListItem")
  @js.native
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemHeight")(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText.asInstanceOf[js.Any]).asInstanceOf[ListItemHeight]
}
