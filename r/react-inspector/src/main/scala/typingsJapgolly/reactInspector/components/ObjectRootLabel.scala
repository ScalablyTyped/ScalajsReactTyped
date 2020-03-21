package typingsJapgolly.reactInspector.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInspector.mod.ObjectRootLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ObjectRootLabel {
  def apply(
    data: js.Any = null,
    name: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ObjectRootLabelProps, 
    MountedWithRawType[ObjectRootLabelProps, js.Object, RawMounted[ObjectRootLabelProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactInspector.mod.ObjectRootLabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInspector.mod.ObjectRootLabelProps])(children: _*)
  }
  @JSImport("react-inspector", "ObjectRootLabel")
  @js.native
  object componentImport extends js.Object
  
}

