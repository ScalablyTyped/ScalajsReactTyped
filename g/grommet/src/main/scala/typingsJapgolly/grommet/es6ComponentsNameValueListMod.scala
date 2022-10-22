package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.anon.Align
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.End
import typingsJapgolly.grommet.anon.`2`
import typingsJapgolly.grommet.es6ComponentsGridMod.AreasType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridColumnsType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridGapType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridSizeType
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignContentType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.AlignType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.HeightType
import typingsJapgolly.grommet.es6UtilsMod.JustifyContentType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.WidthType
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.column
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.grid
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.stretch
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsNameValueListMod {
  
  @JSImport("grommet/es6/components/NameValueList", "NameValueList")
  @js.native
  val NameValueList: FC[NameValueListExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDListElement>, std.HTMLDListElement>, 'align' | 'children' | 'layout' | 'nameProps' | 'pairProps' | 'valueProps'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDListElement>, std.HTMLDListElement>[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.grommet.es6ComponentsGridMod.GridProps because var conflicts: align. Inlined a11yTitle, alignSelf, alignContent, areas, as, border, columns, fill, gap, gridArea, height, justify, justifyContent, margin, pad, responsive, rows, tag, width */ trait NameValueListExtendedProps
    extends StObject
       with NameValueListProps {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignContent: js.UndefOr[AlignContentType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var areas: js.UndefOr[AreasType] = js.undefined
    
    var as: js.UndefOr[PolymorphicType] = js.undefined
    
    var border: js.UndefOr[BorderType] = js.undefined
    
    var columns: js.UndefOr[GridColumnsType] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var gap: js.UndefOr[GridGapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var height: js.UndefOr[HeightType] = js.undefined
    
    var justify: js.UndefOr[start | center | end | stretch] = js.undefined
    
    var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var pad: js.UndefOr[PadType] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[GridSizeType | js.Array[GridSizeType]] = js.undefined
    
    var tag: js.UndefOr[PolymorphicType] = js.undefined
    
    var width: js.UndefOr[WidthType] = js.undefined
  }
  object NameValueListExtendedProps {
    
    inline def apply(): NameValueListExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NameValueListExtendedProps]
    }
    
    extension [Self <: NameValueListExtendedProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAreas(value: AreasType): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
      
      inline def setAreasVarargs(value: (js.Array[String] | End)*): Self = StObject.set(x, "areas", js.Array(value*))
      
      inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setColumns(value: GridColumnsType): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGap(value: GridGapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHeight(value: HeightType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJustify(value: start | center | end | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyContent(value: JustifyContentType): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRows(value: GridSizeType | js.Array[GridSizeType]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: (GridSizeType | String)*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWidth(value: WidthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait NameValueListProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var layout: js.UndefOr[column | grid] = js.undefined
    
    var nameProps: js.UndefOr[Align] = js.undefined
    
    var pairProps: js.UndefOr[`2`] = js.undefined
    
    var valueProps: js.UndefOr[Align] = js.undefined
  }
  object NameValueListProps {
    
    inline def apply(): NameValueListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NameValueListProps]
    }
    
    extension [Self <: NameValueListProps](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLayout(value: column | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setNameProps(value: Align): Self = StObject.set(x, "nameProps", value.asInstanceOf[js.Any])
      
      inline def setNamePropsUndefined: Self = StObject.set(x, "nameProps", js.undefined)
      
      inline def setPairProps(value: `2`): Self = StObject.set(x, "pairProps", value.asInstanceOf[js.Any])
      
      inline def setPairPropsUndefined: Self = StObject.set(x, "pairProps", js.undefined)
      
      inline def setValueProps(value: Align): Self = StObject.set(x, "valueProps", value.asInstanceOf[js.Any])
      
      inline def setValuePropsUndefined: Self = StObject.set(x, "valueProps", js.undefined)
    }
  }
}
