package typingsJapgolly.storybookAddons.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.storybookAddons.AnonBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: js.UndefOr[String] = js.undefined
  var hierarchySeparator: js.UndefOr[js.RegExp] = js.undefined
  var showRoots: js.UndefOr[Boolean] = js.undefined
  var storySort: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[AnonBase] = js.undefined
}

object OptionsParameter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    hierarchyRootSeparator: String = null,
    hierarchySeparator: js.RegExp = null,
    showRoots: js.UndefOr[Boolean] = js.undefined,
    storySort: js.Any = null,
    theme: AnonBase = null
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hierarchyRootSeparator != null) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator.asInstanceOf[js.Any])
    if (hierarchySeparator != null) __obj.updateDynamic("hierarchySeparator")(hierarchySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoots)) __obj.updateDynamic("showRoots")(showRoots.asInstanceOf[js.Any])
    if (storySort != null) __obj.updateDynamic("storySort")(storySort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsParameter]
  }
}

