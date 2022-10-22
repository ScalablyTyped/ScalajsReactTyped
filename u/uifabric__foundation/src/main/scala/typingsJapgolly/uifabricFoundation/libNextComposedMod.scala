package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Required
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricFoundation.libNextIcomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.libNextIcomponentMod.IPartialSlotComponent
import typingsJapgolly.uifabricFoundation.libNextIcomponentMod.IRecompositionComponentOptions
import typingsJapgolly.uifabricFoundation.libNextIcomponentMod.ISlotComponent
import typingsJapgolly.uifabricFoundation.libNextIslotsMod.IFoundationComponent
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextComposedMod {
  
  @JSImport("@uifabric/foundation/lib/next/composed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composed[TComponentProps /* <: ValidProps & ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("composed")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics]
  inline def composed[TComponentProps /* <: ValidProps & ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("composed")(options.asInstanceOf[js.Any]).asInstanceOf[(IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics]
  
  inline def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots]),
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSlots")(slots.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ISlotDefinition[Required[TComponentSlots]]]
  inline def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](slots: Unit, data: TComponentProps): ISlotDefinition[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSlots")(slots.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ISlotDefinition[Required[TComponentSlots]]]
}
