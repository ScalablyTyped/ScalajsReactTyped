package typingsJapgolly.rmcTabs

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.ScrollView
import typingsJapgolly.rmcTabs.anon.Component
import typingsJapgolly.rmcTabs.anon.TabBar
import typingsJapgolly.rmcTabs.anon.TypeofDefaultTabBar
import typingsJapgolly.rmcTabs.libModelsMod.Models.TabData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsDotnativeMod {
  
  @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typingsJapgolly.rmcTabs.libTabsDotbaseMod.Tabs[PropsType, StateType] {
    def this(props: PropsType) = this()
    
    var AnimatedScrollView: ScrollView = js.native
    
    def goToTab(index: Double, force: Boolean, animated: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Unit, animated: Boolean): Boolean = js.native
    
    def handleLayout(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ Any
    ): Unit = js.native
    
    def onMomentumScrollEnd(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ Any
    ): Unit = js.native
    
    def onScroll(): Unit = js.native
    def onScroll(
      evt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ Any
    ): Unit = js.native
    
    def renderContent(): Element = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[Node]
        ]
    ): Element = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    var scrollView: Component = js.native
    
    def setScrollView(sv: Any): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType
    extends StObject
       with typingsJapgolly.rmcTabs.libPropsTypeMod.PropsType {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ] = js.undefined
    
    var styles: js.UndefOr[TabBar] = js.undefined
  }
  object PropsType {
    
    inline def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: TabBar): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait StateType
    extends typingsJapgolly.rmcTabs.libTabsDotbaseMod.StateType {
    
    var containerWidth: Double = js.native
    
    var scrollValue: Value = js.native
    
    var scrollX: Value = js.native
  }
}
