package typingsJapgolly.reactMdTabs

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTabs.typesTabMod.TabProps
import typingsJapgolly.reactMdTabs.typesTabPanelMod.TabPanelProps
import typingsJapgolly.reactMdTabs.typesTabPanelsMod.TabPanelsProps
import typingsJapgolly.reactMdTabs.typesTabsListMod.TabsListProps
import typingsJapgolly.reactMdTabs.typesTabsManagerMod.InitializedTabsManagerContext
import typingsJapgolly.reactMdTabs.typesTabsManagerMod.TabsManagerProps
import typingsJapgolly.reactMdTabs.typesTabsMod.TabsProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tabs", "DEFAULT_TABPANEL_CLASSNAMES")
  @js.native
  val DEFAULT_TABPANEL_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/tabs", "DEFAULT_TABPANEL_TIMEOUT")
  @js.native
  val DEFAULT_TABPANEL_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tabs", "Tab")
  @js.native
  val Tab: ForwardRefExoticComponent[TabProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "Tabs")
  @js.native
  val Tabs: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def TabsManager(
    hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabsManager")(hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useTabs(): InitializedTabsManagerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabs")().asInstanceOf[InitializedTabsManagerContext]
}
