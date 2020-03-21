package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.bodyCellMod.BodyCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyCell {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BodyCellProps, typingsJapgolly.primereact.bodyCellMod.BodyCell, Unit, BodyCellProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.bodyCellMod.BodyCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.bodyCellMod.BodyCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.bodyCellMod.BodyCellProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/BodyCell", "BodyCell")
  @js.native
  object componentImport extends js.Object
  
}

