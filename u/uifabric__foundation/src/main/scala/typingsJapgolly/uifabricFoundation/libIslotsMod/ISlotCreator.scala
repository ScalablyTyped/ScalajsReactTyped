package typingsJapgolly.uifabricFoundation.libIslotsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.undefined
}

object ISlotCreator {
  @scala.inline
  def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](
    create: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle) => CallbackTo[ReturnType[FunctionComponent[TProps]]] = null
  ): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction4((t0: /* componentProps */ TProps with typingsJapgolly.uifabricFoundation.libIslotsMod.IProcessedSlotProps, t1: /* userProps */ typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotProp[TProps, TShorthandProp], t2: /* slotOptions */ js.UndefOr[typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotOptions[TProps]], t3: /* defaultStyles */ typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle) => create(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
}

