package typingsJapgolly.solidReact.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var children: js.UndefOr[js.Function2[/* listItem */ LDflexValue, /* index */ Double, Element]] = js.undefined
  var container: js.UndefOr[js.Function1[Element, Element]] = js.undefined
  // dtslint does not appear to understand that `T` is used in the type guard.
  // See https://github.com/Microsoft/dtslint/issues/228
  // tslint:disable-next-line no-unnecessary-generics
  var filter: js.UndefOr[
    js.Function3[
      /* item */ LDflexValue, 
      /* index */ Double, 
      /* array */ js.Array[LDflexValue], 
      /* is @solid/react.@solid/react.LDflexValue */ Boolean
    ]
  ] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var src: String
}

object ListProps {
  @scala.inline
  def apply(
    src: String,
    children: (/* listItem */ LDflexValue, /* index */ Double) => CallbackTo[Element] = null,
    container: Element => CallbackTo[Element] = null,
    filter: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => CallbackTo[/* is @solid/react.@solid/react.LDflexValue */ Boolean] = null,
    limit: Int | Double = null,
    offset: Int | Double = null
  ): ListProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2((t0: /* listItem */ typingsJapgolly.solidReact.mod.LDflexValue, t1: /* index */ scala.Double) => children(t0, t1).runNow()))
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Element) => container(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.solidReact.mod.LDflexValue, t1: /* index */ scala.Double, t2: /* array */ js.Array[typingsJapgolly.solidReact.mod.LDflexValue]) => filter(t0, t1, t2).runNow()))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

