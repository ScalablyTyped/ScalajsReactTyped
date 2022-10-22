package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.Columns
import typingsJapgolly.baseui.baseuiStrings.`flex-end`
import typingsJapgolly.baseui.baseuiStrings.`flex-start`
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.layoutGridTypesMod.CSSLengthUnit
import typingsJapgolly.baseui.layoutGridTypesMod.CellProps
import typingsJapgolly.baseui.layoutGridTypesMod.GridProps
import typingsJapgolly.baseui.layoutGridTypesMod.StyledCellProps
import typingsJapgolly.baseui.layoutGridTypesMod.StyledGridProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridMod {
  
  @JSImport("baseui/layout-grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly start :'flex-start',  readonly center :'center',  readonly end :'flex-end'}> */
  object ALIGNMENT {
    
    @JSImport("baseui/layout-grid", "ALIGNMENT.center")
    @js.native
    val center: typingsJapgolly.baseui.baseuiStrings.center = js.native
    
    @JSImport("baseui/layout-grid", "ALIGNMENT.end")
    @js.native
    val end: `flex-end` = js.native
    
    @JSImport("baseui/layout-grid", "ALIGNMENT.start")
    @js.native
    val start: `flex-start` = js.native
  }
  
  /* Inlined std.Readonly<{ readonly fluid :'fluid',  readonly fixed :'fixed'}> */
  object BEHAVIOR {
    
    @JSImport("baseui/layout-grid", "BEHAVIOR.fixed")
    @js.native
    val fixed: typingsJapgolly.baseui.baseuiStrings.fixed = js.native
    
    @JSImport("baseui/layout-grid", "BEHAVIOR.fluid")
    @js.native
    val fluid: typingsJapgolly.baseui.baseuiStrings.fluid = js.native
  }
  
  inline def Cell(hasAlignChildrenGridColumnsGridGapsGridGuttersGridUnitOrderSkipSpanOverrides: CellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasAlignChildrenGridColumnsGridGapsGridGuttersGridUnitOrderSkipSpanOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Grid(
    hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides: GridProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Grid")(hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly compact :'compact'}> */
  object STYLE extends Shortcut {
    
    @JSImport("baseui/layout-grid", "STYLE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/layout-grid", "STYLE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{  default :any,   compact :{  columns :std.Array<number>,   gutters :std.Array<number>,   margins :std.Array<number>,   gaps :number,   unit :string,   maxWidth :number}}> */
  object STYLE_VALUES extends Shortcut {
    
    @JSImport("baseui/layout-grid", "STYLE_VALUES.default")
    @js.native
    val default: Any = js.native
    
    @JSImport("baseui/layout-grid", "STYLE_VALUES.compact")
    @js.native
    val compact: Columns = js.native
    
    type _To = Any
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_VALUES.foo` */
    override def _to: Any = default
  }
  
  @JSImport("baseui/layout-grid", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[div, StyledCellProps] = js.native
  
  @JSImport("baseui/layout-grid", "StyledGrid")
  @js.native
  val StyledGrid: StyletronComponent[div, StyledGridProps] = js.native
  
  @JSImport("baseui/layout-grid", "Unstable_Cell")
  @js.native
  val UnstableCell: js.Function1[
    /* hasAlignChildrenGridColumnsGridGapsGridGuttersGridUnitOrderSkipSpanOverrides */ CellProps, 
    Element
  ] = js.native
  
  @JSImport("baseui/layout-grid", "Unstable_Grid")
  @js.native
  val UnstableGrid: js.Function1[
    /* hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides */ GridProps, 
    Element
  ] = js.native
  
  @JSImport("baseui/layout-grid", "Unstable_StyledCell")
  @js.native
  val UnstableStyledCell: StyletronComponent[div, StyledCellProps] = js.native
  
  @JSImport("baseui/layout-grid", "Unstable_StyledGrid")
  @js.native
  val UnstableStyledGrid: StyletronComponent[div, StyledGridProps] = js.native
  
  type CSSLengthUnitT = CSSLengthUnit
}
