package typingsJapgolly.uifabricMergeStyles

import typingsJapgolly.std.Partial
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/concatStyleSetsWithProps", JSImport.Namespace)
@js.native
object concatStyleSetsWithPropsMod extends js.Object {
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Partial[TStyleSet] = js.native
}

