package typingsJapgolly.uifabricFoundation.icomponentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
  extends typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
  /**
    * Slot definition object defining the slot component for each slot.
    */
  var slots: js.UndefOr[ISlotComponent[TComponentProps, TComponentSlots]] = js.undefined
  /**
    * Stateless pure function that receives props to render the output of the component.
    */
  var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.undefined
}

object IComponentOptions {
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
    displayName: String = null,
    factoryOptions: IFactoryOptions[TComponentProps] = null,
    fields: js.Array[String] = null,
    slots: ISlotComponent[TComponentProps, TComponentSlots] = null,
    state: TComponentProps => CallbackTo[TViewProps] = null,
    statics: TStatics = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null,
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => CallbackTo[ReturnType[FunctionComponent[js.Object]]] = null
  ): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (factoryOptions != null) __obj.updateDynamic("factoryOptions")(factoryOptions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(js.Any.fromFunction1((t0: TComponentProps) => state(t0).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.react.mod.PropsWithChildren[TViewProps], t1: /* slots */ typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots[typingsJapgolly.std.Required[TComponentSlots]]) => view(t0, t1).runNow()))
    __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
}

