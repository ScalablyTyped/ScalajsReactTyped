package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Animate
import typingsJapgolly.baseui.anon.Fill
import typingsJapgolly.baseui.anon.FillOrientation
import typingsJapgolly.baseui.anon.HasEndEnhancer
import typingsJapgolly.baseui.anon.Pad
import typingsJapgolly.baseui.anon.`258`
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.tabsMotionTypesMod.Orientation
import typingsJapgolly.baseui.tabsMotionTypesMod.StatefulTabsAction
import typingsJapgolly.baseui.tabsMotionTypesMod.StatefulTabsProps
import typingsJapgolly.baseui.tabsMotionTypesMod.StatefulTabsReducer
import typingsJapgolly.baseui.tabsMotionTypesMod.StatefulTabsState
import typingsJapgolly.baseui.tabsMotionTypesMod.TabProps
import typingsJapgolly.baseui.tabsMotionTypesMod.TabsProps
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMotionMod {
  
  @JSImport("baseui/tabs-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FILL {
    
    @JSImport("baseui/tabs-motion", "FILL.fixed")
    @js.native
    val fixed: typingsJapgolly.baseui.baseuiStrings.fixed = js.native
    
    @JSImport("baseui/tabs-motion", "FILL.intrinsic")
    @js.native
    val intrinsic: typingsJapgolly.baseui.baseuiStrings.intrinsic = js.native
  }
  
  object ORIENTATION {
    
    @JSImport("baseui/tabs-motion", "ORIENTATION.horizontal")
    @js.native
    val horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/tabs-motion", "ORIENTATION.vertical")
    @js.native
    val vertical: typingsJapgolly.baseui.baseuiStrings.vertical = js.native
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/tabs-motion", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  inline def StatefulTabs(props: StatefulTabsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulTabs")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/tabs-motion", "StyledArtworkContainer")
  @js.native
  val StyledArtworkContainer: StyletronComponent[div, `258`] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledEndEnhancerContainer")
  @js.native
  val StyledEndEnhancerContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, `258`] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTab")
  @js.native
  val StyledTab: StyletronComponent[button, Fill] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabBar")
  @js.native
  val StyledTabBar: StyletronComponent[div, HasEndEnhancer] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabBorder")
  @js.native
  val StyledTabBorder: StyletronComponent[div, `258`] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabHighlight")
  @js.native
  val StyledTabHighlight: StyletronComponent[div, Animate] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabList")
  @js.native
  val StyledTabList: StyletronComponent[div, FillOrientation] = js.native
  
  @JSImport("baseui/tabs-motion", "StyledTabPanel")
  @js.native
  val StyledTabPanel: StyletronComponent[div, Pad] = js.native
  
  inline def Tab(props: TabProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def Tabs(
    hasActiveKeyDisabledChildrenFillActivateOnFocusOnChangeOrientationOverridesRenderAllCustomUidEndEnhancer: TabsProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tabs")(hasActiveKeyDisabledChildrenFillActivateOnFocusOnChangeOrientationOverridesRenderAllCustomUidEndEnhancer.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getTabId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTabPanelId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabPanelId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFixed(fill: typingsJapgolly.baseui.tabsMotionTypesMod.Fill): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixed")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHorizontal(orientation: Orientation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntrinsic(fill: typingsJapgolly.baseui.tabsMotionTypesMod.Fill): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntrinsic")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRTL(direction: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(direction.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVertical(orientation: Orientation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Action = StatefulTabsAction
  
  type State = StatefulTabsState
  
  type StateReducer = StatefulTabsReducer
}
