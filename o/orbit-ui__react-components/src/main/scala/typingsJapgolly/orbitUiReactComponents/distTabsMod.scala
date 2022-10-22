package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabListMod.InnerTabListProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabMod.InnerTabProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelMod.InnerTabPanelProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelsMod.TabPanelsProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabsContextMod.TabsContextType
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabsMod.InnerTabsProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTab(hasHasKeyTabIdPanelIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerTabProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTab")(hasHasKeyTabIdPanelIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabList(hasTabsAutoFocusForwardedRefRest: InnerTabListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabList")(hasTabsAutoFocusForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabPanel(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest: InnerTabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabPanel")(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabs(
    hasIdSelectedKeyPropDefaultSelectedKeyOnSelectionChangeManualAutoFocusFluidOrientationAriaLabelChildrenForwardedRefRest: InnerTabsProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabs")(hasIdSelectedKeyPropDefaultSelectedKeyOnSelectionChangeManualAutoFocusFluidOrientationAriaLabelChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "Tab")
  @js.native
  val Tab: OrbitComponent[HTMLElement, InnerTabProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "TabKeyProp")
  @js.native
  val TabKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "TabList")
  @js.native
  val TabList: OrbitComponent[HTMLElement, InnerTabListProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "TabPanel")
  @js.native
  val TabPanel: OrbitComponent[HTMLElement, InnerTabPanelProps] = js.native
  
  object TabPanels {
    
    inline def apply(hasPanelsRest: TabPanelsProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasPanelsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/tabs", "TabPanels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/tabs", "TabPanels.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "Tabs")
  @js.native
  val Tabs: OrbitComponent[HTMLElement, InnerTabsProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs", "TabsContext")
  @js.native
  val TabsContext: Context[TabsContextType] = js.native
  
  inline def useTabsContext(): TabsContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextType]
}
