package typingsJapgolly.reactMdMenu

import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdMenu.anon.Children
import typingsJapgolly.reactMdMenu.anon.OmitListPropsrole
import typingsJapgolly.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuItemGroupMod {
  
  @JSImport("@react-md/menu/types/MenuItemGroup", "MenuItemGroup")
  @js.native
  val MenuItemGroup: ForwardRefExoticComponent[MenuItemGroupProps & RefAttributes[ListElement]] = js.native
  
  type MenuItemGroupProps = LabelRequiredForA11y[OmitListPropsrole] & Children
}
