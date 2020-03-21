package typingsJapgolly.webscopeioReactTextareaAutocomplete.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingType[TItem] extends js.Object {
  /**
    * Show autocomplete only if it's preceded by whitespace. Cannot be combined with allowWhitespace.
    * @default false
    */
  var afterWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this to true if you want to provide autocomplete for words (tokens) containing whitespace.
    * @default false
    */
  var allowWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * The component for rendering the item in suggestion list. It has selected and entity props provided by React Textarea Autocomplete.
    */
  var component: SFC[ItemComponentProps[TItem]]
  /**
    * Called after each keystroke to get data what the suggestion list should display (array or promise resolving array).
    */
  var dataProvider: DataProviderType[TItem]
  /**
    * (Optional for string based item. If the item is an object this method is required) This function defines text
    * which will be placed into textarea after the user makes a selection.
    *
    * You can also specify the behavior of caret if you return object {text: "item", caretPosition: "start"} the caret
    * will be before the word once the user confirms their selection. Other possible value are "next", "end" and number,
    * which is absolute number in contex of textarea (0 is equal position before the first char). Defaults to "next"
    * which is space after the injected word.
    *
    * The default behavior for string based item is a string: <TRIGGER><ITEM><TRIGGER>). This method should always
    * return a unique string, otherwise, you have to use object notation and specify your own key or return object
    * from dataProvider with key property.
    */
  var output: js.UndefOr[
    js.Function2[/* item */ TItem, /* trigger */ js.UndefOr[String], TextToReplaceType | String]
  ] = js.undefined
}

object SettingType {
  @scala.inline
  def apply[TItem](
    component: SFC[ItemComponentProps[TItem]],
    dataProvider: /* token */ String => CallbackTo[js.Promise[js.Array[TItem]] | js.Array[TItem]],
    afterWhitespace: js.UndefOr[Boolean] = js.undefined,
    allowWhitespace: js.UndefOr[Boolean] = js.undefined,
    output: (/* item */ TItem, /* trigger */ js.UndefOr[String]) => CallbackTo[TextToReplaceType | String] = null
  ): SettingType[TItem] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("dataProvider")(js.Any.fromFunction1((t0: /* token */ java.lang.String) => dataProvider(t0).runNow()))
    if (!js.isUndefined(afterWhitespace)) __obj.updateDynamic("afterWhitespace")(afterWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWhitespace)) __obj.updateDynamic("allowWhitespace")(allowWhitespace.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(js.Any.fromFunction2((t0: /* item */ TItem, t1: /* trigger */ js.UndefOr[java.lang.String]) => output(t0, t1).runNow()))
    __obj.asInstanceOf[SettingType[TItem]]
  }
}

