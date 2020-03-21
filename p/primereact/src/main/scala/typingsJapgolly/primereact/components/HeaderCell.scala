package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.headerCellMod.HeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderCell {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HeaderCellProps, 
    typingsJapgolly.primereact.headerCellMod.HeaderCell, 
    Unit, 
    HeaderCellProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.headerCellMod.HeaderCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.headerCellMod.HeaderCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.headerCellMod.HeaderCellProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/HeaderCell", "HeaderCell")
  @js.native
  object componentImport extends js.Object
  
}

