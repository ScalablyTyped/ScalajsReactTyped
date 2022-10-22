package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsMod {
  
  @JSImport("wix-style-react/dist/types/VerticalTabs", JSImport.Default)
  @js.native
  open class default ()
    extends Component[VerticalTabsProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.Footer")
    @js.native
    def Footer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC */ Any = js.native
    inline def Footer_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.TabItem")
    @js.native
    def TabItem: Instantiable0[typingsJapgolly.wixStyleReact.distTypesVerticalTabsItemMod.default] = js.native
    inline def TabItem_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesVerticalTabsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabItem")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.TabsGroup")
    @js.native
    def TabsGroup: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TabsGroup> */ Any = js.native
    inline def TabsGroup_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TabsGroup> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabsGroup")(x.asInstanceOf[js.Any])
  }
  
  trait TabsGroup extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TabsGroup {
    
    inline def apply(): TabsGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroup]
    }
    
    extension [Self <: TabsGroup](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type VerticalTabs = japgolly.scalajs.react.facade.React.Component[VerticalTabsProps & js.Object, js.Object]
  
  trait VerticalTabsProps extends StObject {
    
    var activeTabId: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var size: js.UndefOr[VerticalTabsSize] = js.undefined
  }
  object VerticalTabsProps {
    
    inline def apply(): VerticalTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTabsProps]
    }
    
    extension [Self <: VerticalTabsProps](x: Self) {
      
      inline def setActiveTabId(value: Double): Self = StObject.set(x, "activeTabId", value.asInstanceOf[js.Any])
      
      inline def setActiveTabIdUndefined: Self = StObject.set(x, "activeTabId", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnChange(value: /* id */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* id */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: VerticalTabsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait VerticalTabsSize extends StObject
  object VerticalTabsSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
}
