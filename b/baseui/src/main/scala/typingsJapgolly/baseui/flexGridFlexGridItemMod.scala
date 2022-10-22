package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.FlexGridColumnCount
import typingsJapgolly.baseui.anon.FlexGridColumnGap
import typingsJapgolly.baseui.anon.Readonlyxstringanywidthst
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.blockTypesMod.Responsive
import typingsJapgolly.baseui.blockTypesMod.StyledBlockProps
import typingsJapgolly.baseui.flexGridTypesMod.FlexGridItemProps
import typingsJapgolly.baseui.helpersOverridesMod.StyleOverride
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridFlexGridItemMod {
  
  @JSImport("baseui/flex-grid/flex-grid-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/flex-grid/flex-grid-item", JSImport.Default)
  @js.native
  val default: FlexGridItemComponentType[div] = js.native
  
  inline def flexGridItemMediaQueryStyle(has$themeColCountFlexGridColumnGapFlexGridRowGapItemIndexItemCount: FlexGridColumnCount): Readonlyxstringanywidthst = ^.asInstanceOf[js.Dynamic].applyDynamic("flexGridItemMediaQueryStyle")(has$themeColCountFlexGridColumnGapFlexGridRowGapItemIndexItemCount.asInstanceOf[js.Any]).asInstanceOf[Readonlyxstringanywidthst]
  
  inline def flexGridItemStyle(
    hasDollarflexGridColumnCountDollarflexGridColumnGapDollarflexGridRowGapDollarflexGridItemIndexDollarflexGridItemCountDollartheme: FlexGridColumnGap
  ): StyleOverride = ^.asInstanceOf[js.Dynamic].applyDynamic("flexGridItemStyle")(hasDollarflexGridColumnCountDollarflexGridColumnGapDollarflexGridRowGapDollarflexGridItemIndexDollarflexGridItemCountDollartheme.asInstanceOf[js.Any]).asInstanceOf[StyleOverride]
  
  inline def getResponsiveValue[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")().asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Unit, i: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Responsive[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Responsive[T], i: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @js.native
  trait FlexGridItemComponentType[D /* <: ElementType */] extends StObject {
    
    def apply[C /* <: ElementType */](
      props: FlexGridItemProps[C] & (/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<C> extends {  ref :infer R | undefined} ? {  ref :R | undefined} : {} */ js.Any) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/flex-grid/types.FlexGridItemProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 73, starting with typingsJapgolly.baseui.baseuiStrings.flexGridItemIndex, typingsJapgolly.baseui.baseuiStrings.flexGridItemCount, typingsJapgolly.baseui.baseuiStrings.flexGridColumnCount */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
}
