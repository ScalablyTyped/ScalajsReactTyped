package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingComponentBuilder extends ComponentBuilder[LoadingComponent] {
  /**
  		 * Set the component wrapped by the LoadingComponent
  		 * @param component The component to wrap
  		 */
  def withItem(component: Component): LoadingComponentBuilder
}

object LoadingComponentBuilder {
  @scala.inline
  def apply(
    component: CallbackTo[LoadingComponent],
    withItem: Component => CallbackTo[LoadingComponentBuilder],
    withProperties: js.Any => CallbackTo[ComponentBuilder[LoadingComponent]],
    withValidation: js.Function1[LoadingComponent, Boolean] => CallbackTo[ComponentBuilder[LoadingComponent]]
  ): LoadingComponentBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component.toJsFn)
    __obj.updateDynamic("withItem")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.Component) => withItem(t0).runNow()))
    __obj.updateDynamic("withProperties")(js.Any.fromFunction1((t0: js.Any) => withProperties(t0).runNow()))
    __obj.updateDynamic("withValidation")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.azdata.mod.LoadingComponent, scala.Boolean]) => withValidation(t0).runNow()))
    __obj.asInstanceOf[LoadingComponentBuilder]
  }
}

