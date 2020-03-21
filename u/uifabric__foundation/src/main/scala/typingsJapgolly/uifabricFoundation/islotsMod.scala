package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricFoundation.icomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/ISlots", JSImport.Namespace)
@js.native
object islotsMod extends js.Object {
  @js.native
  trait IFoundationComponent[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics]
    extends FunctionComponent[js.Object] {
    var __options: js.UndefOr[
        IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
      ] = js.native
  }
  
}

