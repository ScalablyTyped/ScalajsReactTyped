package typingsJapgolly.rcFieldForm.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcFieldForm.interfaceMod.NamePath
import typingsJapgolly.rcFieldForm.listMod.ListField
import typingsJapgolly.rcFieldForm.listMod.ListOperations
import typingsJapgolly.rcFieldForm.listMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    name: NamePath,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => CallbackTo[Element | Node] = null
  ): UnmountedSimple[
    ListProps, 
    MountedWithRawType[ListProps, js.Object, RawMounted[ListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2((t0: /* fields */ js.Array[typingsJapgolly.rcFieldForm.listMod.ListField], t1: /* operations */ typingsJapgolly.rcFieldForm.listMod.ListOperations) => children(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcFieldForm.listMod.ListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcFieldForm.listMod.ListProps])
  }
  @JSImport("rc-field-form/lib/List", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

