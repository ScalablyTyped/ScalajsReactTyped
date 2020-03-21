package typingsJapgolly.testingLibraryReact.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions[Q /* <: Queries */] extends js.Object {
  var baseElement: js.UndefOr[HTMLElement] = js.undefined
  var container: js.UndefOr[HTMLElement] = js.undefined
  var hydrate: js.UndefOr[Boolean] = js.undefined
  var queries: js.UndefOr[Q] = js.undefined
  var wrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply[Q /* <: Queries */](
    baseElement: HTMLElement = null,
    container: HTMLElement = null,
    hydrate: js.UndefOr[Boolean] = js.undefined,
    queries: Q = null,
    wrapper: ComponentType[js.Object] = null
  ): RenderOptions[Q] = {
    val __obj = js.Dynamic.literal()
    if (baseElement != null) __obj.updateDynamic("baseElement")(baseElement.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(hydrate)) __obj.updateDynamic("hydrate")(hydrate.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions[Q]]
  }
}

