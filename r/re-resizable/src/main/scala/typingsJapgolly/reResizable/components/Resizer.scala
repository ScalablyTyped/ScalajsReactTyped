package typingsJapgolly.reResizable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.reResizable.resizerMod.Direction
import typingsJapgolly.reResizable.resizerMod.Props
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizer {
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ Direction) => Callback,
    className: String = null,
    replaceStyles: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.reResizable.resizerMod.Resizer, Unit, Props] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onResizeStart")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* dir */ typingsJapgolly.reResizable.resizerMod.Direction) => onResizeStart(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (replaceStyles != null) __obj.updateDynamic("replaceStyles")(replaceStyles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reResizable.resizerMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reResizable.resizerMod.Resizer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reResizable.resizerMod.Props])(children: _*)
  }
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  object componentImport extends js.Object
  
}

