package typingsJapgolly.reactPlacesAutocomplete

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactPlacesAutocomplete.mod.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  loading  :boolean,   suggestions  :std.ReadonlyArray<react-places-autocomplete.react-places-autocomplete.Suggestion>, getInputProps <InputProps extends {}>(options ? : InputProps): {  type  :'text',   autoComplete  :'off',   role  :'combobox',   aria-autocomplete  :'list',   aria-expanded  :boolean,   aria-activedescendant  :string | undefined,   disabled  :boolean,   onKeyDown  :react.react.KeyboardEventHandler<std.Element>,   onBlur  :react.react.FocusEventHandler<std.Element>,   value  :string | undefined, onChange (ev : {  target  :{  value  :string}}): void} & InputProps, getSuggestionItemProps <SuggestionProps extends {}>(suggestion : react-places-autocomplete.react-places-autocomplete.Suggestion, options ? : SuggestionProps): {  key  :number,   id  :string | undefined,   role  :'option',   onMouseEnter  :react.react.MouseEventHandler<std.Element>,   onMouseLeave  :react.react.MouseEventHandler<std.Element>,   onMouseDown  :react.react.MouseEventHandler<std.Element>,   onMouseUp  :react.react.MouseEventHandler<std.Element>,   onTouchStart  :react.react.TouchEventHandler<std.Element>,   onTouchEnd  :react.react.TouchEventHandler<std.Element>,   onClick  :react.react.MouseEventHandler<std.Element>} & SuggestionProps}> */
trait Readonlyloadingbooleansug extends js.Object {
  val getInputProps: js.Function1[/* options */ js.UndefOr[js.Object], AnonAriaactivedescendant with js.Object]
  val getSuggestionItemProps: js.Function2[
    /* suggestion */ Suggestion, 
    /* options */ js.UndefOr[js.Object], 
    AnonId with js.Object
  ]
  val loading: Boolean
  val suggestions: js.Array[Suggestion]
}

object Readonlyloadingbooleansug {
  @scala.inline
  def apply(
    getInputProps: /* options */ js.UndefOr[js.Object] => CallbackTo[AnonAriaactivedescendant with js.Object],
    getSuggestionItemProps: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => CallbackTo[AnonId with js.Object],
    loading: Boolean,
    suggestions: js.Array[Suggestion]
  ): Readonlyloadingbooleansug = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.updateDynamic("getInputProps")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Object]) => getInputProps(t0).runNow()))
    __obj.updateDynamic("getSuggestionItemProps")(js.Any.fromFunction2((t0: /* suggestion */ typingsJapgolly.reactPlacesAutocomplete.mod.Suggestion, t1: /* options */ js.UndefOr[js.Object]) => getSuggestionItemProps(t0, t1).runNow()))
    __obj.asInstanceOf[Readonlyloadingbooleansug]
  }
}

