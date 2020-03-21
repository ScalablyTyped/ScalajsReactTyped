package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameCalculateItemHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyList {
  def apply(
    calculateItemHeight: Double => CallbackTo[js.Any],
    renderRow: Double => CallbackTo[js.Any],
    className: String = null,
    id: String = null,
    length: Int | Double = null,
    modifier: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameCalculateItemHeight, 
    typingsJapgolly.reactOnsenui.mod.LazyList, 
    Unit, 
    HTMLAttributesidclassNameCalculateItemHeight
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("calculateItemHeight")(js.Any.fromFunction1((t0: scala.Double) => calculateItemHeight(t0).runNow()))
    __obj.updateDynamic("renderRow")(js.Any.fromFunction1((t0: scala.Double) => renderRow(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameCalculateItemHeight, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.LazyList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameCalculateItemHeight])(children: _*)
  }
  @JSImport("react-onsenui", "LazyList")
  @js.native
  object componentImport extends js.Object
  
}

