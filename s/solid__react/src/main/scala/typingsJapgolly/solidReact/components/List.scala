package typingsJapgolly.solidReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.solidReact.mod.LDflexValue
import typingsJapgolly.solidReact.mod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    src: String,
    container: Element => CallbackTo[Element] = null,
    filter: (/* item */ LDflexValue, /* index */ Double, /* array */ js.Array[LDflexValue]) => CallbackTo[/* is @solid/react.@solid/react.LDflexValue */ Boolean] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (/* listItem */ LDflexValue, /* index */ Double) => CallbackTo[Element] = null
  ): UnmountedWithRoot[ListProps, typingsJapgolly.solidReact.mod.List, Unit, ListProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2((t0: /* listItem */ typingsJapgolly.solidReact.mod.LDflexValue, t1: /* index */ scala.Double) => children(t0, t1).runNow()))
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Element) => container(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.solidReact.mod.LDflexValue, t1: /* index */ scala.Double, t2: /* array */ js.Array[typingsJapgolly.solidReact.mod.LDflexValue]) => filter(t0, t1, t2).runNow()))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.solidReact.mod.ListProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.solidReact.mod.List](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.solidReact.mod.ListProps])
  }
  @JSImport("@solid/react", "List")
  @js.native
  object componentImport extends js.Object
  
}

