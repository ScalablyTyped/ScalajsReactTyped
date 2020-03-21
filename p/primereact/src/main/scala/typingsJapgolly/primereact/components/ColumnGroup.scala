package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.columngroupColumnGroupMod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ColumnGroupProps, 
    typingsJapgolly.primereact.columngroupMod.ColumnGroup, 
    Unit, 
    ColumnGroupProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.columngroupColumnGroupMod.ColumnGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.columngroupMod.ColumnGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.columngroupColumnGroupMod.ColumnGroupProps])(children: _*)
  }
  @JSImport("primereact/columngroup", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
}

