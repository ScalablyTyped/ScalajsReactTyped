package typingsJapgolly.reactSelect.srcCreatableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactSelect.reactSelectStrings.first
import typingsJapgolly.reactSelect.reactSelectStrings.last
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatableProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* Allow options to be created while the `isLoading` prop is true. Useful to
    prevent the "create new ..." option being displayed while async results are
    still being loaded. */
  var allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined
  /* Sets the position of the createOption element in your options list. Defaults to 'last' */
  var createOptionPosition: js.UndefOr[first | last] = js.undefined
  /* Gets the label for the "create new ..." option in the menu. Is given the
    current input value. */
  var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, Node]] = js.undefined
  /* Returns the data for the new option when it is created. Used to display the
    value, and is passed to `onChange`. */
  var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ Node, OptionType]] = js.undefined
  /* Determines whether the "create new ..." option should be displayed based on
    the current input value, select value and options array. */
  var isValidNewOption: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* value */ ValueType[OptionType], 
      /* options */ OptionsType[OptionType], 
      Boolean
    ]
  ] = js.undefined
  /* If provided, this will be called with the input value when a new option is
    created, and `onChange` will **not** be called. Use this when you need more
    control over what happens when new options are created. */
  var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.undefined
}

object CreatableProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined,
    createOptionPosition: first | last = null,
    formatCreateLabel: /* inputValue */ String => CallbackTo[Node] = null,
    getNewOptionData: (/* inputValue */ String, /* optionLabel */ Node) => CallbackTo[OptionType] = null,
    isValidNewOption: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType]) => CallbackTo[Boolean] = null,
    onCreateOption: /* inputValue */ String => Callback = null
  ): CreatableProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCreateWhileLoading)) __obj.updateDynamic("allowCreateWhileLoading")(allowCreateWhileLoading.asInstanceOf[js.Any])
    if (createOptionPosition != null) __obj.updateDynamic("createOptionPosition")(createOptionPosition.asInstanceOf[js.Any])
    if (formatCreateLabel != null) __obj.updateDynamic("formatCreateLabel")(js.Any.fromFunction1((t0: /* inputValue */ java.lang.String) => formatCreateLabel(t0).runNow()))
    if (getNewOptionData != null) __obj.updateDynamic("getNewOptionData")(js.Any.fromFunction2((t0: /* inputValue */ java.lang.String, t1: /* optionLabel */ japgolly.scalajs.react.raw.React.Node) => getNewOptionData(t0, t1).runNow()))
    if (isValidNewOption != null) __obj.updateDynamic("isValidNewOption")(js.Any.fromFunction3((t0: /* inputValue */ java.lang.String, t1: /* value */ typingsJapgolly.reactSelect.typesMod.ValueType[OptionType], t2: /* options */ typingsJapgolly.reactSelect.typesMod.OptionsType[OptionType]) => isValidNewOption(t0, t1, t2).runNow()))
    if (onCreateOption != null) __obj.updateDynamic("onCreateOption")(js.Any.fromFunction1((t0: /* inputValue */ java.lang.String) => onCreateOption(t0).runNow()))
    __obj.asInstanceOf[CreatableProps[OptionType]]
  }
}

