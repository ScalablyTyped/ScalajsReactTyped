package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.griddleReact.mod.components.Row
import typingsJapgolly.griddleReact.mod.components.RowProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsRow {
  def apply(
    Cell: js.Any = null,
    className: String = null,
    columnIds: js.Array[Double] = null,
    griddleKey: String = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[Element] => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RowProps, Row, Unit, RowProps] = {
    val __obj = js.Dynamic.literal()
  
      if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds.asInstanceOf[js.Any])
    if (griddleKey != null) __obj.updateDynamic("griddleKey")(griddleKey.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.RowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.Row](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.RowProps])(children: _*)
  }
  @JSImport("griddle-react", "components.Row")
  @js.native
  object componentImport extends js.Object
  
}

