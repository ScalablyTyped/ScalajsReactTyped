package typingsJapgolly.webcomponentsJs.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  val shadowRoot: ShadowRoot | Null
  def createShadowRoot(): ShadowRoot
}

object Element {
  @scala.inline
  def apply(createShadowRoot: CallbackTo[ShadowRoot], shadowRoot: ShadowRoot = null): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createShadowRoot")(createShadowRoot.toJsFn)
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

