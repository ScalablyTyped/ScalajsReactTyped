package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Required
import typingsJapgolly.uifabricFoundation.icomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.icomponentMod.IPartialSlotComponent
import typingsJapgolly.uifabricFoundation.icomponentMod.IRecompositionComponentOptions
import typingsJapgolly.uifabricFoundation.icomponentMod.ISlotComponent
import typingsJapgolly.uifabricFoundation.islotsMod.IFoundationComponent
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/composed", JSImport.Namespace)
@js.native
object composedMod extends js.Object {
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: js.UndefOr[
      (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots])
    ],
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = js.native
}

