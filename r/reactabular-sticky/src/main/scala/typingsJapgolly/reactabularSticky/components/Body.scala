package typingsJapgolly.reactabularSticky.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactabularSticky.PartialUIEvent
import typingsJapgolly.reactabularSticky.mod.StickyBodyProps
import typingsJapgolly.reactabularTable.AnonRowIndexNumber
import typingsJapgolly.reactabularTable.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.BodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Body {
  def apply(
    rowKey: String,
    rows: js.Array[_],
    className: String = null,
    onRow: (/* row */ js.Any, /* props */ AnonRowIndexNumber) => CallbackTo[js.Any] = null,
    onScroll: /* e */ PartialUIEvent => Callback = null,
    style: PartialCSSStyleDeclaratio = null,
    tableHeader: HTMLElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StickyBodyProps with BodyProps, 
    typingsJapgolly.reactabularSticky.mod.Body, 
    Unit, 
    StickyBodyProps with BodyProps
  ] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: /* row */ js.Any, t1: /* props */ typingsJapgolly.reactabularTable.AnonRowIndexNumber) => onRow(t0, t1).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactabularSticky.PartialUIEvent) => onScroll(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactabularSticky.mod.StickyBodyProps with typingsJapgolly.reactabularTable.mod.BodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactabularSticky.mod.Body](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactabularSticky.mod.StickyBodyProps with typingsJapgolly.reactabularTable.mod.BodyProps])(children: _*)
  }
  @JSImport("reactabular-sticky", "Body")
  @js.native
  object componentImport extends js.Object
  
}

