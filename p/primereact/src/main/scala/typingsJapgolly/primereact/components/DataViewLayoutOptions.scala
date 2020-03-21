package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValueString
import typingsJapgolly.primereact.dataViewMod.DataViewLayoutOptionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataViewLayoutOptions {
  def apply(
    onChange: AnonValueString => Callback,
    className: String = null,
    id: String = null,
    layout: String = null,
    style: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DataViewLayoutOptionsProps, 
    typingsJapgolly.primereact.primereactDataviewMod.DataViewLayoutOptions, 
    Unit, 
    DataViewLayoutOptionsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.primereact.AnonValueString) => onChange(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.dataViewMod.DataViewLayoutOptionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactDataviewMod.DataViewLayoutOptions](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.dataViewMod.DataViewLayoutOptionsProps])(children: _*)
  }
  @JSImport("primereact/dataview", "DataViewLayoutOptions")
  @js.native
  object componentImport extends js.Object
  
}

