package typingsJapgolly.formol

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictk
  extends /* k */ StringDictionary[js.Any] {
  var no: Node
  var yes: Node
}

object AnonDictk {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    no: VdomNode = null,
    yes: VdomNode = null
  ): AnonDictk = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (no != null) __obj.updateDynamic("no")(no.rawNode.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictk]
  }
}

