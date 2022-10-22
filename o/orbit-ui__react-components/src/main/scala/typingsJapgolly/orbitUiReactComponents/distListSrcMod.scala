package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distListSrcListItemMod.InnerListItemProps
import typingsJapgolly.orbitUiReactComponents.distListSrcListMod.InnerListProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/list/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListItem(hasSizeAsChildrenForwardedRefRest: InnerListItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListItem")(hasSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOrderedList(hasAsForwardedRefRest: InnerListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOrderedList")(hasAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/list/src", "ListItem")
  @js.native
  val ListItem: OrbitComponent[HTMLElement, InnerListItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/list/src", "OrderedList")
  @js.native
  val OrderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/list/src", "UnorderedList")
  @js.native
  val UnorderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
}
