package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.blockTypesMod.BlockComponentType
import typingsJapgolly.baseui.blockTypesMod.StyledBlockProps
import typingsJapgolly.baseui.flexGridTypesMod.FlexGridProps
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridFlexGridMod extends Shortcut {
  
  @JSImport("baseui/flex-grid/flex-grid", JSImport.Default)
  @js.native
  val default: FlexGridComponentType[div] = js.native
  
  @JSImport("baseui/flex-grid/flex-grid", "BaseFlexGrid")
  @js.native
  val BaseFlexGrid: BlockComponentType[div] = js.native
  
  @js.native
  trait FlexGridComponentType[D /* <: ElementType */] extends StObject {
    
    def apply[C /* <: ElementType */](
      props: FlexGridProps[C] & (/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<C> extends {  ref :infer R | undefined} ? {  ref :R | undefined} : {} */ js.Any) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/flex-grid/types.FlexGridProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71, starting with typingsJapgolly.baseui.baseuiStrings.flexGridColumnCount, typingsJapgolly.baseui.baseuiStrings.flexGridColumnGap, typingsJapgolly.baseui.baseuiStrings.flexGridRowGap */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = FlexGridComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `flexGridFlexGridMod.foo` */
  override def _to: FlexGridComponentType[div] = default
}
