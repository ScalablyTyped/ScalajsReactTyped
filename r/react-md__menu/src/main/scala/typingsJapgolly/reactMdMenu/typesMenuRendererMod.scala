package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdMenu.anon.MenuRef
import typingsJapgolly.reactMdMenu.typesTypesMod.BaseMenuRendererProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuListProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuTransitionProps
import typingsJapgolly.reactMdMenu.typesTypesMod.ProvidedMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuRendererMod {
  
  @JSImport("@react-md/menu/types/MenuRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuRenderer(
    hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps: MenuRendererProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuRenderer")(hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuRendererProps = ProvidedMenuProps & BaseMenuRendererProps & MenuListProps & MenuTransitionProps & MenuRef
}
