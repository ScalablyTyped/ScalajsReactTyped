package typingsJapgolly.singleSpaReact.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalajs.dom.raw.Element
import typingsJapgolly.singleSpaReact.TypeofReact
import typingsJapgolly.singleSpaReact.TypeofReactDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var React: TypeofReact
  var ReactDOM: TypeofReactDOM
  var domElementGetter: js.UndefOr[js.Function0[Element]] = js.undefined
  var loadRootComponent: js.UndefOr[js.Function0[js.Promise[ComponentClassP[js.Object]]]] = js.undefined
  var parcelCanUpdate: js.UndefOr[Boolean] = js.undefined
  var rootComponent: js.UndefOr[ComponentClassP[js.Object]] = js.undefined
  var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    React: TypeofReact,
    ReactDOM: TypeofReactDOM,
    domElementGetter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    loadRootComponent: js.UndefOr[CallbackTo[js.Promise[ComponentClassP[js.Object]]]] = js.undefined,
    parcelCanUpdate: js.UndefOr[Boolean] = js.undefined,
    rootComponent: ComponentClassP[js.Object] = null,
    suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
    domElementGetter.foreach(p => __obj.updateDynamic("domElementGetter")(p.toJsFn))
    loadRootComponent.foreach(p => __obj.updateDynamic("loadRootComponent")(p.toJsFn))
    if (!js.isUndefined(parcelCanUpdate)) __obj.updateDynamic("parcelCanUpdate")(parcelCanUpdate.asInstanceOf[js.Any])
    if (rootComponent != null) __obj.updateDynamic("rootComponent")(rootComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressComponentDidCatchWarning)) __obj.updateDynamic("suppressComponentDidCatchWarning")(suppressComponentDidCatchWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

