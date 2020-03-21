package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.AnonFilterPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleInitialState
  extends /* x */ StringDictionary[js.Any] {
  var enableSettings: js.UndefOr[Boolean] = js.undefined
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.undefined
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.undefined
  var textProperties: js.UndefOr[AnonFilterPlaceholder] = js.undefined
}

object GriddleInitialState {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    enableSettings: js.UndefOr[Boolean] = js.undefined,
    pageProperties: GriddlePageProperties = null,
    sortMethod: (/* data */ js.Array[js.Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    textProperties: AnonFilterPlaceholder = null
  ): GriddleInitialState = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* column */ java.lang.String, t2: /* sortAscending */ js.UndefOr[scala.Boolean]) => sortMethod(t0, t1, t2).runNow()))
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties.asInstanceOf[js.Any])
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleInitialState]
  }
}

