package typingsJapgolly.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIslotsMod {
  type ExtractProps[TUnion] = js.Any
  type ExtractShorthand[TUnion] = java.lang.String | scala.Double | scala.Boolean
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsJapgolly.uifabricFoundation.uifabricFoundationStrings.ISlotDefinition with TSlots
  type ISlotFactory[TProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand */] = js.Function4[
    /* componentProps */ TProps with typingsJapgolly.uifabricFoundation.libIslotsMod.IProcessedSlotProps, 
    /* userProps */ typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotOptions[TProps]], 
    /* defaultStyles */ typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle, 
    typingsJapgolly.std.ReturnType[typingsJapgolly.react.mod.FunctionComponent[TProps]]
  ]
  type ISlotProp[TProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand */] = TShorthandProp | TProps
  type ISlotRender[TProps] = js.Function2[
    /* props */ typingsJapgolly.react.mod.PropsWithChildren[TProps], 
    /* defaultComponent */ typingsJapgolly.react.mod.ComponentType[TProps], 
    typingsJapgolly.std.ReturnType[typingsJapgolly.react.mod.FunctionComponent[TProps]]
  ]
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsJapgolly.uifabricFoundation.uifabricFoundationStrings.ISlots with TSlots
  type ISlottableComponentType[TProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand */] = typingsJapgolly.react.mod.ComponentType[TProps] with (typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  type ISlottableProps[TSlots] = TSlots with typingsJapgolly.uifabricFoundation.AnonSlots[TSlots]
  type ISlottableReactType[TProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand */] = japgolly.scalajs.react.raw.React.ElementType with (typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  type ValidProps = js.Object
  type ValidShorthand = java.lang.String | scala.Double | scala.Boolean
}
