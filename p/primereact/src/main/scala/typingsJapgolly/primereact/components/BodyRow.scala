package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.bodyRowMod.BodyRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyRow {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BodyRowProps, typingsJapgolly.primereact.bodyRowMod.BodyRow, Unit, BodyRowProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.bodyRowMod.BodyRowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.bodyRowMod.BodyRow](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.bodyRowMod.BodyRowProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/BodyRow", "BodyRow")
  @js.native
  object componentImport extends js.Object
  
}

