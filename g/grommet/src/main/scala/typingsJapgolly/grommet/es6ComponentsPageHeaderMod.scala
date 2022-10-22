package typingsJapgolly.grommet

import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxProps
import typingsJapgolly.grommet.es6ComponentsGridMod.GridProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.onClick
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.title
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsPageHeaderMod {
  
  @JSImport("grommet/es6/components/PageHeader", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'onClick' | 'title'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.grommet.es6ComponentsPageHeaderMod.PageHeaderProps because var conflicts: a11yTitle, alignSelf, gridArea, margin, responsive. Inlined actions, gridProps, parent, size, subtitle, title */ trait PageHeaderExtendedProps
    extends StObject
       with BoxProps {
    
    var actions: js.UndefOr[Element] = js.undefined
    
    var gridProps: js.UndefOr[GridProps] = js.undefined
    
    var parent: js.UndefOr[Element] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var subtitle: js.UndefOr[String | Element] = js.undefined
    
    var title: js.UndefOr[String | Element] = js.undefined
  }
  object PageHeaderExtendedProps {
    
    inline def apply(): PageHeaderExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderExtendedProps]
    }
    
    extension [Self <: PageHeaderExtendedProps](x: Self) {
      
      inline def setActions(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setGridProps(value: GridProps): Self = StObject.set(x, "gridProps", value.asInstanceOf[js.Any])
      
      inline def setGridPropsUndefined: Self = StObject.set(x, "gridProps", js.undefined)
      
      inline def setParent(value: VdomElement): Self = StObject.set(x, "parent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: String | Element): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PageHeaderProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var actions: js.UndefOr[Element] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var gridProps: js.UndefOr[GridProps] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var parent: js.UndefOr[Element] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var subtitle: js.UndefOr[String | Element] = js.undefined
    
    var title: js.UndefOr[String | Element] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setActions(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridProps(value: GridProps): Self = StObject.set(x, "gridProps", value.asInstanceOf[js.Any])
      
      inline def setGridPropsUndefined: Self = StObject.set(x, "gridProps", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setParent(value: VdomElement): Self = StObject.set(x, "parent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: String | Element): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type PageHeaderType = PageHeaderProps
  
  type divProps = Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onClick | title]
}
