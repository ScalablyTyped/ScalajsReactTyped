package typingsJapgolly.semanticUiReact.stepGroupMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`1`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`2`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`3`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`4`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`5`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`6`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`7`
import typingsJapgolly.semanticUiReact.semanticUiReactNumbers.`8`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.eight
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.five
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.four
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.one
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.seven
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.six
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tablet
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.three
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.two
import typingsJapgolly.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepGroupProps
  extends StrictStepGroupProps
     with /* key */ StringDictionary[js.Any]

object StepGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StepProps] = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    stackable: tablet = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`1` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`2` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`3` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`5` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`6` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`7` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight = null
  ): StepGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stackable != null) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepGroupProps]
  }
}

