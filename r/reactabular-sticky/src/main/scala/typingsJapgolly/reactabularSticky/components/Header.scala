package typingsJapgolly.reactabularSticky.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactabularSticky.PartialUIEvent
import typingsJapgolly.reactabularSticky.mod.StickyHeaderProps
import typingsJapgolly.reactabularTable.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.Column
import typingsJapgolly.reactabularTable.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    className: String = null,
    headerRows: js.Array[Column] = null,
    onScroll: /* e */ PartialUIEvent => Callback = null,
    style: PartialCSSStyleDeclaratio = null,
    tableBody: HTMLElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StickyHeaderProps with HeaderProps, 
    typingsJapgolly.reactabularSticky.mod.Header, 
    Unit, 
    StickyHeaderProps with HeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactabularSticky.PartialUIEvent) => onScroll(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableBody != null) __obj.updateDynamic("tableBody")(tableBody.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactabularSticky.mod.StickyHeaderProps with typingsJapgolly.reactabularTable.mod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactabularSticky.mod.Header](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactabularSticky.mod.StickyHeaderProps with typingsJapgolly.reactabularTable.mod.HeaderProps])(children: _*)
  }
  @JSImport("reactabular-sticky", "Header")
  @js.native
  object componentImport extends js.Object
  
}

