package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.formListMod.FieldData
import typingsJapgolly.antd.formListMod.FormListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormList {
  def apply(
    name: String | Double | (js.Array[String | Double]),
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Array[FieldData], typingsJapgolly.antd.formListMod.Operation) => CallbackTo[Node]
  ): UnmountedSimple[
    FormListProps, 
    MountedWithRawType[FormListProps, js.Object, RawMounted[FormListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.antd.formListMod.FieldData], t1: typingsJapgolly.antd.formListMod.Operation) => children(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.formListMod.FormListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.formListMod.FormListProps])
  }
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

