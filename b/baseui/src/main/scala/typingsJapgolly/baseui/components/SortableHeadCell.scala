package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonHeadCell
import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import typingsJapgolly.baseui.tableMod.SortableHeadCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortableHeadCell {
  def apply(
    title: String,
    direction: ASC | DESC = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fillClickTarget: js.UndefOr[Boolean] = js.undefined,
    onSort: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: AnonHeadCell = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SortableHeadCellProps, 
    MountedWithRawType[SortableHeadCellProps, js.Object, RawMounted[SortableHeadCellProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fillClickTarget)) __obj.updateDynamic("fillClickTarget")(fillClickTarget.asInstanceOf[js.Any])
    onSort.foreach(p => __obj.updateDynamic("onSort")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.tableMod.SortableHeadCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tableMod.SortableHeadCellProps])(children: _*)
  }
  @JSImport("baseui/table", "SortableHeadCell")
  @js.native
  object componentImport extends js.Object
  
}

