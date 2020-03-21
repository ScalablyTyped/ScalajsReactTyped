package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.layoutGridMod.ALIGNMENT
import typingsJapgolly.baseui.layoutGridMod.CellProps
import typingsJapgolly.baseui.layoutGridMod.Responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  def apply(
    align: Responsive[ALIGNMENT] = null,
    order: Responsive[Double] = null,
    skip: Responsive[Double] = null,
    span: Responsive[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CellProps, 
    MountedWithRawType[CellProps, js.Object, RawMounted[CellProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.layoutGridMod.CellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.layoutGridMod.CellProps])(children: _*)
  }
  @JSImport("baseui/layout-grid", "Cell")
  @js.native
  object componentImport extends js.Object
  
}

