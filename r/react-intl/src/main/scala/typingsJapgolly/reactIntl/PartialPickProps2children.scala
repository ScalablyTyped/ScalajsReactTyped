package typingsJapgolly.reactIntl

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.cardinal
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'format' | 'localeMatcher' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any>> */
trait PartialPickProps2children extends js.Object {
  var children: js.UndefOr[js.Function1[/* value */ Node, Element | Null]] = js.undefined
  var few: js.UndefOr[Node] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefHandle[_]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var many: js.UndefOr[Node] = js.undefined
  var one: js.UndefOr[Node] = js.undefined
  var other: js.UndefOr[Node] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  var two: js.UndefOr[Node] = js.undefined
  var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var zero: js.UndefOr[Node] = js.undefined
}

object PartialPickProps2children {
  @scala.inline
  def apply(
    children: /* value */ Node => CallbackTo[Element | Null] = null,
    few: VdomNode = null,
    format: String = null,
    forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefHandle[_] = null,
    key: Key = null,
    localeMatcher: lookup | (`best fit`) = null,
    many: VdomNode = null,
    one: VdomNode = null,
    other: VdomNode = null,
    ref: Ref = null,
    two: VdomNode = null,
    `type`: cardinal | ordinal = null,
    value: Int | Double = null,
    zero: VdomNode = null
  ): PartialPickProps2children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ japgolly.scalajs.react.raw.React.Node) => children(t0).runNow()))
    if (few != null) __obj.updateDynamic("few")(few.rawNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.rawNode.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.rawNode.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickProps2children]
  }
}

