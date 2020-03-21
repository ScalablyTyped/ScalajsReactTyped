package typingsJapgolly.uifabricFoundation.icomponentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IStateComponentType
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends js.Object {
  var displayName: String
  var factoryOptions: IFactoryOptions[TComponentProps]
  var fields: js.Array[String]
  var slots: ISlotComponent[TComponentProps, TComponentSlots]
  var state: IStateComponentType[TComponentProps, TViewProps]
  var statics: TStatics
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
  var view: IViewComponent[TViewProps, TComponentSlots]
}

object IComponent {
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    slots: ISlotComponent[TComponentProps, TComponentSlots],
    state: TComponentProps => CallbackTo[TViewProps],
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => CallbackTo[ReturnType[FunctionComponent[js.Object]]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(js.Any.fromFunction1((t0: TComponentProps) => state(t0).runNow()))
    __obj.updateDynamic("view")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.react.mod.PropsWithChildren[TViewProps], t1: /* slots */ typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots[typingsJapgolly.std.Required[TComponentSlots]]) => view(t0, t1).runNow()))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
}

