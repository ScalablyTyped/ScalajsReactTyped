package typingsJapgolly.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object icomponentMod {
  type IPartialSlotComponent[TComponentProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots] | (js.Function1[
    /* props */ TComponentProps, 
    typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots]
  ])
  type ISlotComponent[TComponentProps /* <: typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsJapgolly.std.Required[TComponentSlots]] | (js.Function1[
    /* props */ TComponentProps, 
    typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsJapgolly.std.Required[TComponentSlots]]
  ])
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ typingsJapgolly.react.mod.PropsWithChildren[TViewProps], 
    /* slots */ typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots[typingsJapgolly.std.Required[TComponentSlots]], 
    typingsJapgolly.std.ReturnType[typingsJapgolly.react.mod.FunctionComponent[js.Object]]
  ]
}
