package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsTabMod.CardFolderTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CardFolderTabsProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/CardFolderTabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Tab(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")().asInstanceOf[Element]
    inline def Tab(props: CardFolderTabProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  type CardFolderTabs = PureComponent[CardFolderTabsProps, js.Object, Any]
  
  trait CardFolderTabsProps extends StObject {
    
    var activeId: String
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var maxTabWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* newActiveId */ String, Unit]] = js.undefined
    
    var size: js.UndefOr[TabFontSize] = js.undefined
  }
  object CardFolderTabsProps {
    
    inline def apply(activeId: String): CardFolderTabsProps = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardFolderTabsProps]
    }
    
    extension [Self <: CardFolderTabsProps](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxTabWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
      
      inline def setOnTabChange(value: /* newActiveId */ String => Callback): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1((t0: /* newActiveId */ String) => value(t0).runNow()))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setSize(value: TabFontSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
  */
  trait TabFontSize extends StObject
  object TabFontSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
}
