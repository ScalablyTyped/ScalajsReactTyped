package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Searchable extends js.Object {
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object Searchable {
  @scala.inline
  def apply(
    autoCapitalize: none | sentences | words | characters = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    onChangeText: /* text */ String => Callback = null,
    onSearchCloseRequested: js.UndefOr[Callback] = js.undefined,
    onSearchClosed: js.UndefOr[Callback] = js.undefined,
    onSearchPressed: js.UndefOr[Callback] = js.undefined,
    onSubmitEditing: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null
  ): Searchable = {
    val __obj = js.Dynamic.literal()
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChangeText(t0).runNow()))
    onSearchCloseRequested.foreach(p => __obj.updateDynamic("onSearchCloseRequested")(p.toJsFn))
    onSearchClosed.foreach(p => __obj.updateDynamic("onSearchClosed")(p.toJsFn))
    onSearchPressed.foreach(p => __obj.updateDynamic("onSearchPressed")(p.toJsFn))
    onSubmitEditing.foreach(p => __obj.updateDynamic("onSubmitEditing")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Searchable]
  }
}

