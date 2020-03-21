package typingsJapgolly.reactIntl.pluralMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactIntl.typesMod.CustomFormatConfig
import typingsJapgolly.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped std.Intl.PluralRulesOptions extends 'localeMatcher' ? never : std.Intl.PluralRulesOptions */ trait Props extends CustomFormatConfig {
  var children: js.UndefOr[js.Function1[/* value */ Node, Element | Null]] = js.undefined
  var few: js.UndefOr[Node] = js.undefined
  var intl: IntlShape
  var many: js.UndefOr[Node] = js.undefined
  var one: js.UndefOr[Node] = js.undefined
  var other: Node
  var two: js.UndefOr[Node] = js.undefined
  var value: Double
  var zero: js.UndefOr[Node] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    intl: IntlShape,
    value: Double,
    children: /* value */ Node => CallbackTo[Element | Null] = null,
    few: VdomNode = null,
    format: String = null,
    many: VdomNode = null,
    one: VdomNode = null,
    other: VdomNode = null,
    two: VdomNode = null,
    zero: VdomNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ japgolly.scalajs.react.raw.React.Node) => children(t0).runNow()))
    if (few != null) __obj.updateDynamic("few")(few.rawNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.rawNode.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.rawNode.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.rawNode.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

