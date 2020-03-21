package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCascader extends js.Object {
  var cascader: Element
}

object AnonCascader {
  @scala.inline
  def apply(cascader: VdomElement): AnonCascader = {
    val __obj = js.Dynamic.literal()
    if (cascader != null) __obj.updateDynamic("cascader")(cascader.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCascader]
  }
}

