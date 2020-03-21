package typingsJapgolly.styletronEngineAtomic.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var container: js.UndefOr[Element] = js.undefined
  var hydrate: js.UndefOr[hydrateType] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(container: Element = null, hydrate: hydrateType = null, prefix: String = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (hydrate != null) __obj.updateDynamic("hydrate")(hydrate.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

