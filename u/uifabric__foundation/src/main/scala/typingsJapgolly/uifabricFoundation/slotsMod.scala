package typingsJapgolly.uifabricFoundation

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ReactNode
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlot
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotFactory
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
@js.native
object slotsMod extends js.Object {
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def withSlots[P](`type`: String): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
}

