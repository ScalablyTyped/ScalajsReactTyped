package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.mod.ColumnProps
import typingsJapgolly.gestalt.mod.UnsignedUpTo12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply(
    span: UnsignedUpTo12,
    lgSpan: UnsignedUpTo12 = null,
    mdSpan: UnsignedUpTo12 = null,
    smSpan: UnsignedUpTo12 = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnProps, typingsJapgolly.gestalt.mod.Column, Unit, ColumnProps] = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
  
      if (lgSpan != null) __obj.updateDynamic("lgSpan")(lgSpan.asInstanceOf[js.Any])
    if (mdSpan != null) __obj.updateDynamic("mdSpan")(mdSpan.asInstanceOf[js.Any])
    if (smSpan != null) __obj.updateDynamic("smSpan")(smSpan.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.ColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Column](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.ColumnProps])(children: _*)
  }
  @JSImport("gestalt", "Column")
  @js.native
  object componentImport extends js.Object
  
}

