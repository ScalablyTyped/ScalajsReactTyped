package typingsJapgolly.reactToolbox.radioBaseMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * If true, the input element will be selected by default. Transferred from the parent.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Callback invoked on mouse down.
    */
  var onMouseDown: js.UndefOr[js.Function] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to Radio container.
    */
  /* key */ StringDictionary[js.Any] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    onMouseDown: js.Function = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

