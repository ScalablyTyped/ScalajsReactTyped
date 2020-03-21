package typingsJapgolly.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhanceInstruction extends js.Object {
  /**
    * A binding context for the enhancement.
    */
  var bindingContext: js.UndefOr[js.Object] = js.undefined
  /**
    * The DI container to use as the root for UI enhancement.
    */
  var container: js.UndefOr[Container] = js.undefined
  /**
    * The element to enhance.
    */
  var element: Element
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.undefined
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources_] = js.undefined
}

object EnhanceInstruction {
  @scala.inline
  def apply(
    element: Element,
    bindingContext: js.Object = null,
    container: Container = null,
    overrideContext: js.Any = null,
    resources: ViewResources_ = null
  ): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (bindingContext != null) __obj.updateDynamic("bindingContext")(bindingContext.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (overrideContext != null) __obj.updateDynamic("overrideContext")(overrideContext.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
}

