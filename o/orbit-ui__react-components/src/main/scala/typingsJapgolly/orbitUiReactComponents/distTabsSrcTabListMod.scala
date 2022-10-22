package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.TabType
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcTabListMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTabList(hasTabsAutoFocusForwardedRefRest: InnerTabListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabList")(hasTabsAutoFocusForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabList", "TabList")
  @js.native
  val TabList: OrbitComponent[HTMLElement, InnerTabListProps] = js.native
  
  trait InnerTabListProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var forwardedRef: ForwardedRef[Any]
    
    var tabs: js.UndefOr[js.Array[TabType]] = js.undefined
  }
  object InnerTabListProps {
    
    inline def apply(): InnerTabListProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTabListProps]
    }
    
    extension [Self <: InnerTabListProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setTabs(value: js.Array[TabType]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: TabType*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  type TabListProps = ComponentProps[OrbitComponent[HTMLElement, InnerTabListProps]]
}
